package ifEx;

public class ifEx1 {

	public static void main(String[] args) {

		int score0=90;
		char grade0='\0';
		
		if(score0>=90 && score0<=100) grade0='A';
		if(score0>=80 && score0<=90) grade0='B';
		if(score0>=70 && score0<=80) grade0='C';
		if(score0>=60 && score0<=70) grade0='D';
		if(score0>=0 && score0<=60) grade0='F';

		System.out.println("������ "+ score0+ "���̰�, ������"+grade0+"�Դϴ�");
//==========================================================================
		//if~else~if��
		int jumsu=95;
		char grade;
		
		if(jumsu>=90) grade='A';
		else if(jumsu>=80) grade='B';
		else if(jumsu>=70) grade='C';
		else if(jumsu>=60) grade='D';
		else grade='F';
		
		System.out.println("������ "+ jumsu+ "���̰�, ������"+grade+"�Դϴ�");
//=======================================================		
		
		//if~else ��
		int score=45;
		if(score>=60) {
			System.out.println("�հ�");
			System.out.println("������ "+score+"�� �Դϴ�.");
		}
		else
		{
			System.out.println("���հ�");
			System.out.println("������ "+score+"�� �̸�, ���� ��ȸ��....");
		}
//=======================================================		
		String str="korea";
		
		if(str=="korea") {
			System.out.println("���ѹα�");
		}
		System.out.println("********");
	

	}

}
