package Auther;

public class Autherclass {
	private int AutherID;		//作者表的主键
	private String Name;    //作者姓名
	private int Age;        //作者年龄
	private String Country; //作者国籍
	
	public int getAutheID(){return AutherID;}
	public void setAutherID(int Auther){this.AutherID=Auther;}
	
	public String getName(){return Name;}
	public void setName(String Name){this.Name=Name;}
	
	public int getAge(){return Age;}
	public void setAge(int age){this.Age=age;}
	
	public String getCountry(){return Country;}
	public void setCountry(String Country){this.Country=Country;}
}
