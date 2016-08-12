<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>	
	<title>administrator_Main</title>

	<!-- Meta -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="관리자 메인페이지">
	<meta name="author" content="배성욱">
	<meta name="date" content="2016-07-27">

	<c:import url="/WEB-INF/views/common/style_pack.jsp"/>

	<link rel="stylesheet" href="/assets/plugins/owl-carousel/owl-carousel/owl.carousel.css">
	<link rel="stylesheet" href="/assets/plugins/scrollbar/css/jquery.mCustomScrollbar.css">
	<link rel="stylesheet" href="/assets/plugins/fancybox/source/jquery.fancybox.css">
	
		<!-- CSS Header and Footer -->
	<link rel="stylesheet" href="/assets/css/headers/header-v7.css">
	<link rel="stylesheet" href="/assets/css/footers/footer-v1.css">

</head>
<body>
	<div class="wrapper">
		<!--=== Header v7 Left ===-->
		<div class="header-v7 header-left-v7">
			<c:import url="/WEB-INF/views/admin/common/adminleftmenu.jsp"/>
		</div>
		<!--=== End Header v7 Left ===-->

		<!--=== Content Side Left Right ===-->
		<div class="content-side-right">
			<div class="container content-sm">
			<!-- 코드 입력,삭제,수정부분 Start -->
			<div class="row">
				<div class="panel panel-green">
					<div class="panel-heading">
						<h3 class="panel-title"><i class="fa fa-long-arrow-right"></i> 코드조작</h3>
					</div>
					<div class="panel-body">
					<div class="text-right">
						<table>
						<form:form commandName="commonCode" id="commonCodeForm">
							<tr>
								<form:hidden path="code_CRUD" id="code_CRUD"/>
								<th>고유코드</th>
								<td>
									<form:input path="code" id="code" maxlength="5" cssClass="form-control"/>
									<form:hidden path="code_seq" id="code_seq" maxlength="5" cssClass="form-control"/>
									<!-- <input type="text" name="code" maxlength="5" id="code" class="form-control"/> -->
								</td>
								<th>코드명</th>
								<td>
									<form:input path="code_name" id="code_name" maxlength="30" cssClass="form-control"/>
									<!-- <input type="text" name="code_name" maxlength="30" id="code_name" class="form-control"/> -->
								</td>
								<th>코드그룹</th>
								<td>
									<form:input path="code_group" id="code_group" maxlength="10" cssClass="form-control"/>
									<!-- <input type="text" name="code_group" maxlength="10" id="code_group" class="form-control"/> -->
								</td>
								<th>코드그룹명</th>
								<td>
									<form:input path="code_group_name" id="code_group_name" maxlength="30" cssClass="form-control"/>
									<!-- <input type="text" name="code_group_name" maxlength="30" id="code_group_name" class="form-control"/> -->
								</td>
								<th>코드밸류</th>
								<td>
									<form:input path="code_value" id="code_value" maxlength="30" cssClass="form-control"/>
									<!-- <input type="text" name="code_value" maxlength="30" id="code_value" class="form-control"/> -->
								</td>
								<th>코드정렬</th>
								<td>
									<form:input path="code_sort" id="code_sort" maxlength="3" cssClass="form-control"/>
									<!-- <input type="text" name="code_value" maxlength="30" id="code_value" class="form-control"/> -->
								</td>
							</tr>
						</form:form>
						</table>
						<br/>
						<input type="button" class="btn btn-warning" value="수정" onclick="updateCcodeFormSubmin()">
						<input type="button" class="btn btn-danger" value="삭제" onclick="deleteCodeFormSubmin()">
						<input type="button" class="btn btn-primary" value="등록" onclick="insertCcodeFormSubmin()">
					</div>
					</div>
				</div>
			</div><!--/end row!-- 코드 입력,삭제,수정부분 End -->
			
			<!-- 코드목록 Start -->
			<div class="row">
				<div class="panel panel-grey margin-bottom-40">
					<div class="panel-heading">
						<h3 class="panel-title"><i class="fa fa-list"></i> 코드 목록 - ${fn:length(commonCodeList)}개</h3>
					</div>
					<div class="panel-body">
						<table class="table table-bordered">
							<thead>
								<tr>
									<th>번호</th>
									<th>고유코드</th>
									<th>코드명</th>
									<th>코드그룹</th>
									<th>코드그룹명</th>
									<th>코드밸류</th>
									<th>코드정렬</th>
								</tr>
							</thead>
							<tbody>
							<c:forEach items="${commonCodeList}" var="codeList">
								<tr>
									<td><c:out value="${codeList.code_seq}"/></td>
									<td>
										<a href="javascript:codeSelector('${codeList.code_seq}','${codeList.code}','${codeList.code_name}','${codeList.code_group}','${codeList.code_group_name}','${codeList.code_value}','${codeList.code_sort}')">
											<c:out value="${codeList.code}"/>
										</a>
									</td>
									<td><c:out value="${codeList.code_name}"/></td>
									<td><c:out value="${codeList.code_group}"/></td>
									<td><c:out value="${codeList.code_group_name}"/></td>
									<td><c:out value="${codeList.code_value}"/></td>
									<td><c:out value="${codeList.code_sort}"/></td>
								</tr>
							</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
			<!-- 코드목록 End -->
			
			
			</div><!-- container content-sm -->
		</div><!-- "content-side-right END -->
	</div><!--/wrapper-->

