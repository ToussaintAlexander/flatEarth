<!-- HEADER -->

<jsp:include page="/include/pageHeader/pageHeader.jsp" />

<!-- Include Core Tags -->
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<!-- Include Functions Tags -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
     
<!-- Include Format Tags -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
     
<!-- Include SQL Tags -->
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!-- Include XML Tags -->
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<title>Language Menu</title>
</head>

<body>

	<div id="container" style="width: 650px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: #FFA500;">
			<h1 style="margin-bottom: 0;">Language Menu</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: #EEEEEE; height: 650px; width: 562px; float: left;">

			<form action="MainMenuServlet">

				<div style="position: absolute; top:70px; left:120px; width:200px; height:25px">
					<h2>Welcome</h2>
				</div> 
				
				<!-- FORM PICTURE -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- WELCOME DATE -->

				<jsp:include page="/include/pageHeader/welcomeDate.jsp" />

				<!-- PASS MULTIPLE LIST FROM CONTROLLER TO JSP -->
				
				<div style="position: absolute; top:250px; left:150px; width:200px; height:25px">
				
				<!-- <p>Length of String: ${fn:length(model.profile)}</p> -->
				
				<c:if test="${fn:length(model.profile) gt 0}">
				
					<c:forEach items="${model.profile}" var="element">
					
						<c:set var="arrayofmsg" value="${fn:split(element,' ')}"/>
					
						<c:forEach var="i" begin="1" end="${fn:length(model.profile)}" varStatus="status">
					
 							<c:set var="menuName" 		value="${arrayofmsg[4]}"/>
 							<c:set var="screenName" 	value="${arrayofmsg[5]}"/>
							<c:set var="menuStatus" 	value="${arrayofmsg[8]  eq 1 ? true : false}"/>
							<c:set var="viewJsp" 		value="${arrayofmsg[9]}"/>
							<c:set var="screenStatus" 	value="${arrayofmsg[10] eq 1 ? true : false}"/>
							<c:set var="controllerBean"	value="${arrayofmsg[11]}"/>
							<c:set var="createStatus" 	value="${arrayofmsg[12] eq 1 ? true : false}"/>
							<c:set var="readStatus" 	value="${arrayofmsg[13] eq 1 ? true : false}"/>
							<c:set var="updateStatus" 	value="${arrayofmsg[14] eq 1 ? true : false}"/>
							<c:set var="deleteStatus" 	value="${arrayofmsg[15] eq 1 ? true : false}"/>
							<c:set var="fieldVisible" 	value="${arrayofmsg[16] eq 1 ? true : false}"/>
							<c:set var="fieldEditable" 	value="${arrayofmsg[17] eq 1 ? true : false}"/>
							
						</c:forEach>
						
						<a href="${controllerBean}">${screenName}</a>  
						<br></br>
						
					</c:forEach>
				
				</c:if>
					
				</div> 
				
			</form>

		</div>

		<!-- INCLUDE COPYRIGHT -->

		<jsp:include page="/include/pageFooter/copyright.jsp" />

	</div>

</body>
</html>