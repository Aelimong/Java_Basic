package finalex;
//import java.lang.object;
import java.lang.String;

class Test {
	
	public Test() {
		
		super();
		
	}
	
	String name = "��ȣ��";
	
	public void view() {
		
		System.out.println("�̸� : " + this.name.toString()); //this. .toString() ������ �Ǿ��ִ�.
	
	}
	
}


public class ObjectEx {

	
	
	public static void main(String[] args) {

		new Test().view();
		
		Test ob = new Test();
		
		ob.view();
		
	}

}
