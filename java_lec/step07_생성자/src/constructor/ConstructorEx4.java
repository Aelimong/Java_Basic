package constructor;

import java.util.Scanner;

/*
 * Ŭ������ : ConstructorEx4
 * x:int
 * y:int
 * 
 * +ConstructorEx4()	--�Է�ó�� (��ĳ��)
 * +calc():int			--x*y�� ����
 * +display():void		--����ϱ�
 * */

/*
 * ���θ� �Է� : 5
 * ���θ� �Է� : 4
 * 
 * �簢���� ���� : 20
 * 
 */

//�޼ҵ�=�Լ�=���ν���=���

public class ConstructorEx4 {
	int x;
	int y;
	
	public ConstructorEx4(){
		Scanner sc=new Scanner(System.in);
		System.out.print("���θ� �Է� : ");
		this.x=sc.nextInt();
		System.out.print("���θ� �Է� : ");
		this.y=sc.nextInt();
		sc.close();
	}
	public void display() {
		System.out.println("�簢���� ���� : "+calc());
	}
	public int calc() {
		return x*y;
	}
	public static void main(String[] args) {
		new ConstructorEx4().display();
	}
}