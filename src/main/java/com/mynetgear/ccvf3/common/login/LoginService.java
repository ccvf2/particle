package com.mynetgear.ccvf3.common.login;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;

import com.mynetgear.ccvf3.common.parser.CommonParserService;
import com.mynetgear.ccvf3.common.util.Constant;
import com.mynetgear.ccvf3.common.util.MapKeyCode;
@Component
public class LoginService implements LoginServiceImp {

	@Autowired
	CommonParserService commonParserService;
	@Autowired
	LoginDAO loginDAO;
	
	
	@Override
	public HashMap<String, String> requestAccessToken(HttpServletRequest request,HttpServletResponse response, String clientId, String clientSecret,String code,String state)throws Exception {
		//String code = request.getAttribute("code").toString();
		//String state = request.getAttribute("state").toString();
		
		//AccessToken을 요청하는 URL
		StringBuilder strbilder = new StringBuilder();
		strbilder.append("https://nid.naver.com/oauth2.0/token?client_id=");
		strbilder.append(clientId);
		strbilder.append("&client_secret=");
		strbilder.append(clientSecret);
		strbilder.append("&grant_type=authorization_code&state=");
		strbilder.append(state);
		strbilder.append("&code=");
		strbilder.append(code);
		
		//strbilder로 만든 URL로 토큰생성요청
		URL url = new URL(strbilder.toString());
		InputStreamReader isr = new InputStreamReader(url.openConnection().getInputStream(), "UTF-8");
		JSONObject object = (JSONObject)JSONValue.parse(isr);
		
		//토큰정보를 담을 MAP Object생성
		HashMap<String, String> returnMap = new HashMap<String, String>();
		
		//토큰정보를 MAP에 담음 MapKey값은 MapKeyCode.java에 정의된 키로 사용.
		returnMap.put(MapKeyCode.N_ACCESS_TOKEN, object.get(MapKeyCode.N_ACCESS_TOKEN).toString());
		returnMap.put(MapKeyCode.N_REFRESH_TOKEN, object.get(MapKeyCode.N_REFRESH_TOKEN).toString());
		returnMap.put(MapKeyCode.N_TOKEN_TYPE, object.get(MapKeyCode.N_TOKEN_TYPE).toString());
		returnMap.put(MapKeyCode.N_EXPIRES_IN, object.get(MapKeyCode.N_EXPIRES_IN).toString());
		isr.close();
		return returnMap;
	}
	
	@Override
	public MemberDTO requestUserInfo(HttpServletRequest request, HttpServletResponse response,HashMap<String, String> tokenMap)throws Exception{
		/********************** 사용자 정보  요청 시작 */
		// 요청 URL
		String uerInfoUrl = "https://apis.naver.com/nidlogin/nid/getUserProfile.xml";
		String tokenValue=" Bearer "+tokenMap.get(MapKeyCode.N_ACCESS_TOKEN).toString();
		// 사용자 기본정보 조회 요청 return XML (Authorization 헤더값에는 인증토큰을 포함)
		URL url = new URL(uerInfoUrl);
		HttpURLConnection conn = null;

		conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Cache-Control", "no-cache");
		conn.setRequestProperty("Content-Type", "application/xml");
		conn.setRequestProperty("Accept", "application/xml");
		//conn.setRequestProperty("Authorization: Bearer", tokenValue);
		conn.setRequestProperty("Authorization", tokenValue);
		conn.setDoInput(true);
		conn.setDoOutput(true);
		
		Document doc=null;
		//connection 의 inputStream을 통해 XML내용을 받아와 Document객체를 구함.
		doc = commonParserService.parseXML(conn.getInputStream());
		
		//parseing 할 내용을 Set에 담음
		Set<String> infoSet = new HashSet<String>();
		infoSet.add("email");
		infoSet.add("nickname");
		infoSet.add("profile_image");
		infoSet.add("age");
		infoSet.add("gender");
		infoSet.add("name");
		infoSet.add("birthday");
		
		
		HashMap<String, String> userInfo= new HashMap<String,String>();
		
		//Document객체,파싱할 부모Tag,파싱할Tag 셋 객체를 요청 하여 사용자 정보를 담은 MAP를 리턴받음.
		userInfo=commonParserService.userInfoXMLParse(doc, "response", infoSet);
		
		//MAP로 받아온 내용을 DTO에 씀.
		MemberDTO memDto  = new MemberDTO();
		memDto.setMem_id(userInfo.get("email"));
		memDto.setMem_name(userInfo.get("name"));
		memDto.setMem_nickname(userInfo.get("nickname"));
		memDto.setMem_info("C0001");
		memDto.setMem_type("M0002");
		conn.disconnect();
		return memDto;
	}

	@Override
	public ModelAndView loginBusinessHandler(ModelAndView mav) {
		Map<String, Object> map = mav.getModelMap();
		HttpServletRequest request= (HttpServletRequest)map.get("request");
		MemberDTO userInfo = (MemberDTO)map.get("userInfo");
		MemberDTO dbSelectUserInfo = null;
		//리턴값= 0:내용없음 1:모두동일
		int returnResult = 0;

		dbSelectUserInfo=loginDAO.userInfoCheck(userInfo);

		if(dbSelectUserInfo==null){
			//디비에 내용이 없으므로 새로 입력
			loginDAO.insertUserInfo(userInfo);
		}else{
			//디비에 내용이 있으므로 그냥 업데이트
			//loginDAO.updateUserInfo(dbSelectUserInfo);
			userInfo.setMem_seq(dbSelectUserInfo.getMem_seq());
			userInfo.setMem_type(dbSelectUserInfo.getMem_type());
			userInfo.setMem_info(dbSelectUserInfo.getMem_info());
			loginDAO.updateUserInfo(userInfo);
		}
		//사용자 정보를 다시조회해옴
		dbSelectUserInfo=loginDAO.userInfoCheck(userInfo);
		// 세션처리
		HttpSession session = request.getSession();
		session.setAttribute(Constant.SYNN_LOGIN_OBJECT, dbSelectUserInfo);
		
		mav.addObject("userInfo",dbSelectUserInfo);
		mav.addObject("request",request);
		return mav;
	}
}
