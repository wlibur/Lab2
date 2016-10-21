package Methods;


import java.util.List;

import Book.BookShow;
import Book.Bookclass;

public class method_Book extends BookShow {
	
		//显示信息
		//List<Bookclass> list_B=new ArrayList<Bookclass>();
		private List<Bookclass> List_B=null;
		public List<Bookclass> getList_B()
		{
			
			return List_B;
		}
		
		public void setList_B(List<Bookclass> List_B)
		{
			this.List_B=List_B;
		}
		
		public String get_ListB()
		{
			BookShow BList=new BookShow();
			List_B=BList.getBookList();
			return "showBookList";
		}
		//以上为显示信息
		
}
  