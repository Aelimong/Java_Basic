package exception;
//������ �θ��� �ڷ������� ����ȯ ���� �����ͺ��̽����� �������̽� ���(?) 
public class ExceptionEx1 {

	public static void main(String[] args) {
		
		int var = 5;
		try { //unchecked exception
			
			int n = Integer.parseInt(args[0]);
			System.out.println(var/n);
		} catch(Exception e) {
			
			System.out.println("�Էµ� ���� ������ �־��..");
		}

	}

}
		/* $ java ExceptionEx1 2 ==> 2
		 * $ java ExceptionEx1 0 ==> 0���� ������ ����� 
		 * $ java ExceptionEx1 p ==> ���ڷ� �ٲ� �� �����ϴ� 
		 * $ java ExceptionEx1   ==> �Էµ� ���� �����
		 * $ java ExceptionEx1 p ==>
		 * 
		 */
		
//		int var = 5;
//		try { 
//			
//			int n = Integer.parseInt(args[0]);
//			System.out.println(var/n);
//		
//		} catch (ArithmeticException e) {
//			
//			System.out.println("0���� ������ �����" + e.getMessage());
//			
//		}
//		
//		catch (NumberFormatException e) {
//			
//			System.out.println("���ڷ� �ٲ� �� �����ϴ�" + e.toString());
//			
//		}
//		
//		catch (ArrayIndexOutOfBoundsException e) {
//			
//			System.out.println("�Էµ� ���� �����ϴ�");
//			
//		} finally { //������ �Էµǵ� ����
//			
//			System.out.println("������ ����");
//			
//		}
//		
	