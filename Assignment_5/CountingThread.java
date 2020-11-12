import java.util.*;
import java.lang.*;
public class CountingThread extends Thread
{
	public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
                if(i%10==0)
                {
                	System.out.println("||==========================================================||");
                }
            }
            catch(Exception e)
            {
            	System.out.println(e);
            }
        }
    }
    public static void main(String[] args)
    {
        CountingThread counting = new CountingThread();
        counting.start();
    }
}
