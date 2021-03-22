package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.java.Dao.coursefactory;
import com.java.register.courses;


public class CourseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CourseServlet() {
        super();
        
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();

			String course = request.getParameter("Course");
			System.out.println(course);
			
			coursefactory cf=new coursefactory();
			courses c=new courses();
			Session cs = cf.getfactory().openSession();
			Transaction Tx = cs.beginTransaction();
			Query qc =cs.createQuery("from courses where Programme_code= :course");
			qc.setParameter("course", course);
			List<courses> co =qc.list();
			
			Tx.commit();
			
			out.println("<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'>");
			out.println("<html lang='en'>");
			out.println("<head>");
			out.println("<title>A.P.J ABDUL KALAM UNIVERSITY</title>");
			out.println("<meta charset='utf-8'>");
			out.println("<meta name='viewport' content='width=device-width, initial-scale=1'>");
			out.println(" <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1' crossorigin='anonymous'>");
			out.println(" <link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css'>");
			out.println(" <link href='https://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>");
			out.println("<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>");
			out.println("  <script src='https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js'></script> ");
			out.println(" <script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js'></script>");
			out.println("<script src='jquery.bxslider.js'></script>");
			out.println("<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js' integrity='sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW' crossorigin='anonymous'></script>");
			out.println("<link rel='stylesheet' href='css/style.css'>");
			out.println("</head>");
			out.println("<body>");
			
			out.println("<div class='container'>");
			out.println("<h1 text-center text-Blue>A. P. J Abdul Kalam university</h1>");
			out.println(" <table class='table table-striped'>");
			out.println("<thead>");
			out.println("<tr>");
			out.println(" <th>Course Code</th>");
			out.println(" <th>Course Name</th>");
			out.println("<th>Credits</th>");
			out.println("<th>Type</th>");
			out.println("<th>Semester</th>");
			
			out.println(" </thead>");
			out.println(" <tbody>");
			
			for (courses cd :co){
				out.println("<tr>");
				out.println("<td>");
				out.println(cd.getCourseCode());
				out.println("</td>");
				out.println("<td>");
				out.println(cd.getCourse_Name());
				out.println("</td>");
				out.println("<td>");
				out.println(cd.getCredits());
				out.println("</td>");
				out.println("<td>");
				out.println(cd.getType());
				out.println("</td>");
				out.println("<td>");
				out.println(cd.getSemester());
				out.println("</td>");
				out.println("</tr>");
			}
			out.println(" </tbody>");
			out.println("</table>");
			
			out.println("</div>");
			out.println("<div class='container'>");
			
			out.println("<p>Theory and Practical Counselling Sessions : (75% attendance in practical sessions is compulsory)</p>");
			out.println("<p>The details of the theory and practical counselling sessions are given below.</p>");
			out.println("<p>Theory Sessions</p>");
			out.println("<p>In distance education, face-to-face contact between the learners and their tutors/counsellors is relatively less. The purpose of such a contact is to answer some of your questions and clarify your doubts that may not be possible through any other means of communication. It also provides you with an opportunity to meet your fellow students.</p>");
			out.println("There are academic counsellors at the Study Centres to provide counselling and guidance to you in the courses that you have chosen for study. Normally, these sessions will be held at the study centres on Saturdays and Sundays.");
			out.println("You should note that the counselling sessions would be very different from the classroom teaching or lectures. Counsellors will not be delivering lectures as in conventional teaching. They will try to help you to overcome difficulties that you face while studying for the MCA programme. In these sessions, you must try to resolve your subject-based difficulties and any other related problems.</p>");
			out.println("<b>Practical Sessions and Compulsory Attendance</b>");
			out.println("<p>The practical sessions will be held in the computer centres / labs of the Study Centres. In these computer labs, the participants will have the facility to use the computer and software packages relevant to the syllabus. The following points regarding the practical attendance must be noted:</p>");
			out.println("<b>(i)   75% attendance is compulsory for each lab course.</b>");
			out.println("(ii)   This is a pre-requisite for taking the term-end practical examination in the respective lab courses.");
			out.println(" <table class='table table-striped'>");
			out.println("<thead>");
			out.println("<th>Courses</th>");
			out.println("<th>Session</th>");
			out.println("<th>Total Hrs</th>");
			out.println("</thead>");

			out.println("<tr>");
			out.println("<td>Theory Courses of 2 Credits.</td>");
			out.println("<td>3 sessions of 2 Hrs each.</td>");
			out.println("<td>6 Hrs.</td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>Theory Courses of 4 Credits</td>");
			out.println("<td>3 sessions of 2 Hrs each.</td>");
			out.println("<td>6 Hrs.<td>");
			out.println("</tr>");
			out.println("<tr>");
			out.println("<td>Practical Courses of 2 Credits");
			out.println("<td>20 practical sessions of 3 Hrs each.</td>");
			out.println("<td>61 Hrs.<td>");
			out.println("</tr>");
			out.println("</table>");
			out.println("<p>For more details Contact:</p>");
			out.println(" <p>Programme Coordinator</p>");
			out.println("<b>E-Mail ID: unversity@gmail.com</b>");
			out.println("<p><a href='index.jsp' >Go to homePage</a></p>");
			out.println("</div>");
			out.println("</body>");
			out.println("</html>");
			
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
