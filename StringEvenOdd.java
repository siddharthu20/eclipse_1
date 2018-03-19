package MyJavaPrograms_1;

public class StringEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "This is not insane";
		
		String sEven = "";
		String sOdd = "";
	
		//expected output
		
		//even  = ti sntisn
		//odd = hsi o nae
		
		for(int j= 0;j<s.length();j++)
		{
			if(j%2==0)
				sEven = sEven + s.charAt(j);
			  			    
			if(j%2==1)
				sOdd = sOdd + s.charAt(j);
		
		}
		
		System.out.println("Characters at Even positions are: "+sEven);
		System.out.println("Characters at Odd positions are: "+sOdd);

	}

}
