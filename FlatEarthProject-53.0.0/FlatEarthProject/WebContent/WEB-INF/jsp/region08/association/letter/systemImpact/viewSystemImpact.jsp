<!-- HEADER -->

<jsp:include page="/include/pageHeader/pageHeader.jsp" />

<!-- 
  ----------------------------------------------------------------------- 
  Include Core Tag, Function Tag, Format Tag, SQL Tag, XML Tag, Form Tags 
  -----------------------------------------------------------------------
-->
  
<%@ taglib prefix="c" 		uri="http://java.sun.com/jstl/core_rt"			%>
<%@ taglib prefix="fn" 		uri="http://java.sun.com/jsp/jstl/functions" 	%>
<%@ taglib prefix="fmt" 	uri="http://java.sun.com/jsp/jstl/fmt" 			%>
<%@ taglib prefix="sql" 	uri="http://java.sun.com/jsp/jstl/sql" 			%>
<%@ taglib prefix="x" 		uri="http://java.sun.com/jsp/jstl/xml" 			%>
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<html xmlns="http://www.w3.org/1999/xhtml">

<style type="text/css">
.demo {
		background-color: 	aliceblue;
		color: 				maroon;
		font-family: 		arial;
		font-weight: 		bold; 
		font-size:			15px;
		border: 			1px solid silver;
} 

.body {
    height: 				200px;
    background-color: 		#cccccc;
    background-image: 		linear-gradient(red, yellow);
}

</style>

<head>
<title>Letter: System Impact Form</title>

</head>

<body>

	<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Letter: System Impact Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form action="SystemImpactFormServiceImpl">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>SystemImpact List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

				<div style="position: absolute; top:200px; left:5px; width:600px; height:25px">
 					
    					<c:forEach var="systemImpact" items="${list}"> 
   							 
   							<div style="position: absolute; left:20px; width:200px; height:25px">
   							 
    							<span class="demo" >${systemImpact.id}</span>
    						
    						</div>	
    							
    						<div style="position: absolute; left:50px; width:200px; height:25px">
    							
    							<span class="demo" >${systemImpact.effectiveDate}</span>
    							
    						</div>
 
    						<div style="position: absolute; left:140px; width:200px; height:25px">
    							
    							<span class="demo" >${systemImpact.majorVersion}</span>
    							
    						</div>
     							
     						<div style="position: absolute; left:170px; width:200px; height:25px">
     							
    							<span class="demo" >${systemImpact.minorVersion}</span>
    							
    						</div>
    							
    						<div style="position: absolute; left:200px; width:200px; height:25px">	
    							
    							<span class="demo" >${systemImpact.section}</span>
    							
    						</div>
    												
    						<div style="position: absolute; left:230px; width:200px; height:25px">	
    							
    							<span class="demo" >${systemImpact.subsection}</span>
    							
    						</div>
 
    						<div style="position: absolute; left:260px; width:200px; height:25px">	
    							
    							<span class="demo" >${systemImpact.paragraph}</span>
    							
    						</div>
    						
    						<div style="position: absolute; left:290px; width:200px; height:25px">	
    							
    							<span class="demo" >${systemImpact.system}</span>
    							
    						</div>
    						
    						<div style="position: absolute; left:360px; width:200px; height:25px">	
    							
    							<span class="demo" >${systemImpact.testingAvailable}</span>
    							
    						</div>
    						
    						<div style="position: absolute; left:390px; width:200px; height:25px">	
    							
    							<span class="demo" >${systemImpact.testingRequired}</span>
    							
    						</div>
    						 												
    						<div style="position: absolute; left:420px; width:200px; height:25px">	
    							
    							<span class="demo" >${systemImpact.activationRequired}</span>
    							
    						</div>
    							
    						<div style="position: absolute; left:500px; width:200px; height:25px">
    							
    							<span class="demo" ><a href="updateSystemImpactJSPHref/${systemImpact.id}">Edit</a></span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:550px; width:200px; height:25px">
    							
    							<span class="demo" ><a href="deleteSystemImpactJSPHref/${systemImpact.id}">Delete</a></span> 
     							
    						</div>	
    							
    						<br></br>
    							
   						</c:forEach>
    				
    					<div style="position: absolute; top:360px; left:15px; width:700px; height:25px">
    				
    						<a href="systemImpactForm">Add System Impact</a>
    						
    					</div>
 					
				</div>

				<!-- BUTTON PANEL -->	
					
				<div style="position: absolute; top:640px; left:100px; width:600px; height:25px">
					__________________________________________________________
					
				</div> 																

				<div style="position: absolute; top:667px; left:150px; width:500px; height:25px">
					<input type="submit" value="Insert"  name="submitAction"></input>
				</div>
				
				<div style="position: absolute; top:667px; left:250px; width:500px; height:25px">
					<input type="submit" value="Activate"  name="submitAction"></input>
				</div>
				
				<div style="position: absolute; top:667px; left:345px; width:500px; height:25px">
					<input type="submit" value="Update"  name="submitAction"></input>
				</div>
				
				<div style="position: absolute; top:667px; left:453px; width:500px; height:25px">
					<input type="submit" value="Delete"  name="submitAction"></input>
				</div>
							
			</form>

		</div>

		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />
		
	</div>

</body>
</html>