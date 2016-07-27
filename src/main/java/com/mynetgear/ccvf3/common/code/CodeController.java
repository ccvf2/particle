package com.mynetgear.ccvf3.common.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mynetgear.ccvf3.HomeController;

@Controller
public class CodeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private CodeService CodeService;

	
	@RequestMapping(value = "/admin/code.do", method = RequestMethod.GET)
	public ModelAndView adminCodeModifyView() {
		ModelAndView mav = new ModelAndView();
		logger.debug("adminCodeModifyView Mathod start");
		mav.setViewName("/admin/code/code");

		return mav;
	}
}
