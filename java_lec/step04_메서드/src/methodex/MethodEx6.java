package methodex;

public class MethodEx6 {
	
	private static String rs(int total) {
		if(total >= 800) return "�հ�";
		else return "���հ�";
	}

	private static int total(int toeic, int it) {
		return toeic+it;
	}
	
	public static void main(String[] args) {
		int toeic=750, it=65;
		System.out.println("�Ի����� : "+total(toeic,it)+"��");
		System.out.println("�Ի��� : "+rs(total(toeic,it))+"�Դϴ�");
		//�Ի����� : 815��
		//�Ի��� : �հ��Դϴ�. ==> 800 �̻� �հ�, �̸� ���հ�
		
		/*
		 * �Լ����� 
		 * 		���������� 		����Ÿ��(�Ű躯��)		 �Լ���
		 * 
		 * 
		 * �Լ�ȣ�� 
		 * 						�Լ��̸�(�Ű躯��)
		 */
	}
}