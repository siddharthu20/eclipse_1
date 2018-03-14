package MyJavaPrograms_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIdValidationUsingRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "siddharthu20@gmail.com";
		
		
		String regex="[A-Za-z0-9]+@+.[A-Za-z]{2,4}" ;
		//String regex = "/b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+/.[A-Za-z]{2,4}/b";
		Pattern pat = Pattern.compile(regex);
		
		Matcher m = pat.matcher(str);
		
		System.out.println("true4111111");
		while(m.find())
		{
			
			System.out.println("The value is: "+m.find());
			
		
			System.out.println(m.group(0));
			
			
		}
		
		
	}

}
