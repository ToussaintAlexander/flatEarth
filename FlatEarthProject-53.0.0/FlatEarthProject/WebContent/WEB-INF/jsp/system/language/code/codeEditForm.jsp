
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Language: Code Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Language: Code Form</h1>
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
           			<form:input path="codeField" size="3"/> 
          		</div>

          		<!-- Code Subfield -->
                  
           		<div style="position: absolute; top:250px; left:20px; width:200px; height:25px">
           			Code Subfield : 
           		</div>
           
            	<div style="position: absolute; top:250px; left:120px; width:200px; height:25px">
           			<form:input path="codeSubfield" size="3" /> 
           		</div>
 
  				<!-- Code Value -->
                  
           		<div style="position: absolute; top:280px; left:20px; width:200px; height:25px">
           			Code Value : 
           		</div>
           
            	<div style="position: absolute; top:280px; left:120px; width:200px; height:25px">
           			<form:input path="codeValue" size="15" /> 
           		</div>

          		<!-- Code Name -->
                  
           		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">
           			Code Name : 
           		</div>
           
            	<div style="position: absolute; top:310px; left:120px; width:200px; height:25px">
           			<form:input path="codeName" size="75" /> 
           		</div>
 
          		<!-- Description -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Description : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:120px; width:200px; height:25px">
           			<form:input path="description" size="50" /> 
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
