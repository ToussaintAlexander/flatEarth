<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>World View Form</title>
</head>
<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">World View Form</h1>
		</div>

		<!-- CONTENT BODY -->

        <div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">
        
        <form> 
        
        		<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />
        
        		<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/world.jsp" />
                 
         		<!-- Actor Object -->
         
        		<div style="position: absolute; top:250px; left:20px; width:200px; height:25px">   
          			 <b><font size=5>Actor Object</font></b>
          		</div>
          
         		<!-- Geography -->
         
        		<div style="position: absolute; top:250px; left:230px; width:200px; height:25px">   
          			 <b><font size=5>Geography</font></b>
          		</div>
          
         		<!-- Date/Time -->
         
        		<div style="position: absolute; top:250px; left:400px; width:200px; height:25px">   
          			 <b><font size=5>Date/Time</font></b>
          		</div>
          
         		<!-- Cardholder -->
         
        		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">   
          			<a href="cardholderForm"><b>Cardholder</b></a>
          		</div>
          
 				<!-- World -->
 
           		<div style="position: absolute; top:310px; left:230px; width:200px; height:25px">
           			<a href="cardholderForm"><b>World</b></a>
           		</div>
           
          		<!-- Year -->
                  
           		<div style="position: absolute; top:310px; left:400px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Year</b></a>
           		</div>
           
  				<!-- Card -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Card</b></a>
           		</div>
           
          		<!-- Region -->
                  
           		<div style="position: absolute; top:340px; left:230px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Region</b></a>
           		</div>
           
          		<!-- Month -->
                  
           		<div style="position: absolute; top:340px; left:400px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Month</b></a>
           		</div>
           
          		<!-- Product -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Product</b></a>
           		</div>
           
          		<!-- Country -->
                  
           		<div style="position: absolute; top:370px; left:230px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Country</b></a>
           		</div>
           
          		<!-- Week -->
                  
           		<div style="position: absolute; top:370px; left:400px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Week</b></a>
           		</div>
           
          		<!-- Terminal -->
                  
           		<div style="position: absolute; top:400px; left:20px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Terminal</b></a>
           		</div>
           
          		<!-- State -->
                  
           		<div style="position: absolute; top:400px; left:230px; width:200px; height:25px">
           			<a href="cardholderForm"><b>State</b></a>
           		</div>
           
          		<!-- Day -->
                  
           		<div style="position: absolute; top:400px; left:400px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Day</b></a>
           		</div>
           
          		<!-- Merchant -->
                  
           		<div style="position: absolute; top:430px; left:20px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Merchant</b></a>
           		</div>
           
          		<!-- City -->
                  
           		<div style="position: absolute; top:430px; left:230px; width:200px; height:25px">
           			<a href="cardholderForm"><b>City</b></a>
           		</div>
           
          		<!-- Hour -->
                  
           		<div style="position: absolute; top:430px; left:400px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Hour</b></a>
           		</div>
           
          		<!-- Acquirer -->
                  
           		<div style="position: absolute; top:460px; left:20px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Acquirer</b></a> 
           		</div>
           
          		<!-- Address -->
                  
           		<div style="position: absolute; top:460px; left:230px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Address</b></a>
           		</div>
           
          		<!-- Minute -->
                  
           		<div style="position: absolute; top:460px; left:400px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Minute</b></a>
           		</div>
           
          		<!-- Acquirer Processor -->
                  
           		<div style="position: absolute; top:490px; left:20px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Acquirer Processor</b></a>
           		</div>
           
          		<!-- Second -->
                  
           		<div style="position: absolute; top:490px; left:400px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Second</b></a>
           		</div>
           
          		<!-- Association -->
                  
           		<div style="position: absolute; top:520px; left:20px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Association</b></a>
           		</div>
           
          		<!-- Issuer Processor -->
                  
           		<div style="position: absolute; top:550px; left:20px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Issuer Processor</b></a>
           		</div>
           
          		<!-- Issuer -->
                  
           		<div style="position: absolute; top:580px; left:20px; width:200px; height:25px">
           			<a href="cardholderForm"><b>Issuer</b></a>
           		</div>
           		          
           		</form> 
           		
      	</div>

		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />

</div>

</body>
</html>