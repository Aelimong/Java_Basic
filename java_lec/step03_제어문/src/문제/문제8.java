package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
[����8]����ó�����α׷�
�߰����,�⸻���,����Ʈ,�⼮������ �Է¹޾Ƽ� ����Ͻÿ�

����1) (�߰�+�⸻)/2      ---> 60%
  ����                   ---> 20%
  �⼮                   ---> 20%

����2)  90�̻� 'A'����     (3)A,B����  ---->"excellent"
   80�̻� 'B'����        C,D����  ---->"good"
   70�̻� 'C'����        F����    ---->"poor"
   60�̻� 'D'����        (switch���̿�) 
   ������ 'F'����
   (if~else if���̿�)

[�Է�ȭ��]
�߰���縦 �Է��Ͻÿ� : 90
�⸻��縦 �Է��Ͻÿ� : 89
���������� �Է��Ͻÿ� : 99
�⼮������ �Է��Ͻÿ�: 100

[���ȭ��]
����=93.20      <---�Ҽ����� 2°�ڸ�����
����=A              System.out.printf("���� : %.2f", avg);
��=excellent
------------------------------------------------------------------------
*/
public class ����8 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	int middle,finalt,report,attendence;
	float score=0;
	
	System.out.print("�߰���縦 �Է��ϼ��� : ");
	middle=Integer.parseInt(br.readLine());
	System.out.print("�⸻��縦 �Է��ϼ��� : ");
	finalt=Integer.parseInt(br.readLine());
	System.out.print("���������� �Է��ϼ��� : ");
	report=Integer.parseInt(br.readLine());
	System.out.print("�⼮������ �Է��ϼ��� : ");
	attendence=Integer.parseInt(br.readLine());
	
	score=(float) ((int)((middle+finalt)/2)*0.6+(report*0.2)+(attendence*0.2));
	
	if(score>=90) System.out.printf("\n���� : %.2f \n����=A\n��=excellent",score);
	else if(score>=80)System.out.printf("\n���� : %.2f \n����=B\n��=excellent",score);
		else if(score>=70)System.out.printf("\n���� : %.2f \n����=C\n��=good",score);
			else if(score>=60)System.out.printf("\n���� : %.2f \n����=D\n��=good",score);
				else System.out.printf("\n���� : %.2f \n����=F\n��=poor",score);



	
	}
}
