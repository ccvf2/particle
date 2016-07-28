package com.mynetgear.ccvf3.common.code;

import java.util.List;

public interface CodeDAOImp {

	List<CodeDTO> getCommonCodeList();

	int updateCommonCode(CodeDTO codeDTO);
	
	int setCommonCode(CodeDTO codeDTO);
	
	int deleteCommonCode(CodeDTO codeDTO);
}
