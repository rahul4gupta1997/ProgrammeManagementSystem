

<%@ page import="java.util.List"%>
<%@ page import="org.hibernate.Session" %> 
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.hibernate.Transaction"  %>
<%@ page import="org.hibernate.cfg.Configuration" %>
<%@ page import="org.hibernate.query.Query" %>
<%@ page import="com.java.register.programme" %>
<%@ page import="com.java.Dao.factoryprv" %>


	 <%
	 		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // Http 1.1
	 		
	 		response.setHeader("Progma", "no-cache"); //Http 1.0
	 		
	 		response.setHeader("Exprires", "0"); // proxies
	 
     		if(session.getAttribute("name")==null){
     			
     			response.sendRedirect("Login.jsp");
     			
     		}
      %>
     
<%@include file="Header.jsp" %>

<!-- Container (TOUR Section) -->
<div id="course" class="bg-light">
  <div class="container">
    <h3 class="text-center">COURSES</h3>
    <p class="text-center"> We have Many Course Like Under Graduation and Post Graduation </p>
     <p class="text-center"> We have Many Fields: </p>
     <ul class="list-group">
  <li class="list-group-item d-flex justify-content-between align-items-center list-group-item-action mb-0">
    Commerce
    <span class="badge bg-primary rounded-pill">14</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center list-group-item-action mb-0">
    Arts
    <span class="badge bg-primary rounded-pill">2</span>
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center list-group-item-action mb-0">
    Technical
    <span class="badge bg-primary rounded-pill">1</span>
  </li>
</ul>
     
     
    <ul class="list-group d-none">
      <li class="list-group-item list-group-item-action">Commerce  </li>
      <li class="list-group-item">Arts   </li> 
      <li class="list-group-item">  </li> 
    </ul><br>
      <p class="text-center">STATUTORY OFFICERS:-</p>
        <ul class="list-group">
  <li class="list-group-item d-flex justify-content-between align-items-center mb-0">
    Vice-Chancellor : Dr. Rita Khanna
  </li>
  <li class="list-group-item d-flex justify-content-between align-items-center mb-0">
    Registrar : Dr. krishna yadav 
  </li>
</ul>
      
    </div>
  </div>
  
 <div class="container">         
 <div class="grid4" style="text-align:center;">
           <h5 style="color:black"><b><u>SCHEDULE OF DATES FOR ADMISSION (WITH OR WITHOUT LATE FEE)</u></b>
          </h5>
      </div>
      <div class="grid5" style="padding-right:100px">
              <p>
                Schedule of Dates for Admission will be observed as under :
              </p>
            <p style="color:black"><b>(1)For U.G. Diploma: courses</b></p>
        
          <table class="table table-stripe">
                      <thead class="bg-secondary text-white">
                        <tr>
                          <th scope="col">S.No.</th>
                          <th scope="col">Particulars</th>
                          <th scope="col">Dates</th>
                        </tr>
                      </thead>
                      <tbody>
                            <tr>
                              <th scope="row">1</th>
                              <td>Normal admission in the courses without late fee</td>
                              <td>17.08.2020 to 10.09.2020</td>
                            
                            </tr>
                            <tr>
                              <th scope="row">2</th>
                              <td>Admission with late fee of Rs.500/-</td>
                              <td>11.09.2020 to 17.09.2020</td>
                            
                            </tr>
                            <tr>
                              <th scope="row">3</th>
                              <td>Admission with late fee of Rs.1000/-</td>
                              <td>18.09.2020 to 30.09.2020</td>
                            </tr>
                      </tbody>
            </table>
                    <p style="color:black"><b>
            (2)	For P.G. Diploma: </b></p>
              <table class="table table-stripe">
                      <thead class="bg-secondary text-white">
                            <tr>
                              <th scope="col">S.No.</th>
                              <th scope="col">Particulars</th>
                              <th scope="col">Dates</th>
                            </tr>
                      </thead>
                      <tbody>
                            <tr>
                                <th scope="row">1</th>
                                <td>Normal admission in the courses without late fee</td>
                                <td>17.08.2020 to 10.09.2020</td>
                            </tr>
                            <tr>
                              <th scope="row">2</th>
                              <td>Admission with late fee of Rs.500/-</td>
                              <td>11.09.2020 to 17.09.2020</td>
                            </tr>
                            <tr>
                              <th scope="row">3</th>
                              <td>Admission with late fee of Rs.1000/-
                              </td>
                              <td>18.09.2020 to 30.09.2020</td>
                            </tr>
                        </tbody>
              </table>
        </div>
