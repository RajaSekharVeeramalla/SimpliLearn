package project3;
class Operations1 implements Runnable
{
	public void run() {
		if(Thread.currentThread().getName().equals("Addition")) {
			add();
		}
		else if(Thread.currentThread().getName().equals("Subtraction")) {
			sub();
		}
		else if(Thread.currentThread().getName().equals("Multiplication")) {
			mul();
		}
		else {
			div();
		}
	}
	void add() {
		System.out.println("Addition is executed");
	}
	void sub() {
		System.out.println("Subtraction is executed");
	}
	void mul() {
		System.out.println("Multiplication is executed");
	}
	void div() {
		System.out.println("Division is executed");
	}
}
public class ThreadingCode2 {
    public static void main(String[] args) {
        Operations1 op1 = new Operations1();//not a thread
        Operations1 op2 = new Operations1();//not a thread
        Operations1 op3 = new Operations1();//not a thread
        Operations1 op4 = new Operations1();//not a thread
        
        Thread t1 = new Thread(op1);
        Thread t2 = new Thread(op2);
        Thread t3 = new Thread(op3);
        Thread t4 = new Thread(op4);
        
        t1.setName("Addition");
        t2.setName("Subtraction");
        t3.setName("Multiplication");
        t4.setName("Division");
        
        t1.start();//t1 is given to the scheduler
        t2.start();//t2 is given to the scheduler
        t3.start();//t3 is given to the scheduler
        t4.start();//t4 is given to the scheduler
        
        
    }
}

