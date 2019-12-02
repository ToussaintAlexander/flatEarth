
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Magstripe: Track 1 Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Magstripe: Track 1 Form</h1>
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
  
           		<div style="position: absolute; top:265px; left:20px; width:330px; height:25px">
           			<b>Format Code :</b>  
           		</div>
 
           		<div style="position: absolute; top:265px; left:200px; width:200px; height:25px">
           			
          		</div>
   
           		<div style="position: absolute; top:290px; left:20px; width:330px; height:25px">
           			<b>Field Separator 1 :</b>  
           		</div>
           
            	<div style="position: absolute; top:290px; left:200px; width:200px; height:25px">
           			<form:input path="fieldSeparator1" size="1"/> 
          		</div>
 
           		<div style="position: absolute; top:315px; left:20px; width:330px; height:25px">
           			<b>Full Name :</b>  
           		</div>
           
            	<div style="position: absolute; top:315px; left:200px; width:200px; height:25px">
           			<form:input path="fullName" size="26"/> 
          		</div>
  
           		<div style="position: absolute; top:340px; left:20px; width:330px; height:25px">
           			<b>Field Separator 2 :</b>  
           		</div>
           
            	<div style="position: absolute; top:340px; left:200px; width:200px; height:25px">
           			<form:input path="fieldSeparator2" size="1"/> 
          		</div>
   
           		<div style="position: absolute; top:365px; left:20px; width:330px; height:25px">
           			<b>Expiration Date Year :</b>  
           		</div>
           
            	<div style="position: absolute; top:365px; left:200px; width:200px; height:25px">
           			<form:input path="expirationDateYear" size="2"/> 
          		</div>
   
           		<div style="position: absolute; top:390px; left:20px; width:330px; height:25px">
           			<b>Expiration Date Month :</b>  
           		</div>
           
            	<div style="position: absolute; top:390px; left:200px; width:200px; height:25px">
           			<form:input path="expirationDateMonth" size="2"/> 
          		</div>
   
           		<div style="position: absolute; top:415px; left:20px; width:330px; height:25px">
           			<b>Service Code :</b>  
           		</div>
           
            	<div style="position: absolute; top:415px; left:200px; width:200px; height:25px">
           			<form:input path="serviceCode" size="3"/> 
          		</div>
   
           		<div style="position: absolute; top:440px; left:20px; width:330px; height:25px">
           			<b>Pin Validation Key Index :</b>  
           		</div>
           
            	<div style="position: absolute; top:440px; left:200px; width:200px; height:25px">
           			<form:input path="pinValidationKeyIndex" size="1"/> 
          		</div>
   
           		<div style="position: absolute; top:465px; left:20px; width:330px; height:25px">
           			<b>PIN Verification Value :</b>  
           		</div>
           
            	<div style="position: absolute; top:465px; left:200px; width:200px; height:25px">
           			<form:input path="pinVerificationValue" size="4"/> 
          		</div>
   
           		<div style="position: absolute; top:490px; left:20px; width:330px; height:25px">
           			<b>Card Verification Value :</b>  
           		</div>
           
            	<div style="position: absolute; top:490px; left:200px; width:200px; height:25px">
           			<form:input path="cardVerificationValue" size="3"/> 
          		</div>
   
           		<div style="position: absolute; top:515px; left:20px; width:330px; height:25px">
           			<b>End Sentinel :</b>  
           		</div>
           
            	<div style="position: absolute; top:515px; left:200px; width:200px; height:25px">
           			<form:input path="endSentinel" size="1"/> 
          		</div>
   
           		<div style="position: absolute; top:540px; left:20px; width:330px; height:25px">
           			<b>Long Redundancy Check :</b>  
           		</div>
           
            	<div style="position: absolute; top:540px; left:200px; width:200px; height:25px">
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
