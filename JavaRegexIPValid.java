package MyJavaPrograms_1;


public class JavaRegexIPValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Pattern pattern;
	
	 /*Scanner sc = new Scanner(System.in);
	 
	
	 
	 while(sc.hasNext())
	 {
		 
		 String in = sc.next();
		 System.out.println(in.matches(MyRegex.pattern1()));
	 }
	 
	 sc.close();*/
	 
	 
	 String demo = "255.0.255.255";
	 System.out.println(demo.matches(MyRegex.pattern1()));
	 
	 
	}
}

 class MyRegex
	{
	    
	    
	  public static String pattern1()
	  {
	    
	  String pat = "(([0-1]?[0-9]{1,2}\\.)|(2[0-4][0-9]\\.)|(25[0-5]\\.)){3}(([0-1]?[0-9]{1,2})|(2[0-4][0-9])|(25[0-5]))";
	  
	  
	  String pat1 = "(([0]?[0-9]{1,2}$).([0]?[0-9]{1,2}$).([0]?[0-9]{1,2}]$).([0]?[0-9]{1,2})$)";
	     //return pat;
	  return pat1;
	  }  

}