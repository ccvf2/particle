package com.mynetgear.ccvf3.user.main;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mynetgear.ccvf3.HomeController;

@Controller
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
		
	@RequestMapping(value = "/main/main.do", method = RequestMethod.GET)
	public ModelAndView userMainPage() {
		ModelAndView mav = new ModelAndView("/main/main");
		logger.debug("userMainPage");
		
		return mav;
	}
}
