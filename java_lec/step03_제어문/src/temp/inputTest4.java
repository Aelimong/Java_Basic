package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * �������� �Է��ϼ��� : 5
 * 
 * ���� ���� : 78.5 (������ *������ *3.14)
 * ���� �ѷ� : 31.4 (2*3.14*������)
 * 
 * */

public class inputTest4 {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int half; 
		double scale, round;
		
		System.out.print("�������� �Է��ϼ��� : ");
		half=Integer.parseInt(br.readLine());
		
		scale = half*half*3.14;
		round = 2*half*3.14;
		
		System.out.printf("���� ���� : %.1f",scale);
		System.out.printf("\n���� �ѷ� : %.1f\n",round);	
	}
}
