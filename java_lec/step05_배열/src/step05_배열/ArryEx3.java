package step05_�迭;
// $java ArryEx3 abcd ������ 123 12345
public class ArryEx3 {
	public static void main(String[] args) {
	System.out.println("args�� ���� : "+args.length);
	
	for(int i=0; i<args.length; i++) {
		System.out.println("args["+i+"] : " +args[i]);
		System.out.println("args["+i+"]�� ũ�� : " +args[i].length());
		System.out.println();
		}
//==========���� for ������ ����غ�����==========================
	
	for(String i:args) {
		
		System.out.println(i);
		System.out.println(i.length()+"\n");
		
		}
	}
}
