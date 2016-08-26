package com.mynetgear.ccvf3.common.login;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mynetgear.ccvf3.HomeController;

@Component
public class LoginDAO implements LoginDAOImp {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	
	@Override
	/** 유저 정보가 데이터베이스에 존재하는지 확인. */
	public MemberDTO userInfoCheck(MemberDTO memDTO) {
		return sessionTemplate.selectOne("user_info_db_check", memDTO);
	}

	@Override
	/** user 정보를 DB에 신규 입력 */
	public int insertUserInfo(MemberDTO userInfo) {
		return sessionTemplate.insert("user_info_new_insert", userInfo);
	}

	@Override
	public int updateUserInfo(MemberDTO userInfo) {
		return sessionTemplate.update("user_info_update", userInfo);
	}
				
/*	@Override
	public int userInfoInsertORUpdate(MemberDTO memDTO) {
		return sessionTemplate.insert("set_Common_Code", memDTO);

	}*/
}
