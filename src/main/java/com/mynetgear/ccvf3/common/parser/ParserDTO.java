package com.mynetgear.ccvf3.common.parser;

public class ParserDTO {

	/** XML Tag :파싱 태그명 ex) <item></item> */
	private String item_tag = "";
	/** XML Value : 태그안에 내용 ex) <str> ★내용~~~!!</st... */
	private StringBuilder item_value = new StringBuilder();
	/** XML Level : 속해있는 레벨*/
	private int item_level = 0;
	/** XML PARENT TAG : 해당 태그의 상위 태그 명*/
	private String item_parent_tag = "";
	/** XML PARENT TAG LEVEL : 해당 태그의 상위 레벨*/
	private int item_parent_level = 0;
	/** XML Line : 해당 태그의 줄*/
	private int item_line = 0;
	public String getItem_tag() {
		return item_tag;
	}
	public void setItem_tag(String item_tag) {
		this.item_tag = item_tag;
	}
	public StringBuilder getItem_value() {
		return item_value;
	}
	public void setItem_value(StringBuilder item_value) {
		this.item_value = item_value;
	}
	public int getItem_level() {
		return item_level;
	}
	public void setItem_level(int item_level) {
		this.item_level = item_level;
	}
	public String getItem_parent_tag() {
		return item_parent_tag;
	}
	public void setItem_parent_tag(String item_parent_tag) {
		this.item_parent_tag = item_parent_tag;
	}
	public int getItem_parent_level() {
		return item_parent_level;
	}
	public void setItem_parent_level(int item_parent_level) {
		this.item_parent_level = item_parent_level;
	}
	public int getItem_line() {
		return item_line;
	}
	public void setItem_line(int item_line) {
		this.item_line = item_line;
	}
	
	
	
}
