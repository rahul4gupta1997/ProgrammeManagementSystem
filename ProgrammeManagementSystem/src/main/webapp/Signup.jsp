<%@include file="Header.jsp" %>
<div class="row bg-light mx-0 " >
    <div class="col-lg-5  mx-auto p-3 p-lg-5 align-self-center my-lg-5">
      <div class="p-3 bg-white w-75 mx-auto border text-center">
        <h1 class="h4 text-center" style="font-weight: 500;">Signup</h1>
         <form name="register" action="signupServlet" method="post" onsubmit="return matchpassword();" class="py-4" >
          <div class="input-group pb-4">
             <input type="text" class="form-control" name="Username"  placeholder="Enter your Username" required />
          </div>
          <div class="input-group pb-4">
            <input type="text" class="form-control" name="Email" placeholder="Enter your Email" required/>
          </div>
          <div class="input-group pb-4">
            <input type="password" class="form-control" name="Password" placeholder="Enter your password" required/>
          </div>
          <div class="input-group pb-4">
           <input type="password" class="form-control" name="check" placeholder="Re-enter your password" required/>
          </div>
          <p class="pt-2">
        <input type="submit" value="Submit" class="btn btn-warning">
  	 <input type="reset" value="Reset" class="btn btn-secondary"></p>
    
    </form>
      </div> 

      
    </div>
  </div>
  
  <%@include file="Footer.jsp" %>