package com.mynetgear.ccvf3.common.login;

import java.math.BigInteger;
import java.security.SecureRandom;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value = "/login/login_n.do", method = RequestMethod.GET)
	public ModelAndView parseResultView(HttpServletRequest request, HttpServletResponse response ) {
		ModelAndView mav = new ModelAndView();
		
		//네이버로그인용
		SecureRandom random = new SecureRandom();
		BigInteger intger= new BigInteger(130, random);
		// 상태 토큰으로 사용할 랜덤 문자열 생성
		String state = intger.toString(32);
		// 세션 또는 별도의 저장 공간에 상태 토큰을 저장
		request.getSession().setAttribute("state", state);
		
		mav.setViewName("/test/login");
		return mav;
	}
}
