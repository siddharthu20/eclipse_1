package MyJavaPrograms_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*ArrayList<String> list = new ArrayList<String>();
		
		list.add("Sid");
		list.add("Raj");
		list.add("Rony");
		
	
		 System.out.println("*******Iterating with Iterator() method*********");
		 
		 System.out.println("\n");
		Iterator<String> itr = list.iterator();
		
		System.out.println("So the full Array list is: ");
		while(itr.hasNext())
		{
	
			System.out.println(itr.next());
		}
		
		System.out.print("\n");
		System.out.println("Array List after removal an item from index 1 is:");
		
		list.remove(1);
		
         Iterator<String> itr1 = list.iterator();
		
		while(itr1.hasNext())
		{
	
			System.out.println(itr1.next());
		}
		
	//	System.out.println("Array List after removal is:");
		
		//System.out.println(list);
		
		System.out.print("\n");
		System.out.println("After clearing the list: ");
		
		list.clear();
		
		Iterator<String> itr2 = list.iterator();
		
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		
		
		
          System.out.println("Display true,if the list is empty: "+list.isEmpty());
          
          System.out.print("\n");
          
          
          
       list.add("Sid");
       list.add("Raj");
       list.add("Roshan");
       
       System.out.println("So the new list is: "+list);
       
       System.out.println("Display true,if the list is empty,otherwise False: "+list.isEmpty());
       
       
       //iterating through for each loop
System.out.print("\n");
       System.out.println("*******Iterating with For each loop*********");
       for(String str : list)
       {
    	  System.out.println(str);   
       }

	
       ArrayList<String> list2 = new ArrayList<String>();
       
       list2.add("Tina");
       list2.add("Anjali");
       System.out.print("\n");
       System.out.println("The new list is: ");
       
       for(String nam:list2)
       {
    	   System.out.println(nam);
       }
       
       System.out.print("\n");
       System.out.println("Now adding the first list to the 2nd list");
       
       list2.addAll(list);
       
       Iterator<String> itr3 = list2.iterator();
       System.out.println("So the list after combining both the list is:");
       while(itr3.hasNext())
       {
    	   
    	   System.out.println(itr3.next());
       }
       
       
       
       System.out.println("\nAfter retaining the list: ");
       
       list2.retainAll(list);
       
       Iterator<String> itr8 = list2.iterator();
       
       while(itr8.hasNext())
       {
    	   System.out.println(itr8.next());
       }
       
       
       
       
       //for list2

       Iterator<String> itr4 = list2.iterator();
       
       while(itr4.hasNext())
       {
    	   
    	   System.out.println(itr4.next());
       }
     System.out.println(list2.size());
      
   //for list

     Iterator<String> itr5 = list.iterator();
     
     while(itr5.hasNext())
     {
  	   
  	   System.out.println(itr5.next());
     }
   System.out.println(list.size());
     */  
       
   
   
   ArrayList<String> list5 = new ArrayList<String>();
   list5.add("Roshni");
   list5.add(null);
   list5.add("Abhi");
   
   
   
   Iterator<String> itr9 = list5.iterator();
   
   while(itr9.hasNext())
   {
	   
	   System.out.println(itr9.next());
   }
   
   System.out.println("The size of the list is: "+list5.size());
   
   }
	
	
    
	
	

}
