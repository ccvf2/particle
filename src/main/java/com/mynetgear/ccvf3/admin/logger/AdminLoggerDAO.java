package com.mynetgear.ccvf3.admin.logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mynetgear.ccvf3.HomeController;

@Component
public class AdminLoggerDAO implements AdminLoggerDAOImp{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public int insertAdminLogger(AdminLoggerDTO adminLoggerDTO) {
		logger.debug("insertAdminLogger Method start");
		/*Map<String, Object> map = new HashMap<String, Object>();
		map.put("adminlog_seq", adminLoggerDTO.getAdminlog_seq());
		map.put("adminlog_cat", adminLoggerDTO.getAdminlog_cat());
		map.put("adminlog_title", adminLoggerDTO.getAdminlog_title());
		map.put("adminlog_contents", adminLoggerDTO
		*/
		return sessionTemplate.insert("set_Admin_Logger", adminLoggerDTO);
	}

	@Override
	public List<AdminLoggerDTO> getAdminLoggerList() {
		logger.debug("getAdminLoggerList Method start");
		
		return sessionTemplate.selectList("get_Admin_Logger_list");
	}

	@Override
	public int deleteAdminLogger() {
		logger.debug("deleteAdminLogger Method start");
		return sessionTemplate.delete("delete_Admin_Logger");
	}

}
