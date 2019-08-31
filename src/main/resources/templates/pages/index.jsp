<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GOSee || Home</title>
</head>
<body>
	<!-- HEADER START -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- HEADER END -->
	
<!-- Banner start -->
<div class="banner" id="banner">
    <div id="bannerCarousole" class="carousel slide" data-ride="carousel">
        <div class="carousel-inner banner-slider-inner text-center">
            <div class="carousel-item banner-max-height active">
                <img class="d-block w-100 h-100" src="img/car-1.jpg" alt="banner">
                <div class="carousel-content container banner-info-2 text-l">
                    <h3>Toyota Prius specs</h3>
                    <h5>Fresh Style Performance</h5>
                    <h4>$37,390</h4>
                    <a href="#" class="btn btn-lg btn-round btn-theme">Order Now</a>
                    <a href="#" class="btn btn-round btn-white-lg-outline">Test Drive</a>
                </div>
            </div>
            <div class="carousel-item banner-max-height">
                <img class="d-block w-100 h-100" src="img/car-2.jpg" alt="banner">
                <div class="carousel-content container banner-info-2 text-center">
                    <h3>Toyota Prius specs</h3>
                    <h5>Fresh Style Performance</h5>
                    <h4>$37,390</h4>
                    <a href="#" class="btn btn-lg btn-round btn-theme">Order Now</a>
                    <a href="#" class="btn btn-round btn-white-lg-outline">Test Drive</a>
                </div>
            </div>
            <div class="carousel-item banner-max-height">
                <img class="d-block w-100 h-100" src="img/car-3.jpg" alt="banner">
                <div class="carousel-content container banner-info-2 text-r">
                    <h3>Toyota Prius specs</h3>
                    <h5>Fresh Style Performance</h5>
                    <h4>$37,390</h4>
                    <a href="#" class="btn btn-lg btn-round btn-theme">Order Now</a>
                    <a href="#" class="btn btn-round btn-white-lg-outline">Test Drive</a>
                </div>
            </div>
        </div>
        <a class="carousel-control-prev none-580" href="#bannerCarousole" role="button" data-slide="prev">
            <span class="slider-mover-left" aria-hidden="true">
                <i class="fa fa-angle-left"></i>
            </span>
        </a>
        <a class="carousel-control-next none-580" href="#bannerCarousole" role="button" data-slide="next">
            <span class="slider-mover-right" aria-hidden="true">
                <i class="fa fa-angle-right"></i>
            </span>
        </a>
    </div>
</div>
<!-- Banner end -->

<!-- Search box 2 start -->
<div class="search-box-2">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="inline-search-area">
                    <div class="row row-3">
                        <div class="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-6 search-col">
                            <select class="selectpicker search-fields" name="select-brand">
                                <option>Select Brand</option>
                                <option>Audi</option>
                                <option>BMW</option>
                                <option>Honda</option>
                                <option>Nissan</option>
                            </select>
                        </div>
                        <div class="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-6 search-col">
                            <select class="selectpicker search-fields" name="select-make">
                                <option>Select Make</option>
                                <option>BMW</option>
                                <option>Honda</option>
                                <option>Lamborghini</option>
                                <option>Sports Car</option>
                            </select>
                        </div>
                        <div class="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-6 search-col">
                            <select class="selectpicker search-fields" name="select-location">
                                <option>Select Location</option>
                                <option>United States</option>
                                <option>United Kingdom</option>
                            </select>
                        </div>
                        <div class="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-6 search-col">
                            <select class="selectpicker search-fields" name="select-year">
                                <option>Select Year</option>
                                <option>2016</option>
                                <option>2017</option>
                                <option>2018</option>
                                <option>2019</option>
                            </select>
                        </div>
                        <div class="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-6 search-col">
                            <select class="selectpicker search-fields" name="select-type">
                                <option>Select Type Of Car</option>
                                <option>New Car</option>
                                <option>Used Car</option>
                            </select>
                        </div>
                        <div class="col-xl-2 col-lg-2 col-md-4 col-sm-6 col-6 search-col">
                            <button class="btn white-btn btn-search btn-block">
                                <i class="fa fa-search"></i><strong>Find</strong>
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Search box 2 end -->

