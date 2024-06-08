package com.demo.beans;

public class BasicRunnable implements Runnable {
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try {
				System.out.println("run method "+i);
				Thread.sleep(100);
				
			}
			catch(InterruptedException e)
			{
				System.out.println("Exception in thread"+e.getMessage());
				
			}
		}
	}

}
