package step05_�迭;

public class ArryEx6 {
	public static void main(String[] args) {
		
		int [][] num=new int[][] {
								 {10,40,70,100},
								 {20,50,80,110},
								 {30,60,90,120}
								 };
								 
	for(int i=0; i<num.length; i++) // �ܺ��� for ���� �� ��ȸ
	{
		for(int j=0; j<num[i].length; j++) // ������ for ���� �� ��ȸ
		{
			System.out.print(num[i][j]+"\t");
		}
		System.out.println(" "); //�� �ٲ�
	}
}
}
