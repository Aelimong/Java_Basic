package collection1;
//List : ���δٸ� �ڷ����� ���ӵ� ������, �ߺ����� O, �������� O

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
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
		
		for(Object ob:list) {
			System.out.println(ob);
		}
		
		list.remove("second");
		Iterator iter=list.iterator();
				while(iter.hasNext())
					System.out.println(iter.next());
	}
}