package whileex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ���� �Է¹޾� �������� ����ϼ���
 * 
 * --���
 * ���� �Է��ϼ��� : 7
 *  7*1 = 7
 *  7*2 = 7
 *  7*3 = 7
 *  7*4 = 7
 *  7*5 = 7
 *  7*6 = 7
 *  7*7 = 7
 *   .
 *   . 
 * */
public class whileEx2 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// ==> �̷��ĵ� ����
	
	int dan;
	int dan2=1;
	System.out.print("���� �Է��ϼ��� : ");
	dan=Integer.parseInt(br.readLine());

	
	while(dan2<10)
	{
		System.out.println(dan+"*"+dan2+"="+(dan*dan2));
		dan2++;
		}
	}
}
