package com.mynetgear.ccvf3.admin.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mynetgear.ccvf3.HomeController;
import com.mynetgear.ccvf3.test.TestService;

@Controller
public class AdminMainController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private TestService testService;

	
	@RequestMapping(value = "/admin/main.do", method = RequestMethod.GET)
	public ModelAndView adminMainView() {
		ModelAndView mav = new ModelAndView();
		//logger.debug("test Mathod start");
		//List<TestDTO> testList = testService.test();
		//mav.addObject("list", testList);
		mav.setViewName("/admin/main");

		return mav;
	}
}
