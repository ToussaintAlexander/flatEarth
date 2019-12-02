
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Configuration: Properties Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Configuration: Properties Form</h1>
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
          
          		<div style="position: absolute; top:190px; left:160px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
 				<!-- Properties File -->
 
           		<div style="position: absolute; top:220px; left:20px; width:200px; height:25px">
           			Properties File :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:160px; width:200px; height:25px">
           			<form:input path="propertiesFile" size="30"/> 
          		</div>

          		<!-- Default Properties -->
                  
           		<div style="position: absolute; top:250px; left:20px; width:200px; height:25px">
           			Default Properties : 
           		</div>
           
            	<div style="position: absolute; top:250px; left:160px; width:200px; height:25px">
           			<form:input path="defaultProperties" size="30" /> 
           		</div>
 
  				<!-- Properties Location -->
                  
           		<div style="position: absolute; top:280px; left:20px; width:200px; height:25px">
           			Properties Location : 
           		</div>
           
            	<div style="position: absolute; top:280px; left:160px; width:200px; height:25px">
           			<form:input path="propertiesLocation" size="30" /> 
           		</div>

          		<!-- Input File Name -->
                  
           		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">
           			Input File Name : 
           		</div>
           
            	<div style="position: absolute; top:310px; left:160px; width:200px; height:25px">
           			<form:input path="inputFileName" size="30" /> 
           		</div>
 
          		<!-- Output File Name -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Output File Name : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:160px; width:200px; height:25px">
           			<form:input path="outputFileName" size="30" /> 
           		</div>
       		         
          		<!-- XML Format Switch -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">
           			XML Format Switch : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:160px; width:200px; height:25px">
           			<form:input path="xmlFormatSwitch" size="1" /> 
           		</div>
     		         
          		<!-- Encoding Format -->
                  
           		<div style="position: absolute; top:400px; left:20px; width:200px; height:25px">
           			Encoding Format : 
           		</div>
           
            	<div style="position: absolute; top:400px; left:160px; width:200px; height:25px">
           			<form:input path="encodingFormat" size="6" /> 
           		</div>
           		     		         
          		<!-- Path Name -->
                  
           		<div style="position: absolute; top:430px; left:20px; width:200px; height:25px">
           			Path Name : 
           		</div>
           
            	<div style="position: absolute; top:430px; left:160px; width:200px; height:25px">
           			<form:input path="pathName" size="30" /> 
           		</div>
           		
          		<!-- File Name -->
                  
           		<div style="position: absolute; top:460px; left:20px; width:200px; height:25px">
           			File Name : 
           		</div>
           
            	<div style="position: absolute; top:460px; left:160px; width:200px; height:25px">
           			<form:input path="fileName" size="30" /> 
           		</div>
           		     		         
          		<!-- File Input Stream -->
                  
           		<div style="position: absolute; top:490px; left:20px; width:200px; height:25px">
           			File Input Stream : 
           		</div>
           
            	<div style="position: absolute; top:490px; left:160px; width:200px; height:25px">
           			<form:input path="fileInputStream" size="30" /> 
           		</div>
         		     		         
          		<!-- File Output Stream -->
                  
           		<div style="position: absolute; top:520px; left:20px; width:200px; height:25px">
           			File Output Stream : 
           		</div>
           
            	<div style="position: absolute; top:520px; left:160px; width:200px; height:25px">
           			<form:input path="fileOutputStream" size="30" /> 
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
