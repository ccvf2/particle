<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page.</title>
<c:import url="/WEB-INF/views/common/js_pack.jsp"/>
<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.2.js" charset="utf-8"></script>
</head>
<body>
<div id="naver_id_login"></div>
<!--  네이버 아이디 로그인 초기화 Script -->
<!-- <script type="text/javascript">
var naver_id_login = new naver_id_login("http://localhost:8888", "redirectURL")
var state = naver_id_login.getUniqState();
naver_id_login.setButton("white",2, 40);
naver_id_login.setDomain(".service.com");
naver_id_login.setState(state);
naver_id_login.setPopup();

</script> -->

<script type="text/javascript">
function callLogin_naver() {
	var state= "<c:out value='${sessionScope.state}'/>";
	var clientID="2lpquhwokR40A9pUgscw";
	var redirectURL="http://ksg9155.iptime.org"
	var url="https://nid.naver.com/oauth2.0/authorize?client_id=" + clientID + "&response_type=code&redirect_uri=" + redirectURL + "&state=" + state;
	//popWindow(url, "winZip", 500, 500, "no");
	window.open(url,"_blank","top=0,left=0,width=470,height=340,resizable=1,scrollbars=no");
}
</script>
test:<c:out value="${sessionScope.state}"/>
<br />
<a href="javascript:callLogin_naver()">테스트</a>
</html>