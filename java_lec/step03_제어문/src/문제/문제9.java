package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * [����9] for���� �̿��Ͽ� �������� ���Ͻÿ�
	
	x�� ���� �Է��Ͻÿ� : 3
	y�� ���� �Է��Ͻÿ� : 3
	3�� 3���� 27
 * */
public class ����9 {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	 
	int x, y, answer=1;
	
	System.out.print("x���� �Է��ϼ��� : ");
	x=Integer.parseInt(br.readLine());
	System.out.print("y���� �Է��ϼ��� : ");
	y=Integer.parseInt(br.readLine());
	
	for(int i=0; i<y; i++)
	{
		answer=answer*x;
	}
	System.out.println(x+"��"+y+"���� "+answer);
	}
}
