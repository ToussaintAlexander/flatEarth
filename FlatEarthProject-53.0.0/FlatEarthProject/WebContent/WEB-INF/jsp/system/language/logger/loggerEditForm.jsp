
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Edit Language: Logger Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Edit Language: Logger Form</h1>
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
          
          		<div style="position: absolute; top:190px; left:140px; width:200px; height:25px">
           			<form:input path="id" size="4" /> 
           		</div>
 
 				<!-- Logger Name -->
 
           		<div style="position: absolute; top:190px; left:330px; width:200px; height:25px">
           			Logger Name :  
           		</div>
           
            	<div style="position: absolute; top:190px; left:475px; width:200px; height:25px">
           			<form:input path="loggerName" size="15"/> 
          		</div>

          		<!-- Server Name -->
                  
           		<div style="position: absolute; top:240px; left:20px; width:200px; height:25px">
           			Server Name : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:140px; width:200px; height:25px">
           			<form:input path="serverName" size="25" /> 
           		</div>
 
  				<!-- Handler Type -->
                  
           		<div style="position: absolute; top:240px; left:330px; width:200px; height:25px">
           			Handler Type : 
           		</div>
           
            	<div style="position: absolute; top:240px; left:475px; width:200px; height:25px">
           			<form:input path="handlerType" size="15" /> 
           		</div>

          		<!-- Port Number -->
                  
           		<div style="position: absolute; top:265px; left:20px; width:200px; height:25px">
           			Port Number : 
           		</div>
           
            	<div style="position: absolute; top:265px; left:140px; width:200px; height:25px">
           			<form:input path="portNumber" size="15" /> 
           		</div>
 
          		<!-- File Handler -->
                  
           		<div style="position: absolute; top:265px; left:330px; width:200px; height:25px">
           			File Handler : 
           		</div>
           
            	<div style="position: absolute; top:265px; left:475px; width:200px; height:25px">
           			<form:input path="fileHandler" size="15" /> 
           		</div>
 
          		<!-- Output Stream -->
                  
           		<div style="position: absolute; top:305px; left:20px; width:200px; height:25px">
           			Output Stream : 
           		</div>
           
            	<div style="position: absolute; top:305px; left:140px; width:200px; height:25px">
           			<form:input path="outputStream" size="20" /> 
           		</div>

          		<!-- Maximum Record Buffer -->
                  
           		<div style="position: absolute; top:305px; left:330px; width:200px; height:25px">
           			Max Record Buffer : 
           		</div>
           
            	<div style="position: absolute; top:305px; left:475px; width:200px; height:25px">
           			<form:input path="maximumRecordBuffer" size="2" /> 
           		</div>

          		<!-- File Name Pattern -->
                  
           		<div style="position: absolute; top:345px; left:20px; width:200px; height:25px">
           			File Name Pattern : 
           		</div>
           
            	<div style="position: absolute; top:345px; left:140px; width:200px; height:25px">
           			<form:input path="fileNamePattern" size="20" /> 
           		</div>

          		<!-- Maximum Disk Files -->
                  
           		<div style="position: absolute; top:345px; left:330px; width:200px; height:25px">
           			Max Disk Files : 
           		</div>
           
            	<div style="position: absolute; top:345px; left:475px; width:200px; height:25px">
           			<form:input path="maximumDiskFiles" size="2" /> 
           		</div>

          		<!-- File Append -->
                  
           		<div style="position: absolute; top:370px; left:20px; width:200px; height:25px">
           			File Append : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:140px; width:200px; height:25px">
           			<form:input path="fileAppend" size="1" /> 
           		</div>

          		<!-- File Limit Size -->
                  
           		<div style="position: absolute; top:370px; left:330px; width:200px; height:25px">
           			File Limit Size : 
           		</div>
           
            	<div style="position: absolute; top:370px; left:475px; width:200px; height:25px">
           			<form:input path="fileLimitSize" size="10" /> 
           		</div>

          		<!-- Filter Code -->
                  
           		<div style="position: absolute; top:410px; left:20px; width:200px; height:25px">
           			Filter Code : 
           		</div>
           
            	<div style="position: absolute; top:410px; left:140px; width:200px; height:25px">
           			<form:input path="filterCode" size="1" /> 
           		</div>

          		<!-- Push Level -->
                  
           		<div style="position: absolute; top:410px; left:330px; width:200px; height:25px">
           			Push Level : 
           		</div>
           
            	<div style="position: absolute; top:410px; left:475px; width:200px; height:25px">
           			<form:input path="pushLevel" size="1" /> 
           		</div>

          		<!-- Filter Value -->
                  
           		<div style="position: absolute; top:435px; left:20px; width:200px; height:25px">
           			Filter Value : 
           		</div>
           
            	<div style="position: absolute; top:435px; left:140px; width:200px; height:25px">
           			<form:input path="filterValue" size="20" /> 
           		</div>

          		<!-- Xxxxxxxxx -->
                  
           		<div style="position: absolute; top:435px; left:330px; width:200px; height:25px">
           			Xxxxxxxxxx : 
           		</div>
           
            	<div style="position: absolute; top:435px; left:475px; width:200px; height:25px">
           			 
           		</div>

          		<!-- Source Class -->
                  
           		<div style="position: absolute; top:475px; left:20px; width:200px; height:25px">
           			Source Class : 
           		</div>
           
            	<div style="position: absolute; top:475px; left:140px; width:200px; height:25px">
           			<form:input path="sourceClass" size="20" /> 
           		</div>

          		<!-- Resource Bundle -->
                  
           		<div style="position: absolute; top:475px; left:330px; width:200px; height:25px">
           			Resource Bundle : 
           		</div>
           
            	<div style="position: absolute; top:475px; left:475px; width:200px; height:25px">
           			 <form:input path="resourceBundle" size="15" /> 
           		</div>
           		
          		<!-- Source Method Name -->
                  
           		<div style="position: absolute; top:500px; left:20px; width:200px; height:25px">
           			Source Method : 
           		</div>
           
            	<div style="position: absolute; top:500px; left:140px; width:200px; height:25px">
           			<form:input path="sourceMethodName" size="20" /> 
           		</div>

          		<!-- Format Code -->
                  
           		<div style="position: absolute; top:500px; left:330px; width:200px; height:25px">
           			Format Code : 
           		</div>
           
            	<div style="position: absolute; top:500px; left:475px; width:200px; height:25px">
           			 <form:input path="formatCode" size="1" /> 
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
