package methodex;

public class MethodEx8 {
	public static void view1() {
		System.out.println("static method");
		
	}
	public void view2() {
		//static Ű���尡 ���� method
		System.out.println("non-static method");
	}
	public static void main(String[] args) {
		
		view1(); //Ŭ���� �޼���(class method) : ��ü���� ȣ�� ����
		MethodEx8.view1(); // ��ŷε� ȣ�� ����
		//========> view1(); ó�� �ڽ��� �޼��忡 �����Ҷ��� Ŭ���� �̸� ���� ����
		
		//Ŭ������ ������Ʈ�� �ν��Ͻ�
					//���� 191p ���� 
		//Ŭ������ �ν��Ͻ��� ������Ʈ
		
		// view2(); ==> �����߻�
		MethodEx8 ob = new MethodEx8(); //��ü����
		ob.view2(); //�ν��Ͻ� �޼��� (instance method)
		//�ݵ�� ��ü�� �����ϰ� �޼��带 ȣ���ؾ� ��

	}
}
