package exception;
//����� ���� ����ó�� 
class MyException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException() {
		
		System.out.println("�ֵ��� ���� ~");	
		
	}
	
}

public class ExceptionEx4 {
	
	public static void main(String[] args) throws MyException {

		int age = Integer.parseInt(args[0]);
		
		if(age < 19)
			throw new MyException();
		else
			System.out.println("���~");
	}

}
