package test20;
/*
[����20]���� �������� �޾� ���̸� ����ϰ� ����Ͻÿ�
(1)package���� test20�� �ϰ� CircleEx.java������ �ϳ� ���� 
Ŭ������ 2�� �߰��Ͻÿ�

(2)Ŭ������ : Circle
-r:int

+Circle(r:int)
+getSize():double

(3) Ŭ������ : CircleEx	
Circle ob=new Circle(10);
System.out.println("���ǳ��� : " + ob.getSize());

(3)���ȭ��
������ 10�� ���� ���̴� 314.16�Դϴ�* 
*/
class Circle {
	
	int r;

	public Circle(int r) {		
		this.r=r;

	}

	public double getSize() {
		return (double) r*r*3.141;
	}
}
