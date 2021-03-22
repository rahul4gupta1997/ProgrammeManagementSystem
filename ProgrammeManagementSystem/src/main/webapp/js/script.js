function matchpassword(){
		      var username = document.register.Username.value;
		      var psd = document.register.Password.value;
		      var psd2 = document.register.check.value;

    		  if (username==null || username==""){  
     				 alert("Name can't be blank");  
     				 return false;  
   			     }
    		  else if(psd.length<6){  
   				       alert("Password must be at least 6 characters long.");  
     			       return false;  
        			  }
    		  else if(psd != psd2){
         			   alert("Password didn't match");
        			   return false;
      				   }
          }
function match(){
    var psd = document.email.Password.value;
    var psd2 = document.email.check.value;

if(psd.length<6){  
       alert("Password must be at least 6 characters long.");  
     return false;  
	  }
else if(psd != psd2){
	   alert("Password didn't match");
	   return false;
	   }
}
$(document).ready(function(){
	  // Initialize Tooltip
	$('#dataTables,#dataUg,#dataUgd').DataTable();
	
	  $('[data-toggle="tooltip"]').tooltip(); 
	  
	  // Add smooth scrolling to all links in navbar + footer link
	  $(".navbar a, footer a[href='#myPage']").on('click', function(event) {

	    // Make sure this.hash has a value before overriding default behavior
	    if (this.hash !== "") {

	      // Prevent default anchor click behavior
	      event.preventDefault();
	      // Store hash
	      var hash = this.hash;
	      // Using jQuery's animate() method to add smooth page scroll
	      // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area
	      $('html, body').animate({
	        scrollTop: $(hash).offset().top
	      }, 900, function(){
	   
	        // Add hash (#) to URL when done scrolling (default click behavior)
	        window.location.hash = hash;
	      });
	    } // End if
	  });

    
});


function myFunction() {var x = document.getElementById('course').value; return x;}


