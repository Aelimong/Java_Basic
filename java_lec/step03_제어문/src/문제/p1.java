package ����;

public class p1 {
public static void main(String[] args) {
	//���� 1
	/*
	 * 
	 * [����1] �޿������� �ۼ��Ͻÿ�
  		����1) �⺻���� 1500000��,������ 55000��,������ �⺻���� 10%
            pay=1500000 / tpay=55000 / tax=0.1  
  		����2) �Ǽ��ɾ� = �⺻�� + �ð����� - ����
           
		[���ȭ��] 
		�Ǽ��ɾ� : 1405000��
	 * */
	
	int pay=1500000, tpay=55000;
	double tax=0.1;
	
	System.out.println("�Ǽ��ɾ� : "+(int)(pay+tpay-(pay*tax))+"��");
	
		/*
		 * [����2] ���������� �����Ͽ� ����Ͻÿ� ����1) data�� ��ȿ��, ���ߺ�, �븮, 1500000�� ���� �������� ����
		 * name,dept,position,sal�� �Ұ� ����2)����� �Ʒ��� ���� �޼���(�Լ�)�� �̿��Ͻÿ�
		 * 
		 * [���ȭ��] �̸� : ��ȿ�� ---> println �μ� : ���ߺ� ---> printf ���� : �븮 ---> print 1�����Ἥ
		 * ����,�޿���� �޿� : 1500000��
		 */
	String name="��ȿ��",dept="���ߺ�",position="�븮";
	int sal=1500000;
	
	System.out.println("�̸� : "+name);
	System.out.printf("�μ� : %s",dept);
	System.out.print("\n���� : "+position+"\n�޿� : "+sal);
	
	
		/*
		 * [����3] ���� ���� ���� �����Ͽ� ����Ͻÿ� 
		 * (name : �ε鷡 / kor : 90 / eng : 70 / mat : 75)
		 * 
		 * [���ȭ��] �̸� : �ε鷡 �հ����� : 235�� ������� : 78.3 <-- �Ҽ� 1�ڸ���������Ͻÿ�
		 */
	String name2="�ε鷡";
	int kor= 90,eng=70,mat=75;
	System.out.println("\n\n\n�̸� : "+name2+"  �հ�����"+(kor+eng+mat)+"  �������"+(kor+eng+mat/3));
	}
}
