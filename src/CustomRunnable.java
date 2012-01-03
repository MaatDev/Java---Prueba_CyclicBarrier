import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


public class CustomRunnable implements Runnable{

	private String name;
		
	final CyclicBarrier barrier;
	
	public CustomRunnable(String name, CyclicBarrier barrier){
		this.name = name;
		this.barrier = barrier;		
		
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i<100;i++){
			System.out.println("Runnable name: "+name+" Interation: "+i);
		}
		
		try {
	           barrier.await(); 
	         } catch (InterruptedException ex) { 
	           return; 
	         } catch (BrokenBarrierException ex) { 
	           return; 
	         }
		
	}

	
}
