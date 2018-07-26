package Guru99_Assignments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: \n");
		
		n = sc.nextInt();
		
		
		int m = n/2;
		
		for(int i = 2;i<=m;i++){
			
			if(n%i==0)
			{
				flag= 1;
				System.out.println("Not a prime number");
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("Prime number");
			
		}
		

	}

}
