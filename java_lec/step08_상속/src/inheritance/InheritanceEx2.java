package inheritance;
class ParentEx{
	public ParentEx() {
		System.out.println("parent class");
	}
	
}
class ChildEx extends ParentEx{
	public ChildEx() {
		super(); //��������
		System.out.println("child class");
	}
	
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		new ChildEx(); //1
	}
}
/*
 * this.����
 * this.�ż���()
 * this()
 * this(����,����,...) --------> �ڱ��ڽ��� ������ ȣ��
 
 
 * super.����
 * super.�ż���()
 * super()
 * super(����,����,...) --------> �θ��� ������ ȣ��
 * 
 * */
 