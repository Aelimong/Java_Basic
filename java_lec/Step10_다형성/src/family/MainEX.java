package family;
/*
 *	�̸� : ȫ�浿 
 *  �ƺ��� ������ ���� �Ѵ�
 *  
 *  �̸� : ��û
 *  ������ �������� �Ѵ�
 * 
 * 	�̸� : ȫ��ǥ
 *  �Ƶ��� ���θ� �Ѵ�
 * 
 * 
 */
//�������̽� ��� : ������ �� �ø���, ���յ��� ����Ʈ����.

public class MainEX {

	public static void main(String[] args) {
		Father fa=new Father("ȫ�浿");
		Mother ma=new Mother("��õ");
		Son so=new Son("ȫ��ǥ");
		
		System.out.println(fa);
		System.out.println(ma.toString());
		System.out.println(so);
		System.out.println("=====================================");
		Family [] family=new Family[] {
				new Father("ȫ�浿"),
				new Mother("��õ"),
				new Son("ȫ��ǥ")
		};
		for(Family ob:family) {
			System.out.println(ob);
		}
		
		Family fa1=new Family("ȫ�浿");
		System.out.println(fa1);
	}

}
