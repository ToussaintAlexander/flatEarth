
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Regression Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Regression Form</h1>
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
         
        		<div style="position: absolute; top:220px; left:25px; width:200px; height:25px">   
          			Unknown Parameter :  
          		</div>
          
          		<div style="position: absolute; top:220px; left:175px; width:200px; height:25px">
           			<form:input path="unknownParameter" size="8" /> 
           		</div>
 
 				<!-- Independent Variable -->
 
           		<div style="position: absolute; top:250px; left:25px; width:200px; height:25px">
           			Independent Variable :  
           		</div>
           
            	<div style="position: absolute; top:250px; left:175px; width:200px; height:25px">
           			<form:input path="independentVariable" size="8"/> 
          		</div>
           
           		<!-- Dependent Variable -->
           
           		<div style="position: absolute; top:280px; left:25px; width:200px; height:25px"> 
          			Dependent Variable :   
           		</div>
           
           		<div style="position: absolute; top:280px; left:175px; width:200px; height:25px">
           			<form:input path="dependentVariable" size="8" /> 
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
