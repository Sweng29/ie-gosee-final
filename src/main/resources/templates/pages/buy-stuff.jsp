<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buy Stuff || GOSEE</title>
<style>
.imagePreview {
    width: 100%;
    height: 180px;
    background-position: center center;
  background:url(http://cliquecities.com/assets/no-image-e3699ae23f866f6cbdf8ba2443ee5c4e.jpg);
  background-color:#fff;
    background-size: cover;
  background-repeat:no-repeat;
    display: inline-block;
  box-shadow:0px -3px 6px 2px rgba(0,0,0,0.2);
}
.imgUp
{
  margin-bottom:15px;
}
.del
{
  position:absolute;
  top:0px;
  right:15px;
  width:30px;
  height:30px;
  text-align:center;
  line-height:30px;
  background-color:rgba(255,255,255,0.6);
  cursor:pointer;
}
.imgAdd
{
  width:30px;
  height:30px;
  border-radius:50%;
  background-color:#4bd7ef;
  color:#fff;
  box-shadow:0px 0px 2px 1px rgba(0,0,0,0.2);
  text-align:center;
  line-height:30px;
  margin-top:0px;
  cursor:pointer;
  font-size:15px;
}
</style>
</head>
<body>
	
	<!-- HEADER START -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- HEADER END -->
	
	
	<!-- Sub banner start -->
	<div class="sub-banner">
	    <div class="container breadcrumb-area">
	        <div class="breadcrumb-areas">
	            <h1>Buy Stuff</h1>
	            <ul class="breadcrumbs">
	                <li><a href="index.jsp">Home</a></li>
	                <li class="active">Buy Stuff</li>
	            </ul>
	        </div>
	    </div>
	</div>
	<!-- Sub Banner end -->

	<!-- MAIN CONTENT START -->
	<!-- Categories Start -->
	<div class="our-team content-area">
	    <div class="container">
	    	<div class="row">
				<div class="col-md-12 text-left">
					<div class="form-group name text-center">
						<button type="submit" class="btn btn-outline-info btn-lg bomd">For
							Sell</button>
					</div>
					<div class="form-group name text-center">
						<button type="submit" class="btn btn-outline-warning btn-lg bomd">Wanted</button>
					</div>
				</div>
			</div>
	        <div class="row">
	           <jsp:include page="categories.jsp"></jsp:include>
	        </div>
	    </div>
	</div>
	<!-- Categories END -->

<!-- Testimonial start -->
<div class="testimonial bg-grea-3 content-area-5">
    <div class="container">
        <div class="row">
         <div class="col-lg-12">
            <div class="heading-4">
               <h4 class="text-center">Advert Details</h4>
            </div>
         </div>
       	<!-- Contact info -->
        <form action="#" method="GET" enctype="multipart/form-data">
            <div class="row">
                <div class="col-lg-12">
                    <div class="row">
                    	<div class="col-lg-12">
                    		<div class="heading-4">
				               <h4 class="text-center">Enter Vehicle Registration</h4>
				               <h5 class="text-center">optional to auto fill your vehicle details</h5>
				                 <div class="col-md-12 text-left">
		                            <div class="form-group number">
		                                <input type="text" name="number" class="form-control" placeholder="eg 0D12345">
		                            </div>
		                        </div>
				            </div>
                    	</div>
                        <div class="col-md-12 text-left">
                        	<label for="title">Advert title</label>
                            <div class="form-group name">
                                <input type="text" name="title" class="form-control" placeholder="Breif Description">
                            </div>
                        </div>
                        <div class="col-md-12 text-left">
                        	<label for="price">Price</label>
                        	<div class="form-group name">
                                <select id="price" class="form-control name">
							        <option selected>Euro</option>
							        <option>Dollar</option>
							        <option>Pound</option>
							    </select>
                            </div>
                        </div>
                        <div class="col-md-12" style="margin-top:20px">
                        	<label for="amount">Amount</label>
                            <div class="form-group email">
                                <input type="number" name="amount" class="form-control" placeholder="1200">
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="years">Years</label>
                            <div class="form-group subject">
                                <input type="number" name="subject" class="form-control" placeholder="Years">
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="make">Make</label>
                            <div class="form-group subject">
                                <select id="make" class="form-control name">
							        <option selected>Toyota</option>
							        <option>Honda</option>
							        <option>Nissan</option>
							        <option>Mercidies</option>
							    </select>
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="mileage">Mileage</label>
                            <div class="form-group subject">
                                <select id="mileage" class="form-control name">
							        <option selected>Kilometers</option>
							        <option>Miles</option>
							    </select>
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="engineType">Engine Type</label>
                            <div class="form-group subject">
                                <select id="engineType" class="form-control name">
							        <option selected>CNG</option>
							        <option>Diesel</option>
							        <option>Hybrid</option>
							        <option>Petrol</option>
							    </select>
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="mileage">Colours</label>
                            <div class="form-group subject">
                                <select id="color" class="form-control name">
							        <option selected>Black</option>
							        <option>Blue</option>
							        <option>White</option>
							    </select>
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="engineType">Transmission</label>
                            <div class="form-group subject">
                                <select id="transmission" class="form-control name">
							        <option selected>Automatic</option>
							        <option>Manual</option>
							    </select>
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="mileage">Doors</label>
                            <div class="form-group subject">
                                <select id="doors" class="form-control name">
							        <option selected>2 Doors</option>
							        <option>3 Doors</option>
							        <option>4 Doors</option>
							        <option>5 Doors</option>
							        <option>Others</option>
							    </select>
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="engineType">Country</label>
                            <div class="form-group subject">
                                <select id="country" class="form-control name">
							        <option selected>Ireland</option>
							        <option>Pakistan</option>
							        <option>U.K</option>
							        <option>USA</option>
							    </select>
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="mileage">Address</label>
                            <div class="form-group subject">
                                <input type="text" name="subject" class="form-control" placeholder="Address">
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="engineType">Kilometers run</label>
                            <div class="form-group subject">
                                <input type="number" name="subject" class="form-control" placeholder="Mileage">
                            </div>
                        </div>
                        <div class="col-md-12">
	                        <label for="mileage">Advert Description</label>
                            <div class="form-group subject">
                                <textarea class="form-control" name="message" placeholder="Write advert Description.."></textarea>
                            </div>
                        </div>
                        
                        <div class="col-md-12">
	                        <br><div class="container">
							  <div class="row">
							  <div class="col-sm-2 imgUp">
							    <div class="imagePreview"></div>
								<label class="btn btn-primary">Upload
									<input type="file" class="uploadFile img" value="Upload Photo" style="width: 0px;height: 0px;overflow: hidden;">
								</label>
							  </div><!-- col-2 -->
							  <i class="fa fa-plus imgAdd"></i>
							 </div><!-- row -->
							</div><!-- container -->
                        </div>
                        
                        <div class="col-lg-12">
				            <div class="heading-4">
				               <h4 class="text-center">Contact Details</h4>
				            </div>
				         </div>
                        
                         <div class="col-md-6">
	                        <label for="engineType">Logged in as : <b id="username">Kashif Ali</b></label>
                        </div>
                        <div class="col-md-6">
	                        <div class="send-btn text-right">
	                            <button type="reset" class="btn btn-md btn-info">Use Login details <span class="lnr lnr-chevron-right text-white"></span></button>
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="engineType">Name</label>
                            <div class="form-group subject">
                                <input type="text" name="subject" class="form-control" placeholder="Kashif Ali">
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="mileage">Country</label>
                            <div class="form-group subject">
                                <input type="text" name="subject" class="form-control" placeholder="Pakistan">
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="mileage">Phone</label>
                            <div class="form-group subject">
                                <input type="number" name="subject" class="form-control" placeholder="092-12345678">
                            </div>
                        </div>
                        <div class="col-md-6">
	                        <label for="mileage">Nearest Town</label>
                            <div class="form-group subject">
                                <input type="text" name="subject" class="form-control" placeholder="Karachi">
                            </div>
                        </div>
                        <div class="col-md-4">
	                        <div class="form-group subject">
                            	<label>Allow contact by Phone </label>
                                <input type="checkbox" name="subject" class="form-control" >
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group subject">
	                            <label for="mileage">Allow contact by Messenger</label>
                                <input type="checkbox" name="subject" class="form-control" placeholder="Karachi">
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="form-group subject">
	                            <label for="mileage">Generate VAT Receipt</label>
                                <input type="checkbox" name="subject" class="form-control" placeholder="Karachi">
                            </div>
                        </div>
                        
                        <div class="col-md-12" style="margin-top:20px">
                            <div class="send-btn text-center">
	                            <button type="reset" class="btn btn-outline-danger bomd">Clear</button>
                                <button type="submit" class="btn btn-outline-primary bomd">Next</button>
                            </div>
                        </div>
                        
                        
                        <div class="col-lg-12" style="margin-top:40px">
				            <div class="heading-4">
				               <h4 class="text-center">Adons</h4>
				            </div>
				         </div>
                        
                         <div class="col-md-6">
	                        <label for="engineType"><b id="featureAdd">Feature add</b></label>
	                        <div class="form-group subject">
	                            Lorem ipsum dolor sit amet, non odio tincidunt ut ante, lorem a euismod suspendisse vel, sed quam nulla mauris iaculis.
                            </div>
                        </div>
								<div class="col-xl-6 col-lg-6 col-md-12">
									<div class="pricing-1 ">
										<div class="title">Exclusive</div>
										<div class="content">
											<ul>
												<li>20 Projects</li>
												<li>32GB Storage</li>
												<li>50 Email Accounts</li>
												<li>12GB Bandwidth</li>
												<li>32GB Storage</li>
											</ul>
										</div>
										<div class="price-for-user">
											<div class="price">
												<sup>$</sup><span class="dolar">38</span><small
													class="month">per month</small>
											</div>
										</div>
										<button type="button" class="btn btn-outline-success bomd">Pay
											now</button>
										<button type="button" class="btn btn-outline-info bomd">View
											my Advert</button>
									</div>
								</div>
								<hr width="1000px">
                    </div>
                </div>
            </div>
        </form>
        </div>
    </div>
<!-- CONTACT DETAILS START -->
	
<!-- CONTACT DETAILS END -->
</div>
<!-- Testimonial end -->

	<!-- MAIN CONTENT END -->
	<!-- FOOTER START -->
	<jsp:include page="footer.jsp"></jsp:include>
	<script>
	$(".imgAdd").click(function(){
		  $(this).closest(".row").find('.imgAdd').before('<div class="col-sm-2 imgUp"><div class="imagePreview"></div><label class="btn btn-primary">Upload<input type="file" class="uploadFile img" value="Upload Photo" style="width:0px;height:0px;overflow:hidden;"></label><i class="fa fa-times del"></i></div>');
		});
		$(document).on("click", "i.del" , function() {
			$(this).parent().remove();
		});
		$(function() {
		    $(document).on("change",".uploadFile", function()
		    {
		    		var uploadFile = $(this);
		        var files = !!this.files ? this.files : [];
		        if (!files.length || !window.FileReader) return; // no file selected, or no FileReader support
		 
		        if (/^image/.test( files[0].type)){ // only image file
		            var reader = new FileReader(); // instance of the FileReader
		            reader.readAsDataURL(files[0]); // read the local file
		 
		            reader.onloadend = function(){ // set image data as background of div
		                //alert(uploadFile.closest(".upimage").find('.imagePreview').length);
		uploadFile.closest(".imgUp").find('.imagePreview').css("background-image", "url("+this.result+")");
		            }
		        }
		      
		    });
		});
	</script>
	<!-- FOOTER END -->
</body>
</html>