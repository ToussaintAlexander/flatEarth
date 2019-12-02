<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c"    uri="http://java.sun.com/jstl/core_rt"	        %>  

		<h1>Add Cover Form</h1>
       <form:form method="post" action="save">  
      	<table >  
      	
          <tr>  
          <td>ID : </td> 
          <td><form:input path="id"  /></td>
         </tr> 
          
         <tr>  
          <td>Title :</td>  
          <td><form:input path="title" /></td>
         </tr> 
          
         <tr>  
          <td>Subtitle :</td>  
          <td><form:input path="subtitle" /></td>
         </tr> 
 
          <tr>  
          <td>Effective Date :</td>  
          <td><form:input path="effectiveDate" /></td>
         </tr>     
          
         <tr>  
          <td>Major Version :</td>  
          <td><form:input path="majorVersion" /></td>
         </tr> 
        
         <tr>  
          <td>Minor Version :</td>  
          <td><form:input path="minorVersion" /></td>
         </tr> 

         <tr>  
          <td>Create User :</td>  
          <td><form:input path="createUser" /></td>
         </tr> 
          
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
         
        </table>  
       </form:form>
