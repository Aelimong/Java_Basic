package inputex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//BufferedReader, InputStreamReader

public class InputTest6 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader isr=new InputStreamReader(System.in); 
	//System.in : Ű���� �Է��� �ǹ�
	BufferedReader br=new BufferedReader(isr);
	
	int eno;
	String ename;
	char dept;
	double score;
	
	System.out.print("�����ȣ�� �Է��ϼ��� : ");
	eno=Integer.parseInt(br.readLine()); 
	//br.readLine���� �о���� �� Integer�� �Ľ�
	
	System.out.println("��� �̸��� �Է��ϼ��� :");
	ename=br.readLine();
	
	System.out.println("�μ� �ڵ带 �Է��ϼ��� :");
	dept=br.readLine().charAt(0);
	
	System.out.println("�Ի� ������ �Է��ϼ��� :");
	score=Double.parseDouble(br.readLine());
	
	System.out.println("�����ȣ : "+eno);
	System.out.println("����̸� : "+ename);
	System.out.println("�μ��ڵ� : "+dept);
	System.out.printf("�Ի缺�� : %.2f�� ",score);


	
	
}
}
