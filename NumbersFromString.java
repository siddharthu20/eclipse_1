package MyJavaPrograms_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Aim is to extract only numbers from a String containing alphabets,special characters and numbers
		
		String str = "sid41d0har78th1ud52weewrer5sadWSD66";
		
	//*****************************Using Regex and ReplaceAll method
		String str1 = "";
		str1 = str1 + str.replaceAll("[A-Za-z]"," ");
		
		String res = str1.trim();
		
	//	System.out.println("Numbers present in the string are: "+res);
		
	//**************************Using Regex*********************************
	
	Pattern p = Pattern.compile("[0-9]+");
	Matcher m = p.matcher(str);
	
	while(m.find())
	{
		System.out.println(m.group());

	}
		
  }

}
