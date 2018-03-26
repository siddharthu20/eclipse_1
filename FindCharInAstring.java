package MyJavaPrograms_1;

import java.util.Scanner;

public class FindCharInAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      //To search for a given character in string
        
        
        String str57 = " ";
        boolean val = false;
        char chToFind = ' ';

        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nEnter the input string: ");
        str57 = sc.nextLine();
        
        System.out.println("Please enter the character to be searched in the input string: ");
        chToFind = sc.next().charAt(0);

        System.out.println("Character to be searched in the input string is: "+chToFind);
        
        char arr[] = str57.toCharArray();
    
         for(int i = 0 ;i<arr.length;i++)
        {
        	
        	if(arr[i] == chToFind)
        	{
        		System.out.println("Character found at location: " +i);
        		val = true;
        	}
        	
        }
        
            if(val == true)
        	    System.out.println("Character found");
            else
        	    System.out.println("OOPS !! Character not found");
        
        
            sc.close();
		
		
		
	}

}
