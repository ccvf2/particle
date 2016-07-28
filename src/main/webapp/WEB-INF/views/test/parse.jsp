<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제목을 입력하세요.</title>
</head>
<body>
<textarea rows="100" cols="100">
<c:out value="${doc}" escapeXml="false"/>
</textarea>
<form action="/admin/parse.do" method="post">
<input type="text" name="url" value="http://openapi.airkorea.or.kr/openapi/services/rest/MsrstnInfoInqireSvc/getNearbyMsrstnList?ServiceKey=kKhGK7eZaBH5m0qmzMlZe7Gv1vqjmiM37qgptv50GQ9akeGzCibFHidN%2FWsnIv84ONp%2BayFUYTknzBQlfA5JEA%3D%3D&tmX=244148.546388&tmY=412423.75772&numOfRows=999&pageSize=999&pageNo=1&startPage=1">
<input type="submit">
</form>
</body>
</html>