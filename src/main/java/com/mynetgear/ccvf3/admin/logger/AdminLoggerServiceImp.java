package com.mynetgear.ccvf3.admin.logger;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

public interface AdminLoggerServiceImp {
	/**
	  * @Method Name : insertAdminLogger
	  * @작성일 : 2016. 8. 12.
	  * @작성자 : 곽성국
	  * @Method 설명 :로그를 추가는 메소드
	  * @param adminLoggerDTO
	  */
	public void insertAdminLogger(AdminLoggerDTO adminLoggerDTO);
	
	/**
	  * @Method Name : getAdminLoggerList
	  * @작성일 : 2016. 8. 12.
	  * @작성자 : 곽성국
	  * @Method 설명 :로그의 리스트를 반환
	  * @return
	  */
	public List<AdminLoggerDTO> getAdminLoggerList();
	
	/**
	  * @Method Name : deleteAdminLogger
	  * @작성일 : 2016. 8. 12.
	  * @작성자 : 곽성국
	  * @Method 설명 :모든 로그를 삭제
	  * @param mav
	  */
	public void deleteAdminLogger(ModelAndView mav);
}
