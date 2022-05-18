package project3;

class Operations extends Thread
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
public class ThreadingCode1 {
	public static void main(String[] args) {
		Operations op1 = new Operations();//thread-1
		Operations op2 = new Operations();//thread-2
		Operations op3 = new Operations();//thread-3
		Operations op4 = new Operations();//thread-4

		op1.setName("Addition");
		op2.setName("Subtraction");
		op3.setName("Multiplication");

		op4.setName("Division");

		op1.start();//op1 is given to the scheduler
		op2.start();//op2 is given to the scheduler
		op3.start();//op3 is given to the scheduler
		op4.start();//op4 is given to the scheduler


	}
}

