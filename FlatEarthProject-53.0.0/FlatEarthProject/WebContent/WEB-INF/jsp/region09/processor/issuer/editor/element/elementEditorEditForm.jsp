
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Message: Element Editor Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Message: Element Editor Form</h1>
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
 
 				<!-- Field -->
 
           		<div style="position: absolute; top:220px; left:20px; width:200px; height:25px">
           			Field :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:120px; width:200px; height:25px">
           			<form:input path="field" size="3" /> 
          		</div>

          		<!-- SubField -->
                  
           		<div style="position: absolute; top:250px; left:20px; width:200px; height:25px">
           			SubField : 
           		</div>
           
            	<div style="position: absolute; top:250px; left:120px; width:200px; height:25px">
           			<form:input path="subField" size="2" /> 
           		</div>
 
  				<!-- Format -->
                  
           		<div style="position: absolute; top:280px; left:20px; width:200px; height:25px">
           			Format : 
           		</div>
           
            	<div style="position: absolute; top:280px; left:120px; width:200px; height:25px">
           			<form:input path="format" size="2" /> 
           		</div>

          		<!-- Length -->
                  
           		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">
           			Length : 
           		</div>
           
            	<div style="position: absolute; top:310px; left:120px; width:200px; height:25px">
           			<form:input path="length" size="3" /> 
           		</div>
 
          		<!-- Encoding -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Encoding : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:120px; width:200px; height:25px">
           			<form:input path="encoding" size="2" /> 
           		</div>

          		<!-- Data Type -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">
           			Data Type : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:120px; width:200px; height:25px">
           			<form:input path="dataType" size="2" /> 
           		</div>
           		
          		<!-- Source -->
                  
           		<div style="position: absolute; top:400px; left:20px; width:200px; height:25px">
           			Source : 
           		</div>
           
            	<div style="position: absolute; top:400px; left:120px; width:200px; height:25px">
           			<form:input path="source" size="2" /> 
           		</div>
           		
          		<!-- Direction -->
                  
           		<div style="position: absolute; top:430px; left:20px; width:200px; height:25px">
           			Direction : 
           		</div>
           
            	<div style="position: absolute; top:430px; left:120px; width:200px; height:25px">
           			<form:input path="direction" size="2" /> 
           		</div>
           		
          		<!-- Existence -->
                  
           		<div style="position: absolute; top:460px; left:20px; width:200px; height:25px">
           			Existence : 
           		</div>
           
            	<div style="position: absolute; top:460px; left:120px; width:200px; height:25px">
           			<form:input path="existence" size="2" /> 
           		</div>
           		
          		<!-- Change -->
                  
           		<div style="position: absolute; top:490px; left:20px; width:200px; height:25px">
           			Change : 
           		</div>
           
            	<div style="position: absolute; top:490px; left:120px; width:200px; height:25px">
           			<form:input path="change" size="2" /> 
           		</div>
           		
          		<!-- Field Value -->
                  
           		<div style="position: absolute; top:520px; left:20px; width:200px; height:25px">
           			Field Value : 
           		</div>
           
            	<div style="position: absolute; top:520px; left:120px; width:200px; height:25px">
           			<form:input path="fieldValue" size="35" /> 
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
