package ifEx;
/*
 * a ������ 55 �Ǵ� 46�� ������ ��
 * 1. if ���� �̿��Ͽ� "55�� 50���� ũ�ų� ����" �Ǵ� "46�� 50���� �۴�"
 * 2. if~else�� �̿� ==> a�� ������ Ȧ������ ¦������ ��� ==> "55�� Ȧ���Դϴ�" �Ǵ� "46�� ¦���Դϴ�"
 * 3. if~else~if�� �̿�, a�� ���� ���,����,zero ���� ���, "55�� ����Դϴ�"...
 * */
public class ifEx3 {
	public static void main(String[] args) {
		int a = 0;
		if(a>=50)System.out.println(a+"�� 50���� ũ�ų� ����");
		if(a<50)System.out.println(a+"�� 50���� �۽��ϴ�.");
		
		if(a%2==0)System.out.println(a+"�� ¦���Դϴ�");
		else System.out.println(a+"�� Ȧ���Դϴ�");
		
		if(a>0)System.out.println(a+"�� ����Դϴ�");
		else if(a<0)System.out.println(a+"�� �����Դϴ�");
		else System.out.println(a+"�� ZERO �Դϴ�");
	}
}
