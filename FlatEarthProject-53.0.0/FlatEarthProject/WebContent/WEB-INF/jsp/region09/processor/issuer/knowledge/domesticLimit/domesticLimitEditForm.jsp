
<%@ taglib prefix="form" 	uri="http://www.springframework.org/tags/form" 	%>  

<head>
<title>Knowledge: Domestic Limit Edit Form</title>
</head>

<body>
<div id="container" style="width: 600px">

		<!-- TOP BORDER -->

		<div id="header" style="background-color: blue;">
			<h1 style="margin-bottom: 0;">Knowledge: Domestic Limit Edit Form</h1>
		</div>

		<!-- CONTENT BODY -->

		<div id="content"
			style="background-color: silver; height: 650px; width: 600px; float: left;">

			<form:form method="POST" action="/FlatEarthProject/chipCardEditFormJSPPostAction">

				<!-- SCREEN DATE -->	
											
				<jsp:include page="/include/pageHeader/screenDate.jsp" />

				<!-- FLATEARTH LOGO -->

				<jsp:include page="/include/pageHeader/Caillebotte.jsp" />

				<!-- SCREEN DISPLAY -->

      	 		<div style="position: absolute; top:210px; left:25px; width:200px; height:25px">
          			<form:hidden  path="id" /> 
          		</div>
         
        		<div style="position: absolute; top:190px; left:20px; width:200px; height:25px">   
          			<b>Low Bin Range :</b> 
          		</div>
          
          		<div style="position: absolute; top:190px; left:170px; width:200px; height:25px">
           			<form:input path="lowBinRangeNumber" size="19" /> 
           		</div>
            
           		<!-- Bin Length -->
           
           		<div style="position: absolute; top:190px; left:330px; width:400px; height:25px">
           			Bin Length :   
           		</div>
           
          		<div style="position: absolute; top:190px; left:500px; width:200px; height:25px">
           			<form:input path="binLength" size="2" /> 
          		</div>
 
           		<div style="position: absolute; top:215px; left:20px; width:330px; height:25px">
           			<b>High Bin Range :</b>  
           		</div>
           
            	<div style="position: absolute; top:215px; left:170px; width:200px; height:25px">
           			<form:input path="highBinRangeNumber" size="19"/> 
          		</div>
          
          		<!-- Account Number Length -->
                  
           		<div style="position: absolute; top:215px; left:330px; width:400px; height:25px">
           			Account Number Length : 
           		</div>
           
            	<div style="position: absolute; top:215px; left:500px; width:500px; height:25px">
           			<form:input path="accountNumberLength" size="2" /> 
           		</div>
   
            	<div style="position: absolute; top:265px; left:20px; width:400px; height:25px">
              			Daily Max Declines :   
           		</div>
  
           		<div style="position: absolute; top:265px; left:170px; width:200px; height:25px">
           			<form:input path="dailyMaximumDeclines" size="2" /> 
          		</div>
 
				<!-- dailyMaximumBadPins -->

            	<div style="position: absolute; top:265px; left:330px; width:400px; height:25px">
           			Daily Maximum Bad Pins :   
           		</div>
           
           		<div style="position: absolute; top:265px; left:500px; width:200px; height:25px">
           			<form:input path="dailyMaximumBadPins" size="2" /> 
          		</div>
 
          		<!-- singleMaximumAdvAmount -->
          
          		<div style="position: absolute; top:315px; left:20px; width:400px; height:25px">
           			Single Max Adv Amt :  
          		</div>
 
          		<div style="position: absolute; top:315px; left:170px; width:200px; height:25px">
           			<form:input path="singleMaximumAdvAmount" size="12" /> 
          		</div>

                <!-- singleMaximumAtmAmount -->
                  
            	<div style="position: absolute; top:315px; left:330px; width:200px; height:25px">
           			Single Maximum Atm Amt :  
           		</div>
           
           		<div style="position: absolute; top:315px; left:500px; width:200px; height:25px"> 
           			<form:input path="singleMaximumAtmAmount" size="12" /> 
          		</div>
           		
                <!-- singleMaximumBckAmount -->

            	<div style="position: absolute; top:340px; left:20px; width:200px; height:25px">
           			Single Max Bck Amt :   
           		</div>

           		<div style="position: absolute; top:340px; left:170px; width:200px; height:25px">
           			<form:input path="singleMaximumBckAmount" size="12" /> 
          		</div>          		
          		
          		<!-- singleMaximumPosAmount -->

           		<div style="position: absolute; top:340px; left:330px; width:200px; height:25px">
           			Single Maximum Pos Amt :   
           		</div>

           		<div style="position: absolute; top:340px; left:500px; width:200px; height:25px">
           			<form:input path="singleMaximumPosAmount" size="12" /> 
          		</div>          		
  
           		<!-- dailyMaximumAdvAmount -->
 
          		<div style="position: absolute; top:390px; left:20px; width:400px; height:25px">  
           			Daily Max Adv Amt :  
           		</div>
 
           		<div style="position: absolute; top:390px; left:170px; width:200px; height:25px">
           			<form:input path="dailyMaximumAdvAmount" size="12" /> 
          		</div>
                            
          		<div style="position: absolute; top:390px; left:330px; width:400px; height:25px">  
           			Daily Maximum Atm Amt :  
           		</div>
           
           		<div style="position: absolute; top:390px; left:500px; width:200px; height:25px"> 
           			<form:input path="dailyMaximumAtmAmount" size="12" /> 
          		</div>

				<!-- dailyMaximumBckAmount -->

          		<div style="position: absolute; top:415px; left:20px; width:400px; height:25px">
           			Daily Max Bck Amt :
           		</div>
           
           		<div style="position: absolute; top:415px; left:170px; width:400px; height:25px">   
           			<form:input path="dailyMaximumBckAmount" size="12" /> 
         		</div>

				<!-- dailyMaximumPosAmount -->

            	<div style="position: absolute; top:415px; left:330px; width:400px; height:25px">
           			Daily Maximum Pos Amt :   
           		</div>
           
           		<div style="position: absolute; top:415px; left:500px; width:200px; height:25px">
           			<form:input path="dailyMaximumPosAmount" size="12" /> 
          		</div>

				<!-- dailyMaximumAdvNumber -->

            	<div style="position: absolute; top:465px; left:20px; width:400px; height:25px">
           			Daily Max Adv Nbr :   
           		</div>
           
           		<div style="position: absolute; top:465px; left:170px; width:200px; height:25px">
           			<form:input path="dailyMaximumAdvNumber" size="2" /> 
          		</div>
 
				<!-- dailyMaximumAtmNumber -->

            	<div style="position: absolute; top:465px; left:330px; width:400px; height:25px">
           			Daily Maximum Atm Nbr :   
           		</div>
           
           		<div style="position: absolute; top:465px; left:500px; width:200px; height:25px">
           			<form:input path="dailyMaximumAtmNumber" size="2" /> 
          		</div>
 
				<!-- dailyMaximumBckNumber -->

            	<div style="position: absolute; top:490px; left:20px; width:400px; height:25px">
           			Daily Max Bck Nbr :   
           		</div>
           
           		<div style="position: absolute; top:490px; left:170px; width:200px; height:25px">
           			<form:input path="dailyMaximumBckNumber" size="2" /> 
          		</div>
 
				<!-- dailyMaximumPosNumber -->

            	<div style="position: absolute; top:490px; left:330px; width:400px; height:25px">
           			Daily Maximum Pos Nbr :   
           		</div>
           
           		<div style="position: absolute; top:490px; left:500px; width:200px; height:25px">
           			<form:input path="dailyMaximumPosNumber" size="2" /> 
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
