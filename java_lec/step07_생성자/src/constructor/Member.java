package constructor;

public class Member {
		private String name;
		private int age;
		
		public Member() {
		// default ������ 
		//�̰� ������ ConstructorEx7 �� Member ob2=new Member(); �� ������ ����.
	
			name="��Ƽ";
			age=22;
		}
		public Member(String name, int age) { //������
			this.name=name;
			this.age=age;
		}
		public void view() {
			System.out.println("�̸� : "+name);
			System.out.println("���� : "+age);
		}
		
}
