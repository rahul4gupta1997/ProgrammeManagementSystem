
<%@include file="Header.jsp" %>

<div class="row bg-light mx-0 " >
    <div class="col-lg-5  mx-auto p-3 p-lg-5 align-self-center my-lg-5">
      <div class="p-3 bg-white w-75 mx-auto border">
        <h1 class="h4 text-center" style="font-weight: 500;">Student / Faculty Portal</h1>
        <form name="register" action="LoginServlet" method="post" onsubmit="" class="py-4" >
          <div class="input-group pb-4">
            <input type="text" class="form-control" name="Username" placeholder="User Name" required >
          </div>
          <div class="input-group pb-4">
            <input type="password" class="form-control" name="Password" placeholder="Enter password" required  />
          </div>
          <div class="form-group h5 ">
            <div class=""><label class="form-check-label">
              <input type="reset" value="Reset" class="btn btn-small p-0"/>
            </label> <a href="ForgetPassword.jsp" class="float-end" >Forgot Password?</a></div>
          </div>
          <button type="submit"  name="submit" value="submit" class="btn btn-warning btn-block mt-3 px-lg-5">Login</button>
        </form>
      </div> 

      <p class="border-top border-bottom w-75 mx-auto mt-3 py-2">Don&apos;t have an account? <a class="font-weight-bold" href="Signup.jsp">Sign Up</a></p>
    </div>
  </div>
	
 
 <%@include file="Footer.jsp" %>