package getConnection;

import java.sql.*;

public class ConnectionFromMySQL {
	
	public Connection getCon()
	{
		Connection conn=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");               //�������ݿ�����
			String url="jdbc:mysql://localhost:3306/BookDB";      //���ݿ������ַ���
			String username="root";								  //���ݿ��û���
			String password="xiao1314";							  //���ݿ��û�����
			conn=DriverManager.getConnection(url, username, password);	//����Connection����
		}catch(SQLException e){
			e.printStackTrace();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		return conn;
	}

}
