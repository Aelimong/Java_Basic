package step02_������;
//�ܼ� : ǥ�� ����� ��ġ

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class InputTest1 {
		
	public static void main(String[] args) throws IOException {
		//throws IOException ==> ���� ������(throws)ó��
		
		InputStreamReader isr = new InputStreamReader(System.in);
		//new �� ���� ���� : ��ü �ڷ��� �ʱ�ȭ
		//1. Ű���忡�� �Է��� �ް�
		BufferedReader br = new BufferedReader(isr);
		//2. ���ۿ� �� ���� ����
		// �̰� �ϴ� ���� : �ӵ� ������ ����
		
		String name;
		char gender;
		int age;
		float weight;
		double tall;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		name=br.readLine();
		//readLine�� �ΰ��� �ǹ�  1.������ �ǹ�, 2.�Է��� �ǹ�
		
		
		System.out.print("������ �Է��ϼ��� : ");
		gender=br.readLine().charAt(0); 
		//gender�� �о�ͼ�(readLine) ĳ������ ù��°�� ���� (charAt(0))
		
		//charAt(i) : ���� 1�� ����, i�� �����ϰ��� �ϴ� ���� �ε���
		//�Է��� charAt(i) �տ� ��� 
		// ���� : System.out.println("�ѱ۰���ǻ��".charAt(3));
		
		System.out.print("���̸� �Է��ϼ��� : ");
		age=Integer.parseInt(br.readLine());
		System.out.print("ü���� �Է��ϼ��� : ");
		weight=Float.parseFloat(br.readLine());
		System.out.print("������ �Է��ϼ��� : ");
		tall=Double.parseDouble(br.readLine());
		

		System.out.println("�̸� : "+name);
		System.out.println("���� : "+gender);
		System.out.println("���� : "+age);
		System.out.println("ü�� : "+weight);
		System.out.println("���� : "+tall);
	}

}
