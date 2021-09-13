package hello;

import java.sql.*;

public class ConnectDB {
	Connection con;
	
	public ConnectDB(String id, String pass) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mydb";
		con = DriverManager.getConnection(url, id, pass);
		System.out.println("데이터베이스에 성공적으로 연결하였습니다.");
	}catch(Exception e) {
		e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ConnectDB("root", "jha8835@");
		
	}

}
