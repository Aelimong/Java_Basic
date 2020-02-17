package interfaceex;
/* class �� interface �� �̿��Ͽ� ����ó��
 * Ŭ���� : User
 * -name : String
 * +User()
 * +User(name: String)
 * +toString(): String
 * 
 * �������̽� Score
 * +sol:int (�ʱⰪ : 20) <-- ���� // ����
 * +getScore():int  //���� �� * sol �� ����
 * 
 * *�������̽� Print
 * +toPaint() : String //
 * 
 * --���ȭ��
 * �̸� : ȫ�浿
 * ���� : 60��
 */

class User{
	
	private String name;

	public User() {

	}
	
	public User(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "�̸� : " + name;
	}

}

interface Score {
	
	public int sol=20;     //����
	public int getScore(); //�������̵� ����, ���� �� * sol�� ����
}

interface Print {
	
	public String toPaint();
	
}
	



public class InterfaceEx4 extends User implements Score, Print {
	
	int s;
	public InterfaceEx4(String name, int s) {
		super(name);
		this.s=s;
	}
	
	public static void main(String[] args) {

		InterfaceEx4 ob = new InterfaceEx4("ȫ�浿", 3);
		System.out.println(ob.toPaint());
		
		
	}

	@Override
	public int getScore() {
		return s*sol;
	}
	@Override
	public String toPaint() {
		
		return super.toString()+"\n���� : "+getScore();
	}


}
