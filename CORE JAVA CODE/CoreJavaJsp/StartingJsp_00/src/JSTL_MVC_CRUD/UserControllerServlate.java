package JSTL_MVC_CRUD;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserControllerServlate
 */
@WebServlet("/UserControllerServlate")
public class UserControllerServlate extends HttpServlet {
	
	
	private static String LIST_USER="/JSTL_Example/JSTL_CRUD_MVC/listUser.jsp";
	private static String INSERT_OR_EDIT = "/JSTL_Example/JSTL_CRUD_MVC/create.jsp"; 
	private UserDaoCls dao;
	
	
	
	
    public UserControllerServlate() {
        super();
        dao = new UserDaoCls();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String forward="";
		String action = request.getParameter("action");
		
		// System.out.println(action);
		
		if(action.equalsIgnoreCase("listOfUser")){
			
		  request.setAttribute("userList", dao.getAllUser());
		  forward = LIST_USER;
		  
		}else if(action.equalsIgnoreCase("addUser")){
			forward = INSERT_OR_EDIT;
			
		}else if(action.equalsIgnoreCase("edit")){
			String UserId = request.getParameter("userId");
			UserModel userModObj = dao.getUserById(UserId);
		     //	System.out.println(userModObj);
			request.setAttribute("userById", userModObj);
			forward = INSERT_OR_EDIT;
		}else if(action.equalsIgnoreCase("delete")){
			
			String delatedId = request.getParameter("userId");
			  dao.deleteUser(delatedId); 
			 
			  request.setAttribute("userList", dao.getAllUser());
			  response.sendRedirect("/StartingJsp_00/JSTL_Example/JSTL_CRUD_MVC/index.jsp");
			  return;
		}
		
		
		
		
		RequestDispatcher view = request.getRequestDispatcher(forward);
		                  view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserModel userModelObj = new UserModel();
		 
		userModelObj.setUserName(request.getParameter("userName"));
		userModelObj.setEmail(request.getParameter("userEmail"));
		userModelObj.setPassword(request.getParameter("userPassword"));
		
		dao.checkUser(userModelObj);
		response.sendRedirect("/StartingJsp_00/JSTL_Example/JSTL_CRUD_MVC/index.jsp");
		
	}

}
