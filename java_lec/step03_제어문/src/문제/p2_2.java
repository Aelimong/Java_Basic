package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2_2 {
public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * [����7]2���� ���ڿ� �����ڸ� �Է��Ͽ� ����Ͻÿ� 
		 * ����1) �Ǽ��ΰ��� �Ҽ����� 2°�ڸ����� ����Ͻÿ� 
		 * ����2) �����ڰ� +,-,*,/ �̿��� ���ڰ� ������ "������error"����Ͻÿ�
		 * 
		 * [������] x���� �Է��Ͻÿ� : 25 y���� �Է��Ͻÿ� : 36 �����ڸ� �Է�(+,-,*,/) : + 25 + 36 = 71
		 * 
		 * x���� �Է��Ͻÿ� : 25 y���� �Է��Ͻÿ� : 36 �����ڸ� �Է�(+,-,*,/) : / 25 / 36 = 0.69
		 * 
		 * x���� �Է��Ͻÿ� : 25 y���� �Է��Ͻÿ� : 36 �����ڸ� �Է�(+,-,*,/) : # ������ error
		 */
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int x,y;
	char yunsanja;
	
	System.out.println("x���� �Է��Ͻÿ� :");
	x=Integer.parseInt(br.readLine());
	System.out.println("y���� �Է��Ͻÿ� :");
	y=Integer.parseInt(br.readLine());
	System.out.println("�����ڸ� �Է�(+,-,*,/)�Ͻÿ� :");
	yunsanja=br.readLine().charAt(0);
	float an;
	switch(yunsanja) {
	case '+':an=x+y; System.out.println(x+"+"+y+"="+(an));break;
	case '-':an=x-y; System.out.println(x+"-"+y+"="+(an));break;
	case '*':an=x*y; System.out.println(x+"*"+y+"="+(an));break;
	case '/':an=x/y; System.out.println(x+"/"+y+"="+(an));break;
	default : System.out.println("# ������ error");}
	
	
	
	}

}
