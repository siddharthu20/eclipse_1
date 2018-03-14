package MyJavaPrograms_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set can only contains unique values ,no dublicate values are allowed.
		
		System.out.println("\n**********Through HashSet**********");
        Set<String> s = new HashSet<String>();
        
        s.add("Sid");
        s.add("Issh");
        s.add("Ram");
        s.add("Issh");
        s.add("Anjan");
        s.add("Priyanka");
       
        Iterator<String> itr = s.iterator(); 
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        
        
		
        System.out.println("\n**********Through TreeSet**********");
        Set<String> s1 = new TreeSet<String>();
        s1.add("Rajiv");
        s1.add("Kashy");
        
        Iterator<String> itr2 = s1.iterator();
        while(itr2.hasNext())
        {
        	
        	System.out.println(itr2.next());
        }
        
        
        System.out.println("\n**********Through LinkedHashSet**********");
        
        Set<String> s2 = new LinkedHashSet<String>();
        s2.add("Pawan");
        s2.add("Anwesha");
        s2.add("Raghu");
        
        
        Iterator<String> itr3 = s2.iterator();
        while(itr3.hasNext())
        {
        	
        	System.out.println(itr3.next());
        }
        
       
        
        
	}

}
