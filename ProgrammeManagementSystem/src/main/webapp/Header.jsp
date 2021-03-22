<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>A.P.J ABDUL KALAM UNIVERSITY</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
   <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet" type="text/css"> 
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet" type="text/css">
   <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/jquery.dataTables.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script src="jquery.bxslider.js"></script>
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
  	<script
  src="https://code.jquery.com/jquery-3.6.0.js"
  integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
  crossorigin="anonymous"></script>
  <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.24/js/jquery.dataTables.js"></script>
  <link rel="stylesheet" href="css/style.css">
    <script type="text/javascript" src="js/script.js"></script>
</head>
<body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="50">
<div class=""><ul class="nav navbar-nav navbar-right">
					
</ul></div>
<nav class="navbar navbar-expand-xl fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="fa fa-align-justify display-4"></span>                      
      </button>
      <a class="navbar-brand" href="#myPage"><img src="images/logo.png" alt="logo"/></a>
      
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right ">
        <li class="nav-item"><a href="index.jsp">HOME</a></li>
        <li class="nav-item"><a href="#about">ABOUT</a></li>
        <li class="nav-item"><a href="Programme.jsp">COURSE</a></li>	
        <li class="nav-item"><a href="Contact.jsp">CONTACT</a></li>
        
       
					 <li class="nav-item dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">MORE</a>
         <div class="dropdown-menu">
            <a class="dropdown-item" href="RegistrationForm.jsp">Admission</a>
            <a class="dropdown-item" href="Programme.jsp">Syllabus</a>
            <a class="dropdown-item" href="#">Faculties</a> 
            <a class="dropdown-item" href="#"> Academics</a> 
           </div>
        </li>
        <li>
       <form class="d-flex search pt-2">
       		 <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
       		 <button class="btn btn-secondary" type="submit"><i class="fa fa-search" ></i></button>
       </form></li>
       <% if(session.getAttribute("name") == null){ %> 	
				<li><a href="Signup.jsp"> Sign Up</a></li>
                    <li><a href="Login.jsp">Login</a>                      
                    </li>
                     <% } else { %> 
                      <li><a href="#" data-toggle="dropdown" class="dropdown-toggle"><h6><span class="glyphicon glyphicon-user"></span></h6></a>
                        <ul class="dropdown-menu">
                               <li class="dropdown-item me-1 pt-2 text-center"> <button type="button" class="btn btn-info btn-sm" data-toggle="modal" data-target="#myModal">User Profile</button>
                               </li>
                               <li>
                                 <a class="dropdown-item nav-link" href="ChangePassword.jsp">Change Password</a>
                               </li>
                         <form action="logoutServlet" method="post" >
                               <li class="dropdown-item nav-link me-3 pt-2">
                                 <input type="submit" class="dropdown-item" value=logout >
                               </li>
                           </form>
                        </ul>
                         </li>
              <% } %>
            	
           </ul>
    </div>
  </div>
</nav>

