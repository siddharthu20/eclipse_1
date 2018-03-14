package MyJavaPrograms_1;

import java.util.HashSet;

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer in = new Integer(2000000000);
		String str = new String("Sid");
		
		System.out.println("For Integer: "+in.hashCode());
		System.out.println("For String: "+str.hashCode());
	
		
		//(S * 31^2) + (i * 31) + d
		
	//	 (83*31^2) + (105*31) + 100  = 79763 + 3255 + 100  = 83118  -----> Logic for hashcode calculation for String
		
		
		
		
		
		//an example:
		
		
		
		String[] str12 = new String("this is not insane ! ! ").split(" ");
		
		HashSet<String> hs = new HashSet<String>();
		
		for(String x:str12)
			hs.add(x);
		
		
		System.out.println(hs.size() + " distinct words detected.");
		System.out.println(hs);

		
	}

}
