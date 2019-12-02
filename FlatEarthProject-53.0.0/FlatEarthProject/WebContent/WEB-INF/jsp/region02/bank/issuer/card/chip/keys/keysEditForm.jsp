
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Chip: Keys Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Chip: Keys Form</h1>
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
          
          		<div style="position: absolute; top:190px; left:150px; width:200px; height:25px">
           			<form:input path="primaryAccountNumber" size="19" /> 
           		</div>
 
           		<div style="position: absolute; top:190px; left:320px; width:330px; height:25px">
           			<b>Sequence :</b>  
           		</div>
           
            	<div style="position: absolute; top:190px; left:400px; width:200px; height:25px">
           			<form:input path="primaryAccountNumberSeq" size="2"/> 
          		</div>
           
           		<!-- ICC Public Key Certificate -->
           
           		<div style="position: absolute; top:240px; left:20px; width:400px; height:25px">
           			ICC Public Key Certificate :   
           		</div>
           
          		<div style="position: absolute; top:240px; left:320px; width:200px; height:25px">
           			<form:input path="publicKeyCertificate" size="8" /> 
          		</div>
          
          		<!-- ICC Public Key Exponent -->
                  
           		<div style="position: absolute; top:270px; left:20px; width:400px; height:25px">
           			ICC Public Key Exponent : 
           		</div>
           
            	<div style="position: absolute; top:270px; left:320px; width:500px; height:25px">
           			<form:input path="publicKeyExponent" size="8" /> 
           		</div>
          
          		<!-- ICC Public Key Remainder -->
          
          		<div style="position: absolute; top:300px; left:20px; width:400px; height:25px">
           			ICC Public Key Remainder :  
          		</div>
 
          		<div style="position: absolute; top:300px; left:320px; width:200px; height:25px">
           			<form:input path="publicKeyRemainder" size="8" /> 
          		</div>
 
                <!-- ICC Public Key Index -->
                  
            	<div style="position: absolute; top:330px; left:20px; width:200px; height:25px">
           			ICC Public Key Index :  
           		</div>
           
           		<div style="position: absolute; top:330px; left:320px; width:200px; height:25px"> 
           			<form:input path="publicKeyIndex" size="8" /> 
          		</div>
                  
                <!-- ICC Dynamic Number -->

            	<div style="position: absolute; top:380px; left:20px; width:200px; height:25px">
           			ICC Dynamic Number :   
           		</div>

           		<div style="position: absolute; top:380px; left:320px; width:200px; height:25px">
           			<form:input path="dynamicNumber" size="8" /> 
          		</div>
                  
           		<!-- ICC PIN Encipherment Public Key Certificate -->
                            
          		<div style="position: absolute; top:430px; left:20px; width:400px; height:25px">  
           			ICC PIN Encipherment Public Key Certificate :  
           		</div>
           
           		<div style="position: absolute; top:430px; left:320px; width:200px; height:25px"> 
           			<form:input path="pinEncipherPublicKeyCert" size="8" /> 
          		</div>

				<!-- ICC PIN Encipherment Public Key Exponent -->

          		<div style="position: absolute; top:460px; left:20px; width:400px; height:25px">
           			ICC PIN Encipherment Public Key Exponent :
           		</div>
           
           		<div style="position: absolute; top:460px; left:320px; width:400px; height:25px">   
           			<form:input path="pinEncipherPublicKeyExp" size="8" /> 
         		</div>

				<!-- ICC PIN Encipherment Public Key Remainder -->

            	<div style="position: absolute; top:490px; left:20px; width:400px; height:25px">
           			ICC PIN Encipherment Public Key Remainder :   
           		</div>
           
           		<div style="position: absolute; top:490px; left:320px; width:200px; height:25px">
           			<form:input path="pinEncipherPublicKeyRemain" size="8" /> 
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
