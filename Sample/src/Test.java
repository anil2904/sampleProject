import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class Test implements Callable<String> {

	public static void main(String[] args) {
		ExecutorService  executor=Executors.newFixedThreadPool(10);
		List<Future<String>> futureList= new ArrayList<Future<String>>();
		Callable<String> callable = new Test();
		
		 for(int i=0; i< 100; i++){
	            Future<String> future = executor.submit(callable);
	            futureList.add(future);
	        }
		 for(Future<String> fut : futureList){
		 try {
             System.out.println(new Date()+ "::"+fut.get());
         } catch (InterruptedException | ExecutionException e) {
             e.printStackTrace();
         }
		 }
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
        return Thread.currentThread().getName();
	}
}
