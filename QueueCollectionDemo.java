package MyJavaPrograms_1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollectionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int time = 5;
		Queue<Integer> que = new LinkedList<Integer>();
		
		for (int i = time; i >= 0; i--)
            que.add(i);

		   while (!que.isEmpty()) {
			   System.out.println("size is: "+que);
            System.out.println(que.remove());
            
            //Thread.sleep(1000);
            
            
            
            //DEQUE concept : example
            
            
            
            
		   }	
		   
	}

}
