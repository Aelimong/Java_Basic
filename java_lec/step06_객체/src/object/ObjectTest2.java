package object;
/*
 * +�� public, -�� private �� �ǹ�
 * 
 * Ŭ������ : Emp
 * -name:String
 * -dept:String
 * -salary:int
 * 
 * +setEmp(name:String,dept:String,salary:int):void
 * +printEmp():void
 *
 * 
 * --ȫ�浿 ����� ���ߺο� �ٹ��ϸ� 1520000���� �޿��� �޾ƿ�
 * 
 * 
 * */
class Emp2{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name, String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public String printEmp() {
		return name+"����� "+dept+"�� �ٹ��ϸ� "+salary+"���� �޿��� �޾ƿ�";
	}
}
public class ObjectTest2 {
	public static void main(String[] args) {
		Emp2 em=new Emp2();
		em.setEmp("ȫ�浿", "���ߺ�", 1520000);
		System.out.println(em.printEmp());
	}
}
