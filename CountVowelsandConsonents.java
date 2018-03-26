package MyJavaPrograms_1;

public class CountVowelsandConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "aaethiopdmfopi ";
		
		int NoOfVowel = 0;
		int NoOfConsonents = 0;
				
		
		for(int i= 0;i<str.length();i++)
		{
			
			if((str.charAt(i)=='a') || (str.charAt(i)=='e') || (str.charAt(i)=='i') || (str.charAt(i)=='o') || (str.charAt(i)=='u') 
					
			|| (str.charAt(i)=='A') || (str.charAt(i)=='E') || (str.charAt(i)=='I') || (str.charAt(i)=='O') || (str.charAt(i)=='U'))
			{
				
				NoOfVowel = NoOfVowel + 1;
				
			}
			else
				
				NoOfConsonents = NoOfConsonents + 1;
			
		}
		
		
		
		System.out.println("No of Vowels are in the string are: "+NoOfVowel);
		System.out.println("No of consonents are in the string are : "+NoOfConsonents);
		
		
		
				
		
		
		
	}

}
