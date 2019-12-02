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
<title>Single Element Explain Form</title>

</head>

<body>

	<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Single Element Explain Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form action="CardholderServiceImpl">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Single Element List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

				<div style="position: absolute; top:200px; left:5px; width:600px; height:25px">
 					
    					<c:forEach var="element" items="${list}"> 
   							 
   							<div style="position: absolute; left:25px; width:200px; height:25px">
   							 
    							<span class="demo" >${element.id}</span>
    						
    						</div>	
    							
    						<div style="position: absolute; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${element.field}</span>
    							
    						</div>
 
    						<div style="position: absolute; left:140px; width:200px; height:25px">
    							
    							<span class="demo" >${element.subField}</span>
    							
    						</div>
     							
     							
     						<div style="position: absolute; left:170px; width:200px; height:25px">
     							
    							<span class="demo" >${element.format}</span>
    							
    						</div>
    							
    						<div style="position: absolute; left:200px; width:200px; height:25px">	
    							
    							<span class="demo" >${element.length}</span>
    							
    						</div>
    							
    						<div style="position: absolute; left:230px; width:200px; height:25px">		
    							
    							<span class="demo" >${element.encoding}</span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:260px; width:200px; height:25px">		
    							
    							<span class="demo" >${element.dataType}</span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:290px; width:200px; height:25px">		
    							
    							<span class="demo" >${element.source}</span>
    							
    						</div>		
    						
    						<div style="position: absolute; left:320px; width:200px; height:25px">		
    							
    							<span class="demo" >${element.direction}</span>
    							
    						</div>			
     						
    						<div style="position: absolute; left:350px; width:200px; height:25px">		
    							
    							<span class="demo" >${element.existence}</span>
    							
    						</div>			
    							
    							    						
    						<div style="position: absolute; left:380px; width:200px; height:25px">		
    							
    							<span class="demo" >${element.change}</span>
    							
    						</div>			
    							
    						<div style="position: absolute; left:410px; width:200px; height:25px">		
    							
    							<span class="demo" >${element.fieldValue}</span>
    							
    						</div>			
    							
    						<br></br>
    							
   						</c:forEach>
    				
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