<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c"    uri="http://java.sun.com/jstl/core_rt"	        %>  

		<h1>Add Reject Code</h1>
       <form:form method="post" action="rejectCodeFormJSPPostAction">  
      	<table >  
      	
          <tr>  
          <td>Field : </td> 
          <td><form:input path="field"  /></td>
         </tr> 
          
         <tr>  
          <td>Subfield :</td>  
          <td><form:input path="subfield" /></td>
         </tr> 
         
         <tr>  
          <td>Sequence :</td>  
          <td><form:input path="sequence" /></td>
         </tr> 
         
         <tr>  
          <td>Code :</td>  
          <td><form:input path="code" /></td>
         </tr>     
              
         <tr>  
          <td>Name :</td>  
          <td><form:input path="name" /></td>
         </tr> 
         
         <tr>  
          <td>Description :</td>  
          <td><form:input path="description" /></td>
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
