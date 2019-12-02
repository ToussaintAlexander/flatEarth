
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Configuration: Address Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Configuration: Address Form</h1>
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
         
         		<!-- identifier -->
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Identifier :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:120px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
 				<!-- street -->
 
           		<div style="position: absolute; top:220px; left:20px; width:200px; height:25px">
           			Street :  
           		</div>
           
            	<div style="position: absolute; top:220px; left:120px; width:200px; height:25px">
           			<form:input path="street" size="30"/> 
          		</div>

          		<!-- City -->
                  
           		<div style="position: absolute; top:250px; left:20px; width:200px; height:25px">
           			City : 
           		</div>
           
            	<div style="position: absolute; top:250px; left:120px; width:200px; height:25px">
           			<form:input path="city" size="30" /> 
           		</div>
 
  				<!-- State -->
                  
           		<div style="position: absolute; top:280px; left:20px; width:200px; height:25px">
           			State : 
           		</div>
           
            	<div style="position: absolute; top:280px; left:120px; width:200px; height:25px">
           			<form:input path="state" size="2" /> 
           		</div>

          		<!-- Country -->
                  
           		<div style="position: absolute; top:310px; left:20px; width:200px; height:25px">
           			Country : 
           		</div>
           
            	<div style="position: absolute; top:310px; left:120px; width:200px; height:25px">
           			<form:input path="country" size="3" /> 
           		</div>
 
          		<!-- Zip Code -->
                  
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Zip Code : 
           		</div>
           
            	<div style="position: absolute; top:340px; left:120px; width:200px; height:25px">
           			<form:input path="zipCode" size="9" /> 
           		</div>
       		         
          		<!-- Phone Number -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">
           			Phone Number : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:120px; width:200px; height:25px">
           			<form:input path="phoneNumber" size="10" /> 
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