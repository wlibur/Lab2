package Book;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


import Book.Bookclass;
import getConnection.ConnectionFromMySQL;

public class Found extends ConnectionFromMySQL{
	//private String Name;
	//public String getName(){return Name;}
	//public void setName(String Name){this.Name=Name;}
	
	
	
	public List<Bookclass> FindList(String Name){
		
		
		System.out.println("查询的名字为： "+Name+"\r\n");
		List<Bookclass> list_F=new ArrayList<Bookclass>();//实例化list
		Bookclass book=null;
		
		try{
			Connection conn=getCon();
			String sqlA="select * from Author where Name like '"+Name+"'";
			Statement psA=conn.createStatement();
			ResultSet rsA=psA.executeQuery(sqlA);	
			while(rsA.next())
			{
				book=new Bookclass();
				book.setAutherID(rsA.getInt("AutherID"));
				String sqlB="select * from Book where AutherID="+book.getAutherID();	
				try{
					Statement psB=conn.createStatement();
					ResultSet rsB=psB.executeQuery(sqlB);
					while(rsB.next()){
							System.out.println(book.getAutherID());							
							//book.setAutherID(rsB.getInt("AutherID"));
							book.setISBN(rsB.getInt("ISBN"));
							book.setPrice(rsB.getDouble("Price"));
							book.setPublishDate(rsB.getString("PublishDate"));
							book.setPublisher(rsB.getString("Publisher"));
							book.setTitle(rsB.getString("Title"));
							list_F.add(book);
							
					}
					psB.close();
					rsB.close();
			
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		
			
			//Statement stmt2= conn.createStatement();	
			
			for(int i=0;i<list_F.size();i++)
			{
			System.out.println("编号 "+list_F.get(i).getISBN()+"\r\n");
			System.out.println("书名 "+list_F.get(i).getTitle()+"\r\n");
			System.out.println("ID "+list_F.get(i).getAutherID()+"\r\n");
		    System.out.println("出版社 "+list_F.get(i).getPublisher()+"\r\n");
			System.out.println("出版日期 "+list_F.get(i).getPublishDate()+"\r\n");
			System.out.println("出版价格 "+list_F.get(i).getPrice()+"\r\n");
			}
			
			psA.close();
			rsA.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return list_F;
		
	
	}
}
