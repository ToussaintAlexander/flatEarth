
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Chip:Amount Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Chip: Amount Form</h1>
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
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Primary Account :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:175px; width:200px; height:25px">
           			<form:input path="primaryAccountNumber" size="19" /> 
           		</div>
 
           		<div style="position: absolute; top:190px; left:330px; width:330px; height:25px">
           			<b>Sequence :</b>  
           		</div>
           
            	<div style="position: absolute; top:190px; left:520px; width:200px; height:25px">
           			<form:input path="primaryAccountNumberSeq" size="2"/> 
          		</div>
           
           		<!-- CURRENCY RELATED ------------------------------------------------------ -->
<!--            
           		<div style="position: absolute; top:270px; left:25px; width:200px; height:25px"> 
          			Currency Related :   
           		</div>
-->           
           		<!-- PRIMARY APPLICATION CURRENCY CODE -->
           
           		<div style="position: absolute; top:230px; left:20px; width:400px; height:25px">
           			Primary Application Currency Code :   
           		</div>
           
          		<div style="position: absolute; top:230px; left:270px; width:200px; height:25px">
           			<form:input path="currencyCodeApplication" size="3" /> 
          		</div>
          
          		<!-- CURRENCY CONVERSION FACTOR -->
                  
           		<div style="position: absolute; top:230px; left:330px; width:400px; height:25px">
           			Currency Conversion Factor : 
           		</div>
           
            	<div style="position: absolute; top:230px; left:520px; width:500px; height:25px">
           			<form:input path="currencyConversionFactor" size="8" /> 
           		</div>
          
          		<!-- SECONDARY APPLICATION CURRENCY CODE -->
          
          		<div style="position: absolute; top:260px; left:20px; width:400px; height:25px">
           			Secondary Application Currency Code :  
          		</div>
 
          		<div style="position: absolute; top:260px; left:270px; width:200px; height:25px">
           			<form:input path="secondaryApplCurrencyCode" size="3" /> 
          		</div>
 
                <!-- CURRENCY EXPONENT APPLICATION -->
                  
            	<div style="position: absolute; top:260px; left:330px; width:200px; height:25px">
           			Currency Exponent Appl :  
           		</div>
           
           		<div style="position: absolute; top:260px; left:520px; width:200px; height:25px"> 
           			<form:input path="currencyExponentApplication" size="1" /> 
          		</div>
                  
 				<!-- PIN RELATED ----------------------------------------------------------- -->
<!--                   
          		<div style="position: absolute; top:460px; left:20px; width:200px; height:25px">  
           			PIN Related   
           		</div>
