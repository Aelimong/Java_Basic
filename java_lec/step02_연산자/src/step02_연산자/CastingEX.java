package step02_������;

public class CastingEX {

	public static void main(String[] args) {
		
		int pay=857650;
		double tax=0.033; // Ȥ��	 int tax=(int)0.033
		int rPay=pay-(int)(pay*tax); 
		// �Ǽ� - ���� = ���� �̹Ƿ� Error �߻�, (int) �� casting(=����ȯ)
		
		System.out.println("�Ǽ��ɾ� : "+rPay);

//=====================================================================================
		
		int k=87, e =88, m=75;
		int total = k+e+m;
	//	double avg = total/3;    // (�Ǽ� / ����) ==> ����
	//	double avg = (double)total/3;  // �ڵ�����ȯ  
	    double avg = total/3.0;    // �ڵ�����ȯ

		System.out.println("���� : "+ total);
		System.out.println("��� : "+ avg);
		
		byte a = 100;
		int b = a; //�ڵ� ����ȯ
		
		double c = 73.45;
		int d = (int) c; //���� ����ȯ
				
		System.out.println(a + " " + b);
		System.out.println(c + " " + d); //����, ���� �κ� �� ���� �κ�(�Ǽ� �κ�) �� ��� ��

	}

}
