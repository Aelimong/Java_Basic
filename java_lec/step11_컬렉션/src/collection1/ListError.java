package collection1;
//List : ���δٸ� �ڷ����� ���ӵ� ������, �ߺ����� O, �������� O

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//����Ʈ ���� : �����Ͽ��� �̻� ������ ����ÿ� ����ȯ ���� �߻�
public class ListError {
	@SuppressWarnings(value="unchecked") //type�� Ȯ������ ����

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>(); // <> = generic�� �ǹ�
		list.add("��");
		list.add("����");
		list.add("����");
		list.add(new Integer(4));
		list.add("�ܿ�");
		list.add(5.0f);
		list.add(4.0);
		
	//System.out.println(list);
		
		for(int i=0; i<list.size();i++) {
			String season=(String)list.get(i); //ClassCastException �߻�
			System.out.println(season);
		}
	}
}