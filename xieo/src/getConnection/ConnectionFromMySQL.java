package getConnection;

import java.sql.*;

public class ConnectionFromMySQL {
	
	public Connection getCon()
	{
		Connection conn=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");               //加载数据库驱动
			String url="jdbc:mysql://localhost:3306/BookDB";      //数据库连接字符串
			String username="root";								  //数据库用户名
			String password="xiao1314";							  //数据库用户密码
			conn=DriverManager.getConnection(url, username, password);	//创建Connection连接
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return conn;
	}

}
