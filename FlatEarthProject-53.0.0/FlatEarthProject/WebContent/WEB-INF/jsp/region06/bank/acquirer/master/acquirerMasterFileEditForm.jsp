
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Acquirer Master File Edit Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Acquirer Master File Edit Formm</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/acquirerEditFormJSPPostAction">

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
 
         		<!-- Merchant Identifier -->
         
        		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">   
          			Merchant Identifier :  
          		</div>
          
          		<div style="position: absolute; top:310px; left:210px; width:200px; height:25px">
           			<form:input path="merchantIdentifier" size="15" /> 
           		</div>
 
				<!-- Merchant Category Code -->

           		<div style="position: absolute; top:310px; left:330px; width:200px; height:25px">
           			Merchant Category Cd :   
           		</div>
           
          		<div style="position: absolute; top:310px; left:475px; width:200px; height:25px">
           			<form:input path="merchantCategoryCode" size="4" /> 
          		</div>
 
 				<!-- Acquirer Identifier -->
                  
           		<div style="position: absolute; top:335px; left:20px; width:200px; height:25px">
           			Acquirer Identifier : 
           		</div>
           
            	<div style="position: absolute; top:335px; left:210px; width:200px; height:25px">
           			<form:input path="acquirerIdentifier" size="11" /> 
           		</div>
                
				<!-- Form Factor Indicator -->

        		<div style="position: absolute; top:335px; left:330px; width:200px; height:25px">
          			Form Factor Indicator :   
          		</div>
          
          		<div style="position: absolute; top:335px; left:475px; width:200px; height:25px">
           			<form:input path="formFactorIndicator" size="4" /> 
            	</div>
                
 				<!-- Terminal Identification -->
                  
          		<div style="position: absolute; top:385px; left:20px; width:200px; height:25px">  
           			Terminal Identification :  
           		</div>
           
           		<div style="position: absolute; top:385px; left:210px; width:200px; height:25px"> 
           			<form:input path="terminalIdentification" size="8" /> 
          		</div>

				<!-- Interface Device Serial Number -->

          		<div style="position: absolute; top:385px; left:330px; width:200px; height:25px">
           			Interface Device Serial :
           		</div>
           
           		<div style="position: absolute; top:385px; left:475px; width:200px; height:25px">   
           			<form:input path="interfaceDeviceSerialNumber" size="8" />  
         		</div>

				<!-- Terminal Type -->

        		<div style="position: absolute; top:410px; left:20px; width:200px; height:25px">
          			Terminal Type :   
          		</div>
          
          		<div style="position: absolute; top:410px; left:210px; width:200px; height:25px">
           			<form:input path="terminalType" size="2" /> 
            	</div>

				<!-- Terminal Country Code -->

        		<div style="position: absolute; top:410px; left:330px; width:200px; height:25px">
          			Terminal Country Cd :   
          		</div>
          
          		<div style="position: absolute; top:410px; left:475px; width:200px; height:25px">
           			<form:input path="terminalCountryCode" size="3" /> 
            	</div>

				<!-- Country Code -->

        		<div style="position: absolute; top:435px; left:20px; width:200px; height:25px">
          			Country Code :   
          		</div>
          
          		<div style="position: absolute; top:435px; left:210px; width:200px; height:25px">
           			<form:input path="countryCode" size="3" /> 
            	</div>

				<!-- Currency Code -->

        		<div style="position: absolute; top:435px; left:330px; width:200px; height:25px">
          			Currency Code :   
          		</div>
          
          		<div style="position: absolute; top:435px; left:475px; width:200px; height:25px">
           			<form:input path="currencyCode" size="3" /> 
            	</div>

				<!-- Point of Service Entry Mode -->

        		<div style="position: absolute; top:485px; left:330px; width:200px; height:25px">
          			POS Entry Mode :   
          		</div>
          
          		<div style="position: absolute; top:485px; left:475px; width:200px; height:25px">
           			<form:input path="pointofServiceEntryMode" size="2" /> 
            	</div>

				<!-- Transaction Type -->

        		<div style="position: absolute; top:485px; left:20px; width:200px; height:25px">
          			Transaction Type :   
          		</div>
          
          		<div style="position: absolute; top:485px; left:210px; width:200px; height:25px">
           			<form:input path="transactionType" size="2" /> 
            	</div>

				<!-- Transaction Date -->

        		<div style="position: absolute; top:535px; left:20px; width:200px; height:25px">
          			Transaction Date :   
          		</div>
          
          		<div style="position: absolute; top:535px; left:210px; width:200px; height:25px">
           			<form:input path="transactionDate" size="6" /> 
            	</div>

				<!-- Transaction Time -->

        		<div style="position: absolute; top:535px; left:330px; width:200px; height:25px">
          			Transaction Time :   
          		</div>
          
          		<div style="position: absolute; top:535px; left:475px; width:200px; height:25px">
           			<form:input path="transactionTime" size="6" /> 
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
