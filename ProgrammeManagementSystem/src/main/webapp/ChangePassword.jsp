   <%
	 		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // Http 1.1
	 		
	 		response.setHeader("Progma", "no-cache"); //Http 1.0
	 		
	 		response.setHeader("Exprires", "0"); // proxies
	 
     		if(session.getAttribute("name")==null){
     			
     			response.sendRedirect("Login.jsp");
     			
     		}
      %>
  <%@include file="Header.jsp" %>
  <div class="row bg-light mx-0 " >
    <div class="col-lg-5  mx-auto p-3 p-lg-5 align-self-center my-lg-5">
      <div class="p-3 bg-white w-75 mx-auto border text-center">
        <h1 class="h4 text-center" style="font-weight: 500;">Change Password</h1>
         <form name="email" action="matchPassword" method="post" class="py-4" onsubmit="return match();" >
          <div class="input-group pb-4">
             <input type="text" class="form-control" name="id"  placeholder="ID" required />
          </div>
          <div class="input-group pb-4">
            <input type="email" class="form-control" name="email" placeholder="Enter your mail id" required/>
          </div>
          <div class="input-group pb-4">
            <input type="Current_password" class="form-control" placeholder="Enter your current password" name="Current_Password" required/>
          </div>
          <div class="input-group pb-4">
           <input type="password" class="form-control" name="Password" placeholder="Enter your New password" required/>
          </div>
          <div class="input-group pb-4">
           <input type="password" class="form-control" name="check" placeholder="Re-enter your New password" required/>
          </div>
          <p class="pt-2"><input type="submit" value="Submit" class="btn btn-warning">
   	<input type="reset" value="Reset" class="btn btn-secondary"></p>
        </form>
      </div> 

      
    </div>
  </div>
     
 <%@include file="Footer.jsp" %>