package ����;
/*
 * [����14]���� 2���� ������ ����� ���α׷��� ����ÿ�
(1) package���� test14�� �ϰ� Emp.java   EmpEx.java������ ����ÿ�
(2) ���ϸ� : Emp  --main()���� X
+name:String
+age:int
+tall:double
+setEmp(name:String, age:int, tall:double):void
+viewEmp():void
          
(3) ���ϸ� : EmpEx   --main()���� O
Emp ob=new Emp();
ob.setEmp("�̼���", 25, 175.3);
ob.viewEmp();

(4) ���ȭ��
���� �̸��� �̼����̸�, 25���̰� Ű�� 175.3cm�Դϴ�
*/
public class Emp {
	private String name;
	private int age;
	private double tall;
	
	public void setEmp(String name, int age, double tall) {
		this.name=name;
		this.age=age;
		this.tall=tall;
		
	}
	
	public String viewEmp() {
		return "���� �̸��� "+name+"�̸�, "+age+"���̰� Ű�� "+tall+"cm�Դϴ�";

	}
}
