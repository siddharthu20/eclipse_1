package MyJavaPrograms_1;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		//Using Scanner class
		
		Scanner sc = new Scanner(System.in);
		
		
		/*int i = sc.nextInt();
		int j = sc.nextInt();
		
		
		int res = i+j;
		
		System.out.println(res);*/
		
		String fn = sc.nextLine();
		String ln = sc.nextLine();
		
		String fullname = fn +" "+ln;
		System.out.println("The full name is: "+fullname);
		

	}

}
