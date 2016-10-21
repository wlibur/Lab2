package Book;

public class method_Accept{
	
	/*private Bookclass book;
	
	public Bookclass getbook()
	{
		return book;
	}
	
	public void setbook(Bookclass book)
	{
		this.book=book;
	}*/
	
	private int ISBN;
	
	public int getISBN()
	{
		return ISBN;
	}
	
	public void setISBN(int ISBN)
	{
		this.ISBN=ISBN;
	}
	
	public String print(){
	
	System.out.print("Ö£Ïö"+ISBN);
	
	return "success";
	}
	
	
	
	
	/*public String getlist()
	{
		//Accept_U booklist=new Accept_U();
		//book=booklist.getlist(ISBN);
		book=getlist(ISBN);
		System.out.println("Ö£Ïö"+book.getISBN());
		return "getbooklist";
	}*/

}
