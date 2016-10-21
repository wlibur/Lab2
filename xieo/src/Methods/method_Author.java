package Methods;



import Auther.AutherShow;
import Auther.Autherclass;

public class method_Author extends AutherShow {
	
	//返回作者的详细信息
			
			private Autherclass List_A=null;
			private int AutherID;
			
			public int getAutherID()
			{
				return AutherID;
			}
			
			public void setAutherID(int AutherID)
			{
				this.AutherID=AutherID;
			}
			
			
	
			public Autherclass getList_A()
			{
				
				return List_A;
			}
			
			public void setList_A(Autherclass List)
			{
				this.List_A=List;
			}
			
			public String get_ListA()
			{
				
				AutherShow AList=new AutherShow();
				List_A=AList.getAutherList(AutherID);
				return "showdetial";
			}
			
			//以上为返回作者详细信息的

}
