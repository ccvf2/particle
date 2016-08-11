package com.mynetgear.ccvf3.common.code;

import com.mynetgear.ccvf3.common.DefaultParticleDTO;

public class CodeDTOExt extends DefaultParticleDTO{
	// 입력, 수정, 삭제, 읽기 여부 확인을 위한 값
	private String code_CRUD = "";

	public String getCode_CRUD() {
		return code_CRUD;
	}

	public void setCode_CRUD(String code_CRUD) {
		this.code_CRUD = code_CRUD;
	}	
}
