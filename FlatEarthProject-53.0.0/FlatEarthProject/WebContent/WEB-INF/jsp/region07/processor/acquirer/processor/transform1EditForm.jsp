
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Acquirer Processor Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Acquirer Processor Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/acquirerEditFormJSPPostAction">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Edit Acquirer Processor List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
        
         		<!-- Name -->
         
        		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">   
          			Acquirer Name :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:140px; width:200px; height:25px">
           			<form:input path="name" size="30" /> 
           		</div>
 
         		<!-- Street -->
         
        		<div style="position: absolute; top:230px; left:25px; width:200px; height:25px">   
          			Street Address :  
          		</div>
          
          		<div style="position: absolute; top:230px; left:140px; width:200px; height:25px">
           			<form:input path="street" size="30" /> 
           		</div>
        
         		<!-- City -->
         
        		<div style="position: absolute; top:260px; left:25px; width:200px; height:25px">   
          			City :  
          		</div>
          
          		<div style="position: absolute; top:260px; left:140px; width:200px; height:25px">
           			<form:input path="city" size="30" /> 
           		</div>
 
         		<!-- State -->
         
        		<div style="position: absolute; top:290px; left:25px; width:200px; height:25px">   
          			State :  
          		</div>
          
          		<div style="position: absolute; top:290px; left:140px; width:200px; height:25px">
           			<form:input path="state" size="2" /> 
           		</div>
 
				<!-- Country -->

           		<div style="position: absolute; top:320px; left:20px; width:200px; height:25px">
           			Country :   
           		</div>
           
          		<div style="position: absolute; top:320px; left:140px; width:200px; height:25px">
           			<form:input path="country" size="3" /> 
          		</div>
 
 				<!-- Zip Code -->
                  
           		<div style="position: absolute; top:350px; left:20px; width:200px; height:25px">
           			Zip Code : 
           		</div>
           
            	<div style="position: absolute; top:350px; left:140px; width:200px; height:25px">
           			<form:input path="zipCode" size="9" /> 
           		</div>
                
                <!-- Phone Number -->
                  
            	<div style="position: absolute; top:380px; left:20px; width:200px; height:25px">
           			Phone Number :  
           		</div>
           
           		<div style="position: absolute; top:380px; left:140px; width:200px; height:25px"> 
           			<form:input path="phoneNumber" size="10" /> 
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
