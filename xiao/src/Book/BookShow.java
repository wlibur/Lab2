package Book;


import java.util.*;

import getConnection.ConnectionFromMySQL;

import java.sql.*;

import Book.Bookclass;

public class BookShow extends ConnectionFromMySQL{
	
	public List<Bookclass> getBookList(){
		
		List<Bookclass> List_B=new ArrayList<Bookclass>();//实例化list
		Connection conn=getCon();
		try{
		/*Class.forName("com.mysql.jdbc.Driver");               //加载数据库驱动
		String url="jdbc:mysql://localhost:3306/BookDB";      //数据库连接字符串
		String username="root";								  //数据库用户名
		String password="xiao1314";							  //数据库用户密码
		Connection conn=DriverManager.getConnection(url, username, password);	//创建Connection连接*/
		Statement stmt= conn.createStatement();				  //获取Statement对象
		String sql="select * from Book";						  //添加展示图书表的SQL语句
		ResultSet rs=stmt.executeQuery(sql);                  //执行查询	 			  
		while(rs.next())
		{
			Bookclass book=new Bookclass();
			//book.setid(rs.getInt("ISBN"));
			book.setISBN(rs.getInt("ISBN"));
			book.setAutherID(rs.getInt("AutherID"));
			book.setPrice(rs.getDouble("Price"));
			book.setPublishDate(rs.getString("PublishDate"));
			book.setPublisher(rs.getString("Publisher"));
			book.setTitle(rs.getString("Title"));
			List_B.add(book);
			//System.out.print("输出结果为书籍的编号"+book.getid());
		}
		rs.close();
		stmt.close();
		conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return List_B;
	}

}
