package MyJavaPrograms_1;

public class StringOperation10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//program to add "1" to each of the number in the string  and display the updated string in output
		
		//Type-1
		
		String str = "4525";
		
		//output shud be 4525 + 1111 = 5636 
		
		
	//	Integer i[]= new Integer[10]; 
		
		
		Integer j = Integer.parseInt(str);
		
		Integer k = j + 1111;
		
	String res = k.toString();
	
	System.out.println("First Input String is: "+str);
	
	System.out.println("The resultant string is(Type 1): "+res);
	
	
	//Type-2
	
	String str1 = "AB248";
	
	String res1 = str1.substring(0,2) + (Integer.parseInt(str1.substring(2) + 1))	;

	String str2 = "Sid5236";
	
	//output shud be Sid1253 (Adding "1" to the last numbers in the string i.e., 1252 + 1 = 1253)
	
	String firsthalf = str2.substring(0,3);
	String secondhalf = str2.substring(3);
	System.out.println("\nSecond Input String is: "+str2);
	System.out.println("the first half of the string is : "+firsthalf);
	System.out.println("the second half of the string is: "+secondhalf);
	
	
	Integer i = Integer.parseInt(secondhalf) + 1;
	String s = i.toString();
	
	String res45 = firsthalf + s ;

	
System.out.println("The new resultant string is:(Type 2) "+res45);
	}

}
