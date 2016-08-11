package com.mynetgear.ccvf3.common.parser;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;

import com.mynetgear.ccvf3.HomeController;

/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
@Controller
public class CommonParserController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	CommonParserService parserService;
	
	
	@RequestMapping(value = "/admin/parse.do", method = RequestMethod.GET)
	public ModelAndView parseResultView(HttpServletRequest request, HttpServletResponse response ) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("doc","");
		mav.setViewName("/test/parse");
		return mav;
	}
	@RequestMapping(value = "/admin/parse.do", method = RequestMethod.POST) 
	public ModelAndView parseResultDO(HttpServletRequest request, HttpServletResponse response ) {
		ModelAndView mav = new ModelAndView();
		String requestURL=request.getParameter("url");
		Document doc = parserService.getXMLDocument(requestURL);
		
		//testSET
		Set<String> parseSET = new HashSet<String>();
		parseSET.add("dataTime");
		parseSET.add("so2Value");
		parseSET.add("coValue");
		
		List<HashMap<String, String>> list =parserService.requestXMLParse(doc, "item", parseSET);
		mav.addObject("paerseList",list);
		mav.setViewName("/test/parse");
		return mav;
	}
	
	
	
	/**
	 * @param request
	 * @param response
	 * @deprecated 시군구를 OpenAPI로 요청
	 * @return
	 */
	@RequestMapping(value="admin/address/parse.do", method= RequestMethod.GET)
	public String getAddressSIGUNGU(HttpServletRequest request, HttpServletResponse response) {
		/* 1.페이징 처리로 요청-페이징을 카운팅 해주는 매소드 필요
		 * 2.필
		 * 
		 * 
		 * */
		
		return "주소 가져오기 성공";
	}
	
	
}
