<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib prefix="c"   uri="http://java.sun.com/jstl/core_rt"	       %>  

		<h1>Add New Track</h1>
       <form:form method="post" action="trackFormJSPPostAction">  
      	<table >  
      	
         <tr>  
          <td>primaryAccountNumber : </td> 
          <td><form:input path="primaryAccountNumber"  /></td>
         </tr> 
          
         <tr>  
          <td>primaryAccountNumberSeq :</td>  
          <td><form:input path="primaryAccountNumberSeq" /></td>
         </tr> 
         
         <tr>  
          <td>startSentinel :</td>  
          <td><form:input path="startSentinel" /></td>
         </tr> 
         
         <tr>  
          <td>formatCode :</td>  
          <td><form:input path="formatCode" /></td>
         </tr>     
              
         <tr>  
          <td>fieldSeparator :</td>  
          <td><form:input path="fieldSeparator" /></td>
         </tr> 
         
         <tr>  
          <td>countryCode :</td>  
          <td><form:input path="countryCode" /></td>
         </tr> 
         
         <tr>  
          <td>currencyCode :</td>  
          <td><form:input path="currencyCode" /></td>
         </tr> 
 
         <tr>  
          <td>currencyExponent :</td>  
          <td><form:input path="currencyExponent" /></td>
         </tr> 
        
         <tr>  
          <td>amountAuthorizedPerCycle :</td>  
          <td><form:input path="amountAuthorizedPerCycle" /></td>
         </tr> 
        
         <tr>  
          <td>amountRemainingThisCycle :</td>  
          <td><form:input path="amountRemainingThisCycle" /></td>
         </tr> 
        
         <tr>  
          <td>cycleBeginYear :</td>  
          <td><form:input path="cycleBeginYear" /></td>
         </tr> 
                
         <tr>  
          <td>cycleBeginDay :</td>  
          <td><form:input path="cycleBeginDay" /></td>
         </tr> 
        
         <tr>  
          <td>cycleLength :</td>  
          <td><form:input path="cycleLength" /></td>
         </tr> 
        
         <tr>  
          <td>retryCount :</td>  
          <td><form:input path="retryCount" /></td>
         </tr> 
        
         <tr>  
          <td>pinControlParameters :</td>  
          <td><form:input path="pinControlParameters" /></td>
         </tr> 
        
         <tr>  
          <td>interchangeControls :</td>  
          <td><form:input path="interchangeControls" /></td>
         </tr> 
                
         <tr>  
          <td>panServiceRestriction :</td>  
          <td><form:input path="panServiceRestriction" /></td>
         </tr> 
                
         <tr>  
          <td>san1ServiceRestriction :</td>  
          <td><form:input path="san1ServiceRestriction" /></td>
         </tr> 
                
         <tr>  
          <td>san2ServiceRestriction :</td>  
          <td><form:input path="san2ServiceRestriction" /></td>
         </tr> 
        
         <tr>  
          <td>expirationDateYear :</td>  
          <td><form:input path="expirationDateYear" /></td>
         </tr> 
        
         <tr>  
          <td>expirationDateMonth :</td>  
          <td><form:input path="expirationDateMonth" /></td>
         </tr> 
        
                
         <tr>  
          <td>cardSecurityNumber :</td>  
          <td><form:input path="cardSecurityNumber" /></td>
         </tr> 
        
         <tr>  
          <td>relayMarker :</td>  
          <td><form:input path="relayMarker" /></td>
         </tr> 
        
         <tr>  
          <td>cryptographicCheckDigits :</td>  
          <td><form:input path="cryptographicCheckDigits" /></td>
         </tr> 
        
         <tr>  
          <td>endSentinel :</td>  
          <td><form:input path="endSentinel" /></td>
         </tr> 
        
         <tr>  
          <td>longRedundancyCheck :</td>  
          <td><form:input path="longRedundancyCheck" /></td>
         </tr> 
        
         <tr>  
          <td>currencyCode :</td>  
          <td><form:input path="currencyCode" /></td>
         </tr> 
          
         <tr>  
          <td>Create User :</td>  
          <td><form:input path="createUser" /></td>
         </tr> 
          
         <tr>  
          <td>Create Timestamp :</td>  
          <td><form:input path="createTimestamp" /></td>
         </tr> 
          
         <tr>  
          <td>Modify User:</td>  
          <td><form:input path="modifyUser" /></td>
         </tr> 
          
         <tr>  
          <td>Modify Timestamp :</td>  
          <td><form:input path="modifyTimestamp" /></td>
         </tr> 
          
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
         
        </table>  
       </form:form>
