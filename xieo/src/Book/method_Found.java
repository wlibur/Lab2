package Book;


import java.util.List;

import Book.Found;
import Book.Bookclass;


public class method_Found extends Found{
	
	private String Name;
	public String getName(){return Name;}
	public void setName(String Name){this.Name=Name;}
	
	
	
	private List<Bookclass> list_F=null;
	public List<Bookclass> getList_F()
	{
		
		return list_F;
	}
	
	public void setList_F(List<Bookclass> List_F)
	{
		this.list_F=List_F;
	}
	
	public String Bfind(){
		System.out.println("±àºÅadadsdadsads±àºÅ: "+this.getName()+"\r\n");
		Found find=new Found();
		list_F=find.FindList(this.Name);
		
		return "success";
		//else{return "error";}
		
	}

}
