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
<title>Dual Element Explain Form</title>

</head>

<body>

	<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Dual Element Explain Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form action="CardholderServiceImpl">

				<div style="position: absolute; top:70px; left:25px; width:200px; height:25px">
					<span class="demo" ><b>Dual Element List:</b></span>
				</div> 
				
				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

				<div style="position: absolute; top:200px; left:5px; width:600px; height:25px">
 					
    					<c:forEach var="dualElement" items="${list}"> 
   							 
   							<div style="position: absolute; top:10px; left:25px; width:200px; height:25px">
   							 
    							<span class="demo" >${dualElement.id}</span>
    						
    						</div>	
    							
    						<div style="position: absolute; top:40px; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.field1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:40px; left:150px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.field2}</span>
    							
    						</div>
 
   							<div style="position: absolute; top:70px; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.subField1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:70px; left:150px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.subField2}</span>
    							
    						</div>

   							<div style="position: absolute; top:100px; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.format1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:100px; left:150px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.format2}</span>
    							
    						</div>

   							<div style="position: absolute; top:130px; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.length1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:130px; left:150px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.length2}</span>
    							
    						</div>

   							<div style="position: absolute; top:160px; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.encoding1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:160px; left:150px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.encoding2}</span>
    							
    						</div>

   							<div style="position: absolute; top:190px; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.dataType1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:190px; left:150px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.dataType2}</span>
    							
    						</div>

   							<div style="position: absolute; top:220px; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.source1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:220px; left:150px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.source2}</span>
    							
    						</div>

   							<div style="position: absolute; top:250px; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.direction1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:250px; left:150px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.direction2}</span>
    							
    						</div>

   							<div style="position: absolute; top:280px; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.existence1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:280px; left:150px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.existence2}</span>
    							
    						</div>

   							<div style="position: absolute; top:310px; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.change1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:310px; left:150px; width:200px; height:25px">
    							
    							<span class="demo" >${dualElement.change2}</span>
    							
    						</div>

   							<div style="position: absolute; top:340px; left:60px; width:500px; height:25px">
    							
    							<span class="demo" >${dualElement.fieldValue1}</span>
    							
    						</div>
    						
    						<div style="position: absolute; top:340px; left:350px; width:500px; height:25px">
    							
    							<span class="demo" >${dualElement.fieldValue2}</span>
    							
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