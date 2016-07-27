package com.mynetgear.ccvf3.common.code;

public class CodeDTO {

	/** 공통 고유코드: 고유코드시퀀스 */
	private int code_seq=0;
	/** 공통 고유코드: 고유코드 */
	private String code="";
	/** 공통 고유코드: 고유코드명(이름) */
	private String code_name="";
	/** 공통 고유코드: 고유코드그룹(묶음) */
	private String code_group="";
	/** 공통 고유코드: 고유코드그룹명(묶음이름) */
	private String code_group_name="";
	/** 공통 고유코드: 고유코드값(코드가 가지는값) */
	private String code_value="";
	/** 공통 고유코드: 고유코드정렬값 */
	private int code_sort=100;

	public int getCode_seq() {
		return code_seq;
	}
	public void setCode_seq(int code_seq) {
		this.code_seq = code_seq;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode_name() {
		return code_name;
	}
	public void setCode_name(String code_name) {
		this.code_name = code_name;
	}
	public String getCode_group() {
		return code_group;
	}
	public void setCode_group(String code_group) {
		this.code_group = code_group;
	}
	public String getCode_group_name() {
		return code_group_name;
	}
	public void setCode_group_name(String code_group_name) {
		this.code_group_name = code_group_name;
	}
	public String getCode_value() {
		return code_value;
	}
	public void setCode_value(String code_value) {
		this.code_value = code_value;
	}
	public int getCode_sort() {
		return code_sort;
	}
	public void setCode_sort(int code_sort) {
		this.code_sort = code_sort;
	}
	
	
}
