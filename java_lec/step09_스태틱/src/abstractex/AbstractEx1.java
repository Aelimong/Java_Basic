package abstractex;
/*
class AA{ //�Ϲ�Ŭ����
	public void view1() {
	System.out.println("view1 method");	
	}
	
	public void view2() {
	System.out.println("view2 method");	
	}
}
class BB extends AA{
	@Override
	public void view1() {System.out.println("view11 method");}
	//AAŬ������ view1()�� ������ - �������� ����
		
}
public class AbstractEx1 {
	public static void main(String[] args) {
		AA ob=new AA(); //��ü ���� ����
		ob.view1(); //view1
		ob.view2(); //view2
	
		AA ob2=new BB(); //ob2�� ���� ������ ����� �ļհ�ü ����
		ob2.view1();
		ob2.view2();
		
	}
	

}*/
/*

//abstract : �̿ϼ� ���¸� �ǹ��Ѵٶ�� �����ϸ� �ȴ�
abstract class AA{ //�߻� (�̿ϼ�) Ŭ����
	abstract public void view1();
	public void view2() {System.out.println("view2 method");}
}
class BB extends AA{
	@Override
	public void view1() {System.out.println("view11 method");}
	//AAŬ������ view1()�� ������ - �������� ����
		
}
public class AbstractEx1 {
	public static void main(String[] args) {
	//	AA ob=new AA(); //��ü ���� �Ұ��� (abstract, �� �̿ϼ� �̱� ����)
	
	// 	ob.view1(); //view1
	//  ob.view2(); //view2
	
		AA ob2=new BB(); //ob2�� ���� ������ ����� �ļհ�ü ����
		ob2.view1();
		ob2.view2();
		
	}
}
*/

abstract class AA{ //�߻� (�̿ϼ�) Ŭ����
	public void view1() {}; 
	public void view2() {System.out.println("view2 method");}
}
class BB extends AA{
	@Override
	public void view1() {System.out.println("view11 method");}
	//AAŬ������ view1()�� ������ - �������� ����		
}
public class AbstractEx1 {
	public static void main(String[] args) {
	//	AA ob=new AA(); //��ü ���� �Ұ��� (class�� ������ �̿ϼ� �̹Ƿ�)
	//**abstract �� ������ ���鿡�� ���� ����Ѵ�.(�������� ����)**
	// 	ob.view1(); //view1
	//  ob.view2(); //view2
	
		AA ob2=new BB(); //ob2�� ���� ������ ����� �ļհ�ü ����
		ob2.view1();
		ob2.view2();
	}
}
