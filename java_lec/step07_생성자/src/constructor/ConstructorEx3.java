package constructor;
//Ŭ������ : UserInfo
//-name : String
//-addr : String
//+UserInfo()
//+UserInfo(name:String, addr:String)
//+getter
//--���
//*** �ּҷ� *** <-- ����Ʈ �����ڿ��� ���
//�̸� : ���󿡸�   <-- main()���� getter�� �̿��ؼ� ���
//�ּ� : ����� ������ <-- main()���� getter�� �̿��ؼ� ���
class UserInfo{
	private String name;
	private String addr;
	
	public UserInfo() {
		System.out.println("*** �ּҷ� ***");
	}
	public UserInfo(String name, String addr) {
		this();
		this.name=name;
		this.addr=addr;
	}
	

	public String getName() {
		return name;
	}
	public String getAddr() {
		return addr;
	}
	
}
public class ConstructorEx3 {


	public static void main(String[] args) {
		UserInfo ob=new UserInfo("���󿡸�","����� ������");
		System.out.println("�̸� : "+ob.getName());
		System.out.println("�ּ� : "+ob.getAddr());	
	}
}
