package family;

public class Mother extends Family implements Job{
	public Mother() {
	}
	public Mother(String name) {
		super(name);
	}
	@Override
	public String work() {
		return "������ �������� �Ѵ�\n";
	}
	@Override
	public String toString() {
		return super.toString()+work();
	}
}
