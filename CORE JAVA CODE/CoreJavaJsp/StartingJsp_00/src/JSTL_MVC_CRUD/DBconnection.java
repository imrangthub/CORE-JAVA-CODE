package JSTL_MVC_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
	static DBconnection dbConnectionObj=null;
	
	private DBconnection(){
		
	}
	public static synchronized DBconnection getInstance(){
		if(dbConnectionObj==null){
			dbConnectionObj=new DBconnection();
			return dbConnectionObj;
		}else
		return dbConnectionObj;
	}
	
	public Connection getConnection(){
		Connection conn=null;
		
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";
		final String DB_URL="jdbc:mysql://localhost:3306/studentsdb";
		final String USER="root";
		final String PASSWRD="admin";
		
		try {
			Class.forName(JDBC_DRIVER);
			conn=DriverManager.getConnection(DB_URL,USER,PASSWRD);
		
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	

}
