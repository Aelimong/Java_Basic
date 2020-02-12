/*
package constructor;

public class ConstructorEx2 {
	
	public ConstructorEx2() { //default constructor //4��°�� ȣ��
		System.out.println("default constructor");
	}
	public ConstructorEx2(String str){
		this(); //3������ ȣ��
		System.out.println(str+" constructor"); //5��°�� ȣ��
	}
	public ConstructorEx2(String str, int n) {
		this();		//default constructor �� �ҷ����°� //2��°�� ȣ��
		System.out.println(str+" "+n+" constructor"); //6��°�� ȣ��
	}

	public static void main(String[] args) {
		new ConstructorEx2("������",10); //1��°�� ȣ�� //7��°�� ���ƿ�
		
	}
}
*/
/*
package constructor;

public class ConstructorEx2 {
	
	public ConstructorEx2() { 
		this("������",10); //2��°�� ȣ��
		System.out.println("default constructor"); // 6��°�� ȣ��
	}
	public ConstructorEx2(String str){
		System.out.println(str+" constructor"); // 4��°�� ȣ��
	}
	public ConstructorEx2(String str, int n) {
		this(str); // 3��°�� ȣ��	
		System.out.println(str+" "+n+" constructor"); // 5��°�� ȣ��
	}

	public static void main(String[] args) {
		new ConstructorEx2(); // 1��°�� ȣ��
		new ConstructorEx2("������"); // 7��°�� ȣ��
	} 
}
*/
package constructor;

public class ConstructorEx2 {
	
	public ConstructorEx2() { 
		System.out.println("default constructor"); // 4
	}
	public ConstructorEx2(String str){
		this(str,10); //2
		System.out.println(str+" constructor"); //6
	}
	public ConstructorEx2(String str, int n) {
		this(); //3
		System.out.println(str+" "+n+" constructor"); //5
	}

	public static void main(String[] args) {
		new ConstructorEx2("������"); // 1
		new ConstructorEx2("������"); // 7
	} 
}