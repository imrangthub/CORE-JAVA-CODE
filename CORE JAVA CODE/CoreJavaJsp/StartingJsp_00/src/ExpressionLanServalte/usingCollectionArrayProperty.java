package ExpressionLanServalte;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class usingCollectionArrayProperty
 */
@WebServlet("/usingCollectionArrayProperty")
public class usingCollectionArrayProperty extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String[] nameArr = {"BaBu","Biddut","Misty"};
		
		List<String> cityList = new ArrayList<String>();		
		 cityList.add("Dhaka");
		 cityList.add("Shariatpur");
		 cityList.add("Damudya");
		
		Map<String, String> nickName = new HashMap<String, String>();
		 nickName.put("BaBu", "MD IMARAN HOSSAIN");
		 nickName.put("Biddut", "JUHORIL ISLAM BIDDUT");
		 nickName.put("Misty", "MOWFEYA HOSSAIN MISTY");
		 
		 request.setAttribute("name", nameArr );
		 request.setAttribute("city", cityList);
		 request.setAttribute("fullName", nickName);
		 
		 

		
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ExpressionLanguageOfJsp/usingCollectionArrayExpLan.jsp");
		dispatcher.forward(request, response);
	}

}
