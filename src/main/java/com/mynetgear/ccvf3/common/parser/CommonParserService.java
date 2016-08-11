package com.mynetgear.ccvf3.common.parser;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.w3c.dom.*;

import com.mynetgear.ccvf3.HomeController;
import com.mynetgear.ccvf3.common.util.Constant;
import com.mynetgear.ccvf3.common.util.MapKeyCode;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

@Component
public class CommonParserService implements CommonParserServiceImp{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	private Document parseXML(InputStream stream) throws Exception{
		DocumentBuilderFactory objDocumentBuilderFactory = null;
		DocumentBuilder objDocumentBuilder = null;
		Document doc = null;
		try{
			objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
			objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();
			doc = objDocumentBuilder.parse(stream);
		}catch(Exception ex){
			throw ex;
		}
		return doc;
	}


	/**@date 2016.07.28
	 * @author 배성욱
	 * @deprecated URL로부터 XML Document 객체를 받아옴.
	 * @param requestURL
	 * @return Document[(Object)org.w3c.dom]
	 */
	@Override
	public Document getXMLDocument(String requestURL){
		URL url=null;
		Document doc=null;
		URLConnection connection=null;
		try {
			url = new URL(requestURL);
			try {
				connection = url.openConnection();
				logger.debug(Constant.LOG_ID1+connection.toString());
				try {
					doc = parseXML(connection.getInputStream());
				} catch (Exception e) {
					e.printStackTrace();
					logger.debug(Constant.LOG_ID1+"XML 문서 객체 생성 실패");
				}
			} catch (IOException e) {
				e.printStackTrace();
				logger.debug(Constant.LOG_ID1+"URL 연결 실패");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
			logger.debug(Constant.LOG_ID1+"URL 요청 실패");
		}
		return doc;
	}

	
	/**@date 2016.07.28
	 * @author 배성욱
	 * @deprecated XML Document 객체로 부터item을 파싱.
	 * @param requestURL
	 * @return NodeList[(Object)org.w3c.dom]
	 */
	/*public NodeList getItemParser(Document doc, String itme_tag) {
		int listCount=doc.getElementsByTagName(itme_tag).getLength();
		NodeList docNodeList=null;
		if (listCount != 0 && listCount != -1) {
			docNodeList = doc.getElementsByTagName(itme_tag);
		}else{
			logger.debug(Constant.LOG_ID1+" "+itme_tag+"가 존재하지 않거나, "+itme_tag+"가 잘못되었습니다.");
		}
		return docNodeList;
	}*/
	
	/**@date 2016.07.31
	 * @author 배성욱
	 * @deprecated XML Document
	 * @param requestURL
	 * @return List<HashMap<String, String>>
	 * @see List<HashMap<String, String>> 파싱된 내용이 담겨있는 맵 목록, 해쉬맵<XMLTag, XMLContents>
	 */
	public List<HashMap<String, String>> requestXMLParse(Document doc, String parentTag, Set<String> parseTag) {
		//return랑 List객체를 생성함
		List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
		
		NodeList docNodes = doc.getElementsByTagName(parentTag);
		Iterator<String> itKey=parseTag.iterator();
		//document에서 item을 검색함.
		for(int i=0; i<docNodes.getLength();i++){
			HashMap<String, String> map = new HashMap<String, String>();
			while (itKey.hasNext()) {
				String kkey=itKey.next();
				for(Node node = docNodes.item(i).getFirstChild(); node!=null; node=node.getNextSibling()){
					if(StringUtils.equals(node.getNodeName(), kkey)){
						try {
							map.put(MapKeyCode .KEY_CODE_INDEX, i+"");
							map.put(kkey, node.getTextContent());
							list.add(map);
						} catch (Exception e) {
							logger.debug(Constant.LOG_ID1+"내용을 찾을 수 없습니다.");
						}
					}
				}
			}
			//item에서 첫번째 자식을 시작으로 마지막까지 다음 형제를 실행
		}
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	/**@date 2016.07.28
	 * @author 배성욱
	 * @deprecated XML Document 객체로 Strig
	 * @param requestURL
	 * @return NodeList[(Object)org.w3c.dom]
	 */
	public String makeXMLDocumentToSting(Document doc) {
		NodeList descNodes = doc.getElementsByTagName("item");
		StringBuffer content=new StringBuffer();
		
		for(int i=0; i<descNodes.getLength();i++){
			content.append("    ");
			content.append("<br />");
			content.append("<item>");
			for(Node node = descNodes.item(i).getFirstChild(); node!=null; node=node.getNextSibling()){
				if(StringUtils.equals(node.getNodeName(), "#text")==false){
			//첫번째 자식을 시작으로 마지막까지 다음 형제를 실행
				content.append("    ");
				content.append("<");
				content.append(node.getNodeName());
				content.append(">");
				content.append(node.getTextContent());
				content.append("</");
				content.append(node.getNodeName());
				content.append(">");
				}
			}
			content.append("</item>");
		}
		return content.toString();
	}
	
	/*public Object makeXMLDocumentToSting(String requestURL, Object returnObject, String 단건다건선택자) {
		*//**
		 * 1.단건 파싱 후 오브젝트를 돌려준다.
		 * 2.다건 파싱 후 콜렌션 오브젝트를 돌려준다.
		 * 3.단건인지 다건인지 선택하는 선택자를 받는다. 
		 * *//*
	}
	*/
	
}
