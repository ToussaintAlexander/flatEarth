
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Association: Scheme Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Association: Scheme Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/cardholderEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Company :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:120px; width:200px; height:25px">
           			<form:input path="company" size="15" /> 
           		</div>
 
 				<!-- industry -->
 
           		<div style="position: absolute; top:240px; left:20px; width:200px; height:25px">
           			<b>Industry :</b>  
           		</div>
           
            	<div style="position: absolute; top:240px; left:120px; width:200px; height:25px">
           			<form:input path="industry" size="15"/> 
          		</div>

           		<!-- products -->
           
           		<div style="position: absolute; top:240px; left:330px; width:400px; height:25px">
           			<b>Products :</b>   
           		</div>
           
          		<div style="position: absolute; top:240px; left:475px; width:200px; height:25px">
           			<form:input path="products" size="15" /> 
          		</div>
          
 				<!-- typeHeld -->
 
           		<div style="position: absolute; top:265px; left:20px; width:200px; height:25px">
           			<b>Type Held :</b>  
           		</div>
           
            	<div style="position: absolute; top:265px; left:120px; width:200px; height:25px">
           			<form:input path="typeHeld" size="15"/> 
          		</div>

           		<!-- founded -->
           
           		<div style="position: absolute; top:265px; left:330px; width:400px; height:25px">
           			<b>Founded :</b>   
           		</div>
           
          		<div style="position: absolute; top:265px; left:475px; width:200px; height:25px">
           			<form:input path="founded" size="15" /> 
          		</div>
          
 				<!-- city -->
 
           		<div style="position: absolute; top:315px; left:20px; width:200px; height:25px">
           			<b>City :</b>  
           		</div>
           
            	<div style="position: absolute; top:315px; left:120px; width:200px; height:25px">
           			<form:input path="city" size="15"/> 
          		</div>

           		<!-- state -->
           
           		<div style="position: absolute; top:315px; left:330px; width:400px; height:25px">
           			<b>State :</b>   
           		</div>
           
          		<div style="position: absolute; top:315px; left:475px; width:200px; height:25px">
           			<form:input path="state" size="15" /> 
          		</div>
          
 				<!-- country -->
 
           		<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			<b>Country :</b>  
           		</div>
           
            	<div style="position: absolute; top:340px; left:120px; width:200px; height:25px">
           			<form:input path="country" size="15"/> 
          		</div>

           		<!-- areaServed -->
           
           		<div style="position: absolute; top:340px; left:330px; width:400px; height:25px">
           			<b>Area Served :</b>   
           		</div>
           
          		<div style="position: absolute; top:340px; left:475px; width:200px; height:25px">
           			<form:input path="areaServed" size="15" /> 
          		</div>
          
 				<!-- founder -->
 
           		<div style="position: absolute; top:390px; left:20px; width:200px; height:25px">
           			<b>Founder :</b>  
           		</div>
           
            	<div style="position: absolute; top:390px; left:120px; width:200px; height:25px">
           			<form:input path="founder" size="15"/> 
          		</div>

           		<!-- keyPeople -->
           
           		<div style="position: absolute; top:390px; left:330px; width:400px; height:25px">
           			<b>Key People :</b>   
           		</div>
           
          		<div style="position: absolute; top:390px; left:475px; width:200px; height:25px">
           			<form:input path="keyPeople" size="15" /> 
          		</div>
          
 				<!-- revenue -->
 
           		<div style="position: absolute; top:440px; left:20px; width:200px; height:25px">
           			<b>Revenue :</b>  
           		</div>
           
            	<div style="position: absolute; top:440px; left:120px; width:200px; height:25px">
           			<form:input path="revenue" size="15"/> 
          		</div>

           		<!-- OperatingIncome -->
           
           		<div style="position: absolute; top:440px; left:330px; width:400px; height:25px">
           			<b>Operating Income :</b>   
           		</div>
           
          		<div style="position: absolute; top:440px; left:475px; width:200px; height:25px">
           			<form:input path="operatingIncome" size="15" /> 
          		</div>
          
 				<!-- netIncome -->
 
           		<div style="position: absolute; top:465px; left:20px; width:200px; height:25px">
           			<b>Net Income :</b>  
           		</div>
           
            	<div style="position: absolute; top:465px; left:120px; width:200px; height:25px">
           			<form:input path="netIncome" size="15"/> 
          		</div>

           		<!-- TotalAssets -->
           
           		<div style="position: absolute; top:465px; left:330px; width:400px; height:25px">
           			<b>Total Assets :</b>   
           		</div>
           
          		<div style="position: absolute; top:465px; left:475px; width:200px; height:25px">
           			<form:input path="totalAssets" size="15" /> 
          		</div>
          
 				<!-- totalEmployees -->
 
           		<div style="position: absolute; top:515px; left:20px; width:200px; height:25px">
           			<b>Employees :</b>  
           		</div>
           
            	<div style="position: absolute; top:515px; left:120px; width:200px; height:25px">
           			<form:input path="totalEmployees" size="15"/> 
          		</div>

           		<!-- website -->
           
           		<div style="position: absolute; top:515px; left:330px; width:400px; height:25px">
           			<b>Website :</b>   
           		</div>
           
          		<div style="position: absolute; top:515px; left:475px; width:200px; height:25px">
           			<form:input path="website" size="15" /> 
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
