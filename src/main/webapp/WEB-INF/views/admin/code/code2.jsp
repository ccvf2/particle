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
			<!-- Interactive Slider -->
<!-- 			<div class="interactive-slider-v1 img-v3">
				<div class="container">
					<h2>Welcome to Unify</h2>
					<p>Unify is a clean and fully responsive incredible Template.</p>
				</div>
			</div> -->
			<!-- End Interactive Slider -->

			<!-- Content Boxes v6-->
<!-- 			<div class="container content-sm">
				<div class="row">
					<div class="col-md-4 content-boxes-v6 md-margin-bottom-50">
						<i class="rounded-x icon-link"></i>
						<h1 class="title-v3-md text-uppercase margin-bottom-10">Fully responsive</h1>
						<p>At vero eos et accusato odio dignissimos ducimus qui blanditiis praesentium voluptatum.</p>
					</div>
					<div class="col-md-4 content-boxes-v6 md-margin-bottom-50">
						<i class="rounded-x icon-paper-plane"></i>
						<h2 class="title-v3-md text-uppercase margin-bottom-10">Modern design</h2>
						<p>At vero eos et accusato odio dignissimos ducimus qui blanditiis praesentium voluptatum.</p>
					</div>
					<div class="col-md-4 content-boxes-v6">
						<i class="rounded-x icon-refresh"></i>
						<h2 class="title-v3-md text-uppercase margin-bottom-10">Powerful slides</h2>
						<p>At vero eos et accusato odio dignissimos ducimus qui blanditiis praesentium voluptatum.</p>
					</div>
				</div>/row
			</div> -->
			<!--/end container-->
			<!-- End Content Boxes v6 -->

			<!-- Container Part -->
			<div class="bg-color-light">
				<div class="container content-sm">
					<div class="row">
						<div class="col-md-6 md-margin-bottom-50">
							<img class="img-responsive" src="/assets/img/mockup/imac2.png" alt="">
						</div>
						<div class="col-md-6">
							<br><br><br>
							<div class="headline-left margin-bottom-30">
								<h2 class="headline-brd">WE ARE UNIFY AGENCY</h2>
								<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form.</p>
							</div>
							<ul class="list-unstyled lists-v2 margin-bottom-30">
								<li><i class="fa fa-check"></i> Suspendisse eget augue non dolor ultrices</li>
								<li><i class="fa fa-check"></i> Donec eget aliquet tortor, quis lacinia dolor</li>
								<li><i class="fa fa-check"></i> Curabitur ut augue at mi eleifend lobortis</li>
							</ul>
							<a href="#" class="btn-u btn-brd btn-brd-hover btn-u-dark">Learn More</a>
						</div><!--/end row-->
					</div>
				</div>
			</div>
			<!-- End Container Part -->

			<!-- Container Part -->
			<div class="container content-sm">
				<div class="headline-center margin-bottom-40">
					<h2>WHY WE ARE GOOD</h2>
					<p>Phasellus vitae ipsum ex. Etiam eu vestibulum ante. <br>
						Lorem ipsum <strong>dolor</strong> sit amet, consectetur adipiscing elit. Morbi libero libero, imperdiet fringilla </p>
				</div>

				<div class="row">
					<div class="col-md-6 content-xs md-margin-bottom-50">
						<p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.</p>
						<p>If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet.</p><br>
						<a href="#" class="btn-u btn-brd btn-brd-hover btn-u-dark margin-right-10">Read More</a>
						<a href="#" class="btn-u">Purchase Now</a>
					</div>

					<!-- Smallest Progress Bar -->
					<div class="col-md-6 progress-box">
						<h3 class="heading-xs">Web Design <span class="pull-right">88%</span></h3>
						<div class="progress progress-u progress-xxs">
							<div class="progress-bar progress-bar-u" role="progressbar" data-width="88">
							</div>
						</div>

						<h3 class="heading-xs">PHP/WordPress <span class="pull-right">76%</span></h3>
						<div class="progress progress-u progress-xxs">
							<div class="progress-bar progress-bar-u" role="progressbar" data-width="76">
							</div>
						</div>

						<h3 class="heading-xs">HTML/CSS <span class="pull-right">97%</span></h3>
						<div class="progress progress-u progress-xxs">
							<div class="progress-bar progress-bar-u" role="progressbar" data-width="97">
							</div>
						</div>

						<h3 class="heading-xs">Illustration <span class="pull-right">69%</span></h3>
						<div class="progress progress-u progress-xxs">
							<div class="progress-bar progress-bar-u" role="progressbar" data-width="69">
							</div>
						</div>
					</div>
					<!-- End Smallest Progress Bar -->
				</div><!--/end row-->
			</div>
			<!-- End Container Part -->

			<!-- Parallax Counter v4 -->
			<div class="parallax-counter-v4 parallaxBg">
				<div class="container content-sm">
					<div class="row">
						<div class="col-md-3 col-xs-6 md-margin-bottom-50">
							<i class="icon-cup"></i>
							<span class="counter">265</span>
							<h4>Coffee's Drunk</h4>
						</div>
						<div class="col-md-3 col-xs-6 md-margin-bottom-50">
							<i class="icon-clock"></i>
							<span class="counter">5957</span>
							<h4>Working Hours</h4>
						</div>
						<div class="col-md-3 col-xs-6">
							<i class="icon-emoticon-smile"></i>
							<span class="counter">3495</span>
							<h4>Happy Clients</h4>
						</div>
						<div class="col-md-3 col-xs-6">
							<i class="icon-bulb"></i>
							<span class="counter">576</span>
							<h4>New Ideas</h4>
						</div>
					</div><!--/end row-->
				</div><!--/end container-->
			</div>
			<!-- End Parallax Counter v4 -->

			<!-- Image Gallery -->
			<div class="container-fluid">
				<div class="container content-sm">
					<div class="text-center">
						<h2 class="title-v2 title-center">PHOTO STREAM</h2>
						<p class="space-lg-hor no-margin-bottom">If you are going to use a <span class="color-green">passage of Lorem Ipsum</span>, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making <span class="color-green">this the first</span> true generator on the Internet.</p>
					</div>
				</div>

				<div class="row no-gutter">
					<div class="col-sm-3 sm-margin-bottom-30">
						<a href="assets/img/main/img12.jpg" class="fancybox img-hover-v2" title="Image 1">
							<span><img class="img-responsive" src="/assets/img/main/img12.jpg" alt=""></span>
						</a>
					</div>
					<div class="col-sm-3 sm-margin-bottom-30">
						<a href="assets/img/main/img17.jpg" class="fancybox img-hover-v2" title="Image 2">
							<span><img class="img-responsive" src="/assets/img/main/img17.jpg" alt=""></span>
						</a>
					</div>
					<div class="col-sm-3 sm-margin-bottom-30">
						<a href="assets/img/main/img4.jpg" class="fancybox img-hover-v2" title="Image 3">
							<span><img class="img-responsive" src="/assets/img/main/img4.jpg" alt=""></span>
						</a>
					</div>
					<div class="col-sm-3">
						<a href="assets/img/main/img16.jpg" class="fancybox img-hover-v2" title="Image 4">
							<span><img class="img-responsive" src="/assets/img/main/img16.jpg" alt=""></span>
						</a>
					</div>
				</div>
			</div>
			<!-- End Image Gallery -->

			<!-- Call To Action -->
			<div class="call-action-v1 bg-color-green">
				<div class="container">
					<div class="call-action-v1-box">
						<div class="call-action-v1-in">
							<p class="color-light">Unify creative technology company providing key digital services and focused on helping our clients to build a successful business on web and mobile.</p>
						</div>
						<div class="call-action-v1-in inner-btn page-scroll">
							<a href="#portfolio" class="btn-u btn-brd btn-brd-hover btn-u-light btn-u-block">View Our Portfolio</a>
						</div>
					</div>
				</div>
			</div>
			<!-- End Call To Action -->

			<!-- Quote v2 -->
			<div class="container content">
				<div class="quote-v2">
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent nibh leo, cursus ut eros sit amet, fringilla vulputate diam. Fusce justo velit, venenatis at lectus in, laoreet suscipit arcu.</p>
					<span>John Clarck <a href="#">Google Inc.</a></span>
				</div>
			</div>
			<!-- End Quote v2 -->

			<!-- Owl Clients v1 -->
			<div class="bg-color-light">
				<div class="container content-sm">
					<div class="owl-clients-v1">
						<div class="item">
							<img src="/assets/img/clients4/1.png" alt="">
						</div>
						<div class="item">
							<img src="/assets/img/clients4/2.png" alt="">
						</div>
						<div class="item">
							<img src="/assets/img/clients4/3.png" alt="">
						</div>
						<div class="item">
							<img src="/assets/img/clients4/4.png" alt="">
						</div>
						<div class="item">
							<img src="/assets/img/clients4/5.png" alt="">
						</div>
						<div class="item">
							<img src="/assets/img/clients4/6.png" alt="">
						</div>
						<div class="item">
							<img src="/assets/img/clients4/7.png" alt="">
						</div>
						<div class="item">
							<img src="/assets/img/clients4/8.png" alt="">
						</div>
						<div class="item">
							<img src="/assets/img/clients4/9.png" alt="">
						</div>
					</div>
				</div>
			</div>
			<!-- End Owl Clients v1 -->
		</div>
		<!--=== End Content Side Left Right ===-->
	</div><!--/wrapper-->

	<!--=== Style Switcher ===-->
	<i class="style-switcher-btn fa fa-cogs hidden-xs"></i>
	<div class="style-switcher animated fadeInRight">
		<div class="style-swticher-header">
			<div class="style-switcher-heading">Style Switcher</div>
			<div class="theme-close"><i class="icon-close"></i></div>
		</div>

		<div class="style-swticher-body">
			<!-- Theme Colors -->
			<div class="style-switcher-heading">Theme Colors</div>
			<ul class="list-unstyled">
				<li class="theme-default theme-active" data-style="default" data-header="light"></li>
				<li class="theme-blue" data-style="blue" data-header="light"></li>
				<li class="theme-orange" data-style="orange" data-header="light"></li>
				<li class="theme-red" data-style="red" data-header="light"></li>
				<li class="theme-light" data-style="light" data-header="light"></li>
				<li class="theme-purple last" data-style="purple" data-header="light"></li>
				<li class="theme-aqua" data-style="aqua" data-header="light"></li>
				<li class="theme-brown" data-style="brown" data-header="light"></li>
				<li class="theme-dark-blue" data-style="dark-blue" data-header="light"></li>
				<li class="theme-light-green" data-style="light-green" data-header="light"></li>
				<li class="theme-dark-red" data-style="dark-red" data-header="light"></li>
				<li class="theme-teal last" data-style="teal" data-header="light"></li>
			</ul>

			<!-- Theme Skins -->
			<div class="style-switcher-heading">Theme Skins</div>
			<div class="row no-col-space margin-bottom-20 skins-section">
				<div class="col-xs-6">
					<button data-skins="default" class="btn-u btn-u-xs btn-u-dark btn-block active-switcher-btn handle-skins-btn">Light</button>
				</div>
				<div class="col-xs-6">
					<button data-skins="dark" class="btn-u btn-u-xs btn-u-dark btn-block skins-btn">Dark</button>
				</div>
			</div>

			<hr>

			<!-- Layout Styles -->
			<div class="style-switcher-heading">Layout Styles</div>
			<div class="row no-col-space margin-bottom-20">
				<div class="col-xs-6">
					<a href="javascript:void(0);" class="btn-u btn-u-xs btn-u-dark btn-block active-switcher-btn wide-layout-btn">Wide</a>
				</div>
				<div class="col-xs-6">
					<a href="javascript:void(0);" class="btn-u btn-u-xs btn-u-dark btn-block boxed-layout-btn">Boxed</a>
				</div>
			</div>

			<hr>

			<!-- Theme Type -->
			<div class="style-switcher-heading">Theme Types and Versions</div>
			<div class="row no-col-space margin-bottom-10">
				<div class="col-xs-6">
					<a href="E-Commerce/index.html" class="btn-u btn-u-xs btn-u-dark btn-block">Shop UI <small class="dp-block">Template</small></a>
				</div>
				<div class="col-xs-6">
					<a href="One-Pages/Classic/index.html" class="btn-u btn-u-xs btn-u-dark btn-block">One Page <small class="dp-block">Template</small></a>
				</div>
			</div>

			<div class="row no-col-space">
				<div class="col-xs-6">
					<a href="Blog-Magazine/index.html" class="btn-u btn-u-xs btn-u-dark btn-block">Blog <small class="dp-block">Template</small></a>
				</div>
				<div class="col-xs-6">
					<a href="RTL/index.html" class="btn-u btn-u-xs btn-u-dark btn-block">RTL <small class="dp-block">Version</small></a>
				</div>
			</div>
		</div>
	</div><!--/style-switcher-->
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