<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>GOSEE </title>
<jsp:include page="includes.jsp"></jsp:include>
</head>
<body>

<div class="page_loader"></div>

<!-- Main header start -->
<header class="main-header sticky-header header-with-top">
    <div class="container">
        <nav class="navbar navbar-expand-lg navbar-light">
            <a class="navbar-brand company-logo" href="index.html">
                <img src="../../static/gosee/img/logos/black-logo.png" alt="logo">
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar" aria-controls="navbar" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="navbar-collapse collapse w-100" id="navbar">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item dropdown active">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Home
                        </a>
						<!--
						<ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <li><a class="dropdown-item" href="index.html">Home 1</a></li>
                            <li><a class="dropdown-item" href="index-2.html">Home 2</a></li>
                            <li><a class="dropdown-item" href="index-3.html">Home 3</a></li>
                            <li><a class="dropdown-item" href="index-4.html">Home 4</a></li>
                            <li><a class="dropdown-item" href="index-5.html">Home 5</a></li>
                            <li><a class="dropdown-item" href="index-6.html">Home 6</a></li>
                        </ul>
                        -->
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Buy Stuff
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <li class="dropdown-submenu"><a class="dropdown-item dropdown-toggle" href="#">List Layout</a>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="buy-stuff.jsp">List Right Sidebar</a></li>
                                    <li><a class="dropdown-item" href="sale-stuff.jsp">List Left Sidebar</a></li>
                                    <li><a class="dropdown-item" href="car-list-fullWidth.html">List FullWidth</a></li>
                                </ul>
                            </li>
                            <li class="dropdown-submenu"><a class="dropdown-item dropdown-toggle" href="#">Grid Layout</a>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="car-grid-rightside.html">Grid Right Sidebar</a></li>
                                    <li><a class="dropdown-item" href="car-grid-leftside.html">Grid Left Sidebar</a></li>
                                    <li><a class="dropdown-item" href="car-grid-fullWidth.html">Grid FullWidth</a></li>
                                </ul>
                            </li>
                            <li class="dropdown-submenu"><a class="dropdown-item dropdown-toggle" href="#">Car Details</a>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="car-details.html">Car Details 1</a></li>
                                    <li><a class="dropdown-item" href="car-details-2.html">Car Details 2</a></li>
                                    <li><a class="dropdown-item" href="car-details-3.html">Car Details 3</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown megamenu-li">
                        <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Sale Stuff</a>
                        <div class="dropdown-menu megamenu" aria-labelledby="dropdown01">
                            <div class="megamenu-area">
                                <div class="row">
                                    <div class="col-sm-6 col-md-4 col-lg-4">
                                        <div class="megamenu-section">
                                            <h6 class="megamenu-title">Pages</h6>
                                            <a class="dropdown-item" href="about.html">About Us</a>
                                            <a class="dropdown-item" href="services.html">Services</a>
                                            <a class="dropdown-item" href="agent.html">Agent</a>
                                            <a class="dropdown-item" href="car-comparison.html">Car Compare</a>
                                            <a class="dropdown-item" href="car-reviews.html">Car Reviews</a>
                                        </div>
                                    </div>
                                    <div class="col-sm-6 col-md-4 col-lg-4">
                                        <div class="megamenu-section">
                                            <h6 class="megamenu-title">Pages</h6>
                                            <a class="dropdown-item" href="gallery.html">Gallery</a>
                                            <a class="dropdown-item" href="typography.html">Typography</a>
                                            <a class="dropdown-item" href="pricing-tables.html">Pricing Tables</a>
                                            <a class="dropdown-item" href="elements.html">Elements</a>
                                            <a class="dropdown-item" href="faq.html">Faq</a>
                                        </div>
                                    </div>
                                    <div class="col-sm-6 col-md-4 col-lg-4">
                                        <div class="megamenu-section">
                                            <h6 class="megamenu-title">Pages</h6>
                                            <a class="dropdown-item" href="icon.html">Icons</a>
                                            <a class="dropdown-item" href="coming-soon.html">Coming Soon</a>
                                            <a class="dropdown-item" href="404.html">Error Page</a>
                                            <a class="dropdown-item" href="login.html">login</a>
                                            <a class="dropdown-item" href="signup.html">Register</a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink6" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            See Stuff
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <li><a class="dropdown-item" href="blog-columns-2col.html">Blog Columns 2</a></li>
                            <li><a class="dropdown-item" href="blog-columns-3col.html">Blog Columns 3</a></li>
                            <li><a class="dropdown-item" href="blog-right-sidebar.html">Blog Right Sidebar</a></li>
                            <li><a class="dropdown-item" href="blog-details.html">Blog Details</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink7" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Rent Stuff
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <li><a class="dropdown-item" href="shop-list.html">Shop List</a></li>
                            <li><a class="dropdown-item" href="shop-cart.html">Shop Cart</a></li>
                            <li><a class="dropdown-item" href="shop-checkout.html">Shop Checkout</a></li>
                            <li><a class="dropdown-item" href="shop-details.html">Shop Details</a></li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link" href="contact.html">What's On?</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link" href="contact.html">How do i?</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link" href="contact.html">Profile</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link" href="contact.html">Contact Us</a>
                          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                            <li class="dropdown-submenu"><a class="dropdown-item dropdown-toggle" href="#">List Layout</a>
                                <ul class="dropdown-menu">
                                    <li><a class="dropdown-item" href="car-list-rightside.html">Dealer Enquiries</a></li>
                                    <li><a class="dropdown-item" href="car-list-leftsidebar.html">Banner Advertisement</a></li>
                                    <li><a class="dropdown-item" href="car-list-fullWidth.html">Data Requests</a></li>
                                    <li><a class="dropdown-item" href="car-list-fullWidth.html">Legal Policies</a></li>
                                </ul>
                            </li>
                        </ul>
                    </li>
                    <li class="nav-item dropdown">
                        <a href="login.html" class="nav-link h-icon">
                            <i class="flaticon-logout"></i>
                        </a>
                    </li>
                    <li class="nav-item dropdown">
                        <a href="#full-page-search" class="nav-link h-icon">
                            <i class="fa fa-search"></i>
                        </a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
</header>
<!-- Main header end -->

</body>
</html>