<!-- Featured car start -->
<div class="featured-car content-area">
    <div class="container">
        <!-- Main title -->
        <div class="main-title">
            <h1>Featured Cars</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod</p>
        </div>
        <div class="row">
            <div class="col-lg-4 col-md-6">
                <div class="car-box">
                    <div class="car-thumbnail">
                        <a href="car-details.html" class="car-img">
                            <div class="tag">Featured</div>
                            <div class="price-box">$850.00</div>
                            <img class="d-block w-100" src="img/car/car-1.jpg" alt="car">
                        </a>
                    </div>
                    <div class="detail">
                        <h1 class="title">
                            <a href="car-grid-rightside.html">Toyota Prius</a>
                        </h1>
                        <div class="location">
                            <a href="car-details.html">
                                <i class="flaticon-pin"></i>123 Kathal St. Tampa City,
                            </a>
                        </div>
                        <ul class="facilities-list clearfix">
                            <li>
                                <i class="flaticon-way"></i> 4,000 km
                            </li>
                            <li>
                                <i class="flaticon-manual-transmission"></i> Manual
                            </li>
                            <li>
                                <i class="flaticon-calendar-1"></i> 2019
                            </li>
                            <li>
                                <i class="flaticon-fuel"></i> Petrol
                            </li>
                            <li>
                                <i class="flaticon-car"></i> Sport
                            </li>
                            <li>
                                <i class="flaticon-gear"></i> Blue
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="car-box">
                    <div class="car-thumbnail">
                        <a href="car-details.html" class="car-img">
                            <div class="tag">Featured</div>
                            <div class="price-box">$850.00</div>
                            <img class="d-block w-100" src="img/car/car-4.jpg" alt="car">
                        </a>
                    </div>
                    <div class="detail">
                        <h1 class="title">
                            <a href="car-grid-rightside.html">Toyota Prius specs</a>
                        </h1>
                        <div class="location">
                            <a href="car-details.html">
                                <i class="flaticon-pin"></i>123 Kathal St. Tampa City,
                            </a>
                        </div>
                        <ul class="facilities-list clearfix">
                            <li>
                                <i class="flaticon-way"></i> 4,000 km
                            </li>
                            <li>
                                <i class="flaticon-manual-transmission"></i> Manual
                            </li>
                            <li>
                                <i class="flaticon-calendar-1"></i> 2019
                            </li>
                            <li>
                                <i class="flaticon-fuel"></i> Petrol
                            </li>
                            <li>
                                <i class="flaticon-car"></i> Sport
                            </li>
                            <li>
                                <i class="flaticon-gear"></i> Blue
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="car-box">
                    <div class="car-thumbnail">
                        <a href="car-details.html" class="car-img">
                            <div class="tag">Featured</div>
                            <div class="price-box">$850.00</div>
                            <img class="d-block w-100" src="img/car/car-3.jpg" alt="car">
                        </a>
                    </div>
                    <div class="detail">
                        <h1 class="title">
                            <a href="car-grid-rightside.html">Lexus GS F</a>
                        </h1>
                        <div class="location">
                            <a href="car-details.html">
                                <i class="flaticon-pin"></i>123 Kathal St. Tampa City,
                            </a>
                        </div>
                        <ul class="facilities-list clearfix">
                            <li>
                                <i class="flaticon-way"></i> 4,000 km
                            </li>
                            <li>
                                <i class="flaticon-manual-transmission"></i> Manual
                            </li>
                            <li>
                                <i class="flaticon-calendar-1"></i> 2019
                            </li>
                            <li>
                                <i class="flaticon-fuel"></i> Petrol
                            </li>
                            <li>
                                <i class="flaticon-car"></i> Sport
                            </li>
                            <li>
                                <i class="flaticon-gear"></i> Blue
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="car-box">
                    <div class="car-thumbnail">
                        <a href="car-details.html" class="car-img">
                            <div class="tag">Featured</div>
                            <div class="price-box">$850.00</div>
                            <img class="d-block w-100" src="img/car/car-5.jpg" alt="car">
                        </a>
                    </div>
                    <div class="detail">
                        <h1 class="title">
                            <a href="car-grid-rightside.html">Hyundai Santa</a>
                        </h1>
                        <div class="location">
                            <a href="car-details.html">
                                <i class="flaticon-pin"></i>123 Kathal St. Tampa City,
                            </a>
                        </div>
                        <ul class="facilities-list clearfix">
                            <li>
                                <i class="flaticon-way"></i> 4,000 km
                            </li>
                            <li>
                                <i class="flaticon-manual-transmission"></i> Manual
                            </li>
                            <li>
                                <i class="flaticon-calendar-1"></i> 2019
                            </li>
                            <li>
                                <i class="flaticon-fuel"></i> Petrol
                            </li>
                            <li>
                                <i class="flaticon-car"></i> Sport
                            </li>
                            <li>
                                <i class="flaticon-gear"></i> Blue
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="car-box">
                    <div class="car-thumbnail">
                        <a href="car-details.html" class="car-img">
                            <div class="tag">Featured</div>
                            <div class="price-box">$850.00</div>
                            <img class="d-block w-100" src="img/car/car-6.jpg" alt="car">
                        </a>
                    </div>
                    <div class="detail">
                        <h1 class="title">
                            <a href="car-grid-rightside.html">Audi Q7 2018</a>
                        </h1>
                        <div class="location">
                            <a href="car-details.html">
                                <i class="flaticon-pin"></i>123 Kathal St. Tampa City,
                            </a>
                        </div>
                        <ul class="facilities-list clearfix">
                            <li>
                                <i class="flaticon-way"></i> 4,000 km
                            </li>
                            <li>
                                <i class="flaticon-manual-transmission"></i> Manual
                            </li>
                            <li>
                                <i class="flaticon-calendar-1"></i> 2019
                            </li>
                            <li>
                                <i class="flaticon-fuel"></i> Petrol
                            </li>
                            <li>
                                <i class="flaticon-car"></i> Sport
                            </li>
                            <li>
                                <i class="flaticon-gear"></i> Blue
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-6">
                <div class="car-box">
                    <div class="car-thumbnail">
                        <a href="car-details.html" class="car-img">
                            <div class="tag">Featured</div>
                            <div class="price-box">$850.00</div>
                            <img class="d-block w-100" src="img/car/car-2.jpg" alt="car">
                        </a>
                    </div>
                    <div class="detail">
                        <h1 class="title">
                            <a href="car-grid-rightside.html">2017 Ford Mustang</a>
                        </h1>
                        <div class="location">
                            <a href="car-details.html">
                                <i class="flaticon-pin"></i>123 Kathal St. Tampa City,
                            </a>
                        </div>
                        <ul class="facilities-list clearfix">
                            <li>
                                <i class="flaticon-way"></i> 4,000 km
                            </li>
                            <li>
                                <i class="flaticon-manual-transmission"></i> Manual
                            </li>
                            <li>
                                <i class="flaticon-calendar-1"></i> 2019
                            </li>
                            <li>
                                <i class="flaticon-fuel"></i> Petrol
                            </li>
                            <li>
                                <i class="flaticon-car"></i> Sport
                            </li>
                            <li>
                                <i class="flaticon-gear"></i> Blue
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Featured car end -->

