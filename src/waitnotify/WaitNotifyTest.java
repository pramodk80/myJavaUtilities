package waitnotify;

public class WaitNotifyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Message message = new Message("process it");
		
		Waiter waiter = new Waiter(message);
		new Thread(waiter, "waiter").start();
		
		Waiter waiter1 = new Waiter(message);
		new Thread(waiter1,"waiter1").start();
		
		Notifier notifier = new Notifier(message);
		new Thread(notifier,"notifier").start();
        System.out.println("All the threads are started");

	}

}
