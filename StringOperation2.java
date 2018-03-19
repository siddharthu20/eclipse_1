package MyJavaPrograms_1;

public class StringOperation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "A412####42682%1fgd41$56*h";
		
		String alpha ="";
		String numericals="";
		String specChars = "";
		
		
		for(int j = 0;j<s.length();j++)
		{
			
			if((s.charAt(j)>=65 && s.charAt(j)<=90) || (s.charAt(j)>=97 && s.charAt(j)<=122))
			{
				alpha = alpha + s.charAt(j);
				
			}
			
			if(s.charAt(j)>=48 && s.charAt(j)<=57)
			{
				
				numericals = numericals + s.charAt(j);
			
			}
			
			
			if(s.charAt(j)>=33 && s.charAt(j)<=47)
			{
				
				specChars = specChars + s.charAt(j);
			
			}
			
					
		}
		
		System.out.println("The alphabets in the string are : "+alpha);
		System.out.println("The numericals in the string are : "+numericals);
		System.out.println("The special characters in the string are : "+specChars);
		
		
		
	}

}
