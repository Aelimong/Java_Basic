package step02_������;

public class OperatorEx {

	public static void main(String[] args) {
		
		//������ �ʱ�ȭ
		
		String a=null;//���� ���� //String a=""; �� ��쿣 null�� �Ҵ� �� �������� �ƹ��͵� �� ���� ����
		int b=0; //���� �������� ��� int b; �� �� ��� error ó�� (�ٸ� ���� �����Ⱚ�� �־��ش�)
		float c=0.0f;
		char d='\0'; //�ι��� (null���� �ٸ���!)
		
		System.out.println(a+" "+b+" "+c+" "+d);
		
	
		char code='��'; 
		//JAVA, Python �� ��쿣 �ѱ۵� �� ���� (char)�� ��� (c���� ���� ���� string ���)
		
		String gender;
		gender=(code=='M'|| code=='��')?"man":"woman";
		//3�� ������
		//(code=='M'|| code=='��') �� ����� True �� man, False �� woman
		System.out.println("���� : "+gender);
		
		boolean ck=true;
		System.out.println(!ck);
		
//======================================================================================
		int k = 5;
		
		System.out.println(k++); //5 (���� �� ���� - ȭ�鿣 5�� ��� �� �� 1 ���� ���� 6�� �޸𸮿� ����)
		System.out.println(++k); //7 (������ k �� 6�� �ǹǷ� ++k �� 6+1 = 7 �� �ȴ�)
		System.out.println(k);   //7
		System.out.println(--k); //6 (���� ������ : ���� �� ���� ==>7-1=6)
		System.out.println(k--); //6 (���� �� ���� : ȭ�鿡 �ϴ� 6�� ��� �޸𸮿� 6-1=5 �� ����)
		
		
		int p=3;
		p+=2; // p=p+2
		p*=3; // p=p*3
		p-=2; // p=p-3
		p%=3; // p=p%3 (������ 1)
		
		
//--------------------------------------------------------------------------------
		
		int score2=17;
		boolean sw = (score2>=70 && score2 <90);
		//boolean �ڷ��� : True, False �� �Ǵ��ϴ� ����

		System.out.println(sw);

		
//--------------------------------------------------------------------------------
		System.out.println(5/3); // ����� : 1 (��)
		System.out.println(5%3); // ����� : 2 (������)
		
		int a2=5;
		
		System.out.println(a2==5); //a�� 5�ΰ�? ����� : True //�º��� �������� �Ǵ�
		
		System.out.println(a2>=5); //a�� 5���� ũ�ų� ������
		System.out.println(a2!=5); //a�� 5�� �ƴѰ�? ����� : false
		
		String str="korea";
		System.out.println(str=="korea"|| str=="KOREA" );
		//�� ���� True �� ������ �ڿ��� �������� �ʴ´� (OR ����)
		
		int	 score=57;
		System.out.println(score>=70&&score<90);
		//AND ����
		
	}

}
