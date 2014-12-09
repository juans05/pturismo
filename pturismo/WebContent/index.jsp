<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js">
<!--<![endif]-->
<head>
	<title>PTurismo</title>
	<%@ include file="/WEB-INF/jsp/componentes/listcss.jsp" %>
</head>

<body>
	<div>
						<a href="toLogin">Login</a><br/>
						<!-- <a href="toSignUp">Sign Up</a> -->
						<a href="toRegistro">Registro</a>
						<!-- <a href="toGetBuckets">Get Buckets</a> -->
						
	</div>
	
	<%@ include file="/WEB-INF/jsp/componentes/header.jsp" %>
	
	<!--==========================
	Slider
	============================-->
	<section id="home" class="">
	  <div id="home-slider" style="width: 100%; height: 550px; margin: 0px auto; ">
	    <div class="ls-layer " style="slidedirection: top; slidedelay: 2000; durationin: 2000; durationout: 1000; delayout: 500;"> 
	      <img src="assets/img/slides/slide1.jpg" class="ls-bg" alt="">
	      <div class="ls-s2 l2-s1 ls-s" style="position:absolute;slidedirection:left; top:95px; left:70%;"> 
	            <img src="assets/img/slides/zic.png" alt=""> 
	      </div>
	       <div class="ls-s2 l2-s1 ls-s" style="position:absolute;slidedirection:left; top:155px; left:73.3%; durationin: 1500;delayout: 500;"> 
	            <img src="assets/img/slides/doted-line.png" alt=""> 
	      </div>
	    </div>
	    <div class="ls-layer" style="slidedelay: 1000;"> 
	    	<img src="assets/img/slides/slide2.jpg" class="ls-bg" alt=""> 
	    </div>
	    <div class="ls-layer" style="slidedelay:1000; delayout: 500; transition2d: all;"> 
	    	<img src="assets/img/slides/slide3.jpg" class="ls-bg" alt=""> 
	    </div>
	    <div class="ls-layer" style="slidedelay:1000; delayout: 500; transition2d: all;"> 
	    	<img src="assets/img/slides/slide5.jpg" class="ls-bg" alt=""> 
	    </div>
	    <div class="ls-layer" style="slidedelay:1000; delayout: 500; transition2d: all;"> 
	    	<img src="assets/img/slides/slide6.jpg" class="ls-bg" alt=""> 
	    </div>
	  </div>
	  <div class="slider-overlay">
	  		<div class="overlay-line"></div>
	    	<div class="overlay-content container">
	        	<div class="content-detail">
	            	<div class="title">
	                    <div class="t-large">
	                    	VIETNAM
	                    </div>
	                    <div class="t-medium">
	                    	HO CHI MINH CITY
	                    </div>
	                </div>
	                <div class="price-tag">
	                    <div class="tag">
	                    	From
	                    </div>
	                    <div class="price">
	                    	$1059
	                    </div>
	                </div>
	                <div class="booknow">
	                	<a href="destination-detail.html">Book Now</a>
	                </div>
	            </div>
	        </div>
	  </div>
	</section><!--\\slider ends here-->
	<div class="overlay-overflow"></div>
	
	<div class="BG-map">
	<div class="BG-map-inner">
	
	<!--==========================
	Destinations
	============================-->
	<section id="destinations-wrapper" class="container">
		<div class="destinations-inner">
	    	<div class="row-fluid">
	        	<div class="span5">
	                <div class="desti-head">
	                    <div class="heading">
	                            <div class="head-circle">
	                                <div class="head-circle-inner"></div>
	                            </div>
	                        Special Destinations
	                        <div class="head-bottom-bar"></div>
	                    </div><!--heading-->
	                </div>
	            </div>
	            
	            <div class="span7">
	                <div class="caption">
	                    <p>Pellentesque facilisis tellus in enim venenatis egestas. Fusce varius laoreet massa sit amet accumsan.</p>
	                </div>
	            </div>
	         </div>
	
	         <div class="clearfix"></div>
	         <div class="destination-wrapper">
	         <div class="clearfix"></div>
	         	<div class="row-fluid">
	            	<div class="span5">
	                
	                    <div class="destination-carosel">
	                        <div id="destination-showcase">
	                        
	                        	<ul class="rs-slider">
	                        
	                                <li>
	                                    <div class="slide-holder">
	                                        <img src="assets/img/destination/mini-slider/1.jpg" alt=""/>
	                                        
	                                        <div class="caption">
	                                        	<p>The PGA WEST TPC Stadium Course in Palm Springs</p>
	                                        </div>
	                                        <div class="city">California</div>
	                                    </div>
	                                 </li>
	                                 
	                                 <li>
	                                    <div class="slide-holder">
	                                        <img src="assets/img/destination/mini-slider/2.jpg" alt=""/>
	                                        <div class="caption">
	                                        	<p>The PGA WEST TPC Stadium Course in Palm Springs</p>
	                                        </div>
	                                        <div class="city">UAE</div>
	                                    </div>
	                                 </li>
	                                 <li>
	                                    <div class="slide-holder">
	                                        <img src="assets/img/destination/mini-slider/3.jpg" alt=""/>
	                                        <div class="caption">
	                                        	<p>The PGA WEST TPC Stadium Course in Palm Springs</p>
	                                        </div>
	                                        <div class="city">South Africa</div>
	                                    </div>
	                                 </li>
	                                 <li>
	                                    <div class="slide-holder">
	                                        <img src="assets/img/destination/mini-slider/4.jpg" alt=""/>
	                                        <div class="caption">
	                                        	<p>The PGA WEST TPC Stadium Course in Palm Springs</p>
	                                        </div>
	                                        <div class="city">Lorem</div>
	                                    </div>
	                                 </li>
	                                 <li>
	                                    <div class="slide-holder">
	                                        <img src="assets/img/destination/mini-slider/5.jpg" alt=""/>
	                                        <div class="caption">
	                                        	<p>The PGA WEST TPC Stadium Course in Palm Springs</p>
	                                        </div>
	                                        <div class="city">Ipsum</div>
	                                    </div>
	                                 </li>
	                              </ul>
	                             
	                         </div><!--destination-showcase-->
	                        
	                         <div id="destination-thumbs"></div><!--destination-thumbs-->
	                         
	                         <div class="view-detail">
	                             <div>View More <span class="icon-double-angle-right"></span></div>
	                             <a href="destinations.html">Destinations</a>
	                         </div>
	                        
	                     </div><!--destination-carosel-->
	                    
	                 <div class="clearfix"></div>
	                </div><!--span-->
	                
	                <div class="span7">
	                
	                	
	                    <div class="box1 box-inner">
	                            <img src="assets/img/destination/boxes/box1.jpg" alt="" />
	                            <div class="box-icon"><span class="icon-play"></span></div>
	                            <div class="box-hover">
	                                <div class="box-caption">
	                                    <div class="tag-line">Amazing Hotels and Airfare</div>
	                                    <div class="city">San Diego</div>
	                                </div>
	                                <a href="destination-detail.html" class="link"><span class="icon-double-angle-right"></span></a>
	                            </div>
	                        </div>
	                        
	                        <div class="box2 box-inner">
	                            <img src="assets/img/destination/boxes/box2.jpg" alt="" />
	                             <div class="box-hover">
	                                <div class="box-caption">
	                                    <div class="tag-line">Amazing Hotels and Airfare</div>
	                                    <div class="city">San Diego</div>
	                                </div>
	                                <a href="destination-detail.html" class="link"><span class="icon-double-angle-right"></span></a>
	                            </div>
	                        </div>
	                        
	                        <div class="box3 box-inner">
	                            <img src="assets/img/destination/boxes/box3.jpg" alt="" />
	                             <div class="box-hover">
	                                <div class="box-caption">
	                                    <div class="tag-line">Amazing Hotels and Airfare</div>
	                                    <div class="city">San Diego</div>
	                                </div>
	                                <a href="destination-detail.html" class="link"><span class="icon-double-angle-right"></span></a>
	                            </div>
	                        </div>
	                        
	                        <div class="box4 box-inner">
	                            <img src="assets/img/destination/boxes/box4.jpg" alt="" />
	                             <div class="box-hover">
	                                <div class="box-caption">
	                                    <div class="tag-line">Amazing Hotels and Airfare</div>
	                                    <div class="city">San Diego</div>
	                                </div>
	                                <a href="destination-detail.html" class="link"><span class="icon-double-angle-right"></span></a>
	                            </div>
	                        </div>
	                     </div>
	                <div class="clearfix"></div>
	                </div><!--span-->
	                
	            </div><!--row-->
	      
	    </div>
	</section>
	<div class="clearfix"></div>
	
	<!--==========================
	Tours
	============================-->
	<section id="tours-wrapper">
		<div class="tabs-top-border"></div>
	    
		<div class="container">
	         
	         <a href="#" class="left-arrow go-left"><span class="icon-chevron-left"></span></a>
			 <a href="#" class="right-arrow go-right"><span class="icon-chevron-right"></span></a>
	          <ul id="filter-tours" class="filter-out">
	              <li><a href="#" data-filter=".european">European tour</a></li>
	              <li><a href="#" data-filter=".asian">Asian tour</a></li>
	              <li class="header" >
					  <a href="#" data-filter="*">
						<div class="header-outer">
							<div class="section-header">
								  <div class="circle-outer">
									  <div class="inner-1">
										  <div class="inner-2"></div>
									  </div>
									  
								  </div>
								  <span>OUR TRAVELS</span>
								  <div class="head-bottom-bar"></div>
							</div>
						</div>
					  </a>
				  </li>
	              <li><a href="#" data-filter=".americas">Americas tour</a></li>
	              <li><a href="#" data-filter=".oceania">Oceania tour</a></li>
	              <li><a href="#" data-filter=".dummy">Dummy tour</a></li>
	          </ul>
	          <div class="clearfix"></div>
	    	 <div class="short-info">
	         	<p>Pellentesque facilisis tellus in enim venenatis egestas. Fusce varius laoreet massa sit amet accumsan. Pellentesque quis lorem vitae nunc dignissim porttitor.</p>
	         </div>
	         <div class="clearfix"></div>
	         <div class="tours-wrapper">
	         	<div class="tour european">
	            	<div class="tour-visual"> 
	                	<img src="assets/img/tours/1.jpg" alt="" />
	                    <div class="hover"></div>
	                    <div class="visual-tag tag-BG1"><span class="icon-heart"></span>456</div>
	                    
	                </div>
	                
	                    <div class="head">
	                        Bitexco Financial Tower
	                    </div>
	                    <div class="tag-line">
	                    	Ho Chi Minh, Vietnam
	                    </div>
	                    <div class="rate">
	                        <div class="rating ">
	                            <span class="icon-star star"></span>
	                            <span class="icon-star star"></span>
	                            <span class="icon-star star"></span>
	                            <span class="icon-star star"></span>
	                            <span class="icon-star"></span>
	                        </div>
	                        <div class="price">
	                        	$1059
	                        </div>
	                    </div>
	                    <div class="records">
	                    	<span class="icon-comment"><a href="#">196</a></span>
	                        <span class="icon-circle-arrow-right"><a href="#">77245</a></span>
	                        <span class="icon-map-marker"><a href="#">show maps</a></span>
	                        
	                    </div>
	                    <div class="tour-bottom-line"></div>
	                    <a href="travel-detail.html" class="booknow">Book Now</a>
	            </div><!--\\tour1-->
	
	            <div class="tour asian">
	            	<div class="tour-visual"> 
	                	<img src="assets/img/tours/2.jpg" alt="" />
	                    <div class="hover"></div>
	                </div>
	                    <div class="head">
	                        Bali Indonesia Hotel Deals
	                    </div>
	                    <div class="tag-line">
	                    	The Soul Of Vietnam
	                    </div>
	                    <div class="rate">
	                        <div class="rating ">
	                            <span class="icon-star star"></span>
	                            <span class="icon-star star"></span>
	                            <span class="icon-star star"></span>
	                            <span class="icon-star star"></span>
	                            <span class="icon-star"></span>
	                        </div>
	                        <div class="price">
	                        	$778
	                        </div>
	                    </div>
	                    <div class="records">
	                    	<span class="icon-comment"><a href="#">196</a></span>
	                        <span class="icon-circle-arrow-right"><a href="#">77245</a></span>
	                        <span class="icon-map-marker"><a href="#">show maps</a></span>
	                        
	                    </div>
	                    <div class="tour-bottom-line"></div>
	                    <a href="travel-detail.html" class="booknow">Book Now</a>
	                 
	            </div><!--\\tour2-->
	            
	            <div class="tour european dummy">
	            	<div class="tour-visual"> 
	                	<img src="assets/img/tours/3.jpg" alt="" />
	                    <div class="hover"></div>
	                    <div class="visual-tag tag-BG1">-50%</div>
	                </div>
	                    <div class="head">
	                        Bali Indonesia Hotel Deals
	                    </div>
	                    <div class="tag-line">
	                    	The Soul Of Vietnam
	                    </div>
	                    <div class="rate">
	                        <div class="rating ">
	                            <span class="icon-star star"></span>
	                            <span class="icon-star star"></span>
	                            <span class="icon-star star"></span>
	                            <span class="icon-star star"></span>
	                            <span class="icon-star"></span>
	                        </div>
	                        <div class="price">
	                        	$778
	                        </div>
	                    </div>
	                    <div class="records">
	                    	<span class="icon-comment"><a href="#">196</a></span>
	                        <span class="icon-circle-arrow-right"><a href="#">77245</a></span>
	                        <span class="icon-map-marker"><a href="#">show maps</a></span>
	                        
	                    </div>
	                    <div class="tour-bottom-line"></div>
	                    <a href="travel-detail.html" class="booknow">Book Now</a>
	                 
	            </div><!--\\tour3-->
	
	            <div class="tour tour-row-end asian">
	            	<div class="tour-visual"> 
	                	<img src="assets/img/tours/4.jpg" alt="" />
	                     <div class="hover"></div>
	                </div>
					<div class="head">
						Draysap
					</div>
					<div class="tag-line">
						Buon Ma Thuot, Vietnam
					</div>
					<div class="rate">
						<div class="rating ">
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star "></span>
							<span class="icon-star"></span>
						</div>
						<div class="price">
							$1059
						</div>
					</div>
					<div class="records">
						<span class="icon-comment"><a href="#">196</a></span>
						<span class="icon-circle-arrow-right"><a href="#">77245</a></span>
						<span class="icon-map-marker"><a href="#">show maps</a></span>
						
					</div>
					<div class="tour-bottom-line"></div>
					<a href="travel-detail.html" class="booknow">Book Now</a>
	            </div><!--\\tour4-->
	            
	            <div class="tour americas">
	            	<div class="tour-visual"> 
	                	<img src="assets/img/tours/5.jpg" alt="" />
	                    <div class="hover"></div>
	                    <div class="visual-tag tag-BG2">-10%</div>
	                </div>
					<div class="head">
					   Bitexco Financial Tower
					</div>
					<div class="tag-line">
						Ho Chi Minh, Vietnam
					</div>
					<div class="rate">
						<div class="rating ">
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star"></span>
						</div>
						<div class="price">
							$666
						</div>
					</div>
					<div class="records">
						<span class="icon-comment"><a href="#">196</a></span>
						<span class="icon-circle-arrow-right"><a href="#">77245</a></span>
						<span class="icon-map-marker"><a href="#">show maps</a></span>
						
					</div>
					<div class="tour-bottom-line"></div>
					<a href="travel-detail.html" class="booknow">Book Now</a> 
	            </div><!--\\tour5-->     
	            
	            <div class="tour oceania" >
	            	<div class="tour-visual"> 
	                	<img src="assets/img/tours/6.jpg" alt="" />
	                    <div class="hover"></div>
	                </div>
					<div class="head">
						Bitexco Financial Tower
					</div>
					<div class="tag-line">
						Ho Chi Minh, Vietnam
					</div>
					<div class="rate">
						<div class="rating ">
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star"></span>
						</div>
						<div class="price">
							$660
						</div>
					</div>
					<div class="records">
						<span class="icon-comment"><a href="#">196</a></span>
						<span class="icon-circle-arrow-right"><a href="#">77245</a></span>
						<span class="icon-map-marker"><a href="#">show maps</a></span>
					</div>
				   <div class="tour-bottom-line"></div>
					<a href="travel-detail.html" class="booknow">Book Now</a> 
	            </div><!--\\tour-->
	
	            <div class="tour americas">
	            	<div class="tour-visual"> 
	                	<img src="assets/img/tours/7.jpg" alt="" />
	                    <div class="hover"></div>
	                </div>
					<div class="head">
						Shanghai Hotel Deals
					</div>
					<div class="tag-line">
						The Soul Of Vietnam
					</div>
					<div class="rate">
						<div class="rating ">
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
						</div>
						<div class="price">
							$727
						</div>
					</div>
					<div class="records">
						<span class="icon-comment"><a href="#">196</a></span>
						<span class="icon-circle-arrow-right"><a href="#">77245</a></span>
						<span class="icon-map-marker"><a href="#">show maps</a></span>
						
					</div>
					<div class="tour-bottom-line"></div>
					<a href="travel-detail.html" class="booknow">Book Now</a>
	            </div><!--\\tour-->
	            
	            <div class="tour tour-row-end oceania">
	            	<div class="tour-visual"> 
	                	<img src="assets/img/tours/8.jpg" alt="" />
	                    <div class="hover"></div>
	                    <div class="visual-tag tag-BG3">-30%</div>
	                </div>
					<div class="head">
						Miami Hotels Discounted
					</div>
					<div class="tag-line">
						The Soul Of Vietnam
					</div>
					<div class="rate">
						<div class="rating ">
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star star"></span>
							<span class="icon-star"></span>
						</div>
						<div class="price">
							$3500
						</div>
					</div>
					<div class="records">
						<span class="icon-comment"><a href="#">196</a></span>
						<span class="icon-circle-arrow-right"><a href="#">77245</a></span>
						<span class="icon-map-marker"><a href="#">show maps</a></span>  
					</div>
					<div class="tour-bottom-line"></div>
					<a href="travel-detail.html" class="booknow">Book Now</a>
	            </div><!--\\tour-->   
	         </div>
	    </div><!--container-->
	</section>
	
	</div>
	</div>
	
	<!--============================
	tab-control
	============================-->
	<section id="special-offers">
		
		<div class="offers-overflow"></div>
		<div class="tabs-top-border"></div>
		 
		<div class="offers-tabs container">
	    <a href="#" class="left-arrow-tab "><span class="icon-chevron-left"></span></a>
		<a href="#" class="right-arrow-tab"><span class="icon-chevron-right"></span></a>
	      <div class="controls">
	         <ul class="single-tab">
	        	<li class="active" data-tabcontrol="#offer-1" data-carausel="#offerCarousel1">
	            	<div class="tab-btn control-BG1">
	                    <div class="tab-btn-inner">
	                         <div class="circle-outer">
	                              <div class="inner-1">
	                                  <div class="inner-2 control-BG1"></div>
	                              </div>
	                          </div><!--circle-outer-->
	                          10%
	                    </div>
	                    <div class="arrow"></div>
	                </div><!--tab-btn-->
	            </li>
	           <!--=============================================--> 
			   
	           <li data-tabcontrol="#offer-2" data-carausel="#offerCarousel2">
	               <div class="tab-btn control-BG2">
	                    <div class="tab-btn-inner">
	                         <div class="circle-outer">
	                              <div class="inner-1">
	                                  <div class="inner-2 control-BG2"></div>
	                              </div>
	                          </div><!--circle-outer-->
	                          20%
	                    </div>
	                    <div class="arrow"></div>
	                </div><!--tab-btn-->
	            </li>
	           <!--=============================================--> 
			   
	           <li data-tabcontrol="#offer-3" data-carausel="#offerCarousel3">
	               <div class="tab-btn control-BG3">
	                    <div class="tab-btn-inner">
	                         <div class="circle-outer">
	                              <div class="inner-1">
	                                  <div class="inner-2 control-BG3"></div>
	                              </div>
	                          </div><!--circle-outer-->
	                          30%
	                    </div>
	                    <div class="arrow"></div>
	                </div><!--tab-btn-->
	            </li>
				
	           <!--=============================================--> 
	           <li data-tabcontrol="#offer-4" data-carausel="#offerCarousel4">
	               <div class="tab-btn control-BG4">
	                    <div class="tab-btn-inner">
	                         <div class="circle-outer">
	                              <div class="inner-1">
	                                  <div class="inner-2 control-BG4"></div>
	                              </div>
	                          </div><!--circle-outer-->
	                          45%
	                    </div>
	                    <div class="arrow"></div>
	                </div><!--tab-btn-->
	            </li>
				
	           <!--=============================================--> 
	           <li data-tabcontrol="#offer-5" data-carausel="#offerCarousel5">
	               <div class="tab-btn control-BG5">
	                    <div class="tab-btn-inner">
	                         <div class="circle-outer">
	                              <div class="inner-1">
	                                  <div class="inner-2 control-BG5"></div>
	                              </div>
	                          </div><!--circle-outer-->
	                          50%
	                    </div>
	                    <div class="arrow"></div>
	                </div><!--tab-btn-->
	            </li>
	           <!--=============================================--> 
			   
	           <li data-tabcontrol="#offer-6" data-carausel="#offerCarousel6">
	               <div class="tab-btn control-BG6">
	                    <div class="tab-btn-inner">
	                         <div class="circle-outer">
	                              <div class="inner-1">
	                                  <div class="inner-2 control-BG6"></div>
	                              </div>
	                          </div><!--circle-outer-->
	                          60%
	                    </div>
	                    <div class="arrow"></div>
	                </div><!--tab-btn-->
	            </li>
	           <!--=============================================--> 
	           
	           <li data-tabcontrol="#offer-7" data-carausel="#offerCarousel7">
	               <div class="tab-btn control-BG7">
	                    <div class="tab-btn-inner">
	                         <div class="circle-outer">
	                              <div class="inner-1">
	                                  <div class="inner-2 control-BG7"></div>
	                              </div>
	                          </div><!--circle-outer-->
	                          65%
	                    </div>
	                    <div class="arrow"></div>
	                </div><!--tab-btn-->
	            </li>
	           <!--=============================================--> 
	           
	           <li data-tabcontrol="#offer-8" data-carausel="#offerCarousel8">
	               <div class="tab-btn control-BG8">
	                    <div class="tab-btn-inner">
	                         <div class="circle-outer">
	                              <div class="inner-1">
	                                  <div class="inner-2 control-BG8"></div>
	                              </div>
	                          </div><!--circle-outer-->
	                          70%
	                    </div>
	                    <div class="arrow"></div>
	                </div><!--tab-btn-->
	            </li>
	           <!--=============================================--> 
	            
	          </ul>  
	           
	          <div class="tab-slide">
	          	  
	                <!--======================-->
	                <div class="tab-area" id="offer-1" style="display:block">
	                  <div class="row-fluid">
	                      <div class="span7">
	                          <div class="content">
	                              <div class="content-head">Special offers</div>
	                              <div class="content-title">Costa Rica Flights and Hotels</div>
	                              <p>Book cheap air fare tickets and hotels for the "Switzerland of Central America." Costa Rica enjoys 50 years of peace and fantastic landscapes.</p>
	                          </div>
	                      </div>
	                      <div class="span5" style="position:relative;" >
	                         <div id="offerCarousel1" class="carousel slide">
	                              <div class="carousel-inner">
	                                  <div class="active item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                                  <div class="item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                              </div>
	                              <!-- Carousel nav -->
	                              <a class="control-offer left-slide" href="#offerCarousel1" data-slide="prev"><span class="icon-chevron-left"></span></a>
	                              <a class="control-offer right-slide" href="#offerCarousel1" data-slide="next"><span class="icon-chevron-right"></span></a>
	                          </div>   
	                      </div>
	                    </div>
	                  </div>
	                  
	                <!--======================-->
	                <div class="tab-area" id="offer-2" >
	                  <div class="row-fluid">
	                      <div class="span7">
	                          <div class="content">
	                              <div class="content-head">Special offers</div>
	                              <div class="content-title">Costa Rica Flights and Hotels</div>
	                              <p>Book cheap air fare tickets and hotels for the "Switzerland of Central America." Costa Rica enjoys 50 years of peace and fantastic landscapes.</p>
	                          </div>
	                      </div>
	                      <div class="span5" style="position:relative;" >
	                         <div id="offerCarousel2" class="carousel slide">
	                              <div class="carousel-inner">
	                                  <div class="active item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                                  <div class="item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                              </div>
	                              <!-- Carousel nav -->
	                              <a class="control-offer left-slide" href="#offerCarousel2" data-slide="prev"><span class="icon-chevron-left"></span></a>
	                              <a class="control-offer right-slide" href="#offerCarousel2" data-slide="next"><span class="icon-chevron-right"></span></a>
	                          </div>   
	                      </div>
	                    </div>
	                </div>
	                  
	                <!--======================-->
	                <div class="tab-area"  id="offer-3" >
	                  <div class="row-fluid">
	                      <div class="span7">
	                          <div class="content">
	                              <div class="content-head">Special offers</div>
	                              <div class="content-title">Costa Rica Flights and Hotels</div>
	                              <p>Book cheap air fare tickets and hotels for the "Switzerland of Central America." Costa Rica enjoys 50 years of peace and fantastic landscapes.</p>
	                          </div>
	                      </div>
	                     <div class="span5" style="position:relative;" >
	                         <div id="offerCarousel3" class="carousel slide">
	                              <div class="carousel-inner">
	                                  <div class="active item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                                  <div class="item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                              </div>
	                              <!-- Carousel nav -->
	                              <a class="control-offer left-slide" href="#offerCarousel3" data-slide="prev"><span class="icon-chevron-left"></span></a>
	                              <a class="control-offer right-slide" href="#offerCarousel3" data-slide="next"><span class="icon-chevron-right"></span></a>
	                          </div>   
	                      </div>
	                    </div>
	                  </div>
	                  
	                 <!--======================-->
	                <div class="tab-area"  id="offer-4" >
	                  <div class="row-fluid">
	                      <div class="span7">
	                          <div class="content">
	                              <div class="content-head">Special offers</div>
	                              <div class="content-title">Costa Rica Flights and Hotels</div>
	                              <p>Book cheap air fare tickets and hotels for the "Switzerland of Central America." Costa Rica enjoys 50 years of peace and fantastic landscapes.</p>
	                          </div>
	                      </div>
	                     <div class="span5" style="position:relative;" >
	                         <div id="offerCarousel4" class="carousel slide">
	                              <div class="carousel-inner">
	                                  <div class="active item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                                  <div class="item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                              </div>
	                              <!-- Carousel nav -->
	                              <a class="control-offer left-slide" href="#offerCarousel4" data-slide="prev"><span class="icon-chevron-left"></span></a>
	                              <a class="control-offer right-slide" href="#offerCarousel4" data-slide="next"><span class="icon-chevron-right"></span></a>
	                          </div>   
	                      </div>
	                    </div>
	                </div>
	                  
	                <!--======================-->
	                <div class="tab-area"  id="offer-5" >
	                  <div class="row-fluid">
	                      <div class="span7">
	                          <div class="content">
	                              <div class="content-head">Special offers</div>
	                              <div class="content-title">Costa Rica Flights and Hotels</div>
	                              <p>Book cheap air fare tickets and hotels for the "Switzerland of Central America." Costa Rica enjoys 50 years of peace and fantastic landscapes.</p>
	                          </div>
	                      </div>
	                      <div class="span5" style="position:relative;" >
	                         <div id="offerCarousel5" class="carousel slide">
	                              <div class="carousel-inner">
	                                  <div class="active item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                                  <div class="item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                              </div>
	                              <!-- Carousel nav -->
	                              <a class="control-offer left-slide" href="#offerCarousel5" data-slide="prev"><span class="icon-chevron-left"></span></a>
	                              <a class="control-offer right-slide" href="#offerCarousel5" data-slide="next"><span class="icon-chevron-right"></span></a>
	                          </div>   
	                      </div>
	                    </div>
	                </div>
					
	                <!--======================-->
	                 <div class="tab-area" id="offer-6" >
	                  <div class="row-fluid">
	                      <div class="span7">
	                          <div class="content">
	                              <div class="content-head">Special offers</div>
	                              <div class="content-title">Costa Rica Flights and Hotels</div>
	                              <p>Book cheap air fare tickets and hotels for the "Switzerland of Central America." Costa Rica enjoys 50 years of peace and fantastic landscapes.</p>
	                          </div>
	                      </div>
	                      <div class="span5" style="position:relative;" >
	                         <div id="offerCarousel6" class="carousel slide">
	                              <div class="carousel-inner">
	                                  <div class="active item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                                  <div class="item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                              </div>
	                              <!-- Carousel nav -->
	                              <a class="control-offer left-slide" href="#offerCarousel6" data-slide="prev"><span class="icon-chevron-left"></span></a>
	                              <a class="control-offer right-slide" href="#offerCarousel6" data-slide="next"><span class="icon-chevron-right"></span></a>
	                          </div>   
	                      </div>
	                    </div>
	                </div>
	                  
	                <!--======================-->
	                <div class="tab-area" id="offer-7">
	                  <div class="row-fluid">
	                      <div class="span7">
	                          <div class="content">
	                              <div class="content-head">Special offers</div>
	                              <div class="content-title">Costa Rica Flights and Hotels</div>
	                              <p>Book cheap air fare tickets and hotels for the "Switzerland of Central America." Costa Rica enjoys 50 years of peace and fantastic landscapes.</p>
	                          </div>
	                      </div>
	                     <div class="span5" style="position:relative;" >
	                         <div id="offerCarousel7" class="carousel slide">
	                              <div class="carousel-inner">
	                                  <div class="active item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                                  <div class="item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                              </div>
	                              <!-- Carousel nav -->
	                              <a class="control-offer left-slide" href="#offerCarousel7" data-slide="prev"><span class="icon-chevron-left"></span></a>
	                              <a class="control-offer right-slide" href="#offerCarousel7" data-slide="next"><span class="icon-chevron-right"></span></a>
	                          </div>   
	                      </div>
	                    </div>
	                </div>
	                  
	                <!--======================-->
	                <div class="tab-area" id="offer-8">
	                  <div class="row-fluid">
	                      <div class="span7">
	                          <div class="content">
	                              <div class="content-head">Special offers</div>
	                              <div class="content-title">Costa Rica Flights and Hotels</div>
	                              <p>Book cheap air fare tickets and hotels for the "Switzerland of Central America." Costa Rica enjoys 50 years of peace and fantastic landscapes.</p>
	                          </div>
	                      </div>
	                     <div class="span5" style="position:relative;" >
	                         <div id="offerCarousel8" class="carousel slide">
	                              <div class="carousel-inner">
	                                  <div class="active item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                                  <div class="item">
	                                  		<img src="assets/img/offfers/1.jpg" alt="" />
	                                        <div class="flex-caption">
	                                        	<p>Let's Go!</p>
	                                            <span>Amazing travel</span>
	                                        </div>
	                                  </div>
	                              </div>
	                              <!-- Carousel nav -->
	                              <a class="control-offer left-slide" href="#offerCarousel8" data-slide="prev"><span class="icon-chevron-left"></span></a>
	                              <a class="control-offer right-slide" href="#offerCarousel8" data-slide="next"><span class="icon-chevron-right"></span></a>
	                          </div>   
	                      </div>
	                    </div>
	                </div>
	                  
	                <div class="tour-bottom-line container"></div>
	          </div>
	        </div>
	    </div>
	</section>
	
	<%@ include file="/WEB-INF/jsp/componentes/booking.jsp" %>
	
	<%@ include file="/WEB-INF/jsp/componentes/footer-links.jsp" %>
	<%@ include file="/WEB-INF/jsp/componentes/footer.jsp" %>
	<%@ include file="/WEB-INF/jsp/componentes/listjs.jsp" %>
</body>
</html>