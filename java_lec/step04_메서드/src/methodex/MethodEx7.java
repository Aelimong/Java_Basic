package methodex;
// Call by reference : ������ ���� ����, ���� �ּ� ����
// ��ü �ڷ������� ���, Ŭ����, ������, �迭, �������̽�

public class MethodEx7 {
	public static void view1(String str) {
		System.out.println("view1�� ���� �� str :"+str);
		str="������";
		System.out.println("view1�� ���� �� str :"+str);
		
	}
	public static void view2(int[] num) {
		for(int n:num) {
			System.out.println("���� �� view2�� num : "+n);
		}
		//System.out.println();
		num[2]=300;
		for(int n:num) {
			System.out.println("���� �� view2�� num : "+n);
		}
	}
	//C ��� �迭 --> ������, ������ --> ����
	//	char* test[] --> �迭 ������
	//  char** test[] --> 2���� �迭
	
	public static void main(String[] args) {

	String str="happy";
	System.out.println("ȣ�� �� ������ str :"+str);
	view1(str); //�Լ�ȣ��
	System.out.println("ȣ�� �� ������ str :"+str);
	System.out.println("============================");
	
	
	int [] num = {10,20,30,40,50};
	for(int n:num) {
		System.out.println("ȣ�� �� ������ num :"+n);
		}
	view2(num);
	for(int n:num) {
		System.out.println("ȣ�� �� ������ num :"+n);
		}
	//====> ���������� num[2] �� ���� �ٲ���� Ȯ�� �����ϴ�.
	}
}
