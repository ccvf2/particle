<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="ko" class="ie8"> <![endif]-->
<!--[if IE 9]> <html lang="ko" class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html lang="ko"> <!--<![endif]-->
<head>
	<title>Particle 메인 페이지</title>

	<!-- Meta -->
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">

	<c:import url="/WEB-INF/views/common/style_pack.jsp"/>
</head>

<body>
	<div class="wrapper">
		<!--=== Header ===-->
		<c:import url="/common/header.do"/>
		<!--=== End Header ===-->

		<!--=== FAQ Page ===-->
		<div class="container content faq-page">
			<div class="row equal-height-columns margin-bottom-40">
				<div class="col-md-5 col-sm-4">
					<div class="panel panel-blue">
						<div class="panel-heading">
							<h3 class="panel-title"><i class="fa fa-tasks"></i> 전국구 미세먼지</h3>
						</div>
						<div class="panel-body">
							<!-- 전국별 미세먼지 현황이 지도로 나와야 할 부분 -->
								<!-- Google Map -->
							<div id="map" class="map"></div>
							<!-- End Google Map -->
							<!-- 전국별 미세먼지 현황이 지도로 나와야 할 부분 끝-->
						</div>
					</div>
				</div>
				
				<!-- 측정소의 시간대별 미세먼지가 표로 나오는 곳 -->
				<div class="col-md-7 col-sm-8">
					<div class="panel panel-blue margin-bottom-40">
						<div class="panel-heading">
							<h3 class="panel-title"><i class="fa fa-gear"></i>종로구</h3>
						</div>
						<table class="table table-hover">
							<thead>
								<tr>
									<th>시간</th>
									<th>PM10</th>
									<th>PM2.5</th>
									<th>오존</th>
									<th>이산화질소</th>
									<th>일산화탄소</th>
									<th>아황산가스</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-danger btn-xs">0.0004</a></td>
									<td><a class="btn btn-danger btn-xs">0.0004</a></td>
									<td><a class="btn btn-danger btn-xs">0.5</a></td>
									<td><a class="btn btn-danger btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>2</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-warning btn-xs">43</a></td>
									<td><a class="btn btn-warning btn-xs">0.0004</a></td>
									<td><a class="btn btn-warning btn-xs">0.0004</a></td>
									<td><a class="btn btn-warning btn-xs">0.5</a></td>
									<td><a class="btn btn-warning btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>3</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-info btn-xs">44</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.5</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>4</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-success btn-xs">32</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.5</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>5</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-success btn-xs">32</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.5</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>6</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-success btn-xs">32</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.5</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>7</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-success btn-xs">32</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.5</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>8</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-success btn-xs">32</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.5</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>9</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-success btn-xs">32</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.5</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>10</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-success btn-xs">32</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.5</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>11</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-success btn-xs">32</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.5</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
								</tr>
								<tr>
									<td>12</td>
									<td><a class="btn btn-danger btn-xs">44</a></td>
									<td><a class="btn btn-success btn-xs">32</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
									<td><a class="btn btn-info btn-xs">0.5</a></td>
									<td><a class="btn btn-info btn-xs">0.0004</a></td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<!-- 측정소의 시간대별 미세먼지가 표로 나오는 곳 끝-->
				
				
				<!-- 측정소별 현재 미세먼지 아이콘과 뉴스가 나올 row -->
				<div class="col-md-4 col-sm-4">
					<div class="panel panel-blue">
						<div class="panel-heading">
							<h3 class="panel-title"><i class="fa fa-tasks"></i> 오늘의 미세먼지</h3>
						</div>
						<div class="panel-body">
							<div class="service-info" style="background:none;">
								<div class="margin-bottom-30">
									<i class="service-info-icon rounded-x icon-wrench"></i>
									<div class="info-description">
										<h3 class="title-v3-md text-uppercase">미세먼지 현황</h3>
										<p>적당한 미세먼지입니다. 어쩌구=블라eros at erat lacinia tempus.</p>
									</div>
								</div>
								<div class="margin-bottom-30">
									<i class="service-info-icon rounded-x icon-power"></i>
									<div class="info-description">
										<h3 class="title-v3-md text-uppercase">마스크</h3>
										<p>마스크는 어쩌구 등급 이상의 마스크를 써야 합니다.lacinia tempus.</p>
									</div>
								</div>
								<div class="md-margin-bottom-30">
									<i class="service-info-icon rounded-x icon-bell"></i>
									<div class="info-description">
										<h3 class="title-v3-md text-uppercase">운동</h3>
										<p>노약자는 운동을 삼가는 것이 좋nex. lacinia tempus.</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				
				<div class="col-md-8 col-sm-8">
					<div class="panel panel-blue">
						<div class="panel-heading">
							<h3 class="panel-title"><i class="fa fa-tasks"></i> 미세먼지 뉴스</h3>
						</div>
						<div class="panel-body">
							미세먼지 뉴스
						</div>
					</div>
				</div>
			</div>
		</div><!--/container-->
		<!--=== End FAQ Page ===-->
	</div>
	<!-- End Wrapper -->
<!-- footer area -->
<c:import url="/WEB-INF/views/common/footer.jsp"/>
<!-- footer area -->

<c:import url="/WEB-INF/views/common/js_pack.jsp"/>



	<script type="text/javascript">
		jQuery(document).ready(function() {
			App.init();
			App.initCounter();
			App.initParallaxBg();
			ContactPage.initMap();
			StyleSwitcher.initStyleSwitcher();
		});
	</script>
	<!--[if lt IE 9]>
	<script src="assets/plugins/respond.js"></script>
	<script src="assets/plugins/html5shiv.js"></script>
	<script src="assets/plugins/placeholder-IE-fixes.js"></script>
	<![endif]-->
</body>
</html>