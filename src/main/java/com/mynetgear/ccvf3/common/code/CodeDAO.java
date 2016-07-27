package com.mynetgear.ccvf3.common.code;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CodeDAO implements CodeDAOImp {
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public List<CodeDTO> getCommonCodeList() {
		return sessionTemplate.selectList("get_Common_Code_list");
	}

}
