package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����13] �Ʒ��� ���� 12���� ������ �迭�� ����� ����Ų�� 
���ϴ� month�� �Է¹޾� �� ���� ������ ����Ͻÿ�

[����]
int []month={31,28,31,30,31,30,31,31,30,31,30,31};

[�Է�ȭ��/���ȭ��]

���ϴ� month�� �Է��Ͻÿ� : 3
3���� 31���Դϴ�.
 */
public class ����13 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int []month={31,28,31,30,31,30,31,31,30,31,30,31};
	
	int i=0;
	System.out.print("���ϴ� month�� �Է��Ͻÿ� : ");
	i=Integer.parseInt(br.readLine());
	
	System.out.println(i+"����"+ month[i-1]+"�� �Դϴ�.");
	
	}
}
