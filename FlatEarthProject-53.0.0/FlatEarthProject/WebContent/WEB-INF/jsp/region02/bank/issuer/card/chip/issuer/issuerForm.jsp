<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c"    uri="http://java.sun.com/jstl/core_rt"	        %>  

		<h1>Add New Issuer</h1>
       <form:form method="post" action="issuerFormJSPPostAction">  
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
          <td>Intl Bank Acct Number :</td>  
          <td><form:input path="intlBankAccountNumber" /></td>
         </tr> 
          
         <tr>  
          <td>Bank Identification Code :</td>  
          <td><form:input path="bankIdentifierCode" /></td>
         </tr> 
         
         <tr>  
          <td>Bank Identification Number :</td>  
          <td><form:input path="bankIdentificationNumber" /></td>
         </tr> 
          
         <tr>  
          <td>Merchant Category Code :</td>  
          <td><form:input path="merchantCategoryCode" /></td>
         </tr> 
          
         <tr>  
          <td>Merchant Identifier :</td>  
          <td><form:input path="merchantIdentifier" /></td>
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
