<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c"    uri="http://java.sun.com/jstl/core_rt"	        %>  

		<h1>Add New Track</h1>
       <form:form method="post" action="trackFormJSPPostAction">  
      	<table >  
         
         <tr>  
          <td>Primary Account Number : </td> 
          <td><form:input path="primaryAccountNumber"  /></td>
         </tr> 
          
         <tr>  
          <td>Primary Account Number Sequence :</td>  
          <td><form:input path="primaryAccountNumberSeq" /></td>
         </tr> 
         
         <tr>  
          <td>Start Sentinel :</td>  
          <td><form:input path="startSentinel" /></td>
         </tr> 
         
         <tr>  
          <td>Format Code :</td>  
          <td><form:input path="formatCode" /></td>
         </tr>     
              
         <tr>  
          <td>Field Separator 1 :</td>  
          <td><form:input path="fieldSeparator1" /></td>
         </tr> 
         
         <tr>  
          <td>Full Name :</td>  
          <td><form:input path="fullName" /></td>
         </tr> 
         
         <tr>  
          <td>Field Separator 2 :</td>  
          <td><form:input path="fieldSeparator2" /></td>
         </tr> 
 
         <tr>  
          <td>Expiration Date Year :</td>  
          <td><form:input path="expirationDateYear" /></td>
         </tr> 
                
         <tr>  
          <td>ExpirationDateMonth :</td>  
          <td><form:input path="expirationDateMonth" /></td>
         </tr> 
                
         <tr>  
          <td>Service Code :</td>  
          <td><form:input path="serviceCode" /></td>
         </tr> 
                
         <tr>  
          <td>PIN Validation Key Index :</td>  
          <td><form:input path="pinValidationKeyIndex" /></td>
         </tr> 
                
         <tr>  
          <td>PIN Verification Value :</td>  
          <td><form:input path="pinVerificationValue" /></td>
         </tr> 
                
         <tr>  
          <td>Card Verification Value :</td>  
          <td><form:input path="cardVerificationValue" /></td>
         </tr> 
                
         <tr>  
          <td>End Sentinel :</td>  
          <td><form:input path="endSentinel" /></td>
         </tr> 
                
         <tr>  
          <td>Long Redundancy Check :</td>  
          <td><form:input path="longRedundancyCheck" /></td>
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
