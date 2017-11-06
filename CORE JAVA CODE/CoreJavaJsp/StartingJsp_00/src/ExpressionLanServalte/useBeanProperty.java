package ExpressionLanServalte;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ExpressionLanBean.Company;
import ExpressionLanBean.Name;
import ExpressionLanBean.employeeCls;



/**
 * Servlet implementation class useBeanProperty
 */
@WebServlet("/useBeanProperty")
public class useBeanProperty extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Name nameObj = new Name("MD IMARN HOSSAIN");
		Company companyObj = new Company("dIT","Business");
		
		employeeCls employeeObj = new employeeCls(nameObj, companyObj);
		
		request.setAttribute("Emp", employeeObj);

		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ExpressionLanguageOfJsp/accessBeanProperty.jsp");
		dispatcher.forward(request, response);
		
	}

}
