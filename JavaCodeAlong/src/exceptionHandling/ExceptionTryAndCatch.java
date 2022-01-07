package exceptionHandling;

public class ExceptionTryAndCatch {

	public static void main(String[] args) {
		try {
			int a = 20;
			int div = a/0;
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("Rest of code...");

	}

}
