package ����;

import java.util.Scanner;



/*
[����25] �߻�Ŭ������ �̿��Ͽ� ���� ���α׷��� �ϼ��Ͻÿ�

(1)�߻�Ŭ����:  Height 
   �ʵ�� : INCH:double                      ==> final����, �ʱⰪ:2.54 
   �޼ҵ� : getInch(double cm):double  ==> �߻�޼���
            

(2)ó������
   Test42Ŭ�������� Height�� ��ӹ޾� getInch()�� ������ 

(3)��.���
�Է�(cm) : 5.08
��� : 2��ġ
*/
abstract class Height{ //�߻� (�̿ϼ�) Ŭ����
	
	abstract public double getInch(double cm);
}
class Test42 extends Height{

	private static final double INCH = 2.54;

	@Override
	public double getInch(double cm) {
		return cm*INCH;
	}
	
}
public class ����25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("�Է� : ");
		int a=sc.nextInt();
		
		Height hi=new Test42();
		System.out.println("��� :"+hi.getInch(a));
		sc.close();
	}
}
