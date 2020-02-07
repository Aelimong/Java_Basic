package switchex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * args�� �Էµ� month�� �ϼ��� ���ϼ���
 * $java SwitchEx3 3
 * 
 * 3���� 31�ϱ��� �ֽ��ϴ�.
 * 
 * */
public class SwitchEx3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int month;
		

		System.out.print("Month : ");
		month=Integer.parseInt(br.readLine());


		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�.");break;
		default : System.out.println(month+"���� 30�ϱ��� �ֽ��ϴ�.");break;
		}

		
	}

}
