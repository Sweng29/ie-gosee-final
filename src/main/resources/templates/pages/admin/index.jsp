<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <jsp:include page="include.jsp"></jsp:include>
    <title>Gosee || Home</title>
</head>
<body class="animsition">
<!-- Main page Area -->
<div class="page-wrapper">

    <!-- MOBILE HEADER AREA STARTS -->
    <jsp:include page="mobile-header.jsp"></jsp:include>
    <!-- MOBILE HEADER AREA ENDS HERE  -->

    <!-- MENU SIDEBAR-->
    <jsp:include page="sidebar.jsp"></jsp:include>
    <!-- MENU SIDEBAR END HERE-->

    <!-- PAGE CONTAINER STARTS HERE-->
    <div class="page-container">

        <!-- HEADER DESKTOP-->
        <jsp:include page="header-desktop.jsp"></jsp:include>
        <!-- HEADER DESKTOP ENDS HERE-->

        <!-- MAIN CONTENT-->
        <div class="main-content">
            <div class="section__content section__content--p30">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-12">
                            <div class="overview-wrap">
                                <h2 class="title-1">overview</h2>
                                <button class="au-btn au-btn-icon au-btn--blue">
                                    <i class="zmdi zmdi-plus"></i>add item
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="row m-t-25">
                        <div class="col-sm-6 col-lg-3">
                            <div class="overview-item overview-item--c1">
                                <div class="overview__inner">
                                    <div class="overview-box clearfix">
                                        <div class="icon">
                                            <i class="zmdi zmdi-account-o"></i>
                                        </div>
                                        <div class="text">
                                            <h2>10368</h2>
                                            <span>members online</span>
                                        </div>
                                    </div>
                                    <div class="overview-chart">
                                        <canvas id="widgetChart1"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-3">
                            <div class="overview-item overview-item--c2">
                                <div class="overview__inner">
                                    <div class="overview-box clearfix">
                                        <div class="icon">
                                            <i class="zmdi zmdi-shopping-cart"></i>
                                        </div>
                                        <div class="text">
                                            <h2>388,688</h2>
                                            <span>items solid</span>
                                        </div>
                                    </div>
                                    <div class="overview-chart">
                                        <canvas id="widgetChart2"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-3">
                            <div class="overview-item overview-item--c3">
                                <div class="overview__inner">
                                    <div class="overview-box clearfix">
                                        <div class="icon">
                                            <i class="zmdi zmdi-calendar-note"></i>
                                        </div>
                                        <div class="text">
                                            <h2>1,086</h2>
                                            <span>this week</span>
                                        </div>
                                    </div>
                                    <div class="overview-chart">
                                        <canvas id="widgetChart3"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-lg-3">
                            <div class="overview-item overview-item--c4">
                                <div class="overview__inner">
                                    <div class="overview-box clearfix">
                                        <div class="icon">
                                            <i class="zmdi zmdi-money"></i>
                                        </div>
                                        <div class="text">
                                            <h2>$1,060,386</h2>
                                            <span>total earnings</span>
                                        </div>
                                    </div>
                                    <div class="overview-chart">
                                        <canvas id="widgetChart4"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="au-card au-card--no-shadow au-card--no-pad m-b-40">
                                <div class="au-card-title" style="background-image:url('../../../static/images/bg-title-02.jpg');">
                                    <div class="bg-overlay bg-overlay--blue"></div>
                                    <h3>
                                        <i class="zmdi zmdi-comment-text"></i>New Messages</h3>
                                    <button class="au-btn-plus">
                                        <i class="zmdi zmdi-plus"></i>
                                    </button>
                                </div>
                                <div class="au-inbox-wrap js-inbox-wrap">
                                    <div class="au-message js-list-load">
                                        <div class="au-message__noti">
                                            <p>You Have
                                                <span>2</span>

                                                new messages
                                            </p>
                                        </div>
                                        <div class="au-message-list">
                                            <div class="au-message__item unread">
                                                <div class="au-message__item-inner">
                                                    <div class="au-message__item-text">
                                                        <div class="avatar-wrap">
                                                            <div class="avatar">
                                                                <img src="../../../static/images/icon/avatar-02.jpg"
                                                                     alt="John Smith">
                                                            </div>
                                                        </div>
                                                        <div class="text">
                                                            <h5 class="name">John Smith</h5>
                                                            <p>Have sent a photo</p>
                                                        </div>
                                                    </div>
                                                    <div class="au-message__item-time">
                                                        <span>12 Min ago</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="au-message__item unread">
                                                <div class="au-message__item-inner">
                                                    <div class="au-message__item-text">
                                                        <div class="avatar-wrap online">
                                                            <div class="avatar">
                                                                <img src="../../../static/images/icon/avatar-03.jpg"
                                                                     alt="Nicholas Martinez">
                                                            </div>
                                                        </div>
                                                        <div class="text">
                                                            <h5 class="name">Nicholas Martinez</h5>
                                                            <p>You are now connected on message</p>
                                                        </div>
                                                    </div>
                                                    <div class="au-message__item-time">
                                                        <span>11:00 PM</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="au-message__item">
                                                <div class="au-message__item-inner">
                                                    <div class="au-message__item-text">
                                                        <div class="avatar-wrap online">
                                                            <div class="avatar">
                                                                <img src="../../../static/images/icon/avatar-04.jpg"
                                                                     alt="Michelle Sims">
                                                            </div>
                                                        </div>
                                                        <div class="text">
                                                            <h5 class="name">Michelle Sims</h5>
                                                            <p>Lorem ipsum dolor sit amet</p>
                                                        </div>
                                                    </div>
                                                    <div class="au-message__item-time">
                                                        <span>Yesterday</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="au-message__item">
                                                <div class="au-message__item-inner">
                                                    <div class="au-message__item-text">
                                                        <div class="avatar-wrap">
                                                            <div class="avatar">
                                                                <img src="../../../static/images/icon/avatar-05.jpg"
                                                                     alt="Michelle Sims">
                                                            </div>
                                                        </div>
                                                        <div class="text">
                                                            <h5 class="name">Michelle Sims</h5>
                                                            <p>Purus feugiat finibus</p>
                                                        </div>
                                                    </div>
                                                    <div class="au-message__item-time">
                                                        <span>Sunday</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="au-message__item js-load-item">
                                                <div class="au-message__item-inner">
                                                    <div class="au-message__item-text">
                                                        <div class="avatar-wrap online">
                                                            <div class="avatar">
                                                                <img src="../../../static/images/icon/avatar-04.jpg"
                                                                     alt="Michelle Sims">
                                                            </div>
                                                        </div>
                                                        <div class="text">
                                                            <h5 class="name">Michelle Sims</h5>
                                                            <p>Lorem ipsum dolor sit amet</p>
                                                        </div>
                                                    </div>
                                                    <div class="au-message__item-time">
                                                        <span>Yesterday</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="au-message__item js-load-item">
                                                <div class="au-message__item-inner">
                                                    <div class="au-message__item-text">
                                                        <div class="avatar-wrap">
                                                            <div class="avatar">
                                                                <img src="../../../static/images/icon/avatar-05.jpg"
                                                                     alt="Michelle Sims">
                                                            </div>
                                                        </div>
                                                        <div class="text">
                                                            <h5 class="name">Michelle Sims</h5>
                                                            <p>Purus feugiat finibus</p>
                                                        </div>
                                                    </div>
                                                    <div class="au-message__item-time">
                                                        <span>Sunday</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="au-message__footer">
                                            <button class="au-btn au-btn-load js-load-btn">load more</button>
                                        </div>
                                    </div>
                                    <div class="au-chat">
                                        <div class="au-chat__title">
                                            <div class="au-chat-info">
                                                <div class="avatar-wrap online">
                                                    <div class="avatar avatar--small">
                                                        <img src="../../../static/images/icon/avatar-02.jpg"
                                                             alt="John Smith">
                                                    </div>
                                                </div>
                                                <span class="nick">
                                                        <a href="#">John Smith</a>
                                                    </span>
                                            </div>
                                        </div>
                                        <div class="au-chat__content">
                                            <div class="recei-mess-wrap">
                                                <span class="mess-time">12 Min ago</span>
                                                <div class="recei-mess__inner">
                                                    <div class="avatar avatar--tiny">
                                                        <img src="../../../static/images/icon/avatar-02.jpg"
                                                             alt="John Smith">
                                                    </div>
                                                    <div class="recei-mess-list">
                                                        <div class="recei-mess">Lorem ipsum dolor sit amet, consectetur
                                                            adipiscing elit non iaculis
                                                        </div>
                                                        <div class="recei-mess">Donec tempor, sapien ac viverra</div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="send-mess-wrap">
                                                <span class="mess-time">30 Sec ago</span>
                                                <div class="send-mess__inner">
                                                    <div class="send-mess-list">
                                                        <div class="send-mess">Lorem ipsum dolor sit amet, consectetur
                                                            adipiscing elit non iaculis
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="au-chat-textfield">
                                            <form class="au-form-icon">
                                                <input class="au-input au-input--full au-input--h65" type="text"
                                                       placeholder="Type a message">
                                                <button class="au-input-icon">
                                                    <i class="zmdi zmdi-camera"></i>
                                                </button>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-12">
                            <div class="copyright">
                                <p>Copyright © 2019. All rights reserved. Template by <a href="https://colorlib.com">Colorlib</a>.
                                </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- MAIN CONTENT ENDS HERE-->
    </div>
    <!-- PAGE CONTAINER ENDS HERE-->

</div>
<!-- Main page Area ends here-->

<!-- Scripts Area -->
<jsp:include page="include-scripts.jsp"></jsp:include>
<!-- Scripts Area end here-->

</body>
</html>
