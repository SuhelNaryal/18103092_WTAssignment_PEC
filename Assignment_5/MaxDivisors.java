import java.util.*;
import java.lang.*;
public class MaxDivisors extends Thread
{
    static int maxNumOfDiv = 0;
    static int resNumber = 0;        // variables associated with class, not with object.
    int start;
    MaxDivisors(int start)
    {
        this.start = start;
    }
    public void run()
    {
        int numdiv=0;
        for(int i=start; i<this.start+10000; i++)
        {
            numdiv=0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                {
                    numdiv+=1;
                }
            }
            if(numdiv>maxNumOfDiv)
            {
                synchronized(this)
                {
                    maxNumOfDiv = numdiv;
                    resNumber = i;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        MaxDivisors thread1 = new MaxDivisors(1);
        MaxDivisors thread2 = new MaxDivisors(10001);
        MaxDivisors thread3 = new MaxDivisors(20001);
        MaxDivisors thread4 = new MaxDivisors(30001);
        MaxDivisors thread5 = new MaxDivisors(40001);
        MaxDivisors thread6 = new MaxDivisors(50001);
        MaxDivisors thread7 = new MaxDivisors(60001);
        MaxDivisors thread8 = new MaxDivisors(70001);
        MaxDivisors thread9 = new MaxDivisors(80001);
        MaxDivisors thread10 = new MaxDivisors(90001);
        long startingTime = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        try{
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();
        thread7.join();
        thread8.join();
        thread9.join();
        thread10.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        long endingTime = System.currentTimeMillis();
        System.out.println("Number which has largest number of divisors = " + resNumber + ", which has number of divisors = " + maxNumOfDiv);
        System.out.println("Total time elapsed: " + (endingTime - startingTime) + " milliseconds.");
    }
}
