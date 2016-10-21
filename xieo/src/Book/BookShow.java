package Book;


import java.util.*;

import getConnection.ConnectionFromMySQL;

import java.sql.*;

import Book.Bookclass;

public class BookShow extends ConnectionFromMySQL{
	
	public List<Bookclass> getBookList(){
		
		List<Bookclass> List_B=new ArrayList<Bookclass>();//ʵ����list
		Connection conn=getCon();
		try{
		/*Class.forName("com.mysql.jdbc.Driver");               //�������ݿ�����
		String url="jdbc:mysql://localhost:3306/BookDB";      //���ݿ������ַ���
		String username="root";								  //���ݿ��û���
		String password="xiao1314";							  //���ݿ��û�����
		Connection conn=DriverManager.getConnection(url, username, password);	//����Connection����*/
		Statement stmt= conn.createStatement();				  //��ȡStatement����
		String sql="select * from Book";						  //���չʾͼ����SQL���
		ResultSet rs=stmt.executeQuery(sql);                  //ִ�в�ѯ	 			  
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
			//System.out.print("������Ϊ�鼮�ı��"+book.getid());
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
