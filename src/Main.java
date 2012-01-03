import java.util.ArrayList;
import java.util.concurrent.CyclicBarrier;


public class Main {

	
	public static void main(String[] args){

		int threadNum = 10;
		
		CyclicBarrier barrier = new CyclicBarrier(threadNum, new MainRunnable());
		
		ArrayList<Runnable> runnables = new ArrayList<Runnable>();
		/*
		 * Crear 10 runnables
		 */
		for(int i=0;i<threadNum;i++){
			
			new Thread(new CustomRunnable("Thread "+i, barrier)).start();

		}
		
		
		
	}
	
	
}
