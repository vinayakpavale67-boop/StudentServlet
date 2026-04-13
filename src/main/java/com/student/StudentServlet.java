package com.student;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws IOException {

	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    // Get form data
	    String prn = request.getParameter("prn");
	    String name = request.getParameter("name");
	    String dob = request.getParameter("dob");
	    String gender = request.getParameter("gender");
	    String[] subjects = request.getParameterValues("subjects");

	    out.println("<html><body>");

	    out.println("<h2 style='color:green;'>Form Submitted Successfully!</h2>");

	    out.println("<h3>Student Information</h3>");

	    out.println("<b>PRN No:</b> " + prn + "<br><br>");
	    out.println("<b>Name:</b> " + name + "<br><br>");
	    out.println("<b>DOB:</b> " + dob + "<br><br>");
	    out.println("<b>Gender:</b> " + gender + "<br><br>");

	    out.println("<b>Subjects:</b><br>");
	    
	    if (subjects != null) {
	        for (String sub : subjects) {
	            out.println(sub + "<br>");
	        }
	    } else {
	        out.println("No subjects selected");
	    }

	    out.println("</body></html>");
	}
}