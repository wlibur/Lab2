package Auther;




import getConnection.ConnectionFromMySQL;

import java.sql.*;



import Auther.Autherclass;

public class AutherShow extends ConnectionFromMySQL{
	
	public Autherclass getAutherList(int AutherID){
		
		Autherclass list_A=new Autherclass();//ʵ����list
		Connection conn=getCon();
		try{
		/*Class.forName("com.mysql.jdbc.Driver");               //�������ݿ�����
		String url="jdbc:mysql://localhost:3306/BookDB";      //���ݿ������ַ���
		String username="root";								  //���ݿ��û���
		String password="xiao1314";							  //���ݿ��û�����
		Connection conn=DriverManager.getConnection(url, username, password);	//����Connection����*/
		Statement stmt= conn.createStatement();				  //��ȡStatement����
		String sql="select * from Author";						  //���չʾͼ����SQL���
		ResultSet rs=stmt.executeQuery(sql);                  //ִ�в�ѯ	 			  
		while(rs.next())
		{
			if(AutherID==rs.getInt("AutherID"))
			{
				list_A.setAge(rs.getInt("Age"));
				list_A.setAutherID(rs.getInt("AutherID"));
				list_A.setCountry(rs.getString("Country"));
				list_A.setName(rs.getString("Name"));
			}
			
			//System.out.print("������Ϊ�鼮�ı��"+book.getid());
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
