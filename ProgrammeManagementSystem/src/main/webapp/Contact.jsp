
<%@include file="Header.jsp" %>
    
<!-- Container (Contact Section) -->
<div id="contact" class="container">
 	 <h3 class="text-center">Contact Us</h3>
  	

 	 <div class="row">
 	 <div class="col-lg-4 align-self-center">
 	 <div class="d-flex">
 	 <div class="pt-3 me-1"><span class="glyphicon glyphicon-map-marker "></span></div>
 	 <div><p>Our Head-Quarter is 155, A.P.J Abdul Kalam University, Rajghat.<br/>Delhi, India</p>
	     	  </div></div>
	     	 <p><span class="glyphicon glyphicon-phone me-1"></span>+91 9540503968</p>
	     	 <p><span class="glyphicon glyphicon-envelope me-1"></span>mail@mail.com</p>
 	
 	 </div>
    <div class="col-lg-8">
    <p class="text-center"><em>We love our Students, In case of any Query, any doubts or any problem. Please contact us</em></p>
      <div class="row">
	        <div class="col-sm-6 form-group">
	          <input class="form-control" id="name" name="name" placeholder="Name" type="text" required>
	        </div>
	        <div class="col-sm-6 form-group">
	          <input class="form-control" id="email" name="email" placeholder="Email" type="email" required>
	        </div>
      </div>
      <textarea class="form-control" id="comments" name="comments" placeholder="Comment" rows="5"></textarea>
     	 <br/>
	       <div class="row">
	        <div class="col-md-12 form-group">
	          	<button class="btn btn-success px-5" type="submit">Send</button>
	        </div>
        <br/>    
	      
     
      </div>
    </div>
  </div>
</div>
 <%@include file="Footer.jsp" %>