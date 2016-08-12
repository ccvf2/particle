package com.mynetgear.ccvf3.admin.logger;

import java.util.List;

public interface AdminLoggerDAOImp {
	/**
	  * @Method Name : insertAdminLogger
	  * @작성일 : 2016. 8. 12.
	  * @작성자 : 곽성국
	  * @Method 설명 : 로그 삽입
	  * @param adminLoggerDTO
	  * @return
	  */
	public int insertAdminLogger(AdminLoggerDTO adminLoggerDTO);
	
	/**
	  * @Method Name : getAdminLoggerList
	  * @작성일 : 2016. 8. 12.
	  * @작성자 : 곽성국
	  * @Method 설명 :로그 리스트를 반환
	  * @return
	  */
	public List<AdminLoggerDTO> getAdminLoggerList();
	
	/**
	  * @Method Name : deleteAdminLogger
	  * @작성일 : 2016. 8. 12.
	  * @작성자 : 곽성국
	  * @Method 설명 :모든 로그 삭제
	  * @return
	  */
	public int deleteAdminLogger();
}
