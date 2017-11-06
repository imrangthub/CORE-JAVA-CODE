package JSTL_MVC_CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoCls {
	
	private Connection connection;
	
	public UserDaoCls(){
		DBconnection DBconnObj = DBconnection.getInstance();
		connection = DBconnObj.getConnection();
	}
	
	
	
	public List<UserModel> getAllUser(){
		
		List<UserModel> users = new ArrayList<UserModel>();
		
		try {
			Statement stmt = connection.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM core_java.jstl_crud_mvc;");
			
			while(rs.next()){
				UserModel UserModelObj = new UserModel();
				UserModelObj.setId(rs.getString("id"));
				UserModelObj.setUserName(rs.getString("user_name"));
				UserModelObj.setEmail(rs.getString("user_email"));
				UserModelObj.setPassword(rs.getString("user_password"));
				UserModelObj.setRegistrdtionDate(rs.getTimestamp("created_at"));
				
				users.add(UserModelObj);
				
			}
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return users;		
	}
	
	
	public UserModel getUserById(String userid){
		
		UserModel userModelObj = new UserModel();
		
		try {
			PreparedStatement preparedStmt = connection.prepareStatement("SELECT * FROM core_java.jstl_crud_mvc WHERE id=?");
			preparedStmt.setString(1, userid);
			ResultSet rs = preparedStmt.executeQuery();
			
			if(rs.next()){
				userModelObj.setId(rs.getString("id"));
				userModelObj.setUserName(rs.getString("user_name"));
				userModelObj.setEmail(rs.getString("user_email"));
				userModelObj.setPassword(rs.getString("user_password"));
				userModelObj.setRegistrdtionDate(rs.getTimestamp("created_at"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userModelObj;
		
	}
	
	public void checkUser(UserModel userModelObj){
		
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM core_java.jstl_crud_mvc WHERE user_email=?");
			ps.setString(1, userModelObj.getEmail());
			ResultSet rs = ps.executeQuery();
			 if(rs.next()){
				 updateUser(userModelObj);
			 }else{
				 addUser(userModelObj);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void addUser(UserModel userDataObj){
		
		try {
			PreparedStatement prestmt = connection.prepareStatement("INSERT INTO core_java.jstl_crud_mvc (`user_name`, `user_email`, `user_password`) VALUES (?,?,?)");
			 
			 prestmt.setString(1, userDataObj.getUserName());
			 prestmt.setString(2, userDataObj.getEmail());
			 prestmt.setString(3, userDataObj.getPassword());
			 
			 prestmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public void updateUser(UserModel userDataObj){
		
		try {
			PreparedStatement prestmt = connection.prepareStatement("UPDATE `core_java`.`jstl_crud_mvc` SET `user_name` = ?, `user_password` = ? WHERE `core_java`.`jstl_crud_mvc`.`user_email`= ?  ");
			
			 
			 prestmt.setString(1, userDataObj.getUserName());			 
			 prestmt.setString(2, userDataObj.getPassword());
			 prestmt.setString(3, userDataObj.getEmail());
			 
			 prestmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

public void deleteUser(String userId){
	try {
		PreparedStatement prestmt = connection.prepareStatement("DELETE FROM `core_java`.`jstl_crud_mvc` WHERE `core_java`.`jstl_crud_mvc`.`id`= ?  ");
	     prestmt.setString(1, userId);
	     prestmt.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
