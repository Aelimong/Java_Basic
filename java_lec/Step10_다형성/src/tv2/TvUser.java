package tv2;
//���յ��� ���� �ڵ�

public class TvUser {
	public static void main(String[] args) {
		String com=args[0];
		Tv tv=null;
		if(com.equals("LG")||com.equals("lg")) { //com=="LG"
			tv=new LgTv();

		}else if(com.contentEquals("SAMSUNG")){
			tv=new SamsungTv();
	
		}else {
			System.out.println("error");
		}
		tv.powerOn();
		tv.soundUp();
		tv.soundDown();
		tv.powerOff();
	}
}
