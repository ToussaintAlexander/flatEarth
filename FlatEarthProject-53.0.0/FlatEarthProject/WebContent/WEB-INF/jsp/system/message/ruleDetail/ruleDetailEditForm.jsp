
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Message: Rule Detail Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Message: Rule Detail Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/retailerEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
         		<!-- Identifier -->
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Identifier :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:140px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
 				<!-- Field -->
 
           		<div style="position: absolute; top:230px; left:20px; width:200px; height:25px">
           			Field :  
           		</div>
           
            	<div style="position: absolute; top:230px; left:140px; width:200px; height:25px">
           			<form:input path="field" size="3" /> 
          		</div>

          		<!-- SubField -->
                  
           		<div style="position: absolute; top:255px; left:20px; width:200px; height:25px">
           			SubField : 
           		</div>
           
            	<div style="position: absolute; top:255px; left:140px; width:200px; height:25px">
           			<form:input path="subField" size="2" /> 
           		</div>
 
  				<!-- Fire -->
                  
           		<div style="position: absolute; top:285px; left:20px; width:200px; height:25px">
           			Fire : 
           		</div>
           
            	<div style="position: absolute; top:285px; left:140px; width:200px; height:25px">
           			<form:input path="fire" size="1" /> 
           		</div>
 
  				<!-- Type -->
                  
           		<div style="position: absolute; top:315px; left:20px; width:200px; height:25px">
           			Type : 
           		</div>
           
            	<div style="position: absolute; top:315px; left:140px; width:200px; height:25px">
           			<form:input path="type" size="2" /> 
           		</div>

          		<!-- Group -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Group : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:140px; width:200px; height:25px">
           			<form:input path="group" size="2" /> 
           		</div>
 
          		<!-- Bin Level -->
                  
           		<div style="position: absolute; top:365px; left:20px; width:200px; height:25px">
           			Bin Level : 
           		</div>
           
            	<div style="position: absolute; top:365px; left:140px; width:200px; height:25px">
           			<form:input path="binLevel" size="2" /> 
           		</div>
 
          		<!-- Account Level -->
                  
           		<div style="position: absolute; top:390px; left:20px; width:200px; height:25px">
           			Account Level : 
           		</div>
           
            	<div style="position: absolute; top:390px; left:140px; width:200px; height:25px">
           			<form:input path="accountLevel" size="2" /> 
           		</div>

          		<!-- Transaction Level -->
                  
           		<div style="position: absolute; top:420px; left:20px; width:200px; height:25px">
           			Transaction Level : 
           		</div>
           
            	<div style="position: absolute; top:420px; left:140px; width:200px; height:25px">
           			<form:input path="transactionLevel" size="2" /> 
           		</div>
           		
          		<!-- Pointer -->
                  
           		<div style="position: absolute; top:445px; left:20px; width:200px; height:25px">
           			Pointer : 
           		</div>
           
            	<div style="position: absolute; top:445px; left:140px; width:200px; height:25px">
           			<form:input path="pointer" size="2" /> 
           		</div>
           		
          		<!-- Sequence -->
                  
           		<div style="position: absolute; top:470px; left:20px; width:200px; height:25px">
           			Sequence : 
           		</div>
           
            	<div style="position: absolute; top:470px; left:140px; width:200px; height:25px">
           			<form:input path="seq" size="2" /> 
           		</div>
           		
          		<!-- Field Value -->
                  
           		<div style="position: absolute; top:495px; left:20px; width:200px; height:25px">
           			Field Value : 
           		</div>
           
            	<div style="position: absolute; top:495px; left:140px; width:200px; height:25px">
           			<form:input path="fieldValue" size="30" /> 
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
