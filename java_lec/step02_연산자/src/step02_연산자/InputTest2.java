package step02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * A���� �Է��ϼ��� : 15
 * B���� �Է��ϼ��� : 10
 * 
 * 15+10 = 25
 * 
 * 
 */
public class InputTest2 {
public static void main(String[] args) throws NumberFormatException, IOException{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int value_a;
	int value_b;
	
	System.out.print("A�� �Է��ϼ��� : ");
	value_a=Integer.parseInt(br.readLine());
	
	System.out.print("B�� �Է��ϼ��� : ");
	value_b=Integer.parseInt(br.readLine());
	
	System.out.println(value_a+ "+"+ value_b+ "="+(value_a+value_b));
	
   }
}