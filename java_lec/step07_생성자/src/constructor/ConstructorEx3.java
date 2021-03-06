package constructor;
//클래스명 : UserInfo
//-name : String
//-addr : String
//+UserInfo()
//+UserInfo(name:String, addr:String)
//+getter
//--출력
//*** 주소록 *** <-- 디폴트 생성자에서 출력
//이름 : 도라에몽   <-- main()에서 getter를 이용해서 출력
//주소 : 서울시 강남구 <-- main()에서 getter를 이용해서 출력
class UserInfo{
	private String name;
	private String addr;
	
	public UserInfo() {
		System.out.println("*** 주소록 ***");
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
		UserInfo ob=new UserInfo("도라에몽","서울시 강남구");
		System.out.println("이름 : "+ob.getName());
		System.out.println("주소 : "+ob.getAddr());	
	}
}
