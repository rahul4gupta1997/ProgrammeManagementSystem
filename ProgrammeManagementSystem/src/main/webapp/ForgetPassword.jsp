
<%@include file="Header.jsp" %>
     
     <div class="row bg-light mx-0 " style="min-height:87vh;">
    <div class="col-lg-5  mx-auto p-3 p-lg-5 align-self-center my-lg-5">
      <div class="p-3 bg-white w-75 mx-auto border">
        <h1 class="h4 text-center" style="font-weight: 500;">Student / Faculty Portal</h1>
       <form name="forget" action="ForgetServlet" method="post" class="py-4" >
          <div class="input-group pb-4">
          <input type="text" class="form-control" name="Username" placeholder="User Name" required/>
          </div>
          <div class="input-group pb-4">
           <input type="email" class="form-control" name="Email" placeholder="Enter your registered mail id" required/>
          </div>
          <input type="submit" value="Reset Password" class="btn btn-warning btn-block mt-3 px-lg-5">
          </form>
      </div> 

     
    </div>
  </div>
     
   
 <%@include file="Footer.jsp" %>