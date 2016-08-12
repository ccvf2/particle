package com.mynetgear.ccvf3.common.code;

import com.mynetgear.ccvf3.common.DefaultParticleDTO;

public class CodeDTOExt extends DefaultParticleDTO{
	/** 공통코드확장 : 입력, 수정, 삭제, 읽기 여부 확인을 위한 값 */
	private String code_CRUD = "";
	/** 공통코드확장 : 검색코드그룹번호 */
	private String search_code_group = "";
	/** 공통코드확장 : 검색코드그룹명 */
	private String search_code_group_name = "";
	
	public String getCode_CRUD() {
		return code_CRUD;
	}

	public void setCode_CRUD(String code_CRUD) {
		this.code_CRUD = code_CRUD;
	}

	public String getSearch_code_group() {
		return search_code_group;
	}

	public void setSearch_code_group(String search_code_group) {
		this.search_code_group = search_code_group;
	}

	public String getSearch_code_group_name() {
		return search_code_group_name;
	}

	public void setSearch_code_group_name(String search_code_group_name) {
		this.search_code_group_name = search_code_group_name;
	}	
}
