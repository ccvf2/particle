package com.mynetgear.ccvf3.common.code;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mynetgear.ccvf3.HomeController;
import com.mynetgear.ccvf3.common.util.Constant;

@Component
public class CodeService implements CodeServiceImp {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private CodeDAO codeDAO;
	
	@Override
	public List<CodeDTO> getCommonCodeList() {
		logger.debug("getCommonCodeList.DAO Method start");
		
		//CodeDTO a= new CodeDTO();
		
		
		List<CodeDTO> codeList = codeDAO.getCommonCodeList();
		
		return codeList;
	}
	
	@Override
	public int callCodeSetting(CodeDTO codeDTO) {
		logger.debug("callCodeSetting Method start");
		int result = 0;
		
		if(StringUtils.equals(codeDTO.getCode_CRUD(), Constant.SYNB_CRUD_C)) {
			// code_CRUD가 쓰기일 때
			result = codeDAO.setCommonCode(codeDTO);
		} else if(StringUtils.equals(codeDTO.getCode_CRUD(), Constant.SYNB_CRUD_U)) {
			//code_CRUD가 수정일 때
			result = codeDAO.updateCommonCode(codeDTO);
		} else if(StringUtils.equals(codeDTO.getCode_CRUD(), Constant.SYNB_CRUD_D)) {
			//code_CRUD가 삭제일 때
			result = codeDAO.deleteCommonCode(codeDTO);
		}
		
		return result;
	}

	/**
	 * 코드 그룹 가져오기용
	 * */
	@Override
	public List<CodeDTO> getListCodeGroup(String codeGroupName) {
		codeGroupName = StringUtils.deleteWhitespace(codeGroupName);
		
		CodeDTO codeDTO = new CodeDTO();
		codeDTO.setSearch_code_group(codeGroupName);
		
		List<CodeDTO> list = codeDAO.getListCodeInfo(codeDTO);
		return list;
	}
}
