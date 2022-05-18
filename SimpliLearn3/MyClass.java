package project3;

public class MyClass 
{
    private static Object LOCK = new Object();
    public static void main(String args[]) throws Exception
    {
        Thread.sleep(1000);//1 second of sleep time
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
        synchronized (LOCK) 
        {
            LOCK.wait(5000);
            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 5 seconds");
        }
    }
}