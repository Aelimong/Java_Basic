package collection2;

import java.util.HashMap;
import java.util.Map;
//import java.util.*; //==> util �ȿ� �ִ� ��Ű���� ��� �� �̷������� ��� �ȴ�.

public class MapEx2 {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("�ظ�����", Integer.valueOf(95));
		map.put("��", Integer.valueOf(75));
		map.put("�츣�̿´�", Integer.valueOf(85));
		map.put("������", Integer.valueOf(88));
		map.put("����", Integer.valueOf(93));
		map.put("�׺��չ���", Integer.valueOf(66));
		map.put("�ظ�����", Integer.valueOf(85)); //�ظ����Ͱ� �ߺ� �ǹǷ� ����� �߻�
		map.put(null, Integer.valueOf(95));
		map.put(null, Integer.valueOf(95)); // Ű�� null ���
		map.put("�����Ʈ", null); //���� null ���
		
		System.out.println(map);
		
		Integer num=map.get("������");
		System.out.println("������ ������?"+num);
		
		 int n=num.intValue();
		System.out.println(n); //�̷� ������ UnBoxing �̶� �θ���. 
		
		int n2=new Integer(num); //���� ��ڽ�
		System.out.println(n2); 
		
		}
}
	