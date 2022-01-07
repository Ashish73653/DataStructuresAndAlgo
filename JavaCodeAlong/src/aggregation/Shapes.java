package aggregation;

class Operation{
	int square(int n){
		return n*n;
	}
}
class Circle{
	double pi = 3.14;
	Operation op;
	double area(int r) {
		 op=new Operation();  
		 int rsquare=op.square(r);
		 return pi*rsquare;
	}
}
public class Shapes {

	public static void main(String[] args) {
		Circle area = new Circle();
		double a = area.area(20);
		System.out.println("The area is: "+a);

	}

}
