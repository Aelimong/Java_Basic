package switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ���ڸ� �Է��ϼ��� : 5
 * 
 * 5�� Ȧ�� �Դϴ�.
 * 
 * */
public class switchEx2 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int num;
	
	System.out.printf("���ڸ� �Է��ϼ��� :");
	num=Integer.parseInt(br.readLine());

	switch(num%2) {
	case 1:System.out.println(num+"�� Ȧ�� �Դϴ�."); break;
	case 0:System.out.println(num+"�� ¦�� �Դϴ�."); break;
	default : System.out.println("�̿����� ���°� ������ �ƴմϴ�");
	}
	
	}
}
