package FirstSeleniumPackage;


public class StringReverse12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "Siddharth";
		
		//Expected output is: htrahddiS
		
		//Manually reversing the string :  not using any method
		
		String strrev = "";
		for(int i = str.length()-1;i>=0;i--)
		{
		strrev = strrev + str.charAt(i);	
		}
		
		System.out.println("The reverse string(without inbuilt method) is: "+strrev);
		
		
	
		//Using Stirng reverse method
		
		String str1 = "Rony";
		
		String srerev1 = new StringBuilder(str1).reverse().toString();
		
		System.out.println("The reverse string(with reverse() method) is: "+srerev1);
		
		
		//we can check for palindrome also using this
		
        String strPal = "kook";
	    String strrev1 ="";
				
	    for(int i =strPal.length()-1;i>=0;i--)
			{
				strrev1 = strrev1 + strPal.charAt(i);
								
			}
				
	    
	//    System.out.println("fdsdfasdfgasdfgqggv"+strrev1);
			if(strrev1.equalsIgnoreCase(strPal))
				{
				System.out.println("Palindrome");
				}
			else
				System.out.println("Not a palindrome");
		
	}

}
