<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
		<div class="header">
			<div class="container">
				<!-- Logo -->
				<a class="logo" href="/main/main.do">
					<img src="/assets/img/logo1-default.png" alt="Logo">
				</a>
				<!-- End Logo -->

				<!-- Topbar -->
				<div class="topbar">
					<div class="loginbar pull-right">
						<ul>
							<li><a href="/login/login.do">login</a></li>
						</ul>
						<!-- <div id="naver_id_login"></div> -->
					</div>
				</div>
				<!-- End Topbar -->

				<!-- Toggle get grouped for better mobile display -->
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="fa fa-bars"></span>
				</button>
				<!-- End Toggle -->
			</div><!--/end container-->

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse mega-menu navbar-responsive-collapse">
				<div class="container">
					
					<ul class="nav navbar-nav">
						<!-- Demo Pages -->
						<li class="mega-menu-fullwidth">
							<div class="row">
								<div class="col-md-6 col-md-offset-3">
									<div class="input-group">
										<input type="text" class="form-control">
										<span class="input-group-btn">
											<button class="btn-u btn-u-blue" type="button">검색</button>
										</span>
									</div>
								</div>
							</div>
						</li>
						<!-- End Demo Pages -->
					</ul>
				</div><!--/end container-->
			</div><!--/navbar-collapse-->
		</div>