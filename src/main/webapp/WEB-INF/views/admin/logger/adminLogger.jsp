<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<title>관리자 로그페이지</title>
	<!-- Meta -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="관리자 로그페이지">
	<meta name="author" content="곽성국">
	<meta name="date" content="2016-08-11">
	
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
				<div class="row">
					<button class="btn btn-danger" type="button" onclick="deleteLogs()">Delete All Logs</button>
				</div>
				<div class="row top-buffer">
					<div class="panel panel-yellow">
						<div class="panel-heading">
							<h3 class="panel-title"><i class="fa fa-tasks"></i>Log</h3>
						</div>
						<div class="panel-body">
							<c:forEach items="${adminLoggerList}" var="adminLogger">
								<p>
									<fmt:formatDate value="${adminLogger.adminlog_time}" type="both" dateStyle="medium"/> : 
									<c:out value="${adminLogger.adminlog_cat}"></c:out> :
									<c:out value="${adminLogger.adminlog_title}"></c:out>
									<c:out value="${adminLogger.adminlog_contents}"></c:out>
									<c:out value="${adminLogger.adminlog_error}"></c:out>
								</p>
							</c:forEach>
						</div>
						<c:forEach items="${loggerCategoryList}" var="loggerCategory">
							${loggerCategory.code}
						</c:forEach>
					</div>
				</div>
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
		
		function deleteLogs() {
			$.ajax({
				url: "/admin/loggerDelete.ajax",
				type:"get",
				dataType:"text",
				success: deleteLogsSuccess,
				error:function(xhr, status, errorMsg){
					alert(xhr+","+status+","+errorMsg);
				}
			});
		}
		
		function deleteLogsSuccess() {
			$( ".panel-body" ).empty();
		}
	</script>
</body>
</html>