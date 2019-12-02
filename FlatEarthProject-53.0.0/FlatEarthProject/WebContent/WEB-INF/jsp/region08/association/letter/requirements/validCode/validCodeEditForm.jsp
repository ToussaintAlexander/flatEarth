
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Requirements: Valid Code Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Requirements: Valid Code Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/acquirerEditFormJSPPostAction">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Edit Requirements: Valid Code List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
          		
         		<!-- Field -->
         
        		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">   
          			Field :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:120px; width:200px; height:25px">
           			<form:input path="field" size="3" /> 
           		</div>
 
         		<!-- Subfield -->
         
        		<div style="position: absolute; top:230px; left:25px; width:200px; height:25px">   
          			Subfield :  
          		</div>
          
          		<div style="position: absolute; top:230px; left:120px; width:200px; height:25px">
           			<form:input path="subfield" size="2" /> 
           		</div>
        
         		<!-- Sequence -->
         
        		<div style="position: absolute; top:260px; left:25px; width:200px; height:25px">   
          			Sequence :  
          		</div>
          
          		<div style="position: absolute; top:260px; left:120px; width:200px; height:25px">
           			<form:input path="seq" size="2" /> 
           		</div>
 
         		<!-- Code -->
         
        		<div style="position: absolute; top:290px; left:25px; width:200px; height:25px">   
          			Code :  
          		</div>
          
          		<div style="position: absolute; top:290px; left:120px; width:200px; height:25px">
           			<form:input path="code" size="4" /> 
           		</div>
 
				<!-- Name -->

           		<div style="position: absolute; top:320px; left:25px; width:200px; height:25px">
           			Name :   
           		</div>
           
          		<div style="position: absolute; top:320px; left:120px; width:200px; height:25px">
           			<form:input path="name" size="30" /> 
          		</div>
 
 				<!-- Description -->
                  
           		<div style="position: absolute; top:350px; left:25px; width:200px; height:25px">
           			Description : 
           		</div>
           
            	<div style="position: absolute; top:350px; left:120px; width:200px; height:25px">
           			<form:input path="description" size="30" /> 
           		</div>
                
				<!-- INCLUDE FOOTPRINT -->

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
