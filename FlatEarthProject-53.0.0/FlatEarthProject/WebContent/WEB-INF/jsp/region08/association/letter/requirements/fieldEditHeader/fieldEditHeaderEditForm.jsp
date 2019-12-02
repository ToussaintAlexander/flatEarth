
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Usage: Field Edit Header Edit Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Usage: Field Edit Header Edit Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/acquirerEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
          		
         		<!-- Field -->
         
        		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">   
          			Field :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:140px; width:200px; height:25px">
           			<form:input path="field" size="3" /> 
           		</div>
 
         		<!-- SubField -->
         
        		<div style="position: absolute; top:230px; left:25px; width:200px; height:25px">   
          			SubField :  
          		</div>
          
          		<div style="position: absolute; top:230px; left:140px; width:200px; height:25px">
           			<form:input path="subfield" size="2" /> 
           		</div>
        
         		<!-- Format -->
         
        		<div style="position: absolute; top:260px; left:25px; width:200px; height:25px">   
          			Format :  
          		</div>
          
          		<div style="position: absolute; top:260px; left:140px; width:200px; height:25px">
           			<form:input path="format" size="2" /> 
           		</div>
 
         		<!-- Minimum Length -->
         
        		<div style="position: absolute; top:290px; left:25px; width:200px; height:25px">   
          			Minimum Length :  
          		</div>
          
          		<div style="position: absolute; top:290px; left:140px; width:200px; height:25px">
           			<form:input path="minimumLength" size="3" /> 
           		</div>
 
         		<!-- Maximum Length -->
         
        		<div style="position: absolute; top:320px; left:25px; width:200px; height:25px">   
          			Maximum Length :  
          		</div>
          
          		<div style="position: absolute; top:320px; left:140px; width:200px; height:25px">
           			<form:input path="maximumLength" size="3" /> 
           		</div>
 
				<!-- Encoding -->

           		<div style="position: absolute; top:350px; left:25px; width:200px; height:25px">
           			Encoding :   
           		</div>
           
          		<div style="position: absolute; top:350px; left:140px; width:200px; height:25px">
           			<form:input path="encoding" size="2" /> 
          		</div>
 
 				<!-- DataType -->
                  
           		<div style="position: absolute; top:380px; left:25px; width:200px; height:25px">
           			Data Type : 
           		</div>
           
            	<div style="position: absolute; top:380px; left:140px; width:200px; height:25px">
           			<form:input path="datatype" size="2" /> 
           		</div>
                
                <!-- Source -->
                  
            	<div style="position: absolute; top:410px; left:25px; width:200px; height:25px">
           			Source :  
           		</div>
           
           		<div style="position: absolute; top:410px; left:140px; width:200px; height:25px"> 
           			<form:input path="source" size="2" /> 
          		</div>
                
                <!-- Direction -->
                  
            	<div style="position: absolute; top:440px; left:25px; width:200px; height:25px">
           			Direction :  
           		</div>
           
           		<div style="position: absolute; top:440px; left:140px; width:200px; height:25px"> 
           			<form:input path="direction" size="2" /> 
          		</div>

                <!-- Existence -->
                  
            	<div style="position: absolute; top:470px; left:25px; width:200px; height:25px">
           			Existence :  
           		</div>
           
           		<div style="position: absolute; top:470px; left:140px; width:200px; height:25px"> 
           			<form:input path="existence" size="2" /> 
          		</div>
          		
                <!-- Change -->
                  
            	<div style="position: absolute; top:500px; left:25px; width:200px; height:25px">
           			Change :  
           		</div>
           
           		<div style="position: absolute; top:500px; left:140px; width:200px; height:25px"> 
           			<form:input path="change" size="2" /> 
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
