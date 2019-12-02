
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Association: Related Document Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Association: Related Document Form</h1>
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
        
         		<!-- Document -->
         
        		<div style="position: absolute; top:260px; left:25px; width:200px; height:25px">   
          			Document :  
          		</div>
          
          		<div style="position: absolute; top:260px; left:120px; width:200px; height:25px">
           			<form:input path="document" size="30" /> 
           		</div>
 
         		<!-- Version -->
         
        		<div style="position: absolute; top:290px; left:25px; width:200px; height:25px">   
          			Version :  
          		</div>
          
          		<div style="position: absolute; top:290px; left:120px; width:200px; height:25px">
           			<form:input path="version" size="30" /> 
           		</div>
 
				<!-- Author -->

           		<div style="position: absolute; top:320px; left:25px; width:200px; height:25px">
           			Author :   
           		</div>
           
          		<div style="position: absolute; top:320px; left:120px; width:200px; height:25px">
           			<form:input path="author" size="30" /> 
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
