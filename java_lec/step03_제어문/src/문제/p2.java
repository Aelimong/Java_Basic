package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2 {
public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * [����4] ������ �Է¹޾� ����Ͻÿ�
		 * 
		 * [�Է�ȭ��] Input name : �ε鷡 kor : 90 eng : 70 mat : 75
		 * 
		 * [���ȭ��] �̸� : �ε鷡 �հ����� : 235�� ������� : 78.3 <-- �Ҽ� 1�ڸ���������Ͻÿ�
		 */
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	String name;
	int kor,eng,mat;
	
	System.out.print("input name: ");
	name=br.readLine();
	System.out.print("kor: ");
	kor=Integer.parseInt(br.readLine());
	System.out.print("eng: ");
	eng=Integer.parseInt(br.readLine());
	System.out.print("mat: ");
	mat=Integer.parseInt(br.readLine());

	System.out.println("�̸� : "+name+" ������� : "+(kor+eng+mat)/3+" �հ����� : "+(kor+eng+mat));
//==============================================================================================
		/*
		 * [����5] ������ �Է¹޾� ����Ͻÿ� (�ﰢ������ = (�غ� * ����)/2)
		 * 
		 * [�Է�ȭ��] �ﰢ���� ���� ���ϱ� **** �غ� : 10 ���� : 3
		 * 
		 * 
		 * [���ȭ��] ���� : 15.00 <--- �Ҽ� 2�ڸ���������Ͻÿ�
		 */
	int bottom, height;
	
	System.out.print("�غ� : ");
	bottom=Integer.parseInt(br.readLine());
	System.out.print("���� : ");
	height=Integer.parseInt(br.readLine());
	
	System.out.println("���� : "+(bottom*height)/2);
//==========================================================================
		/*
		 * [����6] 4���� ���� �ֿܼ��� �Է¹޾� ó���Ͻÿ� ����) ���� : M �̸� "����", ������ "����" (if�� �̿�)
		 * 
		 * [�Է�ȭ��] Input name: ��̶� Input gender: F Input age: 25 Input tall: 173.3
		 * 
		 * [���ȭ��] �̸� : ��̶� ���� : ���� ���� : 25�� ���� : 173.3cm
		 */ 
	String name3;
	char gender;
	int age;
	double tall;
	
	System.out.print("input name: ");
	name3=br.readLine();
	System.out.print("input gender: ");
	gender=br.readLine().charAt(0);
	System.out.print("input age: ");
	age=Integer.parseInt(br.readLine());
	System.out.print("input tall: ");
	tall=Double.parseDouble(br.readLine());
	
	if(gender=='M')
	System.out.println("�̸� : "+name3+" ���� : ����  ���� : "+age+"��  ���� :"+tall+"cm");

	else
		System.out.println("�̸� : "+name3+" ���� : ����  ���� : "+age+"��  ���� :"+tall+"cm");

}

}
