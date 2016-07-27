package com.mynetgear.ccvf3.common.code;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mynetgear.ccvf3.HomeController;

@Component
public class CodeService implements CodeServiceImp {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private CodeDAO codeDAO;
	
	@Override
	public List<CodeDTO> getCommonCodeList() {
		logger.debug("getCommonCodeList.DAO Method start");
		List<CodeDTO> codeList = new ArrayList<CodeDTO>();
		codeList = codeDAO.getCommonCodeList();
		
		return codeList;
	}
}
