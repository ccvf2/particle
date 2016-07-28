package com.mynetgear.ccvf3.common.parser;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.mynetgear.ccvf3.HomeController;

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
		//String str=parserService.makeXMLDocumentToSting(doc);
		
		NodeList list= parserService.getItemParser(doc, "item");
		logger.debug(list.getLength()+"");
		//mav.addObject("doc",str);
		mav.setViewName("/test/parse");
		return mav;
	}
}
