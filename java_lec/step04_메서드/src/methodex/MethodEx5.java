package methodex;

public class MethodEx5 {
	public static void show1() { //call by value (���� ���� ����)
		System.out.println("�ȳ��ϼ���");
		return; //�������� 
	} // ***�� �Ű� ����***
	
	public static String show3() {
		return "hello";
	}
	
	private static void show2(char c, int i) {
		System.out.println("Ÿ�� : "+c);
		System.out.println("�ڵ� : "+i);
	}
	public static float show4(int a, int b, int c) {
		
		return (a+b+c)/3.0f; 
		
	}
	
	public static void main(String[] args) { //call by reference (������ ���� ����)
		show1(); 																    //----
		show2('A',25);																//   : 	***���� �Ű躯��***	
		String s=show3(); System.out.println("show3�� ���ϰ� : "+s);					//	 :
		float k=show4(15, 45, 77); System.out.printf("show4�� ���ϰ� : %.2f\n",k);		//----
	}

}

