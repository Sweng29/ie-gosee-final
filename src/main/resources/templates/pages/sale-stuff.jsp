<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sale Stuff</title>
</head>
<body>
	
	<jsp:include page="header.jsp"></jsp:include>
	
	<!-- Sub banner start -->
	<div class="sub-banner">
	    <div class="container breadcrumb-area">
	        <div class="breadcrumb-areas">
	            <h1>Sell Stuff</h1>
	            <ul class="breadcrumbs">
	                <li><a href="index.jsp">Home</a></li>
	                <li class="active">Sell Stuff</li>
	            </ul>
	        </div>
	    </div>
	</div>
	<!-- Sub Banner end -->
	
	<jsp:include page="categories.jsp"></jsp:include>
	
	<jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>