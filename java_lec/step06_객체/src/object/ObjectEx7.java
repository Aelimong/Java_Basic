package object;
//�ش������� Trapezoid.java �� �����ؼ� �����

import java.util.Scanner;
/*
 *
 * **** ��ٸ����� ���� ���ϱ�  ****
 * �غ��� �Է��ϼ��� : 5
 * ������ �Է��ϼ��� : 4
 * ���̸� �Է��ϼ��� : 3
 * 
 * ���� : 13.5
 * 
 * �� �� �� ��� �ұ��? (Y/y) n
 * ****�����ϼ̽��ϴ�****
 */

public class ObjectEx7 {
public static void main(String[] args) {
	//��ĳ��
	Scanner sc=new Scanner(System.in);
	Trapezoid tr=new Trapezoid();
	
	char d;
	//do-while ���ο��� �Է� ó��
	do {
		System.out.print("****��ٸ����� ���� ���ϱ� ****\n");
		System.out.print("�غ��� �Է��ϼ��� : ");
		int a=sc.nextInt();	
		System.out.print("������ �Է��ϼ��� : ");
		int b=sc.nextInt();	
		System.out.print("���̸� �Է��ϼ��� : ");
		int c=sc.nextInt();	
		
		tr.setTrapezoid(a, b, c);
		System.out.println(tr.toString());
		
		System.out.println("�� �� �� ��� �ұ��? (Y/y)");
		d=sc.next().charAt(0);
		}while(d=='y'||d=='Y');
		System.out.print("****�����ϼ̽��ϴ�****\n");
		
		sc.close();
	}
}
