package com.mynetgear.ccvf3.test;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mynetgear.ccvf3.HomeController;

@Controller
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private TestService testService;

	
	@RequestMapping(value = "/test/test.do", method = RequestMethod.GET)
	public ModelAndView test() {
		ModelAndView mav = new ModelAndView();
		logger.debug("test Mathod start");
		List<TestDTO> testList = testService.test();
		mav.addObject("list", testList);
		mav.setViewName("/main/main");

		return mav;
	}
}
