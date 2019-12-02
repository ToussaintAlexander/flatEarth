
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Configuration: Db Properties Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Configuration: Db Properties Form</h1>
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
          
          		<div style="position: absolute; top:190px; left:140px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
 				<!-- Driver Name -->
 
           		<div style="position: absolute; top:220px; left:20px; width:200px; height:25px">
           			Driver Name :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:140px; width:200px; height:25px">
           			<form:input path="driverName" size="30"/> 
          		</div>

          		<!-- Server Name -->
                  
           		<div style="position: absolute; top:250px; left:20px; width:200px; height:25px">
           			Server Name : 
           		</div>
           
            	<div style="position: absolute; top:250px; left:140px; width:200px; height:25px">
           			<form:input path="serverName" size="30" /> 
           		</div>
 
  				<!-- Port Number -->
                  
           		<div style="position: absolute; top:280px; left:20px; width:200px; height:25px">
           			Port Number : 
           		</div>
           
            	<div style="position: absolute; top:280px; left:140px; width:200px; height:25px">
           			<form:input path="portNumber" size="15" /> 
           		</div>

          		<!-- System Identifier -->
                  
           		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">
           			System Identifier : 
           		</div>
           
            	<div style="position: absolute; top:310px; left:140px; width:200px; height:25px">
           			<form:input path="systemIdentifier" size="30" /> 
           		</div>
 
          		<!-- User Name -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			User Name : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:140px; width:200px; height:25px">
           			<form:input path="userName" size="8" /> 
           		</div>
       		         
          		<!-- Password -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">
           			Password : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:140px; width:200px; height:25px">
           			<form:input path="password" size="8" /> 
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
