package methodex;
//call by value : ���翡 ���� ����

public class MethodEx3 {
	
	public static void show1(int a, char b, double c, float d) {
		System.out.println(a+" "+b+" "+c+" "+d);
	}
	public static int show2(int a, int b, int c) {
		return a+b+c;
		
	}
	public static double show3(int a, int b, int c) {
		
		return a+b+c/3.0;
	}
	public static String show4(int a, int b, int c) {
		
		String temp;
		temp = ((a+b+c/3.0)>=60)?"�հ�":"���հ�"; //3�׿����� ǥ��
		return temp;
		/*
		if((a+b+c/3.0)>60) {
			return "�հ�";
		}
		else {
		return "���հ�";
		}
		*/
	}
	
	public static void main(String[] args) {
		show1(10,'A',100.4,50.3f);
		
		int sum=show2(95,85,73);
		System.out.println("�հ� : "+sum);
		System.out.println("�հ� : "+show2(100,200,300));
		
		double svg=show3(95,85,73);
		System.out.println("��� :"+svg);
		System.out.printf("\n��� : %.2f",svg);
		
		String result = show4(95,85,73);
		System.out.println(" \n\n\n"+result);
		
	}
}
