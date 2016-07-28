package com.mynetgear.ccvf3.common.parser;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.stereotype.Component;
import org.w3c.dom.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

@Component
public class CommonParserService implements CommonParserServiceImp{

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
				try {
					doc = parseXML(connection.getInputStream());
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("XML 문서 객체 생성 실패");
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("URL 연결 실패");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("URL 요청 실패");
		}
		return doc;
	}

	
	/**@date 2016.07.28
	 * @author 배성욱
	 * @deprecated XML Document 객체로 부터item을 파싱.
	 * @param requestURL
	 * @return NodeList[(Object)org.w3c.dom]
	 */
	public NodeList getItemParser(Document doc, String itme_tag) {
		int listCount=doc.getElementsByTagName(itme_tag).getLength();
		NodeList docNodeList=null;
		if (listCount != 0 && listCount != -1) {
			docNodeList = doc.getElementsByTagName(itme_tag);
		}
		return docNodeList;
	}
	
	
	
	
	
	public void saveFileProcess() {
		
	}
	
}
