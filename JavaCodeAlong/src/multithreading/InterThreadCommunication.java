package multithreading;


class TotalEarning extends Thread{
	int total = 0;
	public void run() {
		synchronized(this) {
			for(int i=0;i<=10;i++) {
				total = total +100;
			}
			this.notify();
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		TotalEarning te = new TotalEarning();
		te.start();
		synchronized(te) {
			try {
				te.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total Earnings: "+te.total);
		}

	}

}
