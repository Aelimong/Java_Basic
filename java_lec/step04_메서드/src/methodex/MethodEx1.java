package methodex;

public class MethodEx1 {
	
	public static void view() {
		System.out.println("hello");
		return; //�������� (void Ÿ���� ��쿡�� ���� ����)
	}//�ɹ� �޼ҵ�
	//void = return Ÿ���� ���� �� �ǹ�
	
	public static void star() {
		System.out.println("********"); 
		return;
		
	}
	public static void main(String[] args) {
		view();
		star();
		view();
		star();	
	}
}
