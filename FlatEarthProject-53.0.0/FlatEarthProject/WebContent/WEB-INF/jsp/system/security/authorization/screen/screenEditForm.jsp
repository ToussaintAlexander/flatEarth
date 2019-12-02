<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  
<%@ taglib prefix="c"       uri="http://java.sun.com/jstl/core_rt"	        %>  

<head>
<title>Edit Authorization: Screen Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Authorization: Screen Form</h1>
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
          
          		<div style="position: absolute; top:190px; left:150px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
 				<!-- Group Id -->
 
           		<div style="position: absolute; top:240px; left:20px; width:200px; height:25px">
           			Group Id :  
           		</div>
           
            	<div style="position: absolute; top:240px; left:150px; width:200px; height:25px">
           			<form:input path="groupId" size="3"/> 
          		</div>

          		<!-- User Id -->
                  
           		<div style="position: absolute; top:240px; left:240px; width:200px; height:25px">
           			User Id : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:340px; width:200px; height:25px">
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
           
            	<div style="position: absolute; top:290px; left:150px; width:200px; height:25px">
           			<form:input path="menuName" size="8" /> 
           		</div>
 
          		<!-- Screen Name -->
                  
           		<div style="position: absolute; top:290px; left:240px; width:200px; height:25px">
           			Screen Name : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:340px; width:200px; height:25px">
           			<form:input path="screenName" size="8" /> 
           		</div>

          		<!-- Create Operation -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Create Operation : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:150px; width:200px; height:25px">
           			<form:input path="createOperation" size="15" /> 
           		</div>
 
          		<!-- Read Operation -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">
           			Read Operation : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:150px; width:200px; height:25px">
           			<form:input path="readOperation" size="3" /> 
           		</div>          		          	
 
          		<!-- Update Operation -->
                  
           		<div style="position: absolute; top:400px; left:20px; width:200px; height:25px">
           			Update Operation : 
           		</div>
           
            	<div style="position: absolute; top:400px; left:150px; width:200px; height:25px">
           			<form:input path="updateOperation" size="8" /> 
           		</div>
           		
          		<!-- Delete Operation -->
                  
           		<div style="position: absolute; top:430px; left:20px; width:200px; height:25px">
           			Delete Operation : 
           		</div>
           
            	<div style="position: absolute; top:430px; left:150px; width:200px; height:25px">
           			<form:input path="deleteOperation" size="8" /> 
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