<!-- advantages start -->
<div class="advantages content-area">
    <div class="container">
        <!-- Main title -->
        <div class="main-title-2 text-center">
            <h1>Our Advantages</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod</p>
        </div>
        <div class="row">
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="advantages-box">
                    <div class="icon">
                        <i class="flaticon-shield"></i>
                    </div>
                    <div class="detail">
                        <h5>Highly  Secured</h5>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec luctus tincidunt aliquam.</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="advantages-box">
                    <div class="icon">
                        <i class="flaticon-deal"></i>
                    </div>
                    <div class="detail">
                        <h5>Trusted Agents</h5>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec luctus tincidunt aliquam.</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="advantages-box">
                    <div class="icon">
                        <i class="flaticon-money"></i>
                    </div>
                    <div class="detail">
                        <h5>Get an Offer</h5>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec luctus tincidunt aliquam.</p>
                    </div>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 col-sm-6">
                <div class="advantages-box">
                    <div class="icon">
                        <i class="flaticon-support-2"></i>
                    </div>
                    <div class="detail">
                        <h5>Free Support</h5>
                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec luctus tincidunt aliquam.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- advantages end -->

<!-- Latest offers Start -->
<div class="latest-offers categories content-area-13 bg-grea-3">
    <div class="container">
        <!-- Main title -->
        <div class="main-title text-center">
            <h1>Latest Offers</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod</p>
        </div>
        <div class="row row-2">
            <div class="col-lg-4 col-md-12">
                <div class="row">
                    <div class="col-md-6 col-lg-12 col-pad">
                        <div class="category">
                            <div class="category_bg_box cat-1-bg">
                                <div class="category-overlay">
                                    <div class="category-content">
                                        <h3 class="category-title">
                                            <a href="car-list-rightside.html">Toyota Prius specs</a>
                                        </h3>
                                        <h5 class="category-subtitle">$850.00</h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-12 col-pad">
                        <div class="category">
                            <div class="category_bg_box cat-3-bg">
                                <div class="category-overlay">
                                    <div class="category-content">
                                        <h3 class="category-title">
                                            <a href="car-details.html">Lexus GS F</a>
                                        </h3>
                                        <h5 class="category-subtitle">$450.00</h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-12 col-pad">
                <div class="category">
                    <div class="category_bg_box category_long_bg cat-4-bg">
                        <div class="category-overlay">
                            <div class="category-content">
                                <h3 class="category-title">
                                    <a href="#">Audi R8</a>
                                </h3>
                                <h5 class="category-subtitle">$150.00</h5>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-4 col-md-12">
                <div class="row">
                    <div class="col-md-6 col-lg-12 col-pad">
                        <div class="category">
                            <div class="category_bg_box cat-2-bg">
                                <div class="category-overlay">
                                    <div class="category-content">
                                        <h3 class="category-title">
                                            <a href="car-list-rightside.html">Toyota Prius</a>
                                        </h3>
                                        <h5 class="category-subtitle">$350.000</h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-12 col-pad">
                        <div class="category">
                            <div class="category_bg_box cat-5-bg">
                                <div class="category-overlay">
                                    <div class="category-content">
                                        <h3 class="category-title">
                                            <a href="car-details.html">2017 Ford Mustang</a>
                                        </h3>
                                        <h4 class="category-subtitle">98 Properties</h4>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Latest offers end -->

