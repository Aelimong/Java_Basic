package methodex;

/*
 * ---���
 * ���� : 253��
 * ��� : 84.33��
 * ���� : B (90�� A, 80�� B ...)
 * ��� : �հ�
 * -----------------------------------------------
 * ���� : switch �̿��Ͽ� ���ϱ�  
 * ��� : if~else 	F�� ���հ�, �ƴϸ� �հ��� return
 * 
 * 
 * */

public class MethodEx4 {
	public static int total(int k, int e, int m) {
		
		return k+e+m; //return�� ȣ���� ������ �ǵ��ư�...(���� ������)
	}
	
	public static double avg(int tot) {
		
		return tot/3.0;
	}

	public static char grade(double av) {
		//switch �� ����ϱ�
		
		switch((int)(av/10)) {
		case 9: return 'A'; 
		case 8: return 'B'; 
		case 7: return 'C'; 	
		case 6: return 'D';
		default: return 'F';

		}
	}
	public static String result(char gr) {
		//�հ�, ���հ� �����ϱ�
		if(gr=='F') {
			return "���հ�";
		}
		else return "�հ�";
		
	}
	public static void main(String[] args) {
		int k=95, e=85, m=73;
		
		System.out.println("���� : "+total(k,e,m));
		System.out.printf("��� : %.2f\n",(avg(total(k,e,m))));
		System.out.println("���� : "+grade(avg(total(k,e,m))));
		System.out.println("��� : "+result(grade(avg(total(k,e,m)))));
	}

}
