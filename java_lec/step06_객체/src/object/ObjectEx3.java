package object;
/*
 *  setter & getter
 *  : �ɹ����� �ϳ��� �ϳ��� ���� �����ϴ� setter��
 *    �� ���� �����ϴ� getter
 * 
 */
class Member{
	//private ���� �� �ܺο��� ���� �Ұ� 
	// ==> ex. main ���� Member Ŭ������ name,age,tall ��� �Ұ�
	private String name;
	private int age;
	private double tall;
	
	//�ܺ� ���� ������ ���� setter�� public���� ������ �� �ش�.
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setTall(double tall) {
		this.tall=tall;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age; 
	}
	public double getTall() {
		return tall;
	}
}
public class ObjectEx3 {
	public static void main(String[] args) {
		Member ob=new Member();
		ob.setName("ȫ�浿");
		ob.setAge(25);
		ob.setTall(185);
		
		System.out.println("�̸� : "+ob.getName());
		System.out.println("���� : "+ob.getAge()+"��");
		System.out.println("���� : "+ob.getTall()+"cm");
	}
}
