package constructor;

import java.util.Scanner;

//������ : ��ü ���� (�� ����, �Է� ó��)
/*
 * �����ڿ��� �� ���� �Է¹޾� ū�� ���� ���� ����ϼ���
 * show()�޼��忡�� maxValue(), minValue()�� ȣ���� ��
 * 
 * Ŭ���� : Max
 * -a:int
 * -b:int
 * +Max()
 * +maxValue:int
 * +minValue:int
 * +show():void
 * 
 * --���
 * Input a : 5
 * Input b : 3
 * 
 * ū�� : 5
 * ������ : 3
 * 
 */

class Max{
	private int a;
	private int b;
	
	public Max() {		
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a : ");
		a=sc.nextInt();
		System.out.print("Input b : ");
		b=sc.nextInt();
		sc.close();
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int maxValue(int a, int b) {
	return (a>b)?a:b;
	}
	
	public int minValue(int a, int b) {
	return (a<b)?a:b;

	}
	
	public void show() {
	System.out.println("ū�� : "+maxValue(a,b)+"\n������ : "+minValue(a,b));	
	}
}
public class ConstructorEx6 {
	public static void main(String[] args) {
		new Max().show();
	}
}