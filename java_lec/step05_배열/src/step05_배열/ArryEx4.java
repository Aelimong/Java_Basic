package step05_�迭;

public class ArryEx4 {

	public static void main(String[] args) { 
		//main �Լ��� �ü���� ȣ��
		
		int [] num = new int[3];
		/*
		new ������ ==> �ν��Ͻ� ����, Heap �޸� ���� �Ҵ�, ��ü���� ������ ����
		�ν��Ͻ�(instance)�� �ش� Ŭ������ ������ ��ǻ�� ����������� �Ҵ�� ��ü�� �ǹ�
		��, new �����ڰ� �ϴ� ���� class �� ������ �Լ��� �������� �Ҵ��� �ִ� ������ �Ѵ� (class���� �Ļ��� ��ü ����)
		*/
		
		num[0]=Integer.parseInt(args[0]);
		num[1]=Integer.parseInt(args[1]);
		num[2]=Integer.parseInt(args[2]);
		
		// �ִ밪, �ּҰ� ���ϱ�
		int max=num[0];
		int min=num[0];
		
		for(int i=1; i<num.length; i++) {
			if(num[i] > max) max=num[i];
			if(num[i] < min) min=num[i];
		}
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		/*
		 * Math.max(a, b) �� ��� ����
		 * 
		 */

	}	
}
