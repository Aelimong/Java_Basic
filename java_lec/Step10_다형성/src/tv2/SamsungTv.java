package tv2;

public class SamsungTv implements Tv {
	public void turnOn() {
		System.out.println("Samsung TV-������ �Ҵ�");
	}
	public void turnoff() {
		System.out.println("Samsung TV-������ ����");
	}
	public void soundUP() {
		System.out.println("Samsung TV-�Ҹ��� ���δ�");
	}
	public void soundDown() {
		System.out.println("Samsung TV-�Ҹ��� ���δ�");
	}
	@Override
	public void powerOn() {
	}
	@Override
	public void powerOff() {
	}
	@Override
	public void soundUp() {
	}
}
