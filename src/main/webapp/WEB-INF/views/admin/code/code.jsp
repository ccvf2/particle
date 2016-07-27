<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
							<tr>
								<th>고유코드</th>
								<td>
									<input type="text" name="code" maxlength="5" id="code" class="form-control"/>
								</td>
								<th>코드명</th>
								<td>
									<input type="text" name="code_name" maxlength="30" id="code_name" class="form-control"/>
								</td>
								<th>코드그룹</th>
								<td>
									<input type="text" name="code_group" maxlength="10" id="code_group" class="form-control"/>
								</td>
								<th>코드그룹명</th>
								<td>
									<input type="text" name="code_group_name" maxlength="30" id="code_group_name" class="form-control"/>
								</td>
								<th>코드밸류</th>
								<td>
									<input type="text" name="code_value" maxlength="30" id="code_value" class="form-control"/>
								</td>
								<th>코드정렬</th>
								<td>
									<input type="text" name="code_value" maxlength="30" id="code_value" class="form-control"/>
								</td>
							</tr>
						</table>
						<br />
						<input type="button"  class="btn btn-primary" value="수정" onclick="updateCcodeFormSubmin()">
						<input type="button"  class="btn btn-primary" value="삭제" onclick="deleteCodeFormSubmin()">
						<input type="button"  class="btn btn-primary" value="등록" onclick="insertCcodeFormSubmin()">
					</div>
					</div>
				</div>
			</div><!--/end row!-- 코드 입력,삭제,수정부분 End -->
			
			<!-- 코드목록 Start -->
			<div class="row">
				<div class="panel panel-grey margin-bottom-40">
					<div class="panel-heading">
						<h3 class="panel-title"><i class="fa fa-globe"></i> 코드 목록</h3>
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
								<tr>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
									<td></td>
								</tr>
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
	</script>
</body>
</html>