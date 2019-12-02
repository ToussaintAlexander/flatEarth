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
<title>Checking Detail Form</title>

</head>

<body>

	<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Checking Detail Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form action="CardholderServiceImpl">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

				<div style="position: absolute; top:200px; left:5px; width:600px; height:25px">
 					
    					<c:forEach var="checking" items="${list}"> 
   							 
 							<div style="position: absolute; left:25px; width:200px; height:25px">
   							 
    							<span class="demo" >${checking.id}</span>
    						
    						</div>	
    							
    						<div style="position: absolute; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${checking.primaryAccountNumber}</span>
    							
    						</div>
 
    						<div style="position: absolute; left:200px; width:200px; height:25px">
    							
    							<span class="demo" >${checking.primaryAccountNumberSeq}</span>
    							
    						</div>
     							
     						<div style="position: absolute; left:220px; width:200px; height:25px">
     							
    							<span class="demo" >${checking.closingDate}</span>
    							
    						</div>
    							
    						<div style="position: absolute; left:310px; width:200px; height:25px">		
    							
    							<span class="demo" >${checking.bankName}</span>
    							
    						</div>	
 
    						<div style="position: absolute; left:445px; width:200px; height:25px">		
    							
    							<span class="demo" >${checking.associationName}</span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:515px; width:200px; height:25px">
    							
    							<span class="demo" ><a href="updateCheckingDetailJSPHref/${checking.id}">Edit</a></span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:550px; width:200px; height:25px">
    							
    							<span class="demo" ><a href="deleteCheckingDetailJSPHref/${checking.id}">Delete</a></span> 
     							
    						</div>	
    							
    						<br></br>
    							
   						</c:forEach>
    				
    					<div style="position: absolute; top:370px; left:15px; width:700px; height:25px">
    				
    						<a href="checkingForm">Add New Checking Detail</a>
    						
    					</div>
 					
				</div>

				<!-- BUTTON PANEL -->	
											
				<jsp:include page="/include/pageFooter/buttonDetailPanel.jsp" />
							
			</form>

		</div>

		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />
		
	</div>

</body>
</html>