package MyJavaPrograms_1;

import java.util.Scanner;

public class ReplaceAndRemoveStringOperation_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Replacing each space in string with %20
		String str ="what has been done";
		
		System.out.println("The input string is: "+str);
        System.out.println("After space replacement: "+str.replaceAll(" ", "@20")); 
				
     //**************************************************************************************************************************   
        
     //To remove a given character from a string
        
        
        String str1 = "siddharth";
        
        String res = "";
        
        String res1 = "";
        String res2 = "";
        
        
        res1 = str1.substring(0,5);
       //System.out.println("first part: "+res1);
    
        res2 = str1.substring(6);
       //System.out.println("second part: "+res2);
        
        res= res1 + res2;
        
        System.out.println("\nThe input string is: "+str1);
        System.out.println("String after removing 'a' is:  "+res);
        
        
      //********************************************************************************************************************************  
        
    
        
	}

}
