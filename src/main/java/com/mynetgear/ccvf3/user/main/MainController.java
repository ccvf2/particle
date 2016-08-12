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
		
	@RequestMapping(value = "/common/header.do", method = RequestMethod.GET)
	public ModelAndView userCommonHeader(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView("/common/header");
		
		//if (StringUtils.isEmpty(request.getSession().getAttribute("state").toString())) {
		if (request.getSession().getAttribute("state")==null) {
			//네이버로그인용
			SecureRandom random = new SecureRandom();
			BigInteger intger= new BigInteger(130, random);
			// 상태 토큰으로 사용할 랜덤 문자열 생성
			String state = intger.toString(32);
			// 세션 또는 별도의 저장 공간에 상태 토큰을 저장
			request.getSession().setAttribute("state", state);
		}
		return mav;
	}
	
	
	
	@RequestMapping(value = "/main/main.do", method = RequestMethod.GET)
	public ModelAndView userMainPage() {
		ModelAndView mav = new ModelAndView("/main/main");
		logger.debug("userMainPage");
		
		return mav;
	}
}
