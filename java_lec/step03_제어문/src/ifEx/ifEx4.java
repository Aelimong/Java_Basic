package ifEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ��ø if�� ���
 * 3�� ������ ������ �Է� �޾� �հ� ���հ� ����ϱ�
 * 3�� ������ ���� 40 �̻��̿��� �ϰ� ����� 60�̻��̿��� �հ�
 * ����� 60�� ������ 1�� ������ �����̶� 40�̸��̶�� �������� ���հ�
 * ����� 60 �̸��̸� "���հ�" ���
 * 
 * -----���
 * ���� ���� �Է� : 35
 * ���� ���� �Է� : 80
 * ���� ���� �Է� : 100
 * ���  = �������� ���հ�
 * 
 * ���� ���� �Է� : 75
 * ���� ���� �Է� : 80
 * ���� ���� �Է� : 100
 * ���  = �հ�
 * 
 * ���� ���� �Է� : 35
 * ���� ���� �Է� : 30
 * ���� ���� �Է� : 20
 * ���  = ���հ�
 * */
public class ifEx4 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int k;
	int e;
	int m;
	
	System.out.print("���� ������ �Է��ϼ��� : ");
	k=Integer.parseInt(br.readLine());
	
	System.out.print("���� ������ �Է��ϼ��� : ");
	e=Integer.parseInt(br.readLine());
	
	System.out.print("���� ������ �Է��ϼ��� : ");
	m=Integer.parseInt(br.readLine());
	
	
	if((double)(k+e+m)/3.0>=60) {
		if(k<40||e<40||m<40) System.out.println("��� = �������� ���հ�");
		else System.out.println("��� = �հ�");
	}
	else {
		System.out.println("��� = ���հ�");
	}
	
	
			
			
	}
}
