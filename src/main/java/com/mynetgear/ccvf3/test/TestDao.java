package com.mynetgear.ccvf3.test;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestDao implements TestDaoImp {
	@Autowired
	private SqlSessionTemplate sessionTemplate;

	@Override
	public List<TestDTO> getTest() {
		// TODO Auto-generated method stub
		
		
		return sessionTemplate.selectList("get_test");
	}
	
	
}
