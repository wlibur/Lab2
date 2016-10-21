package Methods;

import java.sql.*;

import getConnection.ConnectionFromMySQL;
public class Insert extends ConnectionFromMySQL{
	
	private int AutherID;		//���߱������//��������
	private String Name;    //��������
	private int Age;        //��������
	private String Country; //���߹���
	
	private int ISBN;              //��ţ���������
	private String Title;        //����
	private String Publisher;     //������
	private String PublishDate;  //��������
	private double Price;        //�۸�
	
	
	public int getAutheID(){return AutherID;}
	public void setAutherID(int Auther){this.AutherID=Auther;}
	
	public String getName(){return Name;}
	public void setName(String Name){this.Name=Name;}
	
	public int getAge(){return Age;}
	public void setAge(int Age){this.Age=Age;}
	
	public String getCountry(){return Country;}
	public void setCountry(String Country){this.Country=Country;}
	
	public int getISBN(){return ISBN;}
	public void setISBN(int ISBN){this.ISBN=ISBN;}
	
	public String getTitle(){return Title;}
	public void setTitle(String Title){this.Title=Title;}
	
	public String getPublisher(){return Publisher;}
	public void setPublisher(String Publisher){this.Publisher=Publisher;}
	
	public String getPublishDate(){return PublishDate;}
	public void setPublishDate(String PublishDate){this.PublishDate=PublishDate;}
	
	public double getPrice(){return Price;}
	public void setPrice(double Price){this.Price=Price;}
	
	
	
	public String InsertInformation (){
		
		Connection conn=getCon();
		//System.out.println("getISBN(): "+this.getISBN()+" ");
		//System.out.println("getTitle() "+this.getTitle()+" ");
		//System.out.println("getAutheID() "+this.getAutheID()+" ");
		//System.out.println("getPublisher() "+this.getPublisher()+" ");
		//System.out.println("getPublishDate() "+this.getPublishDate()+" ");
		//System.out.println("this.getPrice() "+this.getPrice()+" ");
		//System.out.println("this.getName() "+this.getName()+" ");
		//System.out.println("this.getAge() "+this.getAge()+" ");
		//System.out.println("this.getCountry() "+this.getCountry()+" ");
		
		
		try{
			
			//�Ա�Auther�����Ϣ
			
			Statement stmt= conn.createStatement();	
			//�Ա�Book�����Ϣ
			String sql_four="select * from Book";
			ResultSet rs_two=stmt.executeQuery(sql_four);
			while(rs_two.next())
			{
				if(rs_two.getInt("ISBN")==this.ISBN)
				
				{
					stmt.close();
					conn.close();
					return "error";
					}
			}
			
			//¼��Book����Ϣ
			String sql_one="insert into Book(ISBN,Title,AutherID,Publisher,PublishDate, Price)values(?,?,?,?,?,?)";			
			PreparedStatement ps_one=conn.prepareStatement(sql_one);
			
			//insert into Book(ISBN,Title,AutherID,Publisher,PublishDate, Price)values(3,'book',3,'hit','1996-01',53);
			ps_one.setInt(1,this.getISBN());
			ps_one.setString(2,this.getTitle());
			ps_one.setInt(3,this.getAutheID());
			ps_one.setString(4,this.getPublisher());
			ps_one.setString(5,this.getPublishDate());
			ps_one.setDouble(6,this.getPrice());
			int row =ps_one.executeUpdate();
			if(row==0)
			{
				ps_one.close();
				stmt.close();
				conn.close();
				return "error";
			}
			
			
			String sql_three="select * from Author";						  //���չʾͼ����SQL���
			ResultSet rs_one=stmt.executeQuery(sql_three);
			while(rs_one.next())
			{
				if(rs_one.getInt("AutherID")==this.AutherID)
				{
					stmt.close();
					conn.close();
					return "success";}
			}
			
			//¼��Auther����Ϣ
			String sql_two="insert into Author(AutherID,Name,Age,Country)values(?,?,?,?)";
			PreparedStatement ps_two=conn.prepareStatement(sql_two);
			ps_two.setInt(1,this.getAutheID());
			ps_two.setString(2,this.getName());
			ps_two.setInt(3,this.getAge());
			ps_two.setString(4,this.getCountry());
			int row_2 =ps_two.executeUpdate();
			if(row_2==0)
			{
				ps_two.close();
				stmt.close();
				conn.close();
				return "error";
			}
			
			
			
			
			
			
				ps_one.close();
				ps_two.close();
				stmt.close();
				conn.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
		return "success";
	}

}
