package object;

/* 
 * https://hongjinhyeon.tistory.com/25 ����
 *  - (private)     + (public)    # (protected) // ===>���������ڶ� �θ���
 * 
 *  Ŭ������ : Person
 *  +name:String
 *  +age:int
 *  +score:float
 *  +setPerson(name:String, a:int, s:float) : void
 *  +viewPerson():void
 *  
 */

class Person{
	public String name; //�ɹ�(field) ���� ����
	public int age;
	public float score;
	/*
	  	String name; 
		int age;
		float score;
		�� ����
	 * */
	public void setPerson(String name, int age, float score) {
		//�ɹ� �Լ� ����, method
		this.name=name; //this ==> �ڽ��� ��ü ���� �ǹ��Ѵ�.
		this.age=age;
		this.score=score;
	}
	public void viewPerson() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+score);
	}
}

public class ObjectEx1 {
public static void main(String[] args) {
	
	Person ps=new Person(); // new Person : �� ������ �޸𸮸� �Ҵ��ϴ� �ν��Ͻ�
	ps.setPerson("ȫ�浿", 23, 73.5f); //ps:��ü (�ʵ�� �޼����� ����)
	ps.viewPerson();
	//System.out.println(ps.hashCode());

	ps=new Person();
	ps.setPerson("�ε鷡", 25, 90.5f);
	ps.viewPerson();
	//System.out.println(ps.hashCode());
	
	}
}
