<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  
<%@ taglib prefix="c"       uri="http://java.sun.com/jstl/core_rt"	        %>  

<head>
<title>Edit Authorization: Menu Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Authorization: Menu Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/retailerEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:200px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
         		<!-- Identifier -->
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Identifier :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:150px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
 				<!-- Group Id -->
 
           		<div style="position: absolute; top:240px; left:20px; width:200px; height:25px">
           			Group Id :  
           		</div>
           
            	<div style="position: absolute; top:240px; left:150px; width:200px; height:25px">
           			<form:input path="groupId" size="3"/> 
          		</div>

          		<!-- User Id -->
                  
           		<div style="position: absolute; top:240px; left:240px; width:200px; height:25px">
           			User Id : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:340px; width:200px; height:25px">
           			<form:input path="userId" size="3" /> 
           		</div>
 
  				<!-- Sequence -->
                  
           		<div style="position: absolute; top:240px; left:410px; width:200px; height:25px">
           			Sequence : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:490px; width:200px; height:25px">
           			<form:input path="seq" size="2" /> 
           		</div>

          		<!-- parentMenu -->
                  
           		<div style="position: absolute; top:290px; left:20px; width:200px; height:25px">
           			parentMenu : 
           		</div>
           
            	<div style="position: absolute; top:290px; left:150px; width:200px; height:25px">
           			<form:input path="parentMenu" size="50" /> 
           		</div>
 
          		<!-- childMenu -->
                  
           		<div style="position: absolute; top:315px; left:20px; width:200px; height:25px">
           			childMenu : 
           		</div>
           
            	<div style="position: absolute; top:315px; left:150px; width:200px; height:25px">
           			<form:input path="childMenu" size="50" /> 
           		</div>

          		<!-- profileStatus -->
                  
           		<div style="position: absolute; top:365px; left:20px; width:200px; height:25px">
           			profileStatus : 
           		</div>
           
            	<div style="position: absolute; top:365px; left:150px; width:200px; height:25px">
           			<form:input path="profileStatus" size="1" /> 
           		</div>
 
          		<!-- parentMenuStatus -->
                  
           		<div style="position: absolute; top:395px; left:20px; width:200px; height:25px">
           			parentMenuStatus : 
           		</div>
           
            	<div style="position: absolute; top:395px; left:150px; width:200px; height:25px">
           			<form:input path="parentMenuStatus" size="1" /> 
           		</div>          		          	
 
          		<!-- viewJspPath -->
                  
           		<div style="position: absolute; top:425px; left:20px; width:200px; height:25px">
           			viewJspPath : 
           		</div>
           
            	<div style="position: absolute; top:425px; left:150px; width:200px; height:25px">
           			<form:input path="viewJspPath" size="30" /> 
           		</div>
           		
          		<!-- childMenuStatus -->
                  
           		<div style="position: absolute; top:455px; left:20px; width:200px; height:25px">
           			childMenuStatus : 
           		</div>
           
            	<div style="position: absolute; top:455px; left:150px; width:200px; height:25px">
           			<form:input path="childMenuStatus" size="1" /> 
           		</div>
           		
				<!-- INCLUDE FOOTPRINT -->

               <div style="position: absolute; top:560px; left:20px; width:200px; height:25px">
           			<b>Foot Print</b>   
           		</div>

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
