package com.mynetgear.ccvf3.common.login;

public interface LoginDAOImp {

	MemberDTO userInfoCheck(MemberDTO memDTO);

	int insertUserInfo(MemberDTO userInfo);

	int updateUserInfo(MemberDTO userInfo);

}
