package MyJavaPrograms_1;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> m = new HashMap<String, Integer>();

		m.put("Sid", 1);
		m.put("Issh", 2);
		m.put("Ram", 4);
		m.put("shyam", 5);
		m.put("Rahul", 0);
		
		System.out.println(m);
		
		
		Integer res = m.get("Issh");
		System.out.println(res);

		System.out.println(m.containsKey("Sid"));
		System.out.println(m.containsValue(2));
		System.out.println(m.containsKey("Siddharth"));
		System.out.println(m.containsValue(3));
		
		System.out.println("Set of keys: "+m.keySet());
		System.out.println("Set of Values: "+m.values());
		System.out.println("Set of Key - Values pair: "+m.entrySet());
		
}}
