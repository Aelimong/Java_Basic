package temp;

import java.util.Random;

//���� : ��ǻ�Ͱ� ������ ���ڸ� �߻� ��Ű�� ��, �ǻ糭��, Pseudo random


public class RandomEx {

	public static void main(String[] args) {
	//	Math Ŭ����----
	System.out.println(Math.random()); //0~1 �̸��� �Ǽ�
	
	System.out.println((int)(Math.random()*10+1)); //1~11 �̸�
	System.out.println((int)(Math.random()*31+50)); //50~80 ������ ����
	System.out.println((int)(Math.random()*30+51)); //51~80 ������ ����
	
	//RandomŬ���� �̿�
	Random rd=new Random();
	
	int n1=rd.nextInt(101)+0; //0~100
	int n2=rd.nextInt(31)+50; //50~80
	int n3=rd.nextInt(41)+30; //30~70
	
	System.out.println(n1 +" "+n2+" "+n3);
	
	}

}
