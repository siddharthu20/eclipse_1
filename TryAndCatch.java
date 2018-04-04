package datastructures;

public class TryAndCatch {
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub

		try{
			
			int a[] = new int[5];
			
			System.out.println("I am in try block");
			System.out.println(a[6]);
				
		}
		
		/*catch(Exception e)
		{
		
		e.printStackTrace();
		System.out.println("I am in first catch block");
		}*/
		
		finally
		{
			
			System.out.println("I am in finally block");
		}
		
	}

}
