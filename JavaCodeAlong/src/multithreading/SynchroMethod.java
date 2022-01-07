package multithreading;

class BookTicket1{
	int TotalSeats=10;
	synchronized void book(int seats) {
		if(TotalSeats >= seats) {
			System.out.println("Seat booked..."+seats);
			TotalSeats = TotalSeats - seats;
			System.out.println("Remaining seats:  "+TotalSeats);
		}else {
			System.out.println("Can't be booked because only "+TotalSeats+" are available...");
		}
	}
	
}
public class SynchroMethod extends Thread{
	static BookTicket1 b;
	int seats;
	public void run() {
		b.book(seats);
	}
	public static void main(String[] args) {
		b  = new BookTicket1();
		SynchroMethod ashish = new SynchroMethod();
		ashish.seats = 6;
		ashish.start();
		SynchroMethod karan  = new SynchroMethod();
		karan.seats = 7;
		karan.start();

	}

}
