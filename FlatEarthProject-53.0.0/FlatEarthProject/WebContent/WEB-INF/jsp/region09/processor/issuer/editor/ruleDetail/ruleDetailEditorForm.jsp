<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix="c"    uri="http://java.sun.com/jstl/core_rt"	        %>  

		 <h1>Edit Cardholder</h1>
         <form:form method="POST" action="/FlatEarthProject/cardholderEditFormJSPPostAction">  
      	 <table >  
      	
      	 <tr>
      	 <td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         
         <tr>  
          <td>First Name : </td> 
          <td><form:input path="firstName"  /></td>
         </tr> 
          
         <tr>  
          <td>Middle Name :</td>  
          <td><form:input path="middleName" /></td>
         </tr> 
         
         <tr>  
          <td>Last Name :</td>  
          <td><form:input path="lastName" /></td>
         </tr> 
         
         <tr>  
          <td>Social Security :</td>  
          <td><form:input path="socialSecurity" /></td>
         </tr> 
                  
         <tr>  
          <td>Company :</td>  
          <td><form:input path="company" /></td>
         </tr> 
                  
         <tr>  
          <td>Department :</td>  
          <td><form:input path="department" /></td>
         </tr> 
                  
         <tr>  
          <td>Title :</td>  
          <td><form:input path="title" /></td>
         </tr> 
                  
         <tr>  
          <td>Salary :</td>  
          <td><form:input path="salary" /></td>
         </tr> 
         
         <tr>  
          <td>Age :</td>  
          <td><form:input path="age" /></td>
         </tr> 
         
         <tr>  
          <td>Marital Status :</td>  
          <td><form:input path="maritalStatus" /></td>
         </tr>     
              
         <tr>  
          <td>Date Of Birth :</td>  
          <td><form:input path="dateOfBirth" /></td>
         </tr> 
         
         <tr>  
          <td>Education :</td>  
          <td><form:input path="education" /></td>
         </tr> 
         
         <tr>  
          <td>Interests :</td>  
          <td><form:input path="interests" /></td>
         </tr> 

         <tr>  
          <td>User Name :</td>  
          <td><form:input path="userName" /></td>
         </tr> 
                
         <tr>  
          <td>User Id :</td>  
          <td><form:input path="userId" /></td>
         </tr> 
                
         <tr>  
          <td>Secret :</td>  
          <td><form:input path="secret" /></td>
         </tr> 
                
         <tr>  
          <td>Clear Text Pin :</td>  
          <td><form:input path="clearTextPin" /></td>
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
          <td>Modify User :</td>  
          <td><form:input path="modifyUser" /></td>
         </tr> 
                  
         <tr>  
          <td>Modify Timestamp :</td>  
          <td><form:input path="modifyTimestamp" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
         
        </table>  
       </form:form>  
