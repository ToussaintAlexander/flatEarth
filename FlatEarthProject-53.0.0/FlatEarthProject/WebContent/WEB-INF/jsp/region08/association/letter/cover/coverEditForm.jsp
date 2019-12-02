
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Letter: Cover Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Letter: Cover Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/editsave">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
        
         		<!-- title -->
         
        		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">   
          			Title :  
          		</div>
          
          		<div style="position: absolute; top:200px; left:120px; width:200px; height:25px">
           			<form:input path="title" size="30" /> 
           		</div>
 
         		<!-- subtitle -->
         
        		<div style="position: absolute; top:230px; left:25px; width:200px; height:25px">   
          			Subtitle :  
          		</div>
          
          		<div style="position: absolute; top:230px; left:120px; width:200px; height:25px">
           			<form:input path="subtitle" size="30" /> 
           		</div>
        
         		<!-- effectiveDate -->
         
        		<div style="position: absolute; top:260px; left:25px; width:200px; height:25px">   
          			Effective Date :  
          		</div>
          
          		<div style="position: absolute; top:260px; left:120px; width:200px; height:25px">
           			<form:input path="effectiveDate" size="8" /> 
           		</div>
 
         		<!-- majorVersion -->
         
        		<div style="position: absolute; top:290px; left:25px; width:200px; height:25px">   
          			Major Version :  
          		</div>
          
          		<div style="position: absolute; top:290px; left:120px; width:200px; height:25px">
           			<form:input path="majorVersion" size="5" /> 
           		</div>
 
				<!-- minorVersion -->

           		<div style="position: absolute; top:320px; left:25px; width:200px; height:25px">
           			Minor Version :   
           		</div>
           
          		<div style="position: absolute; top:320px; left:120px; width:200px; height:25px">
           			<form:input path="minorVersion" size="5" /> 
          		</div>
<!-- 
 				<div style="position: absolute; top:370px; left:25px; width:200px; height:25px">
 					<input type="submit" value="Edit Save" />
 				</div>
--> 
				<!-- INCLUDE FOOTPRINT -->

				<jsp:include page="/include/pageFooter/footprint.jsp" />

				<!-- INCLUDE BUTTON PANEL -->

				
				<div style="position: absolute; top:640px; left:20px; width:600px; height:25px">
					________________________________________________________________________
				</div> 																


				<div style="position: absolute; top:670px; left:20px; width:500px; height:25px">
					<input type="submit" value="Prv Rec"  name="submitAction"></input>
				</div>

				<div style="position: absolute; top:670px; left:130px; width:500px; height:25px">
					<input type="submit" value="Insert"  name="submitAction"></input>
				</div>
				
				<div style="position: absolute; top:670px; left:220px; width:500px; height:25px">
					<input type="submit" value="Select"  name="submitAction"></input>
				</div>
				
				<div style="position: absolute; top:670px; left:325px; width:500px; height:25px">
					<input type="submit" value="Update"  name="submitAction"></input>
				</div>
				
				<div style="position: absolute; top:670px; left:433px; width:500px; height:25px">
					<input type="submit" value="Delete"  name="submitAction"></input>
				</div>

				<div style="position: absolute; top:670px; left:530px; width:500px; height:25px">
					<input type="submit" value="Nxt Rec"  name="submitAction"></input>
				</div>
				
      		</form:form> 

		</div>
 
		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />
		
		</div>
		
</body>

</html>
