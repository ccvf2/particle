package com.mynetgear.ccvf3.common.code;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mynetgear.ccvf3.HomeController;
@Component
public class CodeDAO implements CodeDAOImp {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public List<CodeDTO> getCommonCodeList() {
		logger.debug("getCommonCodeList Method start");
		return sessionTemplate.selectList("get_Common_Code_list");
	}

	@Override
	public int setCommonCode(CodeDTO codeDTO) {
		logger.debug("setCommonCode Method start");
		return sessionTemplate.insert("set_Common_Code", codeDTO);
	}

	@Override
	public int updateCommonCode(CodeDTO codeDTO) {
		logger.debug("updateCommonCode Method start");
		return sessionTemplate.update("update_Common_Code", codeDTO);
	}
	
	@Override
	public int deleteCommonCode(CodeDTO codeDTO) {
		logger.debug("deleteCommonCode Method start");
		return sessionTemplate.delete("delete_Common_Code", codeDTO);
	}

}
