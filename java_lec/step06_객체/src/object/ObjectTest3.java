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
class Emp3{
	private String name;
	private String dept;
	private int salary;
	
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return name + "�� " + dept + "�� �ٹ��ϸ� " + salary + "���� �޿��� �޽��ϴ�";
	}
	
}
public class ObjectTest3 {

	public static void main(String[] args) {
		Emp3 em = new Emp3(); //������ (Constructor) �� ���⼭ new �ڿ� ���� Emp3 �� �ǹ��Ѵ�
		em.setName("��ȣ��");
		em.setDept("���ߺ�");
		em.setSalary(1200000);
		System.out.println(em.toString());
		
		System.out.println("�̸� : "+em.getName());
		System.out.println("�μ� : "+em.getDept());
		System.out.println("�޿� : "+em.getSalary()+"��");

	}
}
