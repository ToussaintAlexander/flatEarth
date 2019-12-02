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
<title>Letter: Cover Form</title>

</head>

<body>

	<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Letter: Cover Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form action="CoverFormServiceImpl">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Letter: Cover List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

				<div style="position: absolute; top:200px; left:5px; width:600px; height:25px">
 					
    					<c:forEach var="cover" items="${list}"> 
   							 
   							<div style="position: absolute; left:25px; width:200px; height:25px">
   							 
    							<span class="demo" >${cover.id}</span>
    						
    						</div>	
    							
    						<div style="position: absolute; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${cover.title}</span>
    							
    						</div>
 
    						<div style="position: absolute; left:200px; width:200px; height:25px">
    							
    							<span class="demo" >${cover.subtitle}</span>
    							
    						</div>
     							
     						<div style="position: absolute; left:340px; width:200px; height:25px">
     							
    							<span class="demo" >${cover.effectiveDate}</span>
    							
    						</div>
    							
     						<div style="position: absolute; left:430px; width:200px; height:25px">
     							
    							<span class="demo" >${cover.majorVersion}</span>
    							
    						</div>
   							
     						<div style="position: absolute; left:460px; width:200px; height:25px">
     							
    							<span class="demo" >${cover.minorVersion}</span>
    							
    						</div>
    							
    						<div style="position: absolute; left:490px; width:200px; height:25px">
    							
    							<span class="demo" ><a href="updateCover/${cover.id}">Edit</a></span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:540px; width:200px; height:25px">
    							
    							<span class="demo" ><a href="deleteCover/${cover.id}">Delete</a></span> 
     							
    						</div>	
    							
    						<br></br>
    							
   						</c:forEach>
    				
    					<div style="position: absolute; top:380px; left:25px; width:700px; height:25px">
    				
    						<a href="coverForm">Add Cover Form</a>
    						
    					</div>
 					
				</div>

				<!-- BUTTON PANEL -->	
					
				<div style="position: absolute; top:640px; left:100px; width:600px; height:25px">
					__________________________________________________________
					
				</div> 																

				<div style="position: absolute; top:667px; left:200px; width:500px; height:25px">
					<input type="submit" value="Prev Page"  name="submitAction"></input>
				</div>
				
				<div style="position: absolute; top:667px; left:350px; width:500px; height:25px">
					<input type="submit" value="Next Page"  name="submitAction"></input>
				</div>
							
			</form>

		</div>

		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />
		
	</div>

</body>
</html>