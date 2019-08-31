<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<jsp:include page="includes.jsp"></jsp:include>
</head>
<body>
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
.uploadBtn
{
	width:100%;
	margin: 0px;
}
</style>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-sm-2 imgUp">
				<div class="imagePreview"></div>
				<div class="col-lg-3 col-md-4 col-sm-12">
					<label class="btn btn-primary btn-md uploadBtn"> Upload<input type="file"
						class="uploadFile img" value="Upload Photo"
						style="width: 0px; height: 0px; overflow: hidden;">
					</label>
				</div>
			</div>
			<!-- col-2 -->
			<i class="fa fa-plus imgAdd"></i>
		</div>
		<!-- row -->
	</div>
	<!-- container -->
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
</body>
</html>