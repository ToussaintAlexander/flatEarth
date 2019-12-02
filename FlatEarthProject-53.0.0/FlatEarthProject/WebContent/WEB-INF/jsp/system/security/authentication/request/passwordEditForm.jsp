<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  
<%@ taglib prefix="c"       uri="http://java.sun.com/jstl/core_rt"	        %>  

<head>
<title>Edit Security: Password Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Security: Password Form</h1>
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
          
          		<div style="position: absolute; top:190px; left:145px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
 				<!-- Group Id -->
 
           		<div style="position: absolute; top:240px; left:20px; width:200px; height:25px">
           			Group Id :  
           		</div>
           
            	<div style="position: absolute; top:240px; left:145px; width:200px; height:25px">
           			<form:input path="groupId" size="3"/> 
          		</div>

          		<!-- User Id -->
                  
           		<div style="position: absolute; top:240px; left:240px; width:200px; height:25px">
           			User Id : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:310px; width:200px; height:25px">
           			<form:input path="userId" size="3" /> 
           		</div>
 
  				<!-- Sequence -->
                  
           		<div style="position: absolute; top:240px; left:380px; width:200px; height:25px">
           			Sequence : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:450px; width:200px; height:25px">
           			<form:input path="seq" size="3" /> 
           		</div>

          		<!-- Username -->
                  
           		<div style="position: absolute; top:290px; left:20px; width:200px; height:25px">
           			Username : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:145px; width:200px; height:25px">
           			<form:input path="username" size="8" /> 
           		</div>
 
          		<!-- Password -->
                  
           		<div style="position: absolute; top:290px; left:310px; width:200px; height:25px">
           			Password : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:450px; width:200px; height:25px">
           			<form:input path="password" size="8" /> 
           		</div>

          		<!-- Domain -->
                  
           		<div style="position: absolute; top:315px; left:20px; width:200px; height:25px">
           			Domain : 
           		</div>
           
            	<div style="position: absolute; top:315px; left:145px; width:200px; height:25px">
           			<form:input path="domain" size="20" /> 
           		</div>
 
          		<!-- Password Attempts -->
                  
           		<div style="position: absolute; top:315px; left:310px; width:200px; height:25px">
           			Password Attempts : 
           		</div>
           
            	<div style="position: absolute; top:315px; left:450px; width:200px; height:25px">
           			<form:input path="passwordAttempts" size="3" /> 
           		</div>          		          	
 
          		<!-- Computer Name -->
                  
           		<div style="position: absolute; top:365px; left:20px; width:200px; height:25px">
           			Computer Name : 
           		</div>
           
            	<div style="position: absolute; top:365px; left:145px; width:200px; height:25px">
           			<form:input path="computerName" size="8" /> 
           		</div>
           		
          		<!-- Remember Me -->
                  
           		<div style="position: absolute; top:365px; left:310px; width:200px; height:25px">
           			Remember Me : 
           		</div>
           
            	<div style="position: absolute; top:365px; left:450px; width:200px; height:25px">
           			<form:input path="rememberMe" size="5" /> 
           		</div>
           		
          		<!-- Password Type -->
                  
           		<div style="position: absolute; top:390px; left:20px; width:200px; height:25px">
           			Password Type : 
           		</div>
           
            	<div style="position: absolute; top:390px; left:145px; width:200px; height:25px">
           			<form:input path="passwordType" size="10" /> 
           		</div>
  		
          		<!-- Account Status -->
                  
           		<div style="position: absolute; top:390px; left:310px; width:200px; height:25px">
           			Account Status : 
           		</div>
           
            	<div style="position: absolute; top:390px; left:450px; width:200px; height:25px">
           			<form:input path="accountStatus" size="10" /> 
           		</div>
           		
          		<!-- First Name -->
                  
           		<div style="position: absolute; top:440px; left:20px; width:200px; height:25px">
           			First Name : 
           		</div>
           
            	<div style="position: absolute; top:440px; left:145px; width:200px; height:25px">
           			<form:input path="firstName" size="10" /> 
           		</div>
           		
          		<!-- Last Name -->
                  
           		<div style="position: absolute; top:440px; left:310px; width:200px; height:25px">
           			Last Name : 
           		</div>
           
            	<div style="position: absolute; top:440px; left:450px; width:200px; height:25px">
           			<form:input path="lastName" size="15" /> 
           		</div>
          
          		<!-- Last Access -->
                  
           		<div style="position: absolute; top:465px; left:20px; width:200px; height:25px">
           			Last Access : 
           		</div>
           
            	<div style="position: absolute; top:465px; left:145px; width:200px; height:25px">
           			<form:input path="lastAccess" size="10" /> 
           		</div>
           		
          		<!-- Password Change -->
                  
           		<div style="position: absolute; top:465px; left:310px; width:200px; height:25px">
           			Password Change : 
           		</div>
           
            	<div style="position: absolute; top:465px; left:450px; width:200px; height:25px">
           			<form:input path="passwordChange" size="10" /> 
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
