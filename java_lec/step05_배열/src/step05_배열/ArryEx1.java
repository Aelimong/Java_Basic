package step05_�迭;
//1���� �迭
//String name="ȫ�浿"

//�迭 : ������ �ڷ����� ���ӵ� ������

public class ArryEx1 {
public static void main(String[] args) {
	int[] num=new int[5]; //new ������ : ��ü���� ---�����ڷ��� (���� �����Ϳ� ������ ����)
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	
	
	for(int i=num.length-1; i>=0; i--) {
		
		System.out.println(num[i]);
	}
	
	//���� for���� �̿��Ͽ� ����ϼ���
	for(int n : num) { // 10 20 30 40 50
		System.out.printf("%d ",n); 

	}
}

}
