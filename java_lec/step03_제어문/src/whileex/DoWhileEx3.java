package whileex;
/*
 * do~while�� �̿��Ͽ� 65~90 ������ ���� 10 �����ϱ�
 * 
 * 
 * */

import java.util.Random;


public class DoWhileEx3 {
public static void main(String[] args) {
	
	int i=0;
	int random_number;
	//RandomŬ���� �̿�
	Random rd=new Random();
	
//	int n1=rd.nextInt(101)+0; //0~100
//	int n2=rd.nextInt(31)+50; //50~80
//	int n3=rd.nextInt(41)+30; //30~70
	
	do {
		random_number=rd.nextInt(26)+65; 
		//random_number=(int)(Math.random()*26+65); //Math Ŭ������ ����� ���
		System.out.println(random_number);
		++i;
	}while(i<10);
}

}
