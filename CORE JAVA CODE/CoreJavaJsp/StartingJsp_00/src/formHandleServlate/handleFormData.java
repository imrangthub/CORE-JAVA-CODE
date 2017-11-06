package formHandleServlate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class handleFormData
 */
@WebServlet("/handleFormData")
public class handleFormData extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get form servalte");
		
        response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Using servlate</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h4>User name: "+ request.getParameter("userName")+"</h4>");
		
		out.println("<h4>Password: "+request.getParameter("password")+"</h4>");
		
	
		out.println("</body>");		
		out.println("</html>");
		
		out.close();
	}

}
