<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<img src="http://www.airkorea.or.kr/airkorea/station_photo/NAMIS/station_images/238145/INSIDE_OTHER_1.jpg
"/>
<P>  The time on the server is ${serverTime}. </P>


<script type="text/javascript" src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.2.js" charset="utf-8"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	// 네이버 사용자 프로필 조회 이후 프로필 정보를 처리할 callback function
	function naverSignInCallback() {
		// naver_id_login.getProfileData('프로파일항목명');
		// 프로필 항목은 개발가이드를 참고하시기 바랍니다.
		alert(naver_id_login.getProfileData('email'));
		alert(naver_id_login.getProfileData('nickname'));
		alert(naver_id_login.getProfileData('age'));
	}

	// 네이버 사용자 프로필 조회
	//naver_id_login.get_naver_userprofile("naverSignInCallback()");
</script>
<!-- //네이버아디디로로그인 Callback 페이지 처리 Script -->
<a href="javascript:naverSignInCallback()">확인</a>
test:<c:out value="${sessionScope}"/>
test1:<c:out value="${sessionScope.state}"/>
</body>
</html>
