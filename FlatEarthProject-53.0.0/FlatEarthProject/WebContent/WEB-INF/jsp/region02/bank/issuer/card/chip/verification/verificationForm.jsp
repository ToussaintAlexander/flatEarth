<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c"    uri="http://java.sun.com/jstl/core_rt"	        %>  

		<h1>Add New Verification</h1>
       <form:form method="post" action="verificationFormJSPPostAction">  
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
          <td>Cardholder Verification Method :</td>  
          <td><form:input path="cardhldrVerificationMethod" /></td>
         </tr> 
         
         <tr>  
          <td>Cardholder Verification Status :</td>  
          <td><form:input path="cardhldrVerificationStatus" /></td>
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
