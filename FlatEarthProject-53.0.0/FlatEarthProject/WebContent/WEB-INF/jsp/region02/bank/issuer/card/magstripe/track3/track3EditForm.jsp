
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Magstripe: Track 3 Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Magstripe: Track 3 Form</h1>
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
   
           		<div style="position: absolute; top:240px; left:20px; width:330px; height:25px">
           			<b>Start Sentinel :</b>  
           		</div>
           
            	<div style="position: absolute; top:240px; left:200px; width:200px; height:25px">
           			<form:input path="startSentinel" size="1"/> 
          		</div>
   
           		<div style="position: absolute; top:240px; left:30px; width:330px; height:25px">
           			<b>Format Code :</b>  
           		</div>
           
            	<div style="position: absolute; top:240px; left:400px; width:200px; height:25px">
           			<form:input path="formatCode" size="2"/> 
          		</div>
   
           		<div style="position: absolute; top:265px; left:30px; width:330px; height:25px">
           			<b>countryCode :</b>  
           		</div>
           
            	<div style="position: absolute; top:265px; left:400px; width:200px; height:25px">
           			<form:input path="countryCode" size="3"/> 
          		</div>
   
           		<div style="position: absolute; top:290px; left:20px; width:330px; height:25px">
           			<b>Currency Code :</b>  
           		</div>
           
            	<div style="position: absolute; top:290px; left:200px; width:200px; height:25px">
           			<form:input path="currencyCode" size="3"/> 
          		</div>
  
           		<div style="position: absolute; top:290px; left:300px; width:330px; height:25px">
           			<b>Currency Exponent :</b>  
           		</div>
           
            	<div style="position: absolute; top:290px; left:400px; width:200px; height:25px">
           			<form:input path="currencyExponent" size="3"/> 
          		</div>
   
           		<div style="position: absolute; top:320px; left:20px; width:330px; height:25px">
           			<b>Cycle Begin Year :</b>  
           		</div>
           
            	<div style="position: absolute; top:320px; left:200px; width:200px; height:25px">
           			<form:input path="cycleBeginYear" size="4"/> 
          		</div>
   
           		<div style="position: absolute; top:320px; left:300px; width:330px; height:25px">
           			<b>amountAuthorizedPerCycle :</b>  
           		</div>
           
            	<div style="position: absolute; top:320px; left:400px; width:200px; height:25px">
           			<form:input path="amountAuthorizedPerCycle" size="4"/> 
          		</div>
   
           		<div style="position: absolute; top:345px; left:20px; width:330px; height:25px">
           			<b>Cycle Begin Day :</b>  
           		</div>
           
            	<div style="position: absolute; top:345px; left:200px; width:200px; height:25px">
           			<form:input path="cycleBeginDay" size="3"/> 
          		</div>
   
           		<div style="position: absolute; top:345px; left:300px; width:330px; height:25px">
           			<b>Amount Remaining This Cycle :</b>  
           		</div>
           
            	<div style="position: absolute; top:345px; left:400px; width:200px; height:25px">
           			<form:input path="amountRemainingThisCycle" size="4"/> 
          		</div>
   
           		<div style="position: absolute; top:370px; left:20px; width:330px; height:25px">
           			<b>Cycle Length :</b>  
           		</div>
           
            	<div style="position: absolute; top:370px; left:200px; width:200px; height:25px">
           			<form:input path="cycleLength" size="2"/> 
          		</div>
  
           		<div style="position: absolute; top:395px; left:20px; width:330px; height:25px">
           			<b>Retry Count :</b>  
           		</div>
           
            	<div style="position: absolute; top:395px; left:200px; width:200px; height:25px">
           			<form:input path="retryCount" size="4"/> 
          		</div>
  
           		<div style="position: absolute; top:425px; left:20px; width:330px; height:25px">
           			<b>PIN Control Parameters :</b>  
           		</div>
           
            	<div style="position: absolute; top:425px; left:200px; width:200px; height:25px">
           			<form:input path="pinControlParameters" size="6"/> 
          		</div>
    
           		<div style="position: absolute; top:455px; left:20px; width:330px; height:25px">
           			<b>Interchange Controls :</b>  
           		</div>
           
            	<div style="position: absolute; top:455px; left:200px; width:200px; height:25px">
           			<form:input path="interchangeControls" size="1"/> 
          		</div>
    
           		<div style="position: absolute; top:455px; left:300px; width:330px; height:25px">
           			<b>san1ServiceRestriction :</b>  
           		</div>
           
            	<div style="position: absolute; top:455px; left:400px; width:200px; height:25px">
           			<form:input path="san1ServiceRestriction" size="2"/> 
          		</div>
    
           		<div style="position: absolute; top:455px; left:20px; width:330px; height:25px">
           			<b>PAN Service Restriction :</b>  
           		</div>
           
            	<div style="position: absolute; top:455px; left:200px; width:200px; height:25px">
           			<form:input path="panServiceRestriction" size="2"/> 
          		</div>
     
           		<div style="position: absolute; top:470px; left:300px; width:330px; height:25px">
           			<b>San2 Service Restriction :</b>  
           		</div>
           
            	<div style="position: absolute; top:470x; left:400px; width:200px; height:25px">
           			<form:input path="san2ServiceRestriction" size="2"/> 
          		</div>
   
           		<div style="position: absolute; top:500px; left:20px; width:330px; height:25px">
           			<b>Expiration Date Year :</b>  
           		</div>
           
            	<div style="position: absolute; top:500px; left:200px; width:200px; height:25px">
           			<form:input path="expirationDateYear" size="2"/> 
          		</div>
   
   				<div style="position: absolute; top:530px; left:20px; width:330px; height:25px">
           			<b>Card Sequence Number :</b>  
           		</div>
           
            	<div style="position: absolute; top:530px; left:200px; width:200px; height:25px">
           			<form:input path="cardSequenceNumber" size="1"/> 
          		</div>
   
           		<div style="position: absolute; top:530px; left:300px; width:330px; height:25px">
           			<b>relayMarker :</b>  
           		</div>
           
            	<div style="position: absolute; top:530px; left:400px; width:200px; height:25px">
           			<form:input path="relayMarker" size="1"/> 
          		</div>
   
           		<div style="position: absolute; top:555px; left:20px; width:330px; height:25px">
           			<b>Card Security Number :</b>  
           		</div>
           
            	<div style="position: absolute; top:555px; left:200px; width:200px; height:25px">
           			<form:input path="cardSecurityNumber" size="9"/> 
          		</div>
   
           		<div style="position: absolute; top:555px; left:300px; width:330px; height:25px">
           			<b>Cryptographic Check Digits :</b>  
           		</div>
           
            	<div style="position: absolute; top:555px; left:400px; width:200px; height:25px">
           			<form:input path="cryptographicCheckDigits" size="1"/> 
          		</div>
   
           		<div style="position: absolute; top:585px; left:20px; width:330px; height:25px">
           			<b>End Sentinel :</b>  
           		</div>
           
            	<div style="position: absolute; top:585px; left:200px; width:200px; height:25px">
           			<form:input path="endSentinel" size="1"/> 
          		</div>
   
           		<div style="position: absolute; top:585px; left:300px; width:330px; height:25px">
           			<b>Long Redundancy Check :</b>  
           		</div>
           
            	<div style="position: absolute; top:585px; left:400px; width:200px; height:25px">
           			<form:input path="longRedundancyCheck" size="1"/> 
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
