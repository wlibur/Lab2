package Book;

import Book.Accept_Final;
public class method_Update extends Accept_Final{
	
	private int ISBN;              //编号，书表的主键
	//private int id;
	private String Publisher;     //出版社

	private String PublishDate;  //出版日期
	private String Name;
	private Bookclass book;
	private double Price;        //价格
	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}





	
	
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public String getPublishDate() {
		return PublishDate;
	}

	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Bookclass getBook() {
		return book;
	}

	public void setBook(Bookclass book) {
		this.book = book;
	}

	
	
	
	
	private String Jieguo;
	
	public String getJieguo()
	{
		return Jieguo;
	}
	
	public void setJieguo(String Jieguo)
	{
		this.Jieguo=Jieguo;
	}
	
	
	public String getResult()
	{
		book=new Bookclass();
		System.out.println(ISBN+Name+PublishDate+Price);
		book.setISBN(ISBN);
        book.setName(Name);
        book.setPublishDate(PublishDate);
        book.setPublisher(Publisher);
        book.setPrice(Price);
		Accept_Final Result=new Accept_Final();
		
		Jieguo=Result.returnResult(book);
		if(Jieguo=="success"){
			return "success";
		}else
		{
			return "error";
		}
		
	}
}
