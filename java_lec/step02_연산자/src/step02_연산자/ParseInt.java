package step02_연산자;

public class ParseInt {
	
public static void main(String[] args) {
	String a="100"; // 문자열 100
	String b="200"; // 문자열 200
	
	int a1=Integer.parseInt(a); //"100" ---> 100
	int b1=Integer.parseInt(b); //"200" ---> 200

	System.out.println(a+b); // 연결의 의미
	System.out.println(a1+b1); // 더하기의 역할

	}
}
