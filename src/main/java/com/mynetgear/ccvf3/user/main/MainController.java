package com.mynetgear.ccvf3.user.main;


import java.math.BigInteger;
import java.security.SecureRandom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	/** 네이버 로그인시 필요한 토근생성*/
	private String generateState()
	{
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}
	
	@RequestMapping(value = "/main/main.do", method = RequestMethod.GET)
	public ModelAndView userMainPage(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("/main/main");
		String tokenStr= generateState();
		request.getSession().setAttribute("token", tokenStr);
		
		logger.debug("userMainPage");
		
		return mav;
	}
	
	
	
	
}
