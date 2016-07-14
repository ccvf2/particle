package com.mynetgear.ccvf3.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService implements TestServiceImp {

	@Autowired
	private TestDao testDao;
	
	@Override
	public List<TestDTO> test() {
		List<TestDTO> testList = new ArrayList<TestDTO>();
		testList = testDao.getTest();
		 
		
		return testList;
	}
}
