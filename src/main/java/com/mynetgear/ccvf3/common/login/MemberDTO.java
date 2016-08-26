package com.mynetgear.ccvf3.common.login;

import java.util.Date;

import com.mynetgear.ccvf3.common.DefaultParticleDTO;

public class MemberDTO extends DefaultParticleDTO{
	/** 회원정보: 회원번호 */
	private int	mem_seq=0;
	/** 회원정보: 회원명 */
	private String	mem_name="";
	/** 회원정보: 회원별명 */
	private String	mem_nickname="";
	/** 회원정보: 회원아이디 */
	private String	mem_id="";
	/** 회원정보: 로그인인증정보 */
	private String	mem_info="";
	/** 회원정보: 회원종류 일반||관리자*/
	private String	mem_type="";
	/** 회원정보: 최종로그인시간 */
	private Date	mem_last_login=null;
	public int getMem_seq() {
		return mem_seq;
	}
	public void setMem_seq(int mem_seq) {
		this.mem_seq = mem_seq;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_nickname() {
		return mem_nickname;
	}
	public void setMem_nickname(String mem_nickname) {
		this.mem_nickname = mem_nickname;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_info() {
		return mem_info;
	}
	public void setMem_info(String mem_info) {
		this.mem_info = mem_info;
	}
	public String getMem_type() {
		return mem_type;
	}
	public void setMem_type(String mem_type) {
		this.mem_type = mem_type;
	}
	public Date getMem_last_login() {
		return mem_last_login;
	}
	public void setMem_last_login(Date mem_last_login) {
		this.mem_last_login = mem_last_login;
	}
	
	
	

}
