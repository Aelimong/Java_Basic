package forex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForEx4 {
/*
 * BufferedReader�� �̿��Ͽ� �ۼ�
 * 
 * 1. ���ڸ� �Է¹ޱ� (�빮��)
 * 2. �����ϰ� �빮�� 30���� �߻��Ͽ� ȭ�鿡 ���
 * 3. �߻��� ���� �߿� �Է��� ���ڰ� ����� ����ϱ�
 * 
 * ---���
 * �����Է� : K
 * X H G D H I U D R ...K W E R
 * 
 * K�� ���� : 5
 * 
 * 
 * 
 * */
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		char alph;
		char alph2='A';
		int count=0;
		System.out.print("�����Է� : ");
		alph=br.readLine().charAt(0);
		
		for(int i=1; i<=30; i++)
		{	
			alph2+=(Math.random()*26+0);
			System.out.printf(alph2+" ");
			if(alph2==alph) count++;
			alph2='A';
		}
		System.out.println("\n\n"+alph+"�� ���� : "+count);
		}
	}
