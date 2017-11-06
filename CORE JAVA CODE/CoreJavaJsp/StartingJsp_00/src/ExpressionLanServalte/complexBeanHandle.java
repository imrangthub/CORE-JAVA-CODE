package ExpressionLanServalte;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ComplesBeansExpLan.Address;
import ComplesBeansExpLan.Person;
import ComplesBeansExpLan.PhoneNumber;

/**
 * Servlet implementation class complexBeanHandle
 */
@WebServlet("/complexBeanHandle")
public class complexBeanHandle extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		Person p = new Person();
		p.setName("MD IMRAN HOSSAIN");
		p.setAge(26);
		
		Address a = new Address();
		a.setLine1("Address line 01");
		a.setTown("Dhaka");
		a.setCountry("Bangladesh");
		a.setPostcode("8040");
		
		ArrayList al = new ArrayList();
		
		PhoneNumber ph = new PhoneNumber();
		ph.setStd("+88");
		ph.setNumber("01916894486");
		
		al.add(ph);
		
		a.setPhoneNumber(al);
		
		p.setAddress(a);
		
		
		
		

		request.setAttribute("person", p);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("ExpressionLanguageOfJsp/complexBean.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
