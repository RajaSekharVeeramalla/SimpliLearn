package project3;

//Thread is a built in class in java present in java.lang package
public class ThreadBasic {
  public static void main(String[] args) {
      Thread t = new Thread();
      System.out.println(t);
      t.setName("Shaktiman");
      t.setPriority(1);
      System.out.println(t);
      System.out.println(Thread.currentThread().getName());
      System.out.println(t.getName());
      System.out.println(t.getId());
      System.out.println(t.getPriority());
      System.out.println(t.getClass());
  }
}
//Thread[Thread-0,5,main]
//Thread-0 (name of the thread)
//5 (priority of the thread)
//main (method associated to the thread)