package ����;
/*                
 [����12]���θ޼��忡�� ���� �Է¹ް�  compute�޼��带 ȣ���Ͽ� ó���Ͻÿ�
(1)�Է¹��� ����  compute(item, qty, price)�޼����� ó���Ұ�
(2)�������  �ݾ� = ���� * �ܰ� �� �Ͻÿ�

[�Է�ȭ��]
ǰ���� �Է��Ͻÿ� : apple
������ �Է��Ͻÿ� : 10
�ܰ��� �Է��Ͻÿ� : 1200

[���ȭ��]
ǰ�� : apple
�ݾ� : 12000��
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ����12 {
public static void compute(String item1, int qty, int price) {
	System.out.println("ǰ�� : "+item1);
	System.out.println("�ݾ� : "+(qty*price)+"��");
	
}
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String item1;
		int qty1;
		int price1;
		
		System.out.print("ǰ���� �Է��ϼ��� : ");
		item1=br.readLine();
		
		System.out.print("������ �Է��ϼ��� : ");
		qty1=Integer.parseInt(br.readLine());
		
		System.out.print("�ܰ��� �Է��ϼ��� : ");
		price1=Integer.parseInt(br.readLine());
		
		compute(item1,qty1,price1);
	}
}
