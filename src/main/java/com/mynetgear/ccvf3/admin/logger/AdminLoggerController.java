package com.mynetgear.ccvf3.admin.logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mynetgear.ccvf3.HomeController;
import com.mynetgear.ccvf3.common.code.CodeService;

/**
  * @FileName : AdminLoggerController.java
  * @Project : particle
  * @Date : 2016. 8. 12. 
  * @author : 곽성국
  * @comment : 관리자 로그 컨트롤러
  */
@Controller
public class AdminLoggerController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private AdminLoggerService adminLoggerService;
	
	@Autowired
	private CodeService codeService;
	
	@RequestMapping(value = "/admin/logger.do", method = RequestMethod.GET)
	public ModelAndView adminLoggerView() {
		ModelAndView mav = new ModelAndView();
		logger.debug("adminLoggerView Method Start");
		
		AdminLoggerDTO adminLoggerDTO = new AdminLoggerDTO();
		mav.addObject("adminLoggerList", adminLoggerService.getAdminLoggerList());
		mav.addObject("adminLogger", adminLoggerDTO);
		//로그의 공통코드 그룹 명
		mav.addObject("loggerCategoryList", codeService.getListCodeGroup("L0000"));
		mav.setViewName("/admin/logger/adminLogger");
		
		return mav;
	}
	
	@RequestMapping(value = "/admin/logger.do", method = RequestMethod.POST)
	public ModelAndView adminLoggerInsert(@ModelAttribute("adminLogger")AdminLoggerDTO adminLoggerDTO) {
		ModelAndView mav = new ModelAndView();
		logger.debug("adminLoggerInsert Method Start");
		
		int result = adminLoggerService.insertAdminLogger(adminLoggerDTO);
		mav.addObject("result", result);
		
		mav.addObject("adminLoggerList", adminLoggerService.getAdminLoggerList());
		mav.addObject("adminLogger", adminLoggerDTO);
		//로그의 공통코드 그룹 명
		mav.addObject("loggerCategoryList", codeService.getListCodeGroup("L0000"));
		mav.setViewName("/admin/logger/adminLogger");
		
		return mav;
	}
	
	@RequestMapping(value = "/admin/loggerDelete.ajax", method = RequestMethod.GET)
	public ModelAndView adminLoggerDelete(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		logger.debug("adminLoggerDelete Method start");
		
		mav.addObject("request", request);
		mav.addObject("response", response);
		
		adminLoggerService.deleteAdminLogger(mav);
		
		return null;
	}
}
