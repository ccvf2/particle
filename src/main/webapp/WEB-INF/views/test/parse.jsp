<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제목을 입력하세요.</title>
</head>
<body>
<textarea rows="10" cols="100">
<c:out value="${doc}" escapeXml="false"/>
</textarea>
<form action="/admin/parse.do" method="post">
<input type="text" name="url" value="http://openapi.airkorea.or.kr/openapi/services/rest/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty?ServiceKey=kKhGK7eZaBH5m0qmzMlZe7Gv1vqjmiM37qgptv50GQ9akeGzCibFHidN%2FWsnIv84ONp%2BayFUYTknzBQlfA5JEA%3D%3D&numOfRows=10&pageSize=10&pageNo=1&startPage=1&sidoName=%EC%84%9C%EC%9A%B8">
<input type="submit">

<div>
<c:forEach items="${paerseList}" var="list">
시간:${list.dataTime} / 
so2:${list.so2Value} / 
co:${list.coValue}<br />
<%-- <c:set var="map" property="${list}" /> --%>
<%-- <c:out value="${map.stationName}"></c:out> --%>
</c:forEach>
</div>


</form>
</body>
</html>