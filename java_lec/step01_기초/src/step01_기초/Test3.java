package step01_����;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * float ������ ����� 75.3
		 * double ������ ����� 89.53�� ���� ���� �� ��
		 * System.out.println();�� �ѹ��� ����Ͽ� ����ϼ���.
		 * 
		 * --���
		 * ���������� 75.3���̰�
		 * ���������� 89.53�� �Դϴ�.
		 * 
		 * */
		float num1=75.3f;
		double num2=89.53;
		
		System.out.printf("���� ������ %.2f �̰�\n���������� %.2f�� �Դϴ�.",num1,num2);
		System.out.println("\n���� : "+String.format("%-10.1f", num1));
		// println ���� �Ҽ����� ��� ǥ���ϴ� ���
		

	}

}
