package Book;

public class Bookclass {
	
	private int ISBN;              //��ţ���������
	private String Title;        //����
	private int AutherID;        //�������߱�����
	private String Publisher;     //������
	private String PublishDate;  //��������
	private double Price;        //�۸�
	
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
