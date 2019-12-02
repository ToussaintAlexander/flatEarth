
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Chip: Verification Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Chip: Verification Form</h1>
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
           
            	<div style="position: absolute; top:190px; left:410px; width:200px; height:25px">
           			<form:input path="primaryAccountNumberSeq" size="2"/> 
          		</div>

           		<!-- Cardholder Verification Method -->
           
           		<div style="position: absolute; top:240px; left:20px; width:400px; height:25px">
           			Cardholder Verification Method :   
           		</div>
           
          		<div style="position: absolute; top:240px; left:240px; width:200px; height:25px">
           			<form:input path="cardhldrVerificationMethod" size="8" /> 
          		</div>
          
          		<!-- Cardholder Verification Status -->
                  
           		<div style="position: absolute; top:270px; left:20px; width:400px; height:25px">
           			Cardholder Verification Status : 
           		</div>
           
            	<div style="position: absolute; top:270px; left:240px; width:500px; height:25px">
           			<form:input path="cardhldrVerificationStatus" size="8" /> 
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
