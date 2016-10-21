package Book;

public class Bookclass {
	
	private int ISBN;              //编号，书表的主键
	private String Title;        //书名
	private int AutherID;        //链接作者表的外键
	private String Publisher;     //出版社
	private String PublishDate;  //出版日期
	private double Price;        //价格
	
	private String Name;
	public String getName(){return Name;}
	public void setName(String Name){this.Name=Name;}
	
	
	//public int getid(){return id;}
	//public void setid(int id){this.id=id;}
	
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
	
	public int getAutherID(){return AutherID;}
	public void setAutherID(int AutherID){this.AutherID=AutherID;}
	
}