-->           
           		<!-- Encrypted PIN -->
                            
          		<div style="position: absolute; top:290px; left:20px; width:200px; height:25px">  
           			Encrypted PIN :  
           		</div>
           
           		<div style="position: absolute; top:290px; left:270px; width:200px; height:25px"> 
           			<form:input path="encryptedPin" size="4" /> 
          		</div>

				<!-- PIN TRY COUNTER -->

          		<div style="position: absolute; top:290px; left:330px; width:300px; height:25px">
           			PIN Try Counter :
           		</div>
           
           		<div style="position: absolute; top:290px; left:520px; width:400px; height:25px">   
           			<form:input path="pinTryCounter" size="2" /> 
         		</div>

				<!-- CONSECUTIVE DOMESTIC OFFLINE ------------------------------------------ -->
 
        		<div style="position: absolute; top:320px; left:20px; width:200px; height:25px">
          			<b>Consecutive Domestic Offline</b>   
          		</div>
          
          		<!-- CONSECUTIVE INTERNATIONAL OFFLINE ------------------------------------------ -->
 
        		<div style="position: absolute; top:320px; left:330px; width:400px; height:25px">
          			<b>Consecutive International Offline</b>   
          		</div>
          
				<!-- CONSECUTIVE DOMESTIC OFFLINE COUNTER -->

            	<div style="position: absolute; top:350px; left:20px; width:200px; height:25px">
           			Counter :   
           		</div>
           
           		<div style="position: absolute; top:350px; left:120px; width:200px; height:25px">
           			<form:input path="consecutDomOfflineCtr" size="1" /> 
          		</div>
 
				<!-- CONSECUTIVE INTERNATIONAL OFFLINE COUNTER -->

            	<div style="position: absolute; top:350px; left:330px; width:200px; height:25px">
           			Counter :   
           		</div>

           		<div style="position: absolute; top:350px; left:520px; width:200px; height:25px">
           			<form:input path="consecutIntlOfflineCtr" size="1" /> 
          		</div>
          
				<!-- CONSECUTIVE DOMESTIC OFFLINE LOWER LIMIT -->
          
            	<div style="position: absolute; top:380px; left:20px; width:200px; height:25px">
           			Lower Limit :   
          		</div>
           
           		<div style="position: absolute; top:380px; left:120px; width:200px; height:25px">
           			<form:input path="consecutDomOfflineLwrLmt" size="1" /> 
          		</div>

				<!-- CONSECUTIVE INTERNATIONAL OFFLINE HIGHER LIMIT -->
          
            	<div style="position: absolute; top:380px; left:330px; width:200px; height:25px">
           			Higher Limit :   
          		</div>
           
           		<div style="position: absolute; top:380px; left:520px; width:200px; height:25px">
           			<form:input path="consecutIntlOfflineUprLmt" size="1" /> 
          		</div>
 
				<!-- CONSECUTIVE DOMESTIC OFFLINE UPPER LIMIT -->
          
             	<div style="position: absolute; top:410px; left:20px; width:200px; height:25px">
           			Lower Limit :   
          		</div>
           
           		<div style="position: absolute; top:410px; left:120px; width:200px; height:25px">
           			<form:input path="consecutIntlOfflineUprLmt" size="1" /> 
          		</div>  
           
				<!-- CONSECUTIVE INTERNATIONAL OFFLINE UPPER LIMIT -->
          
            	<div style="position: absolute; top:410px; left:330px; width:200px; height:25px">
           			Higher Limit :   
          		</div>
           
           		<div style="position: absolute; top:410px; left:520px; width:200px; height:25px">
           			<form:input path="consecutIntlOfflineUprLmt" size="1" /> 
          		</div>
          
          		<!-- CUMMULATIVE TOTAL DOMESTIC TRANSACTION AMOUNT ------------------------- -->
            
                <div style="position: absolute; top:440px; left:20px; width:400px; height:25px">   
           			<b>Cum Total Domestic Trans Amount</b>   
           		</div>
           
                <!-- CUMMULATIVE TOTAL INTERNATIONAL TRANSACTION AMOUNT ------------------------- -->
            
                <div style="position: absolute; top:440px; left:330px; width:400px; height:25px">   
           			<b>Cum Total International Trans Amount</b>   
           		</div>
           
          		<!-- CUMMULATIVE TOTAL DOMESTIC TRANSACTION AMOUNT -->
           
           		<div style="position: absolute; top:470px; left:20px; width:200px; height:25px">   
           			Amount :   
           		</div>
           
           		<div style="position: absolute; top:470px; left:120px; width:200px; height:25px">
           			<form:input path="cumTotDomTransAmount" size="9"/> 
           		</div>

          		<!-- CUMMULATIVE TOTAL INTERNATIONAL TRANSACTION AMOUNT -->
           
           		<div style="position: absolute; top:470px; left:330px; width:200px; height:25px">   
           			Amount :   
           		</div>
           
           		<div style="position: absolute; top:470px; left:520px; width:200px; height:25px">
           			<form:input path="cumTotIntlTransAmount" size="9"/> 
           		</div>
           
           		<!-- CUMMULATIVE TOTAL DOMESTIC TRANSACTION AMOUNT LOWER LIMIT -->
           
           		<div style="position: absolute; top:500px; left:20px; width:200px; height:25px">
           			Lower Limit :   
           		</div>
           
           		<div style="position: absolute; top:500px; left:120px; width:200px; height:25px">
           			<form:input path="cumTotDomTransAmtLwrLmt" size="9"/> 
           		</div>
                    
           		<!-- CUMMULATIVE TOTAL DOMESTIC TRANSACTION AMOUNT HIGHER LIMIT -->
           
           		<div style="position: absolute; top:500px; left:330px; width:200px; height:25px">
           			Higher Limit :   
           		</div>
           
           		<div style="position: absolute; top:500px; left:520px; width:200px; height:25px">
           			<form:input path="cumTotDomTransAmtUprLmt" size="9"/> 
           		</div>
          
           		<!-- CUMMULATIVE TOTAL INTERNATIONAL TRANSACTION AMOUNT HIGHER LIMIT -->
           
           		<div style="position: absolute; top:530px; left:20px; width:200px; height:25px">
           			Lower Limit :   
           		</div>
           
           		<div style="position: absolute; top:530px; left:120px; width:200px; height:25px">
           			<form:input path="cumTotDomTransAmtLwrLmt" size="9"/> 
           		</div>
          
           		<!-- CUMMULATIVE TOTAL INTERNATIONAL TRANSACTION AMOUNT LOWER LIMIT -->
           
           		<div style="position: absolute; top:530px; left:330px; width:200px; height:25px">
           			Higher Limit :   
           		</div>
           
           		<div style="position: absolute; top:530px; left:520px; width:200px; height:25px">
           			<form:input path="cumTotIntlTransAmtUprLmt" size="9"/> 
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
