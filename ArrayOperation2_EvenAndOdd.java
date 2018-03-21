package MyJavaPrograms_1;

public class ArrayOperation2_EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr[] = {12,3,42,59,79,41,26,20,41};
		
		int evenArray[] = new int[15];
		
		int oddArray[] = new int[15];
		
		
		System.out.println("\nThe input array is: ");
		
		for(int i=0;i<arr.length;i++)
		{
				System.out.println(arr[i]);
		}
		
		System.out.println("\nThe even array is: ");
		
	for(int i=0;i<arr.length;i++)
	{
		
		if(arr[i]%2==0)
		{
			evenArray[i] =  arr[i];
			System.out.println(evenArray[i]);
			
		}
		
		
	}
	
	System.out.println("\nThe odd array is: ");
	
	
	for(int i=0;i<arr.length;i++)
	{
		
		if(arr[i]%2!=0)
		{
			oddArray[i] =  arr[i];
			System.out.println(oddArray[i]);
				
		}
		
	}
	
  }
}
