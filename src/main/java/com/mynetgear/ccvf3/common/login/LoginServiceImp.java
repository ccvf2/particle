package com.mynetgear.ccvf3.common.login;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoginServiceImp {

	public HashMap<String, String> requestAccessToken(HttpServletRequest request,HttpServletResponse response, String clientId, String clientSecret,String code,String state)throws Exception;

	public HashMap<String, String> requestUserInfo(HttpServletRequest request, HttpServletResponse response,
			HashMap<String, String> tokenMap) throws Exception;


}