<!-- Our team start -->
<div class="our-team content-area">
    <div class="container">
        <!-- Main title -->
        <div class="main-title">
            <h1>Our Agent</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod</p>
        </div>
        <div class="row">
            <div class="col-xl-3 col-lg-3 col-md-6 col-sm-6">
                <div class="team-1">
                    <div class="team-photo">
                        <a href="#">
                            <img src="img/avatar/avatar-5.jpg" alt="agent" class="img-fluid">
                        </a>
                        <ul class="social-list clearfix">
                            <li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#" class="google"><i class="fa fa-google-plus"></i></a></li>
                            <li><a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a></li>
                        </ul>
                    </div>
                    <div class="team-details">
                        <h5><a href="agent-detail.html">Michelle Nelson</a></h5>
                        <h6>Support Manager</h6>
                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-lg-3 col-md-6 col-sm-6">
                <div class="team-1">
                    <div class="team-photo">
                        <a href="#">
                            <img src="img/avatar/avatar-7.jpg" alt="agent" class="img-fluid">
                        </a>
                        <ul class="social-list clearfix">
                            <li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#" class="google"><i class="fa fa-google-plus"></i></a></li>
                            <li><a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a></li>
                        </ul>
                    </div>
                    <div class="team-details">
                        <h5><a href="agent-detail.html">Martin Smith</a></h5>
                        <h6>Web Developer</h6>
                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-lg-3 col-md-6 col-sm-6">
                <div class="team-1">
                    <div class="team-photo">
                        <a href="#">
                            <img src="img/avatar/avatar-6.jpg" alt="agent" class="img-fluid">
                        </a>
                        <ul class="social-list clearfix">
                            <li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#" class="google"><i class="fa fa-google-plus"></i></a></li>
                            <li><a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a></li>
                        </ul>
                    </div>
                    <div class="team-details">
                        <h5><a href="agent-detail.html">Carolyn Stone</a></h5>
                        <h6>Creative Director</h6>
                    </div>
                </div>
            </div>
            <div class="col-xl-3 col-lg-3 col-md-6 col-sm-6">
                <div class="team-1">
                    <div class="team-photo">
                        <a href="#">
                            <img src="img/avatar/avatar-8.jpg" alt="agent" class="img-fluid">
                        </a>
                        <ul class="social-list clearfix">
                            <li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
                            <li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
                            <li><a href="#" class="google"><i class="fa fa-google-plus"></i></a></li>
                            <li><a href="#" class="linkedin"><i class="fa fa-linkedin"></i></a></li>
                        </ul>
                    </div>
                    <div class="team-details">
                        <h5><a href="agent-detail.html">Brandon Miller</a></h5>
                        <h6>Manager</h6>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Our team end -->

