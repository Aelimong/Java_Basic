package constructor;
// ������ : Ŭ�����̸��� ������ �޼����� ����, �����ڷ����� ����
//        ��ü ���� ���, �����ڸ� ������ ���� ��� ����Ʈ �����ڰ� �ڵ� ���� ȣ��

public class ConstructorEx1 {
	public ConstructorEx1() { //Ȥ�� �׳� ConstructorEx1() {} �� public ���� ������� ����
		System.out.println("default constructor");
		return;
	}	
	public ConstructorEx1(String str) { //�Ű躯�� �ϳ�¥�� ������
		System.out.println(str+" constructor");
	}
	public ConstructorEx1(String str,int n) { //�Ű躯�� �ϳ�¥�� ������
		System.out.println(str+" "+n+" constructor");
	}
	//�ᱹ �����ڵ� �Լ��� �ϳ� �̹Ƿ� Overloading�� �����ϴ�
	
	
	
	
	public static void main(String[] args) {
		new ConstructorEx1();
		new ConstructorEx1("������");
		new ConstructorEx1("������",10);
	}

}
