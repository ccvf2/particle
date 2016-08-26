<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page.</title>
</head>
<body>
이메일:${userInfo.mem_id} / 
닉네임:${userInfo.mem_nickname} / 
name:${userInfo.mem_name} / 
mem_type:${userInfo.mem_type} / 
mem_info:${userInfo.mem_info}<br />
</body>

</html>