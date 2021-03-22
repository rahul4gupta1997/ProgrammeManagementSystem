

<%@ page import="java.util.List"%>
<%@ page import="org.hibernate.Session" %> 
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.hibernate.Transaction"  %>
<%@ page import="org.hibernate.cfg.Configuration" %>
<%@ page import="org.hibernate.query.Query" %>
<%@ page import="com.java.register.programme" %>
<%@ page import="com.java.Dao.factoryprv" %>
<%@ page import="com.java.Dao.coursefactory" %>
<%@ page import="com.java.register.courses" %>

	
     
<%@include file="Header.jsp" %> 

 <%
	 		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // Http 1.1
	 		
	 		response.setHeader("Progma", "no-cache"); //Http 1.0
	 		
	 		response.setHeader("Exprires", "0"); // proxies
	 
     		if(session.getAttribute("name")==null){
     			
     			response.sendRedirect("Login.jsp");
     			
     		}
      %>
<div class="row bg-light mx-0 " >
    <div class="col-lg-10  mx-auto p-3 p-lg-5 align-self-center my-lg-5">
      <div class="p-3 bg-white w-75 mx-auto border">
        <h1 class="h4 text-center" style="font-weight: 500;">STUDENT REGISTERATION FORM</h1>
  <form name="" action="RegistrationForm.jsp" method="post" class="py-4" >
   <div class="input-group pb-4">

<select class="form-control" id="course" name="Course">
 		  	<option>Select</option>
        		<%
		            try {
		          factoryprv FactoryProvider9= new factoryprv();
				programme pq = new programme();
				Session spq = FactoryProvider9.getfactory().openSession();
				Transaction tx5 = spq.beginTransaction();
			//	Query q =sp.createQuery("from programme order by category");
			//	List<programme> programme = q.list();
				
				Query q5 =spq.createQuery("from programme");
				List<programme> course = q5.list();
				
				tx5.commit();
				
				for( programme l7 : course){%>
 		 	<option><%=l7.getProgramme_code() %></option>
 		   		<%}%>
 		   		 <% } catch (Exception e) {
			
				e.printStackTrace();
				
			} %>	
		  </select>
	<p class="text-center"><button type="submit" class="btn btn-warning  mt-3 px-lg-5">Select Programme</button> 
</div> 
</form>
        
        
        
        
        <form name="registeration" action="RegisterationServlet" method="post" class="py-4" >
          <div class="input-group pb-4">
		  <input type="text" name="firstname" placeholder= "Firstname" size="15" class="form-control"required /> 
          </div>
          <div class="input-group pb-4">
            <input type="text" name="lastname" placeholder="Lastname" size="15"class="form-control" required /> 
          </div>
		  
		  <div class="input-group pb-4">
		  <input type="text" name="fathername" placeholder= "Father's Name" size="15"class="form-control" required />  
          </div>
          <div class="input-group pb-4">
            <input type="text" name="mothername" placeholder="Mother's Name" size="15" class="form-control" required />  
          </div>
		  <div class="input-group pb-4">
		  <input type="text" name="city" placeholder= "City" size="15"  class="form-control" required />  
          </div>
          <div class="input-group pb-4">
            <input type="text" name="state" placeholder="State" size="15" class="form-control" required /> 
          </div>
		  <div class="input-group pb-4"> 
<input type="text" name="country" placeholder= " Country" size="15"  class="form-control"required />   
</div>
<div class="input-group pb-4">
  
<input type="text" name="pin" placeholder= " Pin Code"  maxlength="6" class="form-control" required/>
</div>
<div class="input-group pb-4">
     <input type="date" name="myDate" id="myDate" placeholder="Date of Birth" class="form-control" required>
 
 </div> 
 <div > 
<label>   
Gender :  
</label><br>
<input type="radio" value="Male" name="gender" > Male 
<input type="radio" value="Female" name="gender" >Female   
<input type="radio" value="Other" name="gender" >Other   
  
</div>
     
 <div >
<label>   
Category :  
</label><br> 
<input type="radio" value=" General" name="category">  General  
<input type="radio" value="SC" name="category"> SC
<input type="radio" value="ST" name="category">ST
<input type="radio" value="OBS" name="category"> OBC
</div> 
<%			String course = request.getParameter("Course");
			int Semester=1;
			String Type= "Compulsary";
			String TYPE= "Optional";
			coursefactory cf=new coursefactory();
			courses c=new courses();
			Session cs = cf.getfactory().openSession();
			Transaction Tx = cs.beginTransaction();
			Query qc =cs.createQuery("from courses where Programme_code= :course And Semester= :Semester And Type= :Type");
			qc.setParameter("course", course);
			qc.setParameter("Semester", Semester);
			qc.setParameter("Type", Type);
			List<courses> co =qc.list(); 
			Query qo =cs.createQuery("from courses where Programme_code= :course And Semester= :Semester And TYPE= :TYPE");
			qo.setParameter("course", course);
			qo.setParameter("Semester", Semester);
			qo.setParameter("TYPE", TYPE);
			List<courses> wo =qo.list(); 
			Tx.commit();
			%>
			<label>   
Programme :  
</label><select class="form-control" name="programme"/><option><%=course %></option></select>
<div class="input-group pb-4">
<label class="course">   
Subjects :  
</label>   

    <div >            
  <table class="table table-bordered">
    <thead>
        <th>Compulsory</th>
    </thead>
    <tbody>
      <tr>
      <%for (courses cd :co){ %>
        <td><%=cd.getCourse_Name() %></td>
        <%} %>  
      </tr>
    </tbody>
  </table>
   <table class="table table-bordered">
    <thead>
      <tr>
        <th>Optional</th>        
      </tr>
    </thead>
    <tbody>
      <tr>
      <td class="select">
      <select class="form-control" name="optional">        
      <%for (courses ad :wo){ %>
       <option><%=ad.getCourse_Name() %></option>
        <%} %>       
        </select>
          </td>
      </tr>
    </tbody>
  </table>
</div>

</div> 
     
   <div class="input-group pb-4">      
<input type="text" name="countrycode" placeholder="Country Code"  class="form-control" value="+91" size="2" style="width:10%;" /> 
<input type="text" name="phone" placeholder="phone no." size="10" class="form-control" style="width:90%;" required/>   
</div>

 <div class="input-group pb-4">
 <input type="text" placeholder="Enter Email" name="email" class="form-control" required />
 </div>
<div class="input-group pb-4">  
<input type="text" name="religion" placeholder="Religion" size="15" class="form-control" required />   
 </div>
		  
		  <p class="text-center"><button type="submit" class="btn btn-warning  mt-3 px-lg-5">Register</button>    
		<button type="submit" class="btn btn-secondary  mt-3 px-lg-5">Cancel</button> </p>
        </form>
      </div> 
    </div>
  </div>




 <%@include file="Footer.jsp" %>