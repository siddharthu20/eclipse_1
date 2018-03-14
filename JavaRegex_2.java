package MyJavaPrograms_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "Goodbye bye bye world world world !!";
		
		//String regex = "(\\b\\w+\\b) (\\1\\b)+";
		
		String regex = "\\b(\\w+)(\\W+\\1\\b)+";
		
		//Pattern p = Pattern.compile(regex);
		
		Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		
		Matcher m = p.matcher(input);
		
		while(m.find())
		{
			System.out.println("First sequence: "+m.group(0));
			System.out.println("Second sequence: "+m.group(1));
		
			
	          input = input.replaceAll(m.group(), m.group(1));
			
			
		}
		
		System.out.println("The modified string(without dublicates) is: "+input);
		
		

	}

}