</div>
<!-- Post graduates courses -->
        <br/>
          <h3 class="text-center"><b>COURSES OFFERED AND ELIGIBILITY FOR ADMISSION </b></h3>
       	<div class="col-sm-12">
       	
       	<h4 class="bg-light text-dark text-center p-2 rounded" style="font-size:22px;">All the Available Post-Graduation Programmes are :-</h4>
       	
      
        <table class="table table-course" id="dataTables">
                    <thead class="bg-secondary text-white">
                        <tr>
                            <th scope="col" style="width:152px;">Programme Code</th>
                            <th scope="col">Name of Programme</th>
                            <th scope="col">Duration</th>
                             <th scope="col">course_fees</th>
                  			<th scope="col">Eligibility <i id="example" class="fa fa-info-circle text-white-50 ms-2" data-toggle="tooltip" title="(Passed one of the following examinations from this University/ Board of School Education, Haryana or any other recognized University)"></i>
                            </th> 
                          </tr>
                      </thead>
                    <tbody>
                  
            <% 
             try {
            factoryprv FactoryProvider = new factoryprv();
			
			String PG = "P.G.";
			programme p11 = new programme();
			Session sp = FactoryProvider.getfactory().openSession();
			Transaction tx2 = sp.beginTransaction();
		//	Query q =sp.createQuery("from programme order by category");
		//	List<programme> programme = q.list();
			
			Query q1 =sp.createQuery("from programme where Category= :PostGraduate");
			q1.setParameter("PostGraduate",PG);
			List<programme> POGR = q1.list();
			
			tx2.commit();
			
			for( programme l1 : POGR){%>
                          		
                           <tr>
                              <th scope="row"><%=l1.getProgramme_code() %></th>
                              <td><%=l1.getProgramme_name() %></td>
                           	  <td><%=l1.getMinimum_duration() %></td>
                              <td><%=l1.getCourse_Fee_Discription() %></td>
                              <td><%=l1.getEligiblity() %></td> 
                              
                          </tr>
     			 <%}%>
		 <% } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} %>
                          
                    </tbody>
         </table>
      </div>

   <br/>
   <!-- under Graduates programs -->
  	<div class="col-sm-12">
		      	
		      	<h4 class="bg-light text-dark text-center p-2 rounded" style="font-size:22px;">All the Available Under-Graduation Programmes are :-</h4>
		      	
		     
		       <table class="table table-course" id="dataUg">
		                   <thead class="bg-secondary text-white">
		                       <tr>
		                           <th scope="col" style="width:156px;">Programme Code</th>
		                           <th scope="col">Name of Programme</th>
		                           <th scope="col">Duration</th>
		                            <th scope="col">course_fees</th>
		                 			<th scope="col">Eligibility <i id="example" class="fa fa-info-circle text-white-50 ms-2" data-toggle="tooltip" title="(Passed one of the following examinations from this University/ Board of School Education, Haryana or any other recognized University)"></i>
                            </th>
		                         </tr>
		                     </thead>
		                   <tbody>
		                 
		        <% 
		        try {
		        factoryprv FactoryProvider3 = new factoryprv();
				
				String UGDP = "U.G.";
		        factoryprv FactoryProvider2 = new factoryprv();
				programme p11 = new programme();
				Session spdp = FactoryProvider2.getfactory().openSession();
				Transaction tx2ud = spdp.beginTransaction();
		
				Query q2 =spdp.createQuery("from programme where Category= :PostGraduate");
				q2.setParameter("PostGraduate",UGDP);
				List<programme> UGDPL = q2.list();
				
				tx2ud.commit();
				
				for( programme l2 : UGDPL){%>
		                         		
		                          <tr>
		                             <th scope="row"><%=l2.getProgramme_code() %></th>
		                             <td><%=l2.getProgramme_name() %></td>
		                          	  <td><%=l2.getMinimum_duration() %></td>
		                             <td><%=l2.getCourse_Fee_Discription() %></td>
		                             <td><%=l2.getEligiblity() %></td> 
		                             
		                         </tr>
		    			 <%}%>
			 <% } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} %>
		                         
		                   </tbody>
		        </table>
		     
		      	
		      	<h4 class="bg-light text-dark text-center p-2 rounded" style="font-size:22px;">All the Available Under-Graduation diploma Programmes are :-</h4>
		      	
		     
		       <table class="table table-course" id="dataUgd">
		                   <thead class="bg-secondary text-white">
		                       <tr>
		                           <th scope="col" style="width:156px;">Programme Code</th>
		                           <th scope="col">Name of Programme</th>
		                           <th scope="col">Duration</th>
		                            <th scope="col">course_fees</th>
		                 			<th scope="col">Eligibility <i id="example" class="fa fa-info-circle text-white-50 ms-2" data-toggle="tooltip" title="(Passed one of the following examinations from this University/ Board of School Education, Haryana or any other recognized University)"></i>
                            </th> 
		                         </tr>
		                     </thead>
		                   <tbody>
		                 
		           <% 
		            try {
		          
				programme UGDiploma = new programme();
				
				String PGdiploma = "PG Diploma";
		           factoryprv FactoryProvider4 = new factoryprv();
				programme p13 = new programme();
				Session spdup3 = FactoryProvider4.getfactory().openSession();
				Transaction tx2P = spdup3.beginTransaction();
			
				Query q3 =spdup3.createQuery("from programme where Category= :PGDiploma");
				q3.setParameter("PGDiploma",PGdiploma);
				List<programme> PGDiploma = q3.list();
				
				tx2P.commit();
				
				for( programme l6 : PGDiploma){%>
		                         		
		                          <tr>
		                             <th scope="row"><%=l6.getProgramme_code() %></th>
		                             <td><%=l6.getProgramme_name() %></td>
		                          	  <td><%=l6.getMinimum_duration() %></td>
		                             <td><%=l6.getCourse_Fee_Discription() %></td>
		                             <td><%=l6.getEligiblity() %></td> 
		                             
		                         </tr>
		    			 <%}%>
			 <% } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} %>
		                         
		                   </tbody>
		        </table>
   	<div class="col-sm-12">
		      	
		      	<h4 class="bg-light text-dark text-center p-2 rounded" style="font-size:22px;">All the Available Post-Graduation Diploma Programmes are :-</h4>
		      	
		     
		       <table class="table table-course" id="dataTables">
		                   <thead class="bg-secondary text-white">
		                       <tr>
		                           <th scope="col" style="width:156px;">Programme Code</th>
		                           <th scope="col">Name of Programme</th>
		                           <th scope="col">Duration</th>
		                            <th scope="col">course_fees</th>
		                 			<th scope="col">Eligibility <i id="example" class="fa fa-info-circle text-white-50 ms-2" data-toggle="tooltip" title="(Passed one of the following examinations from this University/ Board of School Education, Haryana or any other recognized University)"></i>
                            </th>
		                     </thead>
		                   <tbody>
		                 
		           <% 
		            try {
		           
				
				String PG = "PG Diploma";
		           factoryprv FactoryProvider1 = new factoryprv();
				programme p114 = new programme();
				Session sp4 = FactoryProvider1.getfactory().openSession();
				Transaction tx2 = sp4.beginTransaction();
			//	Query q =sp.createQuery("from programme order by category");
			//	List<programme> programme = q.list();
				
				Query q4 =sp4.createQuery("from programme where Category= :PostGraduate");
				q4.setParameter("PostGraduate",PG);
				List<programme> POGR = q4.list();
				
				tx2.commit();
				
				for( programme l1 : POGR){%>
		                         		
		                          <tr>
		                             <th scope="row"><%=l1.getProgramme_code() %></th>
		                             <td><%=l1.getProgramme_name() %></td>
		                          	  <td><%=l1.getMinimum_duration() %></td>
		                             <td><%=l1.getCourse_Fee_Discription() %></td>
		                             <td><%=l1.getEligiblity() %></td> 
		                             
		                         </tr>
		    			 <%}%>
			 <% } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} %>
		                         
		                   </tbody>
		        </table>
		     <!--courses  -->
<div class="row bg-light mx-0 " >
   <div class="col-lg-5  mx-auto p-3 p-lg-5 align-self-center my-lg-5">
      <div class="p-3 bg-white w-75 mx-auto border">
      <p>Search courses</p>
      <form name="register" action="CourseServlet" method="post" onsubmit="" class="py-4" >
      <label for="sel1">Select list:</label>
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
       	<button type="submit"  name="submit" value="submit" class="btn btn-warning btn-block mt-3 px-lg-5">check</button>
       	</form>
       	<</div>
	</div>
</div>
       		
  

 <%@include file="Footer.jsp" %>