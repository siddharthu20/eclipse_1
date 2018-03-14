package MyJavaPrograms_1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Sid");
		list.add("Ishh");
		list.add("Rohan");
		list.add("Roshni");
		
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		list.removeFirst();
		
		
		Iterator<String> itr1 = list.iterator();
		
		System.out.println("******After removal of first element*****");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		list.removeLast();
		
        Iterator<String> itr2 = list.iterator();
		
		System.out.println("******After removal of last element*****");
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		
		list.add("Rozzy");
        Iterator<String> itr3 = list.iterator();
		
		System.out.println("******After Adding one element*****");
		while(itr3.hasNext())
		{
			System.out.println(itr3.next());
		}
		
		
		String first_element = list.getFirst();
		String last_element = list.getLast();
		
		System.out.println("The first element is: "+first_element);
		System.out.println("The last element is: "+last_element);
		
		
		
		if (list.contains("Rozzyd"))
			System.out.println("True");
		else
			System.out.println("False");
		
		
		System.out.println("The size of the list is: "+list.size());
		
		int index1 = list.indexOf("Ishh");
		
		System.out.println("the index is "+index1);
		
		
		
		
		
		
	}

}
