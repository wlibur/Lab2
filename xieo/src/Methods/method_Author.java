package Methods;



import Auther.AutherShow;
import Auther.Autherclass;

public class method_Author extends AutherShow {
	
	//�������ߵ���ϸ��Ϣ
			
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
			
			//����Ϊ����������ϸ��Ϣ��

}
