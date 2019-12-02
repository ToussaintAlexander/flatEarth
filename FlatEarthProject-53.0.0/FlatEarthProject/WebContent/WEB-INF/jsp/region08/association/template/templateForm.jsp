<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c"    uri="http://java.sun.com/jstl/core_rt"	        %>  

		<h1>Add New Scheme</h1>
       <form:form method="post" action="templateFormJSPPostAction">  
      	<table >  
         
         <tr>  
          <td>Processing Code : </td> 
          <td><form:input path="processingCode"  /></td>
         </tr> 
          
         <tr>  
          <td>Point Of Service Entry Mode :</td>  
          <td><form:input path="pointOfServiceEntryMode" /></td>
         </tr> 
         
         <tr>  
          <td>Point Of Service Condition Code :</td>  
          <td><form:input path="pointOfServiceConditionCode" /></td>
         </tr> 
         
         <tr>  
          <td>Primary Account Number :</td>  
          <td><form:input path="primaryAccountNumber" /></td>
         </tr>     
              
         <tr>  
          <td>Merchant Type :</td>  
          <td><form:input path="merchantType" /></td>
         </tr> 
         
         <tr>  
          <td>Expiration Date :</td>  
          <td><form:input path="expirationDate" /></td>
         </tr> 
         
         <tr>  
          <td>Track 2 Data :</td>  
          <td><form:input path="track2Data" /></td>
         </tr> 
        
         <tr>  
          <td>Transaction Amount :</td>  
          <td><form:input path="transactionAmount" /></td>
         </tr> 
        
         <tr>  
          <td>Additional Amounts :</td>  
          <td><form:input path="additionalAmounts" /></td>
         </tr> 
                
         <tr>  
          <td>Personal Identification Number :</td>  
          <td><form:input path="personalIdentificationNumber" /></td>
         </tr> 
        
         <tr>  
          <td>Response Code :</td>  
          <td><form:input path="responseCode" /></td>
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
