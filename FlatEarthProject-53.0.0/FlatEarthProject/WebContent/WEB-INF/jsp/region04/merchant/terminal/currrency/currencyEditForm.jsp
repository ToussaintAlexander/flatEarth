
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Currency Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Terminal: Currency Form</h1>
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
          			<b>Acquirer Identifier :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:250px; width:200px; height:25px">
           			<form:input path="acquirerIdentifier" size="11" /> 
           		</div>
 
 				<!-- Merchant Identifier -->
 
           		<div style="position: absolute; top:220px; left:20px; width:330px; height:25px">
           			<b>Merchant Identifier :</b>  
           		</div>
           
            	<div style="position: absolute; top:220px; left:250px; width:200px; height:25px">
           			<form:input path="merchantIdentifier" size="15"/> 
          		</div>

           		<!-- Terminal Identification -->
           
           		<div style="position: absolute; top:250px; left:20px; width:400px; height:25px">
           			<b>Terminal Identification :</b>   
           		</div>
           
          		<div style="position: absolute; top:250px; left:250px; width:200px; height:25px">
           			<form:input path="terminalIdentification" size="8" /> 
          		</div>
          
          		<!-- Account Type -->
                  
           		<div style="position: absolute; top:300px; left:20px; width:400px; height:25px">
           			Account Type : 
           		</div>
           
            	<div style="position: absolute; top:300px; left:250px; width:500px; height:25px">
           			<form:input path="accountType" size="2" /> 
           		</div>
          
          		<!-- Amount Authorized -->
                  
           		<div style="position: absolute; top:350px; left:20px; width:400px; height:25px">
           			Amount Authorized : 
           		</div>
           
            	<div style="position: absolute; top:350px; left:250px; width:500px; height:25px">
           			<form:input path="amountAuthorized" size="12" /> 
           		</div>
           		         
          		<!-- Amount Other -->
                  
           		<div style="position: absolute; top:380px; left:20px; width:400px; height:25px">
           			Amount Other : 
           		</div>
           
            	<div style="position: absolute; top:380px; left:250px; width:500px; height:25px">
           			<form:input path="amountOther" size="12" /> 
           		</div>
           		         
          		<!-- Amount Reference Currency -->
                  
           		<div style="position: absolute; top:430px; left:20px; width:400px; height:25px">
           			Amount Reference Currency : 
           		</div>
           
            	<div style="position: absolute; top:430px; left:250px; width:500px; height:25px">
           			<form:input path="amountReferenceCurrency" size="4" /> 
           		</div>
           		         
          		<!-- Code Transaction Reference Code -->
                  
           		<div style="position: absolute; top:460px; left:20px; width:400px; height:25px">
           			Code Transaction Reference Code : 
           		</div>
           
            	<div style="position: absolute; top:460px; left:250px; width:500px; height:25px">
           			<form:input path="codeTransReferenceCode" size="3" /> 
           		</div>
           		         
          		<!-- Exponent Transaction Reference -->
                  
           		<div style="position: absolute; top:490px; left:20px; width:400px; height:25px">
           			Exponent Transaction Reference : 
           		</div>
           
            	<div style="position: absolute; top:490px; left:250px; width:500px; height:25px">
           			<form:input path="exponentTransReference" size="1" /> 
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
