
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Issuer Master File Edit Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Issuer Master File Edit Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/acquirerEditFormJSPPostAction">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Issuer Master File Edit Form:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:20px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
       
         		<!-- INTERNATIONAL BANK ACCOUNT NUMBER -->
         
        		<div style="position: absolute; top:200px; left:20px; width:200px; height:25px">   
          			Int'l Bank Account Number :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:210px; width:200px; height:25px">
           			<form:input path="intlBankAccountNumber" size="34" /> 
           		</div>
 
         		<!-- BANK IDENTIFIER CODE -->
         
        		<div style="position: absolute; top:230px; left:20px; width:200px; height:25px">   
          			Bank Identifier Code :  
          		</div>
          
          		<div style="position: absolute; top:230px; left:210px; width:200px; height:25px">
           			<form:input path="bankIdentifierCode" size="11" /> 
           		</div>
        
         		<!-- BANK IDENTIFICATION NUMBER -->
         
        		<div style="position: absolute; top:260px; left:20px; width:200px; height:25px">   
          			Bank Identification Number :  
          		</div>
          
          		<div style="position: absolute; top:260px; left:210px; width:200px; height:25px">
           			<form:input path="bankIdentificationNumber" size="6" /> 
           		</div>
 
         		<!-- First Name -->
         
        		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">   
          			First Name :  
          		</div>
          
          		<div style="position: absolute; top:310px; left:210px; width:200px; height:25px">
           			<form:input path="firstName" size="30" /> 
           		</div>
 
				<!-- Middle Name -->

           		<div style="position: absolute; top:335px; left:20px; width:200px; height:25px">
           			Middle Name :   
           		</div>
           
          		<div style="position: absolute; top:335px; left:210px; width:200px; height:25px">
           			<form:input path="middleName" size="30" /> 
          		</div>
 
 				<!-- Last Name -->
                  
           		<div style="position: absolute; top:360px; left:20px; width:200px; height:25px">
           			Last Name : 
           		</div>
           
            	<div style="position: absolute; top:360px; left:210px; width:200px; height:25px">
           			<form:input path="lastName" size="30" /> 
           		</div>
                
                <!-- Social Security -->
                  
            	<div style="position: absolute; top:390px; left:20px; width:200px; height:25px">
           			Social Security :  
           		</div>
           
           		<div style="position: absolute; top:390px; left:210px; width:200px; height:25px"> 
           			<form:input path="socialSecurity" size="9" /> 
          		</div>
                  
 				<!-- Primary Account Number -->
                  
          		<div style="position: absolute; top:420px; left:20px; width:200px; height:25px">  
           			Primary Account Number :  
           		</div>
           
           		<div style="position: absolute; top:420px; left:210px; width:200px; height:25px"> 
           			<form:input path="primaryAccountNumber" size="19" /> 
          		</div>

				<!-- Primary Account Number Sequence -->

           		<div style="position: absolute; top:420px; left:370px; width:200px; height:25px">   
           			<form:input path="primaryAccountNumberSeq" size="2" />  
         		</div>

				<!-- Association Name -->

        		<div style="position: absolute; top:450px; left:20px; width:200px; height:25px">
          			Association Name :   
          		</div>
          
          		<div style="position: absolute; top:450px; left:210px; width:200px; height:25px">
           			<form:input path="associationName" size="15" /> 
            	</div>

				<!-- Bank Name -->

        		<div style="position: absolute; top:450px; left:330px; width:200px; height:25px">
          			Bank Name :   
          		</div>
          
          		<div style="position: absolute; top:450px; left:470px; width:200px; height:25px">
           			<form:input path="bankName" size="15" /> 
            	</div>

				<!-- Brand Name -->

        		<div style="position: absolute; top:480px; left:20px; width:200px; height:25px">
          			Brand Name :   
          		</div>
          
          		<div style="position: absolute; top:480px; left:210px; width:200px; height:25px">
           			<form:input path="brandName" size="15" /> 
            	</div>

				<!-- Card Expiration Date -->

        		<div style="position: absolute; top:510px; left:20px; width:200px; height:25px">
          			Card Expiration Date :   
          		</div>
          
          		<div style="position: absolute; top:510px; left:210px; width:200px; height:25px">
           			<form:input path="cardExpirationDate" size="10" /> 
            	</div>

				<!-- Card Verification Value -->

        		<div style="position: absolute; top:540px; left:20px; width:200px; height:25px">
          			Card Verification Value :   
          		</div>
          
          		<div style="position: absolute; top:540px; left:210px; width:200px; height:25px">
           			<form:input path="cardVerificationValue" size="3" /> 
            	</div>

				<!-- INCLUDE FOOTPRINT -->

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
