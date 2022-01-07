package abstraction;
abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	void run() {
		System.out.println("Running safely...");
	}
}
public class Basic {

	public static void main(String[] args) {
		Bike honda = new Honda();
		honda.run();

	}

}
