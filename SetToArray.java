package MyJavaPrograms_1;

import java.util.HashSet;
import java.util.Set;

public class SetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Conversion of set to array (for string contents) : it can be either hashset or treeset
		
		Set<String> s = new HashSet<String>();
		
		s.add("World");
		s.add("Of");
		s.add("Geeks");
		
		
		int setLen = s.size();
		
		String arr[] = new String[setLen];
		
		int i = 0;
		for(String  k :s)
		{
			arr[i] = k;
			
			System.out.println(arr[i]);
			
		}
		
		
		
		
		/*for(String  m :arr)
		{
			
			System.out.println(m);
		}*/
		
		
	}

}
