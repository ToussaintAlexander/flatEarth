
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Retailer: Edit Invoice Page 2 Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Retailer: Edit Invoice Page 2 Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/cardholderEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
         		<!-- Acquirer Identifier -->
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Acquirer Identifier :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:230px; width:200px; height:25px">
           			<form:input path="acquirerIdentifier" size="11" /> 
           		</div>
 
 				<!-- Merchant Identifier -->
 
           		<div style="position: absolute; top:215px; left:20px; width:330px; height:25px">
           			<b>Merchant Identifier :</b>  
           		</div>
           
            	<div style="position: absolute; top:215px; left:230px; width:200px; height:25px">
           			<form:input path="merchantIdentifier" size="15"/> 
          		</div>

           		<!-- Terminal Identification -->
           
           		<div style="position: absolute; top:240px; left:20px; width:400px; height:25px">
           			<b>Terminal Identification :</b>   
           		</div>
           
          		<div style="position: absolute; top:240px; left:230px; width:200px; height:25px">
           			<form:input path="terminalIdentification" size="8" /> 
          		</div>
          
          		<!-- Interface Device Serial Number -->
                  
           		<div style="position: absolute; top:290px; left:20px; width:400px; height:25px">
           			Interface Device Serial Number : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:230px; width:500px; height:25px">
           			<form:input path="interfaceDeviceSerialNumber" size="8" /> 
           		</div>
          
          		<!-- Terminal Type -->
                  
           		<div style="position: absolute; top:290px; left:330px; width:400px; height:25px">
           			Terminal Type : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:470px; width:500px; height:25px">
           			<form:input path="terminalType" size="2" /> 
           		</div>
 
  				<!-- Terminal Country Code -->
                  
           		<div style="position: absolute; top:320px; left:20px; width:400px; height:25px">
           			Terminal Country Code : 
           		</div>
           
            	<div style="position: absolute; top:320px; left:230px; width:500px; height:25px">
           			<form:input path="terminalCountryCode" size="3" /> 
           		</div>

          		<!-- Country Code -->
                  
           		<div style="position: absolute; top:320px; left:330px; width:400px; height:25px">
           			Country Code : 
           		</div>
           
            	<div style="position: absolute; top:320px; left:470px; width:500px; height:25px">
           			<form:input path="countryCode" size="3" /> 
           		</div>
 
          		<!-- Currency Code -->
                  
           		<div style="position: absolute; top:350px; left:20px; width:400px; height:25px">
           			Currency Code : 
           		</div>
           
            	<div style="position: absolute; top:350px; left:230px; width:500px; height:25px">
           			<form:input path="currencyCode" size="3" /> 
           		</div>
       		         
          		<!-- Form Factor Indicator -->
                  
           		<div style="position: absolute; top:350px; left:330px; width:400px; height:25px">
           			Form Factor Indicator : 
           		</div>
           
            	<div style="position: absolute; top:350px; left:470px; width:500px; height:25px">
           			<form:input path="formFactorIndicator" size="4" /> 
           		</div>

          		<!-- Point of Service Entry Mode -->
                  
           		<div style="position: absolute; top:380px; left:20px; width:400px; height:25px">
           			Point of Service Entry Mode : 
           		</div>
           
            	<div style="position: absolute; top:380px; left:230px; width:500px; height:25px">
           			<form:input path="pointofServiceEntryMode" size="2" /> 
           		</div>
        
          		<!-- Transaction Type -->
                  
           		<div style="position: absolute; top:380px; left:330px; width:400px; height:25px">
           			Transaction Type : 
           		</div>
           
            	<div style="position: absolute; top:380px; left:470px; width:500px; height:25px">
           			<form:input path="transactionType" size="2" /> 
           		</div>
 
          		<!-- Transaction Date -->
                  
           		<div style="position: absolute; top:410px; left:20px; width:400px; height:25px">
           			Transaction Date : 
           		</div>
           
            	<div style="position: absolute; top:410px; left:230px; width:500px; height:25px">
           			<form:input path="transactionDate" size="6" /> 
           		</div>
  
          		<!-- Transaction Time -->
                  
           		<div style="position: absolute; top:410px; left:330px; width:400px; height:25px">
           			Transaction Time : 
           		</div>         
           		         
            	<div style="position: absolute; top:410px; left:470px; width:500px; height:25px">
           			<form:input path="transactionTime" size="6" /> 
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
