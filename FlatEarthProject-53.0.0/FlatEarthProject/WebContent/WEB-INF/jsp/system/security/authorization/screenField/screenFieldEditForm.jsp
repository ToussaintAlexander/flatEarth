<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  
<%@ taglib prefix="c"       uri="http://java.sun.com/jstl/core_rt"	        %>  

<head>
<title>Edit Authorization: Screen Field Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Authorization: Screen Field Form</h1>
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
 
 				<!-- Group Id -->
 
           		<div style="position: absolute; top:240px; left:20px; width:200px; height:25px">
           			Group Id :  
           		</div>
           
            	<div style="position: absolute; top:240px; left:120px; width:200px; height:25px">
           			<form:input path="groupId" size="3"/> 
          		</div>

          		<!-- User Id -->
                  
           		<div style="position: absolute; top:240px; left:220px; width:200px; height:25px">
           			User Id : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:320px; width:200px; height:25px">
           			<form:input path="userId" size="3" /> 
           		</div>
 
  				<!-- Sequence -->
                  
           		<div style="position: absolute; top:240px; left:410px; width:200px; height:25px">
           			Sequence : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:490px; width:200px; height:25px">
           			<form:input path="seq" size="3" /> 
           		</div>

          		<!-- Menu Name -->
                  
           		<div style="position: absolute; top:290px; left:20px; width:200px; height:25px">
           			Menu Name : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:120px; width:200px; height:25px">
           			<form:input path="menuName" size="8" /> 
           		</div>
 
          		<!-- Screen Name -->
                  
           		<div style="position: absolute; top:290px; left:220px; width:200px; height:25px">
           			Screen Name : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:320px; width:200px; height:25px">
           			<form:input path="screenName" size="8" /> 
           		</div>

          		<!-- FieldName -->
                  
           		<div style="position: absolute; top:290px; left:410px; width:200px; height:25px">
           			Field Name : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:490px; width:200px; height:25px">
           			<form:input path="fieldName" size="15" /> 
           		</div>
 
          		<!-- Field Visible -->
                  
           		<div style="position: absolute; top:340px; left:220px; width:200px; height:25px">
           			Field Visible : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:320px; width:200px; height:25px">
           			<form:input path="fieldVisible" size="3" /> 
           		</div>          		          	
 
          		<!-- FieldEditable -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Field Editable : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:120px; width:200px; height:25px">
           			<form:input path="fieldEditable" size="8" /> 
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
