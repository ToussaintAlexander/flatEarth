
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Terminal: Terminal Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Terminal: Terminal Form</h1>
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
          
          		<!-- Merchant Category Code -->
                  
           		<div style="position: absolute; top:270px; left:20px; width:400px; height:25px">
           			Merchant Category Code : 
           		</div>
           
            	<div style="position: absolute; top:270px; left:230px; width:500px; height:25px">
           			<form:input path="merchantCategoryCode" size="2" /> 
           		</div>
          
          		<!-- Merchant Name And Location -->
                  
           		<div style="position: absolute; top:270px; left:330px; width:400px; height:25px">
           			Name : 
           		</div>
           
            	<div style="position: absolute; top:270px; left:400px; width:500px; height:25px">
           			<form:input path="merchantNameAndLocation" size="28" /> 
           		</div>
 
  				<!-- Terminal Country Code -->
                  
           		<div style="position: absolute; top:295px; left:20px; width:400px; height:25px">
           			Terminal Country Code : 
           		</div>
           
            	<div style="position: absolute; top:295px; left:230px; width:500px; height:25px">
           			<form:input path="terminalCountryCode" size="3" /> 
           		</div>

          		<!-- Merchant Name And Location -->
                  
           		<div style="position: absolute; top:295px; left:330px; width:400px; height:25px">
           			Location : 
           		</div>
           
            	<div style="position: absolute; top:295px; left:400px; width:500px; height:25px">
           			<form:input path="merchantNameAndLocation" size="28" /> 
           		</div>
 
          		<!-- Interface Device Serial Number -->
                  
           		<div style="position: absolute; top:320px; left:20px; width:400px; height:25px">
           			Interface Device Serial Number : 
           		</div>
           
            	<div style="position: absolute; top:320px; left:230px; width:500px; height:25px">
           			<form:input path="interfaceDeviceSerialNumber" size="12" /> 
           		</div>
       		         
          		<!-- Terminal Type -->
                  
           		<div style="position: absolute; top:320px; left:330px; width:400px; height:25px">
           			Terminal Type : 
           		</div>
           
            	<div style="position: absolute; top:320px; left:545px; width:500px; height:25px">
           			<form:input path="terminalType" size="4" /> 
           		</div>

          		<!-- Terminal Capabilities -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:400px; height:25px">
           			Terminal Capabilities : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:230px; width:500px; height:25px">
           			<form:input path="terminalCapabilities" size="1" /> 
           		</div>
        
          		<!-- Additional Terminal Capabilities -->
                  
           		<div style="position: absolute; top:370px; left:330px; width:400px; height:25px">
           			Additional Terminal Capabilities : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:565px; width:500px; height:25px">
           			<form:input path="additionalTermCapabilities" size="1" /> 
           		</div>
 
          		<!-- Kernel 4 Reader Capabilities -->
                  
           		<div style="position: absolute; top:395px; left:20px; width:400px; height:25px">
           			Kernel 4 Reader Capabilities : 
           		</div>
           
            	<div style="position: absolute; top:395px; left:230px; width:500px; height:25px">
           			<form:input path="kernel4ReaderCapabilities" size="1" /> 
           		</div>
  
          		<!-- Terminal Transaction Qualifiers -->
                  
           		<div style="position: absolute; top:395px; left:330px; width:400px; height:25px">
           			Terminal Transaction Qualifiers : 
           		</div>         
           		         
            	<div style="position: absolute; top:395px; left:565px; width:500px; height:25px">
           			<form:input path="terminalTransQualifiers" size="1" /> 
           		</div>
    
          		<!-- VLP Terminal Support Indicator -->
                  
           		<div style="position: absolute; top:435px; left:20px; width:400px; height:25px">
           			VLP Terminal Support Indicator : 
           		</div>
           
            	<div style="position: absolute; top:435px; left:230px; width:500px; height:25px">
           			<form:input path="vLPTermSupportIndicator" size="1" /> 
           		</div>
                               		         
          		<!-- Action Code Default -->
                  
           		<div style="position: absolute; top:435px; left:330px; width:400px; height:25px">
           			Action Code Default : 
           		</div>
           
            	<div style="position: absolute; top:435px; left:565px; width:500px; height:25px">
           			<form:input path="actionCodeDefault" size="1" /> 
           		</div>
                   		         
          		<!-- VLP Terminal Transaction Limit -->
                  
           		<div style="position: absolute; top:460px; left:20px; width:400px; height:25px">
           			VLP Terminal Transaction Limit : 
           		</div>
           
            	<div style="position: absolute; top:460px; left:230px; width:500px; height:25px">
           			<form:input path="vLPTermTransactionLimit" size="1" /> 
           		</div>
 
          		<!-- Action Code Decline -->
                  
           		<div style="position: absolute; top:460px; left:330px; width:400px; height:25px">
           			Action Code Decline : 
           		</div>
           
            	<div style="position: absolute; top:460px; left:565px; width:500px; height:25px">
           			<form:input path="actionCodeDecline" size="1" /> 
           		</div>
                   		         
          		<!-- Terminal Floor Limit -->
                  
           		<div style="position: absolute; top:485px; left:20px; width:400px; height:25px">
           			Terminal Floor Limit : 
           		</div>
           
            	<div style="position: absolute; top:485px; left:230px; width:500px; height:25px">
           			<form:input path="terminalFloorLimit" size="1" /> 
           		</div>
      
          		<!-- Action Code Online -->
                  
           		<div style="position: absolute; top:485px; left:330px; width:400px; height:25px">
           			Action Code Online : 
           		</div>
           
            	<div style="position: absolute; top:485px; left:565px; width:500px; height:25px">
           			<form:input path="actionCodeOnline" size="1" /> 
           		</div>
                   		         
          		<!-- Risk Management Data -->
                  
           		<div style="position: absolute; top:530px; left:20px; width:400px; height:25px">
           			Risk Management Data : 
           		</div>
           
            	<div style="position: absolute; top:530px; left:230px; width:500px; height:25px">
           			<form:input path="riskManagementData" size="1" /> 
           		</div>
                   		         
          		<!-- Verification Results -->
                  
           		<div style="position: absolute; top:530px; left:330px; width:400px; height:25px">
           			Verification Results : 
           		</div>
           
            	<div style="position: absolute; top:530px; left:565px; width:500px; height:25px">
           			<form:input path="verificationResults" size="1" /> 
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
