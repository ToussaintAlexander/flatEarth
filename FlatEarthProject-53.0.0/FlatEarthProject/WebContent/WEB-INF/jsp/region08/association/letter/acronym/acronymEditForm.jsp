
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Association: Acronym Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Association: Acronym Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/acquirerEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
          		
         		<!-- Identifier -->
         
        		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">   
          			Identifier :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:120px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
         		<!-- Sequence -->
         
        		<div style="position: absolute; top:230px; left:25px; width:200px; height:25px">   
          			Sequence :  
          		</div>
          
          		<div style="position: absolute; top:230px; left:120px; width:200px; height:25px">
           			<form:input path="seq" size="2" /> 
           		</div>
        
         		<!-- Acronym -->
         
        		<div style="position: absolute; top:260px; left:25px; width:200px; height:25px">   
          			Acronym :  
          		</div>
          
          		<div style="position: absolute; top:260px; left:120px; width:200px; height:25px">
           			<form:input path="acronym" size="30" /> 
           		</div>
 
         		<!-- Full Name -->
         
        		<div style="position: absolute; top:290px; left:25px; width:200px; height:25px">   
          			Full Name :  
          		</div>
          
          		<div style="position: absolute; top:290px; left:120px; width:200px; height:25px">
           			<form:input path="fullName" size="30" /> 
           		</div>
 
				<!-- Description -->

           		<div style="position: absolute; top:320px; left:25px; width:200px; height:25px">
           			Description :   
           		</div>
           
          		<div style="position: absolute; top:320px; left:120px; width:200px; height:25px">
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
