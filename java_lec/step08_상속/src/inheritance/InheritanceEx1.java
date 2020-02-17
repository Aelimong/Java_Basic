/*
package inheritance;
//inheritance(���)

class SuperEx{
	public void show1() {
		System.out.println("show1 method");
	}
} //�θ� Ŭ����

class SubEx extends SuperEx{
	public void show2() {
		System.out.println("show2 method");
	}
} //�ڽ� Ŭ���� //�θ��� �ڿ��� ������� ��� �� �� �ִ�.

public class InheritanceEx1 {
	
	public static void main(String[] args) {
		SubEx ob = new SubEx();
		ob.show1();
		ob.show2();
	}
}
*/
package inheritance;
//inheritance(���)

class SuperEx{
	public void show() {
		System.out.println("show1 method");
	}
} //�θ� Ŭ����

class SubEx extends SuperEx{
	@Override //(�������̵� �� �޼ҵ����� �˷��ִ� ��)
	public void show() {
		super.show(); //�θ� Ŭ������ �޼ҵ� �켱 ȣ��
		System.out.println("show2 method");
	}
} //�ڽ� Ŭ���� //�θ��� �ڿ��� ������� ��� �� �� �ִ�.

public class InheritanceEx1 {
	
	public static void main(String[] args) {
		SubEx ob = new SubEx();
		ob.show();
		ob.show();
	}
}
/*
 * ����� :
	show1 method
	show2 method
	show1 method
	show2 method
 * */
