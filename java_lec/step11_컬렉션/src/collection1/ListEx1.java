package collection1;
//List : ���δٸ� �ڷ����� ���ӵ� ������, �ߺ����� O, �������� O

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx1 {
	@SuppressWarnings(value="unchecked") //type�� Ȯ������ ����

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(4);
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		list.add(5.0f);
		
	//System.out.println(list);
		
		list.remove("second");
		Iterator iter=list.iterator();
				while(iter.hasNext())
					System.out.println(iter.next());
	}
}