package MyJavaPrograms_1;

public class StrRev_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "This is so insane";
		
		System.out.println("The input string is: "+s);
		
		System.out.println("\nThe string is reverse fromat is: ");
		for(int i = s.length()-1;i>=0;i--)
		{
			
			System.out.println(s.charAt(i));
		}
		
		//Also,we can use stringBuilder and inbuilt reverse() method
		System.out.println("\nUsing String builder and inbuilt reverse() method: \n");
		String reverse = new StringBuilder(s).reverse().toString();
		System.out.println(reverse);
		
		
	
	   System.out.println("Using endsWith() method: "+s.endsWith("so insane"));
		
	System.out.println("Using trim() method: "+s.trim());
	
		
		//Using char array
	
	
	String str22 = "Siddharth";
	
		
	String res1 = " ";
	char[] res  = {' '};
	
	for(int i = str22.length()-1;i>=0;i--)
	{
		
		
		res1 = res1 + str22.charAt(i);
				
	}	
		
	System.out.println("The reverse is: "+res1);
	
	
	}

}
