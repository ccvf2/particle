package com.mynetgear.ccvf3.common.login;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mynetgear.ccvf3.common.util.Constant;

@Controller
public class LoginController {
	private static final String mydomain = "http%3A%2F%2Fksg9155.iptime.org%2Flogin%2FloginCheck.do";
	private static final String clientId = "2lpquhwokR40A9pUgscw";
	private static final String clientSecret = "fFotJOgIV4";
	private static final String requestUrl = "https://nid.naver.com/oauth2.0/authorize?client_id=" + clientId + "&response_type=code&redirect_uri="+ mydomain + "&state="; 
	
	@Autowired
	LoginService loginService;

	//네이버 세션이 없을시 네이버 로그인 창으로 이동
	@RequestMapping(value = "/login/login.do")
	public String login(HttpServletRequest servletRequest, HttpServletResponse servletResponse){
		String state= servletRequest.getSession().getAttribute("token").toString();
		return "redirect:" + requestUrl + state;
	}

	//토큰을 만들기 위해 정보를 입력받음
	@RequestMapping(value = "/login/loginCheck.do")
	public String parseResultView(HttpServletRequest servletRequest, HttpServletResponse servletResponse,@RequestParam String state, @RequestParam String code)throws Exception {

		String str2= servletRequest.getSession().getAttribute("token").toString();
		System.out.println(Constant.LOG_ID1 + str2);

		if(StringUtils.equalsIgnoreCase(state, str2)){
			System.out.println("로그인 성공!!");
			return "forward:/login/accesstoken.do";
		}else{
			System.out.println("로그인 실패!!");
			return "";
		}
	}
	
	//받아온 토큰으로 사용저 정보를 네이버API로 요청
	@RequestMapping(value = "/login/accesstoken.do")
	public ModelAndView accessToken(HttpServletRequest servletRequest, HttpServletResponse servletResponse,@RequestParam String state, @RequestParam String code)throws Exception {
		ModelAndView mav = new ModelAndView();
		HashMap<String, String> tokenMap = new HashMap<String, String>();
		//로그인에 필요한 토큰을 받아옴
		tokenMap=loginService.requestAccessToken(servletRequest,servletResponse,clientId,clientSecret,code,state);
		
		//받아온토큰 값으로 사용자 정보를 받아옴.
		HashMap<String, String> userInfo = loginService.requestUserInfo(servletRequest,servletResponse,tokenMap);
		
		mav.addObject("userInfo",userInfo);
		mav.setViewName("/test/login");
		return mav;
	}


}
