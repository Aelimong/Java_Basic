package step05_�迭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ũŰ�� 5���� ������ �迭�� ��� �迭�� �����͸� �Է¹޾Ƽ� ����ϰ� �ִ�,
 * �ּҰ��� ���ϼ���
 * 
 * ===���
 * ar[0]�� ���� �Է� : 25
 * ar[1]�� ���� �Է� : -34
 * ar[2]�� ���� �Է� : 10
 * ar[3]�� ���� �Է� : 16
 * ar[4]�� ���� �Է� : 8
 * 
 * 25 -34 10 16 8
 * 
 * �ִ밪 : 25
 * �ּҰ� : -34
 * 
 * */
public class ArryEx5 {
	
public static void main(String[] args) throws NumberFormatException, IOException {
	int [] ar = new int[5];
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	for(int i=0; i<5; i++)
	{
		System.out.print("ar["+i+"]�� �Է��ϼ��� : ");
		ar[i]=Integer.parseInt(br.readLine());
	}
	
	
	int max=ar[0];
	int min=ar[0];
	
	for(int i=1; i<ar.length; i++) {
		if(ar[i] > max) max=ar[i];
		if(ar[i] < min) min=ar[i];
	}
	System.out.println("max : "+max);
	System.out.println("min : "+min);
	
}
	

}

