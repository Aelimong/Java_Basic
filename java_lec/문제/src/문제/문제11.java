package 문제;
/*
[문제11]다음과 같은 메서드를 작성하고 결과를 완성하시오
(1) output(10,'#') : void 를 호출하여 output메서드에서 출력하시오
(2)출력은 for문을 이용하시오

[출력화면]
# # # # # # # # # # 
*/
public class 문제11 {
	public static void output(int a, char b) {
		
		for(int i=0; i<a; i++) {
			System.out.print(b);
		}
		
	}
public static void main(String[] args) {
	output(10,'#');
}
}
