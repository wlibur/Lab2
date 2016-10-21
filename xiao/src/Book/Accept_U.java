package Book;

import java.sql.Connection;
import java.sql.ResultSet;

import getConnection.ConnectionFromMySQL;

import java.sql.*;

public class Accept_U extends ConnectionFromMySQL{
	
	public Bookclass getlist(int ISBN){
		Bookclass  book = new Bookclass ();  
		
        try{  
        	Connection conn=getCon();
    		String sql = "select * from Book"; 
    		PreparedStatement  pstmt = conn.prepareStatement(sql); 
           
           //pstmt.setInt(1, ISBN);
            ResultSet rs=pstmt.executeQuery(sql);  
            while(rs.next()){
            	if(rs.getInt("ISBN")==ISBN)
            	{
            		book.setISBN(rs.getInt("ISBN"));  
            	}
               
               
            }  
            
            conn.close();
            pstmt.close();
            rs.close();
        }catch(Exception ex)  
        {  
            ex.printStackTrace();  
        }
		
        System.out.println(book.getISBN());
		return book;
		
		
		
	}

}
