
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Chip Card Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Chip Card Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/chipCardEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Primary Account :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:200px; width:200px; height:25px">
           			<form:input path="primaryAccountNumber" size="19" /> 
           		</div>
 
           		<div style="position: absolute; top:190px; left:350px; width:330px; height:25px">
           			<b>Sequence :</b>  
           		</div>
           
            	<div style="position: absolute; top:190px; left:430px; width:200px; height:25px">
           			<form:input path="primaryAccountNumberSeq" size="2"/> 
          		</div>
           
           		<!-- Association Name -->
           
           		<div style="position: absolute; top:240px; left:20px; width:400px; height:25px">
           			Association Name :   
           		</div>
           
          		<div style="position: absolute; top:240px; left:200px; width:200px; height:25px">
           			<form:input path="associationName" size="30" /> 
          		</div>
          
          		<!-- Bank Name -->
                  
           		<div style="position: absolute; top:270px; left:20px; width:400px; height:25px">
           			Bank Name : 
           		</div>
           
            	<div style="position: absolute; top:270px; left:200px; width:500px; height:25px">
           			<form:input path="bankName" size="30" /> 
           		</div>
          
          		<!-- Brand Name -->
          
          		<div style="position: absolute; top:300px; left:20px; width:400px; height:25px">
           			Brand Name :  
          		</div>
 
          		<div style="position: absolute; top:300px; left:200px; width:200px; height:25px">
           			<form:input path="brandName" size="30" /> 
          		</div>
 
                <!-- Cardholder First Name -->
                  
            	<div style="position: absolute; top:350px; left:20px; width:200px; height:25px">
           			Cardholder First Name :  
           		</div>
           
           		<div style="position: absolute; top:350px; left:200px; width:200px; height:25px"> 
           			<form:input path="cardholderFirstName" size="30" /> 
          		</div>
                  
                <!-- Cardholder Middle Name -->

            	<div style="position: absolute; top:380px; left:20px; width:200px; height:25px">
           			Cardholder Middle Name :   
           		</div>

           		<div style="position: absolute; top:380px; left:200px; width:200px; height:25px">
           			<form:input path="cardholderMiddleName" size="30" /> 
          		</div>
                  
           		<!-- Cardholder Last Name -->
                            
          		<div style="position: absolute; top:410px; left:20px; width:400px; height:25px">  
           			Cardholder Last Name :  
           		</div>
           
           		<div style="position: absolute; top:410px; left:200px; width:200px; height:25px"> 
           			<form:input path="cardholderLastName" size="30" /> 
          		</div>

				<!-- Card Expiration Date -->

          		<div style="position: absolute; top:460px; left:20px; width:400px; height:25px">
           			Card Expiration Date :
           		</div>
           
           		<div style="position: absolute; top:460px; left:200px; width:400px; height:25px">   
           			<form:input path="cardExpirationDate" size="10" /> 
         		</div>

				<!-- Card Verification Value -->

            	<div style="position: absolute; top:490px; left:20px; width:400px; height:25px">
           			Card Verification Value :   
           		</div>
           
           		<div style="position: absolute; top:490px; left:200px; width:200px; height:25px">
           			<form:input path="cardVerificationValue" size="3" /> 
          		</div>
 
				<!-- INCLUDE FOOTPRINT -->

               <div style="position: absolute; top:560px; left:20px; width:200px; height:25px">
           			<b>Foot Print</b>   
           		</div>

				<jsp:include page="/include/pageFooter/footprint.jsp" />

				<!-- INCLUDE COPYRIGHT -->

				<jsp:include page="/include/pageFooter/buttonHeaderPanel.jsp" />
				
      		</form:form> 

		</div>
 
		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />
		
		</div>
		
</body>

</html>
