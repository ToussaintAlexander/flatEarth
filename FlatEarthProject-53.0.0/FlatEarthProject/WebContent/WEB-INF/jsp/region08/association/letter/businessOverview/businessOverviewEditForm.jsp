
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Association: Letter: Business Overview Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Letter: Business Overview Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/acquirerEditFormJSPPostAction">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Edit Association: Letter: Business Overview List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         		<!-- effectiveDate -->
         
        		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">   
          			Effective Date :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:140px; width:200px; height:25px">
           			<form:input path="effectiveDate" size="10" /> 
           		</div>
 
         		<!-- majorVersion -->
         
        		<div style="position: absolute; top:230px; left:25px; width:200px; height:25px">   
          			Major Version :  
          		</div>
          
          		<div style="position: absolute; top:230px; left:140px; width:200px; height:25px">
           			<form:input path="majorVersion" size="2" /> 
           		</div>
        
         		<!-- minorVersion -->
         
        		<div style="position: absolute; top:260px; left:25px; width:200px; height:25px">   
          			Minor Version :  
          		</div>
          
          		<div style="position: absolute; top:260px; left:140px; width:200px; height:25px">
           			<form:input path="minorVersion" size="2" /> 
           		</div>
 
         		<!-- section -->
         
        		<div style="position: absolute; top:290px; left:25px; width:200px; height:25px">   
          			Section :  
          		</div>
          
          		<div style="position: absolute; top:290px; left:140px; width:200px; height:25px">
           			<form:input path="Section" size="2" /> 
           		</div>
 
				<!-- subsection -->

           		<div style="position: absolute; top:320px; left:25px; width:200px; height:25px">
           			Subsection :   
           		</div>
           
          		<div style="position: absolute; top:320px; left:140px; width:200px; height:25px">
           			<form:input path="subsection" size="2" /> 
          		</div>
 
 				<!-- paragraph -->
                  
           		<div style="position: absolute; top:350px; left:25px; width:200px; height:25px">
           			Paragraph : 
           		</div>
           
            	<div style="position: absolute; top:350px; left:140px; width:200px; height:25px">
           			<form:input path="paragraph" size="2" /> 
           		</div>
                
                <!-- title -->
                  
            	<div style="position: absolute; top:380px; left:25px; width:200px; height:25px">
           			Title :  
           		</div>
           
           		<div style="position: absolute; top:380px; left:140px; width:200px; height:25px"> 
           			<form:input path="title" size="50" /> 
          		</div>
                
                <!-- sentence -->
                  
            	<div style="position: absolute; top:410px; left:25px; width:200px; height:25px">
           			Sentence :  
           		</div>
           
           		<div style="position: absolute; top:410px; left:140px; width:200px; height:25px"> 
           			<form:input path="sentence" size="50" /> 
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
