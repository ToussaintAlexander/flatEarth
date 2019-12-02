
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Association: Template Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Association: Template Form</h1>
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

      	 		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Processing Code :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:250px; width:200px; height:25px">
           			<form:input path="processingCode" size="6" /> 
           		</div>
 
 				<!-- pointOfServiceEntryMode -->
 
           		<div style="position: absolute; top:220px; left:20px; width:300px; height:25px">
           			<b>Point Of Service Entry Mode :</b>  
           		</div>
           
            	<div style="position: absolute; top:220px; left:250px; width:200px; height:25px">
           			<form:input path="pointOfServiceEntryMode" size="3"/> 
          		</div>

           		<!-- pointOfServiceConditionCode -->
           
           		<div style="position: absolute; top:250px; left:20px; width:400px; height:25px">
           			<b>Point Of Service Condition Code :</b>   
           		</div>
           
          		<div style="position: absolute; top:250px; left:250px; width:200px; height:25px">
           			<form:input path="pointOfServiceConditionCode" size="2" /> 
          		</div>
          
 				<!-- primaryAccountNumber -->
 
           		<div style="position: absolute; top:280px; left:20px; width:200px; height:25px">
           			<b>Primary AccountNumber :</b>  
           		</div>
           
            	<div style="position: absolute; top:280px; left:250px; width:200px; height:25px">
           			<form:input path="primaryAccountNumber" size="19"/> 
          		</div>

           		<!-- merchantType -->
           
           		<div style="position: absolute; top:310px; left:20px; width:400px; height:25px">
           			<b>Merchant Type :</b>   
           		</div>
           
          		<div style="position: absolute; top:310px; left:250px; width:200px; height:25px">
           			<form:input path="merchantType" size="4" /> 
          		</div>
          
 				<!-- expirationDate -->
 
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			<b>Expiration Date :</b>  
           		</div>
           
            	<div style="position: absolute; top:340px; left:250px; width:200px; height:25px">
           			<form:input path="expirationDate" size="10"/> 
          		</div>

           		<!-- track2Data -->
           
           		<div style="position: absolute; top:370px; left:20px; width:400px; height:25px">
           			<b>Track 2 Data :</b>   
           		</div>
           
          		<div style="position: absolute; top:370px; left:250px; width:200px; height:25px">
           			<form:input path="track2Data" size="37" /> 
          		</div>
          
 				<!-- transactionAmount -->
 
           		<div style="position: absolute; top:400px; left:20px; width:200px; height:25px">
           			<b>Transaction Amount :</b>  
           		</div>
           
            	<div style="position: absolute; top:400px; left:250px; width:200px; height:25px">
           			<form:input path="transactionAmount" size="12"/> 
          		</div>

           		<!-- additionalAmounts -->
           
           		<div style="position: absolute; top:430px; left:20px; width:400px; height:25px">
           			<b>Additional Amounts :</b>   
           		</div>
           
          		<div style="position: absolute; top:430px; left:250px; width:200px; height:25px">
           			<form:input path="additionalAmounts" size="12" /> 
          		</div>
          
 				<!-- personalIdentificationNumber -->
 
           		<div style="position: absolute; top:460px; left:20px; width:300px; height:25px">
           			<b>Personal Identification Number :</b>  
           		</div>
           
            	<div style="position: absolute; top:460px; left:250px; width:200px; height:25px">
           			<form:input path="personalIdentificationNumber" size="4"/> 
          		</div>

           		<!-- responseCode -->
           
           		<div style="position: absolute; top:490px; left:20px; width:400px; height:25px">
           			<b>Response Code :</b>   
           		</div>
           
          		<div style="position: absolute; top:490px; left:250px; width:200px; height:25px">
           			<form:input path="responseCode" size="2" /> 
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
