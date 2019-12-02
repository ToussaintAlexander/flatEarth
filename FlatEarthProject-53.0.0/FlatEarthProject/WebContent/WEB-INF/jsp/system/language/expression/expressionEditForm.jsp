
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
 
 				<!-- Screen Name -->
 
           		<div style="position: absolute; top:220px; left:20px; width:200px; height:25px">
           			Screen Name :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:120px; width:200px; height:25px">
           			<form:input path="screenName" size="30"/> 
          		</div>

          		<!-- Field Name -->
                  
           		<div style="position: absolute; top:250px; left:20px; width:200px; height:25px">
           			Field Name : 
           		</div>
           
            	<div style="position: absolute; top:250px; left:120px; width:200px; height:25px">
           			<form:input path="fieldName" size="30" /> 
           		</div>
 
  				<!-- Field Value -->
                  
           		<div style="position: absolute; top:280px; left:20px; width:200px; height:25px">
           			Field Value : 
           		</div>
           
            	<div style="position: absolute; top:280px; left:120px; width:200px; height:25px">
           			<form:input path="fieldValue" size="30" /> 
           		</div>

          		<!-- Expression -->
                  
           		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">
           			Expression : 
           		</div>
           
            	<div style="position: absolute; top:310px; left:120px; width:200px; height:25px">
           			<form:input path="expression" size="70" /> 
           		</div>
 
          		<!-- Rating -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Rating : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:120px; width:200px; height:25px">
           			<form:input path="rating" size="1" /> 
           		</div>
 
          		<!-- Default Value -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">
           			Default Value : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:120px; width:200px; height:25px">
           			<form:input path="defaultValue" size="30" /> 
           		</div>

          		<!-- Status -->
                  
           		<div style="position: absolute; top:400px; left:20px; width:200px; height:25px">
           			Status : 
           		</div>
           
            	<div style="position: absolute; top:400px; left:120px; width:200px; height:25px">
           			<form:input path="status" size="1" /> 
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
