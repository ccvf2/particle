package com.mynetgear.ccvf3.admin.logger;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class AdminLoggerDTO {
	/** 관리자 로그: 로그 시퀀스 */
	private int adminlog_seq;
	/** 관리자 로그: 로그 종류 */
	private String adminlog_cat;
	/** 관리자 로그: 로그 제목 */
	private String adminlog_title;
	/** 관리자 로그: 로그 내용 */
	private String adminlog_contents;
	/** 관리자 로그: 로그 에러 내용 */
	private String adminlog_error;
	/** 관리자 로그: 로그 작성 시간 */
	private Date adminlog_time;
	
	public int getAdminlog_seq() {
		return adminlog_seq;
	}
	public void setAdminlog_seq(int adminlog_seq) {
		this.adminlog_seq = adminlog_seq;
	}
	public String getAdminlog_cat() {
		return adminlog_cat;
	}
	public void setAdminlog_cat(String adminlog_cat) {
		this.adminlog_cat = adminlog_cat;
	}
	public String getAdminlog_title() {
		return adminlog_title;
	}
	public void setAdminlog_title(String adminlog_title) {
		this.adminlog_title = adminlog_title;
	}
	public String getAdminlog_contents() {
		return adminlog_contents;
	}
	public void setAdminlog_contents(String adminlog_contents) {
		this.adminlog_contents = adminlog_contents;
	}
	public Date getAdminlog_time() {
		return adminlog_time;
	}
	public void setAdminlog_time(Date adminlog_time) {
		this.adminlog_time = adminlog_time;
	}
	
	//Clob은 보류 ㅠ
/*	public Clob getAdminlog_error() {
		return adminlog_error;
	}
	public void setAdminlog_error(Clob adminlog_error) {
		this.adminlog_error = adminlog_error;
	}
	public void setAdminlog_error(String adminlog_error) {
		try {
			this.adminlog_error.setString(0, adminlog_error);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}*/
	public String getAdminlog_error() {
		return adminlog_error;
	}
	public void setAdminlog_error(String adminlog_error) {
		this.adminlog_error = adminlog_error;
	}
}
