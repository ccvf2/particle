package com.mynetgear.ccvf3.common.code;

import java.util.List;

public interface CodeServiceImp {

	List<CodeDTO> getCommonCodeList();
	
	int callCodeSetting(CodeDTO codeDTO);
	
	List<CodeDTO> getListCodeGroup(String codeGroupName);
}
