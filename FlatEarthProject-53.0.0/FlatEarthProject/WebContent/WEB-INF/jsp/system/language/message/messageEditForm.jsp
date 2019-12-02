
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Language: Message Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Language: Message Form</h1>
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
          
          		<div style="position: absolute; top:190px; left:120px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
 				<!-- Code Field -->
 
           		<div style="position: absolute; top:220px; left:20px; width:200px; height:25px">
           			Code Field :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:120px; width:200px; height:25px">
           			<form:input path="code" size="4"/> 
          		</div>

          		<!-- description -->
                  
           		<div style="position: absolute; top:250px; left:20px; width:200px; height:25px">
           			description : 
           		</div>
           
            	<div style="position: absolute; top:250px; left:120px; width:200px; height:25px">
           			<form:input path="description" size="30" /> 
           		</div>
 
  				<!-- cause -->
                  
           		<div style="position: absolute; top:280px; left:20px; width:200px; height:25px">
           			cause : 
           		</div>
           
            	<div style="position: absolute; top:280px; left:120px; width:200px; height:25px">
           			<form:input path="cause" size="30" /> 
           		</div>

          		<!-- effect -->
                  
           		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">
           			effect : 
           		</div>
           
            	<div style="position: absolute; top:310px; left:120px; width:200px; height:25px">
           			<form:input path="effect" size="30" /> 
           		</div>
 
          		<!-- recovery -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			recovery : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:120px; width:200px; height:25px">
           			<form:input path="recovery" size="30" /> 
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
