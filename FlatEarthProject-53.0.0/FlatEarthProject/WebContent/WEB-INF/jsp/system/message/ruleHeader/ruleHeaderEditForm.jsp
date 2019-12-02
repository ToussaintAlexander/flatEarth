
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Message: Header Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Message: Header Form</h1>
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
 
 				<!-- Field -->
 
           		<div style="position: absolute; top:230px; left:20px; width:200px; height:25px">
           			Field :  
           		</div>
           
            	<div style="position: absolute; top:230px; left:140px; width:200px; height:25px">
           			<form:input path="field" size="3" /> 
          		</div>

          		<!-- SubField -->
                  
           		<div style="position: absolute; top:255px; left:20px; width:200px; height:25px">
           			SubField : 
           		</div>
           
            	<div style="position: absolute; top:255px; left:140px; width:200px; height:25px">
           			<form:input path="subField" size="2" /> 
           		</div>
 
  				<!-- Fire -->
                  
           		<div style="position: absolute; top:285px; left:20px; width:200px; height:25px">
           			Fire : 
           		</div>
           
            	<div style="position: absolute; top:285px; left:140px; width:200px; height:25px">
           			<form:input path="fire" size="1" /> 
           		</div>
 
  				<!-- Format -->
                  
           		<div style="position: absolute; top:315px; left:20px; width:200px; height:25px">
           			Format : 
           		</div>
           
            	<div style="position: absolute; top:315px; left:140px; width:200px; height:25px">
           			<form:input path="format" size="2" /> 
           		</div>

          		<!-- Minimum Length -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Minimum Length : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:140px; width:200px; height:25px">
           			<form:input path="minimumLength" size="3" /> 
           		</div>
 
          		<!-- MaximumLength -->
                  
           		<div style="position: absolute; top:365px; left:20px; width:200px; height:25px">
           			Maximum Length : 
           		</div>
           
            	<div style="position: absolute; top:365px; left:140px; width:200px; height:25px">
           			<form:input path="minimumLength" size="3" /> 
           		</div>
 
          		<!-- Encoding -->
                  
           		<div style="position: absolute; top:390px; left:20px; width:200px; height:25px">
           			Encoding : 
           		</div>
           
            	<div style="position: absolute; top:390px; left:140px; width:200px; height:25px">
           			<form:input path="encoding" size="2" /> 
           		</div>

          		<!-- Data Type -->
                  
           		<div style="position: absolute; top:420px; left:20px; width:200px; height:25px">
           			Data Type : 
           		</div>
           
            	<div style="position: absolute; top:420px; left:140px; width:200px; height:25px">
           			<form:input path="dataType" size="2" /> 
           		</div>
           		
          		<!-- Source -->
                  
           		<div style="position: absolute; top:445px; left:20px; width:200px; height:25px">
           			Source : 
           		</div>
           
            	<div style="position: absolute; top:445px; left:140px; width:200px; height:25px">
           			<form:input path="source" size="2" /> 
           		</div>
           		
          		<!-- Direction -->
                  
           		<div style="position: absolute; top:470px; left:20px; width:200px; height:25px">
           			Direction : 
           		</div>
           
            	<div style="position: absolute; top:470px; left:140px; width:200px; height:25px">
           			<form:input path="direction" size="2" /> 
           		</div>
           		
          		<!-- Existence -->
                  
           		<div style="position: absolute; top:495px; left:20px; width:200px; height:25px">
           			Existence : 
           		</div>
           
            	<div style="position: absolute; top:495px; left:140px; width:200px; height:25px">
           			<form:input path="existence" size="2" /> 
           		</div>
           		
          		<!-- Change -->
                  
           		<div style="position: absolute; top:520px; left:20px; width:200px; height:25px">
           			Change : 
           		</div>
           
            	<div style="position: absolute; top:520px; left:140px; width:200px; height:25px">
           			<form:input path="change" size="2" /> 
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
