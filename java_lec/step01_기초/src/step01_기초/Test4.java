package step01_����;

public class Test4 {
public static void main(String[] args) {

	/*
		 *���� ������ �����Ͽ� ��� �ϼ���
		 *--���
		 *�̸� : �̼��� <-- println()
		 *���� : 25�� <-- print()
		 *�μ� : ���ߺ�
		 *���� : 87.5�� <-- printf() �μ� ���� �ѹ��� ��� 
		 * 
	*/
		String name="�̼���";
		int age = 25;
		String depo="���ߺ�";
		float score = 87.5f;
		
		System.out.println("�̸� : "+name);
		System.out.print("���� : "+age+"\n");
		System.out.printf("�μ� : %s \n���� : %.1f��",depo,score);
	}
}