package objectArry;
//������Ʈ �迭 -2

public class UserEx3 {
	public static void main(String[] args) {
		User[] ob=new User[] {
				new User("kim","010-123-4567"),
				new User("lee","010-123-4567"),
				new User("park","010-123-4567")
		};
		
		
		for(User m:ob) { //���� for��
		 System.out.println(m.getName()+"\t"+m.getPhone());
		} //Object Arry                  
	}
}
