package MyJavaPrograms_1;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {-4,52,0,-9,-3,25,4,12,-8};
		
		System.out.println("The input array is: ");
		
		for(int k=0;k<arr.length;k++)
		{
		System.out.println(arr[k]);
		}
		
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
