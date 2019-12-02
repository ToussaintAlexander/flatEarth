
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Configuration: Batch Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Configuration: Batch Form</h1>
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
          
          		<div style="position: absolute; top:190px; left:180px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
 				<!-- Batch Key -->
 
           		<div style="position: absolute; top:220px; left:20px; width:200px; height:25px">
           			Batch Key :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:180px; width:200px; height:25px">
           			<form:input path="batchKey" size="30"/> 
          		</div>

          		<!-- Context File -->
                  
           		<div style="position: absolute; top:250px; left:20px; width:200px; height:25px">
           			Context File : 
           		</div>
           
            	<div style="position: absolute; top:250px; left:180px; width:200px; height:25px">
           			<form:input path="contextFile" size="30" /> 
           		</div>
 
  				<!-- Database Configuration -->
                  
           		<div style="position: absolute; top:280px; left:20px; width:200px; height:25px">
           			Database Configuration : 
           		</div>
           
            	<div style="position: absolute; top:280px; left:180px; width:200px; height:25px">
           			<form:input path="databaseConfiguration" size="30" /> 
           		</div>

          		<!-- Job Report -->
                  
           		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">
           			Job Report : 
           		</div>
           
            	<div style="position: absolute; top:310px; left:180px; width:200px; height:25px">
           			<form:input path="jobReport" size="30" /> 
           		</div>
 
          		<!-- Job Launcher -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Job Launcher : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:180px; width:200px; height:25px">
           			<form:input path="jobLauncher" size="1" /> 
           		</div>
       		         
          		<!-- Report Job -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">
           			Report Job : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:180px; width:200px; height:25px">
           			<form:input path="reportJob" size="30" /> 
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
