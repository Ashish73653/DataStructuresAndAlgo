package multithreading;

class BookTicket{
	int TotalSeats=10;
	void book(int seats) {
		if(TotalSeats >= seats) {
			System.out.println("Seat booked..."+seats);
			TotalSeats = TotalSeats - seats;
			System.out.println("Remaining seats:  "+TotalSeats);
		}else {
			System.out.println("Can't be booked because only "+TotalSeats+" are available...");
		}
	}
	
}

public class MovieTicketBook extends Thread{
	static BookTicket b;
	int seats;
	public void run() {
		b.book(seats);
	}

	public static void main(String[] args) {
		b  = new BookTicket();
		MovieTicketBook ashish = new MovieTicketBook();
		ashish.seats = 6;
		ashish.start();
		MovieTicketBook karan  = new MovieTicketBook();
		karan.seats = 7;
		karan.start();
	}

}
