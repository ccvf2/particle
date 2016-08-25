<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page.</title>
</head>
<body>
이메일:${userInfo.email} / 
닉네임:${userInfo.nickname} / 
age:${userInfo.age} / 
name:${userInfo.name} / 
birthday:${userInfo.birthday} / 
profile_image:${userInfo.profile_image}<br />
</body>

</html>