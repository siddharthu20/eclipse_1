package MyJavaPrograms_1;

public class ArrayOperation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-56,-42,-108,1,2,0,-5,9,-7,14};
		
		//modify the array such that all negative numbers will be in left side and all positive numbers will be in right side
		//hint : you can use bubble sort 
		
		//used bubble sort
           int temp = 0;
		
		for (int i=0;i<arr.length;i++)
		{
			
			for(int j=1;j<(arr.length-i);j++)
			{
				
				if(arr[j-1]>arr[j])
				{
					
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		System.out.println("The sorted array is: ");
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(+arr[i]);
		}
		
		
		
	}

}
