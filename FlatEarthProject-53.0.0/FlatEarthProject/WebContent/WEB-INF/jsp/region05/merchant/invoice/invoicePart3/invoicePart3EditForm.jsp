
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Retailer: Edit Invoice Page 3 Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Retailer: Edit Invoice Page 3 Form</h1>
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

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Code :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:120px; width:200px; height:25px">
           			<form:input path="code" size="4" /> 
           		</div>
 
           		<div style="position: absolute; top:190px; left:200px; width:330px; height:25px">
           			<b>Category :</b>  
           		</div>
           
            	<div style="position: absolute; top:190px; left:300px; width:200px; height:25px">
           			<form:input path="category" size="4"/> 
          		</div>

           		<!-- Sequence -->
           
           		<div style="position: absolute; top:190px; left:400px; width:400px; height:25px">
           			<b>Sequence</b> :   
           		</div>
           
          		<div style="position: absolute; top:190px; left:480px; width:200px; height:25px">
           			<form:input path="seq" size="2" /> 
          		</div>
          
          		<!-- Product Name -->
                  
           		<div style="position: absolute; top:240px; left:20px; width:400px; height:25px">
           			Product Name : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:120px; width:500px; height:25px">
           			<form:input path="productName" size="30" /> 
           		</div>

          		<!-- Description -->
                  
           		<div style="position: absolute; top:270px; left:20px; width:400px; height:25px">
           			Description : 
           		</div>
           
            	<div style="position: absolute; top:270px; left:120px; width:500px; height:25px">
           			<form:input path="description" size="30" /> 
           		</div>
                   
          		<!-- Gender -->
                  
           		<div style="position: absolute; top:320px; left:20px; width:400px; height:25px">
           			Gender : 
           		</div>
           
            	<div style="position: absolute; top:320px; left:120px; width:500px; height:25px">
           			<form:input path="season" size="7" /> 
           		</div>
                   
          		<!-- Season -->
                  
           		<div style="position: absolute; top:320px; left:200px; width:400px; height:25px">
           			Season : 
           		</div>
           
            	<div style="position: absolute; top:320px; left:300px; width:500px; height:25px">
           			<form:input path="season" size="6" /> 
           		</div>
                   
          		<!-- Frequency -->
                  
           		<div style="position: absolute; top:320px; left:400px; width:400px; height:25px">
           			Frequency : 
           		</div>
           
            	<div style="position: absolute; top:320px; left:480px; width:500px; height:25px">
           			<form:input path="frequency" size="1" /> 
           		</div>
                   
          		<!-- Supplier -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:400px; height:25px">
           			Supplier : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:120px; width:500px; height:25px">
           			<form:input path="supplier" size="4" /> 
           		</div>
          
          		<!-- Unit Size -->
                  
           		<div style="position: absolute; top:420px; left:20px; width:400px; height:25px">
           			Unit Size : 
           		</div>
           
            	<div style="position: absolute; top:420px; left:120px; width:500px; height:25px">
           			<form:input path="unitSize" size="4" /> 
           		</div>
                   
          		<!-- Unit Price -->
                  
           		<div style="position: absolute; top:420px; left:200px; width:400px; height:25px">
           			Unit Price : 
           		</div>
           
            	<div style="position: absolute; top:420px; left:300px; width:500px; height:25px">
           			<form:input path="unitPrice" size="6" /> 
           		</div>
                   
          		<!-- Discount -->
                  
           		<div style="position: absolute; top:450px; left:20px; width:400px; height:25px">
           			Discount : 
           		</div>
           
            	<div style="position: absolute; top:450px; left:120px; width:500px; height:25px">
           			<form:input path="discount" size="4" /> 
           		</div>
                   
          		<!-- Unit Weight -->
                  
           		<div style="position: absolute; top:450px; left:200px; width:400px; height:25px">
           			Unit Weight : 
           		</div>
           
            	<div style="position: absolute; top:450px; left:300px; width:500px; height:25px">
           			<form:input path="unitWeight" size="2" /> 
           		</div>
                   
          		<!-- Picture -->
                  
           		<div style="position: absolute; top:500px; left:20px; width:400px; height:25px">
           			Picture : 
           		</div>
           
            	<div style="position: absolute; top:500px; left:120px; width:500px; height:25px">
           			<form:input path="picture" size="4" /> 
           		</div>
                   
          		<!-- Notes -->
                  
           		<div style="position: absolute; top:530px; left:20px; width:400px; height:25px">
           			Notes : 
           		</div>
           
            	<div style="position: absolute; top:530px; left:120px; width:500px; height:25px">
           			<form:input path="notes" size="30" /> 
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
