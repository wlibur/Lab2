package Auther;




import getConnection.ConnectionFromMySQL;

import java.sql.*;



import Auther.Autherclass;

public class AutherShow extends ConnectionFromMySQL{
	
	public Autherclass getAutherList(int AutherID){
		
		Autherclass list_A=new Autherclass();//实例化list
		Connection conn=getCon();
		try{
		/*Class.forName("com.mysql.jdbc.Driver");               //加载数据库驱动
		String url="jdbc:mysql://localhost:3306/BookDB";      //数据库连接字符串
		String username="root";								  //数据库用户名
		String password="xiao1314";							  //数据库用户密码
		Connection conn=DriverManager.getConnection(url, username, password);	//创建Connection连接*/
		Statement stmt= conn.createStatement();				  //获取Statement对象
		String sql="select * from Author";						  //添加展示图书表的SQL语句
		ResultSet rs=stmt.executeQuery(sql);                  //执行查询	 			  
		while(rs.next())
		{
			if(AutherID==rs.getInt("AutherID"))
			{
				list_A.setAge(rs.getInt("Age"));
				list_A.setAutherID(rs.getInt("AutherID"));
				list_A.setCountry(rs.getString("Country"));
				list_A.setName(rs.getString("Name"));
			}
			
			//System.out.print("输出结果为书籍的编号"+book.getid());
		}
		rs.close();
		stmt.close();
		conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list_A;
	}

}
