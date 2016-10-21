package Methods;

import java.sql.Connection;

import getConnection.ConnectionFromMySQL;

import java.sql.*;

public class Delete extends ConnectionFromMySQL{
	private int ISBN;
	
	public int getISBN(){return ISBN;}
	public void setISBN(int id){this.ISBN=id;}
	
	public String deleteBook(){
		
		Connection conn=getCon();
		
		try{
			String sqlB="delete from Book where ISBN=?";
			//String sqlA="delete from Author where AutherID=?";
			
			PreparedStatement psB=conn.prepareStatement(sqlB);//É¾³ýbookÖÐµÄÄÚÈÝ
			//PreparedStatement psA=conn.prepareStatement(sqlA);//É¾³ý
			
			psB.setInt(1, this.getISBN());
			psB.executeUpdate();
			psB.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return "success";
	}

}
