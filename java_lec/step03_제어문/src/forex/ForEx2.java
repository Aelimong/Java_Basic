package forex;

public class ForEx2 {
	public static void main(String[] args) {
		
		//�迭 : ������ �ڷ����� ���ӵ� ������
		int [] num= {101, 102, 103, 104, 105}; //�迭 ����
		
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
		
		//���� for��
		for(int n : num) { // (������)'�迭�� ó������ ������'  ����
			System.out.println(n); //�Ϻκθ� �ʿ��� ��쿣 �Ϲ��� for �� ��� 
									// (��ü�� �� ������ �� ���� ����Ѵ�) 
		}
		//======================================================================
			String[] color= {"red","green","blue"};
			
			for(int j=0; j<color.length; j++) {
				
				System.out.println(color[j]);
			}
			
			for(String k : color) {
				
				System.out.println(k);
			}
			
			for(int a=1; a<=10; a++) {
				
				if(a==5) {
				//	break; //==> for�� ���� break	
					continue; // ��� : 1 2 3 4 6 7 8 9 10 ==> 5�� ������.
				}
				System.out.println(a+" ");
			}
	}
	
}
