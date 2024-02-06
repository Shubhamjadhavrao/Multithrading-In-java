package DeadLockDemo;



public class DeadlockTest {
	public static void main(String[] args) {
	 Object loc1 =new Object();
	 Object loc2 = new Object();
	 
//		Thread t1 = new Thread(new ThreadOne(loc1, loc2));
//		Thread t2 = new Thread(new ThreadTwo(loc1, loc2));
	 ThreadOne t1 = new ThreadOne(loc1, loc2);
	 ThreadTwo t2 = new ThreadTwo(loc1, loc2);

		t1.start();
		t2.start();

	}

}
