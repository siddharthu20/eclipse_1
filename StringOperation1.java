package MyJavaPrograms_1;

public class StringOperation1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		String str = new String("This is so hot");
		
		//Calculating the length of the string
		int len = str.length();
		System.out.println("The length is: "+len);
		
		//splitting the string
		
		//String s[] = new String[10];
		
		int ctr = 0;
		char ch ;
		
		//Iterating through the string
	
		for(int i = 0;i<str.length()+1;i++)
		{
			System.out.println("The characters are: "+str.charAt(i));
					
			
			ch = str.charAt(i);
			if(ch=='s')
			{
		    
			ctr = ctr+1; 
			System.out.println("The number of s are: "+ctr);
			}
							
		}
				
	}
	
}
