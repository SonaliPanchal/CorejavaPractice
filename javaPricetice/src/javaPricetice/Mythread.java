package javaPricetice;

public class Mythread extends Thread {
	public void run()
	{
		System.out.println("MyThread is Runnig");
		for(int i=0;i<=8;i++)
		{
			try {
				Thread.sleep(200);
				System.out.println(i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Currently Running Thread"+Thread.currentThread());
		}

	}
	public static void main(String[] args) {
		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		Mythread t3 = new Mythread();
		t1.start();
		try {
			t1.join(1500);
			System.out.println(t1.getId()+"name"+t1.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
		t2.start();
		System.out.println(t3.getId()+"name"+t3.getName()+" Priority"+t3.getPriority());
		System.out.println(t2.getId()+"name"+t2.getName());
	}

}
