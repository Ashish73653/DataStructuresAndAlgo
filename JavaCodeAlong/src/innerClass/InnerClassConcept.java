package innerClass;

class Outer{
	void outer() {
		System.out.println("Outer class");
	}
	class Inner{
		void inner() {
			System.out.println("Inner class");
		}
	}
}

public class InnerClassConcept {

	public static void main(String[] args) {
		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		in.inner();
		ou.outer();
	}

}
