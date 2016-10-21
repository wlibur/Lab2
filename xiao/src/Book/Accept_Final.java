package Book;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import getConnection.ConnectionFromMySQL;

public class Accept_Final extends ConnectionFromMySQL{
	

	public String returnResult(Bookclass book)
	{
		System.out.print("结果如下："+"\r\n");
		//System.out.print("ISBN"+book.getISBN()+"\r\n");
		System.out.print("Name"+book.getName()+"\r\n");
		System.out.print("Price"+book.getPrice()+"\r\n");
		System.out.print("PublishDate"+book.getPublishDate()+"\r\n");
		System.out.print("Publisher"+book.getPublisher()+"\r\n");
		try{
			Connection conn=getCon();
			Statement stmt= conn.createStatement();				  //获取Statement对象
			String sql="select * from book where ISBN = "+book.getISBN();	
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()){
				
				String sql4="update Author set Name='"+book.getName()+"' where AutherID="+rs.getObject(3);
				stmt.execute(sql4);
				/*if(book.getISBN()==rs.getInt("ISBN")){
					
					String sql4="update Author set Name=? where AutherID=?";
					PreparedStatement ps4 = conn.prepareStatement(sql4); 
					ps4.setString(1,book.getName());
					ps4.setInt(2,rs.getInt("AutherID"));
					ps4.executeUpdate();
					ps4.close();
					break;
				}*/
			}
			
			rs.close();
			stmt.close();
			
			String sql1="update book set Publisher=? where ISBN=?";//更新bbok表
			PreparedStatement ps1 = conn.prepareStatement(sql1); 
			ps1.setString(1,book.getPublisher());
			ps1.setInt(2,book.getISBN());
			ps1.executeUpdate();
			ps1.close();
			
			String sql2="update book set PublishDate=? where ISBN=?";//更新bbok表
			PreparedStatement ps2 = conn.prepareStatement(sql2); 
			ps2.setString(1,book.getPublishDate());
			ps2.setInt(2,book.getISBN());
			ps2.executeUpdate();
			ps2.close();
			
			String sql3="update book set Price=? where ISBN=?";//更新bbok表
			PreparedStatement ps3 = conn.prepareStatement(sql3); 
			ps3.setDouble(1,book.getPrice());
			ps3.setInt(2,book.getISBN());
			ps3.executeUpdate();
			ps3.close();
			
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "success";
	}
	
}
