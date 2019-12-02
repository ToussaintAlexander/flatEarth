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
<title>Credit Detail Form</title>

</head>

<body>

	<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Credit Detail Form</h1>
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
 					
    					<c:forEach var="credit" items="${list}"> 
   							 
   							<div style="position: absolute; left:25px; width:200px; height:25px">
   							 
    							<span class="demo" >${credit.id}</span>
    						
    						</div>	
    							
    						<div style="position: absolute; left:120px; width:200px; height:25px">
    							
    							<span class="demo" >${credit.transactionDate}</span>
    							
    						</div>
 
    						<div style="position: absolute; left:240px; width:200px; height:25px">
    							
    							<span class="demo" >${credit.postingDate}</span>
    							
    						</div>
     							
     						<div style="position: absolute; left:280px; width:200px; height:25px">
     							
    							<span class="demo" >${credit.referenceNumber}</span>
    							
    						</div>
    							
    						<div style="position: absolute; left:380px; width:200px; height:25px">		
    							
    							<span class="demo" >${credit.productDescription}</span>
    							
    						</div>	
 
    						<div style="position: absolute; left:430px; width:200px; height:25px">		
    							
    							<span class="demo" >${credit.creditAmount}</span>
    							
    						</div>	
    						 							
    						<div style="position: absolute; left:480px; width:200px; height:25px">		
    							
    							<span class="demo" >${credit.chargeAmount}</span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:510px; width:200px; height:25px">
    							
    							<span class="demo" ><a href="updateCreditDetailJSPHref/${credit.id}">Edit</a></span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:550px; width:200px; height:25px">
    							
    							<span class="demo" ><a href="deleteCreditDetailJSPHref/${credit.id}">Delete</a></span> 
     							
    						</div>	
    							
    						<br></br>
    							
   						</c:forEach>
    				
    					<div style="position: absolute; top:370px; left:15px; width:700px; height:25px">
    				
    						<a href="creditForm">Add New Credit Detail</a>
    						
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