package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * �ٽ� �ѹ� �����ұ��(y/Y) ? Y 
 * �ٽ� �ѹ� �����ұ��(y/Y) ? y
 * �ٽ� �ѹ� �����ұ��(y/Y) ? n
 * 
 * ***�����***
 *
 */

public class DoWhileEx2 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		char qu;
		
		do {
			System.out.print("�ٽ��ѹ� �����ұ��(y/Y) ? : ");
			qu=br.readLine().charAt(0);
			
		}while(qu=='y'||qu=='Y');
		System.out.println("***�����***"); 
		System.exit(0);
		}
	}