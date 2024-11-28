package thread.com;

	
	class MyThread  implements Runnable
	{   
	  public void run() 
	 {   
	     System.out.println("My thread is in running state.");    
	 } 
	  public static void main(String args[]) 
	 {   
		  MyThread obj=new MyThread();  
		  Thread run = new Thread(obj);
	        run.start();  
	        run.run();
	  }  
	} 
