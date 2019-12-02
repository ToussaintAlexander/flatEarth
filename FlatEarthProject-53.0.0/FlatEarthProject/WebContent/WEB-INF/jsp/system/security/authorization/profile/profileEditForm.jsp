<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  
<%@ taglib prefix="c"       uri="http://java.sun.com/jstl/core_rt"	        %>  

<head>
<title>Edit Authorization: Profile Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Authorization: Profile Form</h1>
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
                  
           		<div style="position: absolute; top:240px; left:230px; width:200px; height:25px">
           			User Id : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:330px; width:200px; height:25px">
           			<form:input path="userId" size="3" /> 
           		</div>
 
  				<!-- Sequence -->
                  
           		<div style="position: absolute; top:240px; left:410px; width:200px; height:25px">
           			Sequence : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:490px; width:200px; height:25px">
           			<form:input path="seq" size="3" /> 
           		</div>

  				<!-- Menu Status -->
                  
           		<div style="position: absolute; top:290px; left:20px; width:200px; height:25px">
           			Menu Status : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:120px; width:200px; height:25px">
           			<form:input path="menuStatus" size="1" /> 
           		</div>

          		<!-- Menu Name -->
                  
           		<div style="position: absolute; top:290px; left:230px; width:200px; height:25px">
           			Menu Name : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:330px; width:200px; height:25px">
           			<form:input path="menuName" size="30" /> 
           		</div>
 
    			<!-- Screen Status -->
                  
           		<div style="position: absolute; top:315px; left:20px; width:200px; height:25px">
           			Screen Status : 
           		</div>
           
            	<div style="position: absolute; top:315px; left:120px; width:200px; height:25px">
           			<form:input path="screenStatus" size="1" /> 
           		</div>
 
          		<!-- Screen Name -->
                  
           		<div style="position: absolute; top:315px; left:230px; width:200px; height:25px">
           			Screen Name : 
           		</div>
           
            	<div style="position: absolute; top:315px; left:330px; width:200px; height:25px">
           			<form:input path="screenName" size="30" /> 
           		</div>

          		<!-- Profile Status -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Profile Status : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:120px; width:200px; height:25px">
           			<form:input path="profileStatus" size="1" /> 
           		</div>          		          	
 
          		<!-- Field Name -->
                  
           		<div style="position: absolute; top:340px; left:230px; width:200px; height:25px">
           			Field Name : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:330px; width:200px; height:25px">
           			<form:input path="fieldName" size="30" /> 
           		</div>
 
          		<!-- View Jsp -->
                  
           		<div style="position: absolute; top:390px; left:20px; width:200px; height:25px">
           			View Jsp : 
           		</div>
           
            	<div style="position: absolute; top:390px; left:120px; width:200px; height:25px">
           			<form:input path="viewJsp" size="30" /> 
           		</div>
           		
          		<!-- Controller Bean -->
                  
           		<div style="position: absolute; top:420px; left:20px; width:200px; height:25px">
           			Controller Bean : 
           		</div>
           
            	<div style="position: absolute; top:420px; left:120px; width:200px; height:25px">
           			<form:input path="controllerBean" size="30" /> 
           		</div>
           		          
          		<!-- Field Visible -->
                  
           		<div style="position: absolute; top:470px; left:20px; width:200px; height:25px">
           			Field Visible : 
           		</div>
           
            	<div style="position: absolute; top:470px; left:120px; width:200px; height:25px">
           			<form:input path="fieldVisible" size="1" /> 
           		</div>
         		
          		<!-- Field Editable -->
                  
           		<div style="position: absolute; top:470px; left:230px; width:200px; height:25px">
           			Field Editable : 
           		</div>
           
            	<div style="position: absolute; top:470px; left:330px; width:200px; height:25px">
           			<form:input path="fieldEditable" size="1" /> 
           		</div>
           		          		
          		<!-- Create Status -->
                  
           		<div style="position: absolute; top:495px; left:20px; width:200px; height:25px">
           			Create Status : 
           		</div>
           
            	<div style="position: absolute; top:495px; left:120px; width:200px; height:25px">
           			<form:input path="createStatus" size="1" /> 
           		</div>
           		          		
          		<!-- Read Status -->
                  
           		<div style="position: absolute; top:495px; left:230px; width:200px; height:25px">
           			Read Status : 
           		</div>
           
            	<div style="position: absolute; top:495px; left:330px; width:200px; height:25px">
           			<form:input path="readStatus" size="1" /> 
           		</div>
           		          		
          		<!-- Update Status -->
                  
           		<div style="position: absolute; top:520px; left:20px; width:200px; height:25px">
           			Update Status : 
           		</div>
           
            	<div style="position: absolute; top:520px; left:120px; width:200px; height:25px">
           			<form:input path="updateStatus" size="1" /> 
           		</div>
           		
          		<!-- Delete Status -->
                  
           		<div style="position: absolute; top:520px; left:230px; width:200px; height:25px">
           			Delete Status : 
           		</div>
           
            	<div style="position: absolute; top:520px; left:330px; width:200px; height:25px">
           			<form:input path="deleteStatus" size="1" /> 
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
