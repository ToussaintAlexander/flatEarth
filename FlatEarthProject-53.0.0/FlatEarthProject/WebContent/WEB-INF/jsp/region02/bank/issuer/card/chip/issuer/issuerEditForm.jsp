
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Issuer Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Chip: Issuer Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/applicationEditFormJSPPostAction">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Edit Chip: Issuer List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
         		<!-- PRIMARY ACCOUNT NUMBER -->
         
        		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">   
          			<b>Primary Account Number :</b>  
          		</div>
          
          		<div style="position: absolute; top:200px; left:210px; width:200px; height:25px">
           			<form:input path="primaryAccountNumber" size="19" /> 
           		</div>
 
				<!-- SEQUENCE NUMBER -->

           		<div style="position: absolute; top:230px; left:25px; width:200px; height:25px">
           			<b>Sequence :</b>   
           		</div>
           
          		<div style="position: absolute; top:230px; left:210px; width:200px; height:25px">
           			<form:input path="primaryAccountNumberSeq" size="2" /> 
          		</div>
 
 				<!-- INTERNATIONAL BANK ACCOUNT NUMBER -->
                  
           		<div style="position: absolute; top:270px; left:25px; width:200px; height:25px">
           			Int'l Bank Account Number  	: 
           		</div>
           
            	<div style="position: absolute; top:270px; left:210px; width:200px; height:25px">
           			<form:input path="intlBankAccountNumber" size="34" /> 
           		</div>
                
                <!-- BANK IDENTIFIER CODE -->
                  
            	<div style="position: absolute; top:310px; left:25px; width:200px; height:25px">
           			Bank Identifier Code   	:  
           		</div>
           
           		<div style="position: absolute; top:310px; left:210px; width:200px; height:25px"> 
           			<form:input path="bankIdentifierCode" size="11" /> 
          		</div>
                  
 				<!-- BANK IDENTIFICATION NUMBER -->
                  
          		<div style="position: absolute; top:310px; left:310px; width:200px; height:25px">  
           			Bank Identification Number	:  
           		</div>
           
           		<div style="position: absolute; top:310px; left:490px; width:200px; height:25px"> 
           			<form:input path="bankIdentificationNumber" size="6" /> 
          		</div>

				<!-- MERCHANT CATEGORY CODE -->

          		<div style="position: absolute; top:340px; left:25px; width:200px; height:25px">
           			Merchant Category Code	:
           		</div>
           
           		<div style="position: absolute; top:340px; left:210px; width:200px; height:25px">   
           			<form:input path="merchantCategoryCode" size="4" />  
         		</div>

				<!-- MERCHANT IDENTIFIER -->

        		<div style="position: absolute; top:340px; left:310px; width:200px; height:25px">
          			Merchant Identifier	:   
          		</div>
          
          		<div style="position: absolute; top:340px; left:490px; width:200px; height:25px">
           			<form:input path="merchantIdentifier" size="15" /> 
            	</div>

				<!-- COUNTRY CODE -->

        		<div style="position: absolute; top:380px; left:25px; width:200px; height:25px">
          			Country Code	:   
          		</div>
          
          		<div style="position: absolute; top:380px; left:210px; width:200px; height:25px">
           			<form:input path="countryCode" size="3" /> 
            	</div>

				<!-- ACTION CODE DEFAULT -->

        		<div style="position: absolute; top:420px; left:25px; width:200px; height:25px">
          			Action Code Default	:   
          		</div>
          
          		<div style="position: absolute; top:420px; left:210px; width:200px; height:25px">
           			<form:input path="actionCodeDefault" size="1" /> 
            	</div>

				<!-- ACTION CODE DENIAL -->

        		<div style="position: absolute; top:420px; left:260px; width:200px; height:25px">
          			Action Code Denial	:   
          		</div>
          
          		<div style="position: absolute; top:420px; left:390px; width:200px; height:25px">
           			<form:input path="actionCodeDenial" size="1" /> 
            	</div>

				<!-- ACTION CODE ONLINE -->

        		<div style="position: absolute; top:420px; left:430px; width:200px; height:25px">
          			Action Code Online	:   
          		</div>
          
          		<div style="position: absolute; top:420px; left:570px; width:200px; height:25px">
           			<form:input path="actionCodeOnline" size="1" /> 
            	</div>

				<!-- PUBLIC KEY CERTIFICATE -->

        		<div style="position: absolute; top:470px; left:25px; width:200px; height:25px">
          			Public Key Certificate	:   
          		</div>
          
          		<div style="position: absolute; top:470px; left:210px; width:200px; height:25px">
           			<form:input path="publicKeyCertificate" size="60" /> 
            	</div>

				<!-- PUBLIC KEY EXPONENT -->

        		<div style="position: absolute; top:520px; left:25px; width:200px; height:25px">
          			Public Key Exponent	:   
          		</div>
          
          		<div style="position: absolute; top:520px; left:210px; width:200px; height:25px">
           			<form:input path="publicKeyExponent" size="3" /> 
            	</div>

				<!-- PUBLIC KEY REMAINDER -->

        		<div style="position: absolute; top:550px; left:25px; width:200px; height:25px">
          			Public Key Remainder	:   
          		</div>
          
          		<div style="position: absolute; top:550px; left:210px; width:200px; height:25px">
           			<form:input path="publicKeyRemainder" size="8" /> 
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
