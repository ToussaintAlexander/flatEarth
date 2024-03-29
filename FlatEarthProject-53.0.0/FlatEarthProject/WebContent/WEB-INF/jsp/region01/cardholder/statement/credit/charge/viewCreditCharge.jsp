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
<title>Credit Charge Form</title>

</head>

<body>

	<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Credit Charge Form</h1>
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
    							
    						<div style="position: absolute; left:60px; width:200px; height:25px">
    							
    							<span class="demo" >${credit.primaryAccountNumber}</span>
    							
    						</div>
 
    						<div style="position: absolute; left:140px; width:200px; height:25px">
    							
    							<span class="demo" >${credit.primaryAccountNumberSeq}</span>
    							
    						</div>
     							
     						<div style="position: absolute; left:190px; width:200px; height:25px">
     							
    							<span class="demo" >${credit.bankName}</span>
    							
    						</div>
    							
    						<div style="position: absolute; left:240px; width:200px; height:25px">		
    							
    							<span class="demo" >${credit.associationName}</span>
    							
    						</div>	
 
    						<div style="position: absolute; left:290px; width:200px; height:25px">		
    							
    							<span class="demo" >${credit.closingDate}</span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:340px; width:200px; height:25px">		
    							
    							<span class="demo" >${credit.compositeAPR}</span>
    							
    						</div>	
 				 							
    						<div style="position: absolute; left:390px; width:200px; height:25px">		
    							
    							<span class="demo" >${credit.totalFeesChargedThisPeriod}</span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:430px; width:200px; height:25px">		
    							
    							<span class="demo" >${credit.compositeAPR}</span>
    							
    						</div>	
 									 							
    						<div style="position: absolute; left:480px; width:200px; height:25px">		
    							
    							<span class="demo" >${credit.totalFeesChargedYTD}</span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:530px; width:200px; height:25px">		
    							
    							<span class="demo" >${credit.totalInterestChargedYTD}</span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:560px; width:200px; height:25px">
    							
    							<span class="demo" ><a href="updateCreditChargeJSPHref/${credit.id}">Edit</a></span>
    							
    						</div>	
    						
    						<div style="position: absolute; left:590px; width:200px; height:25px">
    							
    							<span class="demo" ><a href="deleteCreditChargeJSPHref/${credit.id}">Delete</a></span> 
     							
    						</div>	
    							
    						<br></br>
    							
   						</c:forEach>
    				
    					<div style="position: absolute; top:370px; left:15px; width:700px; height:25px">
    				
    						<a href="creditForm">Add New Credit Charge</a>
    						
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