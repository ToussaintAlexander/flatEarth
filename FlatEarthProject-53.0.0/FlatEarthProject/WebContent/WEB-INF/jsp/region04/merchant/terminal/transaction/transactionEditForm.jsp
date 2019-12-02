
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Terminal: Transaction Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Terminal: Transaction Form</h1>
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
          
          		<div style="position: absolute; top:190px; left:220px; width:200px; height:25px">
           			<form:input path="acquirerIdentifier" size="11" /> 
           		</div>
 
 				<!-- Merchant Identifier -->
 
           		<div style="position: absolute; top:215px; left:20px; width:200px; height:25px">
           			<b>Merchant Identifier :</b>  
           		</div>
           
            	<div style="position: absolute; top:215px; left:220px; width:200px; height:25px">
           			<form:input path="merchantIdentifier" size="15"/> 
          		</div>

           		<!-- Terminal Identification -->
           
           		<div style="position: absolute; top:240px; left:20px; width:200px; height:25px">
           			<b>Terminal Identification :</b>   
           		</div>
           
          		<div style="position: absolute; top:240px; left:220px; width:200px; height:25px">
           			<form:input path="terminalIdentification" size="8" /> 
          		</div>
          
          		<!-- Status Information -->
                  
           		<div style="position: absolute; top:290px; left:20px; width:200px; height:25px">
           			Status Information : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:220px; width:200px; height:25px">
           			<form:input path="statusInformation" size="4" /> 
           		</div>
          
          		<!-- Country Code -->
                  
           		<div style="position: absolute; top:290px; left:330px; width:200px; height:25px">
           			Country Code : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:550px; width:200px; height:25px">
           			<form:input path="countryCode" size="3" /> 
           		</div>
 
  				<!-- Form Factor Indicator -->
                  
           		<div style="position: absolute; top:315px; left:20px; width:200px; height:25px">
           			Form Factor Indicator : 
           		</div>
           
            	<div style="position: absolute; top:315px; left:220px; width:200px; height:25px">
           			<form:input path="formFactorIndicator" size="4" /> 
           		</div>

          		<!-- Sequence Counter -->
                  
           		<div style="position: absolute; top:315px; left:330px; width:200px; height:25px">
           			Sequence Counter : 
           		</div>
           
            	<div style="position: absolute; top:315px; left:520px; width:200px; height:25px">
           			<form:input path="sequenceCounter" size="8" /> 
           		</div>
 
          		<!-- Point of Service Entry Mode -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Point of Service Entry Mode : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:220px; width:200px; height:25px">
           			<form:input path="pointofServiceEntryMode" size="2" /> 
           		</div>
       		         
          		<!-- Authorization Response Code -->
                  
           		<div style="position: absolute; top:340px; left:330px; width:200px; height:25px">
           			Authorization Response Code : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:555px; width:200px; height:25px">
           			<form:input path="authorizationResponseCode" size="2" /> 
           		</div>

          		<!-- Transaction Type -->
                  
           		<div style="position: absolute; top:390px; left:20px; width:200px; height:25px">
           			Transaction Type : 
           		</div>
           
            	<div style="position: absolute; top:390px; left:220px; width:200px; height:25px">
           			<form:input path="transactionType" size="2" /> 
           		</div>
        
          		<!-- Transaction Date -->
                  
           		<div style="position: absolute; top:390px; left:330px; width:200px; height:25px">
           			Transaction Date : 
           		</div>
           
            	<div style="position: absolute; top:390px; left:530px; width:200px; height:25px">
           			<form:input path="transactionDate" size="6" /> 
           		</div>
 
          		<!-- Transaction PIN -->
                  
           		<div style="position: absolute; top:415px; left:20px; width:200px; height:25px">
           			Transaction PIN : 
           		</div>
           
            	<div style="position: absolute; top:415px; left:220px; width:200px; height:25px">
           			<form:input path="transactionPIN" size="4" /> 
           		</div>
  
          		<!-- Transaction Time -->
                  
           		<div style="position: absolute; top:415px; left:330px; width:200px; height:25px">
           			Transaction Time : 
           		</div>         
           		         
            	<div style="position: absolute; top:415px; left:530px; width:200px; height:25px">
           			<form:input path="transactionTime" size="6" /> 
           		</div>
    
          		<!-- Currency Code -->
                  
           		<div style="position: absolute; top:465px; left:20px; width:200px; height:25px">
           			Currency Code : 
           		</div>
           
            	<div style="position: absolute; top:465px; left:220px; width:200px; height:25px">
           			<form:input path="currencyCode" size="3" /> 
           		</div>
                               		         
          		<!-- Reference Currency Code -->
                  
           		<div style="position: absolute; top:465px; left:330px; width:200px; height:25px">
           			Reference Currency Code : 
           		</div>
           
            	<div style="position: absolute; top:465px; left:550px; width:200px; height:25px">
           			<form:input path="referenceCurrencyCode" size="3" /> 
           		</div>
                   		         
          		<!-- Currency Exponent -->
                  
           		<div style="position: absolute; top:490px; left:20px; width:200px; height:25px">
           			Currency Exponent : 
           		</div>
           
            	<div style="position: absolute; top:490px; left:220px; width:200px; height:25px">
           			<form:input path="currencyExponent" size="1" /> 
           		</div>
 
          		<!-- Reference Currency Exponent -->
                  
           		<div style="position: absolute; top:490px; left:330px; width:200px; height:25px">
           			Reference Currency Exponent : 
           		</div>
           
            	<div style="position: absolute; top:490px; left:560px; width:200px; height:25px">
           			<form:input path="referenceCurrencyExponent" size="1" /> 
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