<!-- ------------------------------------------------------------------------------------------------------------------- -->
	<!--=== End Style Switcher ===-->
	<c:import url="/WEB-INF/views/common/js_pack.jsp"/>
	<script type="text/javascript" src="/assets/plugins/owl-carousel/owl-carousel/owl.carousel.js"></script>
	<script type="text/javascript" src="/assets/plugins/jquery-appear.js"></script>
	<script type="text/javascript" src="/assets/plugins/fancybox/source/jquery.fancybox.pack.js"></script>
	<script type="text/javascript" src="/assets/plugins/scrollbar/js/jquery.mCustomScrollbar.concat.min.js"></script>
	<script type="text/javascript" src="/assets/js/plugins/fancy-box.js"></script>
	<script type="text/javascript" src="/assets/js/plugins/progress-bar.js"></script>
	<script type="text/javascript" src="/assets/js/plugins/owl-carousel.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function() {
			App.init();
			App.initCounter();
			App.initParallaxBg();
			App.initScrollBar();
			FancyBox.initFancybox();
			App.initSidebarMenuDropdown();
			OwlCarousel.initOwlCarousel();
			StyleSwitcher.initStyleSwitcher();
			ProgressBar.initProgressBarHorizontal();
		});
		
		//코드목록에서 코드이름을 누르면 폼에 값들이 채워지는 함수
		function codeSelector(code_seq, code, code_name, code_group, code_group_name, code_value, code_sort) {
			$(function() {
				$("#code_seq").val(code_seq);
				$("#code").val(code);
				$("#code_name").val(code_name);
				$("#code_group").val(code_group);
				$("#code_group_name").val(code_group_name);
				$("#code_value").val(code_value);
				$("#code_sort").val(code_sort);
			});
		}
		
		// 공통코드 값을 수정
		function updateCcodeFormSubmin() {
			var form = document.getElementById("commonCodeForm");
			$("#code_CRUD").val("U");
			form.action="/admin/code.do"; 
			form.submit();
		}
		
		// 공통코드 값을 삭제
		function deleteCodeFormSubmin() {
			var form = document.getElementById("commonCodeForm");
			$("#code_CRUD").val("D");
			
			form.action="/admin/code.do"; 
			form.submit();
		}
		
		// 공통코드 값을 등록
		function insertCcodeFormSubmin() {
			var form = document.getElementById("commonCodeForm");
			$("#code_CRUD").val("C");
			
			form.action="/admin/code.do"; 
			form.submit();
		}
	</script>
</body>
</html>