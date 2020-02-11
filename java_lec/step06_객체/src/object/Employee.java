package object;
/*
 * -name:String
 * -dept:Sting
 * -pay:int
 * -score:double
 * 
 *  +setNmae(name:String):void
 *  +setDept(dept:String):void
 *  +setPay(pay:int):void
 *  +setScore(score:double):void
 *
 *
 *  +getNmae():String
 *  +getDept():String
 *  +getPay():int
 *  +getScore():double
 */
public class Employee {
	private String name;
	private String dept;
	private int pay;
	private double score;

	public void setName(String name) {
	this.name=name;
	}
	public void setDept(String dept) {
	this.dept=dept;
	}
	public void setPay(int pay) {
	this.pay=pay;
	}
	public void setScore(double score) {
	this.score=score;
	}
	
	public String getName() {return name;}
	public String getDept() {return dept;}
	public int getPay() {return pay;}
	public double getScore() {return score;}
	/*
	getter & setter �� ��� ��Ŭ�� => source => Generate getter and setter
	 �� �ڵ� ���� �����ϴ�.
	*/
	
	@Override
	public String toString() {
		return "�̸���" + name + "�̰�, " + dept + "�� �ٹ��ϸ� �޿���" + pay + "���̰�, �Ի�������" + score + "�� �Դϴ�.";
	}
	/*
	 * ��Ŭ�� => source => GenerateToString()���� toString �ڵ����� ����
	 * */
	
	public void setEmployee(String name,String dept,int pay, double score) {
		
		this.name=name;
		this.dept=dept;
		this.pay=pay;
		this.score=score;
	}
	
	
	
	
}