<!-- Testimonial start -->
<div class="testimonial bg-grea-3 content-area-5">
    <div class="container">
        <!-- Main title -->
        <div class="main-title">
            <h1>Our Testimonial</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod</p>
        </div>
        <!-- Slick slider area start -->
        <div class="slick-slider-area">
            <div class="row slick-carousel" data-slick='{"slidesToShow": 2, "responsive":[{"breakpoint": 1024,"settings":{"slidesToShow": 2}}, {"breakpoint": 768,"settings":{"slidesToShow": 1}}]}'>
                <div class="slick-slide-item">
                    <div class="testimonial-inner">
                        <div class="text-box">
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard</p>
                            <div class="rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star-o"></i>
                                <span>( 4 Reviews )</span>
                            </div>
                        </div>
                        <div class="user">
                            <div class="photo">
                                <img class="media-object" src="img/avatar/avatar-1.jpg" alt="user">
                            </div>
                            <div class="detail">
                                <h5>Maikel Alisa</h5>
                                <p>Web Designer, New York</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="slick-slide-item">
                    <div class="testimonial-inner">
                        <div class="text-box">
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard</p>
                            <div class="rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star-o"></i>
                                <span>( 4 Reviews )</span>
                            </div>
                        </div>

                        <div class="user">
                            <div class="photo">
                                <img class="media-object" src="img/avatar/avatar-1.jpg" alt="user">
                            </div>
                            <div class="detail">
                                <h5>Maikel Alisa</h5>
                                <p>Creative Director, New York</p>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="slick-slide-item">
                    <div class="testimonial-inner">
                        <div class="text-box">
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard</p>
                            <div class="rating">
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star"></i>
                                <i class="fa fa-star-o"></i>
                                <span>( 4 Reviews )</span>
                            </div>
                        </div>

                        <div class="user">
                            <div class="photo">
                                <img class="media-object" src="img/avatar/avatar-2.jpg" alt="user">
                            </div>
                            <div class="detail">
                                <h5>Auro Navanth</h5>
                                <p>Office Manager, New York</p>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="slick-prev slick-arrow-buton">
                <i class="fa fa-angle-left"></i>
            </div>
            <div class="slick-next slick-arrow-buton">
                <i class="fa fa-angle-right"></i>
            </div>
        </div>
    </div>
</div>
<!-- Testimonial end -->

