package objectArry;
//������Ʈ �迭 -1

public class UserEx2 {
	public static void main(String[] args) {
		User[] ob=new User[3];
		int [] num=new int[3];
		
		ob[0]=new User("kim","010-123-4567");
		ob[1]=new User("lee","010-123-4567");
		ob[2]=new User("park","010-123-4567");
		
		for(int i=0; i<ob.length; i++) {
			System.out.println(ob[i].getName()+"\t"+ob[i].getPhone());
		} //Object Arry
	}
}