<!-- Blog start -->
<div class="blog content-area">
    <div class="container">
        <!-- Main title -->
        <div class="main-title">
            <h1>Our Blog</h1>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
        </div>
        <!-- Slick slider area start -->
        <div class="slick-slider-area clearfix">
            <div class="row slick-carousel" data-slick='{"slidesToShow": 3, "responsive":[{"breakpoint": 1024,"settings":{"slidesToShow": 2}}, {"breakpoint": 768,"settings":{"slidesToShow": 1}}]}'>
                <div class="slick-slide-item">
                    <div class="blog-1">
                        <div class="blog-photo">
                            <img src="img/blog/blog-2.jpg" alt="small-blog" class="img-fluid">
                            <div class="date-box">
                                <span>14</span>Nov
                            </div>
                        </div>
                        <div class="detail">
                            <h4>
                                <a href="blog-details.html">Elegant Audi Car</a>
                            </h4>
                            <div class="post-meta clearfix">
                                <span><a href="#"><i class="flaticon-user-1"></i></a>Admin</span>
                                <span><a href="#"><i class="flaticon-comment"></i></a>17K</span>
                                <span><a href="#"><i class="flaticon-calendar"></i></a>73k</span>
                            </div>
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry</p>
                        </div>
                    </div>
                </div>
                <div class="slick-slide-item">
                    <div class="blog-1">
                        <div class="blog-photo">
                            <img src="img/blog/blog-3.jpg" alt="small-blog" class="img-fluid">
                            <div class="date-box">
                                <span>14</span>Nov
                            </div>
                        </div>
                        <div class="detail">
                            <h4>
                                <a href="blog-details.html">2018 Lexus GS F</a>
                            </h4>
                            <div class="post-meta clearfix">
                                <span><a href="#"><i class="flaticon-user-1"></i></a>Admin</span>
                                <span><a href="#"><i class="flaticon-comment"></i></a>17K</span>
                                <span><a href="#"><i class="flaticon-calendar"></i></a>73k</span>
                            </div>
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry</p>
                        </div>
                    </div>
                </div>
                <div class="slick-slide-item">
                    <div class="blog-1">
                        <div class="blog-photo">
                            <img src="img/blog/blog-1.jpg" alt="small-blog" class="img-fluid">
                            <div class="date-box">
                                <span>14</span>Nov
                            </div>
                        </div>
                        <div class="detail">
                            <h4>
                                <a href="blog-details.html">Audi R8</a>
                            </h4>
                            <div class="post-meta clearfix">
                                <span><a href="#"><i class="flaticon-user-1"></i></a>Admin</span>
                                <span><a href="#"><i class="flaticon-comment"></i></a>17K</span>
                                <span><a href="#"><i class="flaticon-calendar"></i></a>73k</span>
                            </div>
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry</p>
                        </div>
                    </div>
                </div>
                <div class="slick-slide-item">
                    <div class="blog-1">
                        <div class="blog-photo">
                            <img src="img/blog/blog-1.jpg" alt="small-blog" class="img-fluid">
                            <div class="date-box">
                                <span>14</span>Nov
                            </div>
                        </div>
                        <div class="detail">
                            <h4>
                                <a href="blog-details.html">Audi R8</a>
                            </h4>
                            <div class="post-meta clearfix">
                                <span><a href="#"><i class="flaticon-user-1"></i></a>Admin</span>
                                <span><a href="#"><i class="flaticon-comment"></i></a>17K</span>
                                <span><a href="#"><i class="flaticon-calendar"></i></a>73k</span>
                            </div>
                            <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="slick-prev slick-arrow-buton">
                <i class="fa fa-angle-left"></i>
            </div>
            <div class="slick-next slick-arrow-buton">
                <i class="fa fa-angle-right"></i>
            </div>
        </div>
    </div>
</div>
<!-- Blog end -->
	
	
<!-- FOOTER START -->
<jsp:include page="footer.jsp"></jsp:include>
<!-- FOOTER END -->
</body>
</html>