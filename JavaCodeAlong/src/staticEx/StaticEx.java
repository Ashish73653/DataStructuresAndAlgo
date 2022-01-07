package staticEx;

class Test{
	static int var = 100; 
	/*instance variable = An instance variable is a variable which is declared 
	 * in a class but outside of constructors, methods, or blocks.
	 * */
	public static int test(int val) {
		val = val+10;
		return val;
	}
}
class statiClass{
	static class inner{
		int value = 2000;
	}
}
//class Override{
//	static void override() {
//		System.out.println("Override the parent");
//	}
//}
//class OverrideChild extends Override{
//	static void override() {
//		System.out.println("children of override");
//	}
//}

public class StaticEx {

	public static void main(String[] args) {
//		we can use static methods and variables in main without making object 
//		we will just use className.methodName or classNAme.variable name
		
		System.out.println(Test.var);
		System.out.println(Test.test(10));
		
		
//		we cannot make outside class as static 
//		but we can make inner class as static and can refer it by :
//		OuterClassName.innerClassName obj = new OuterClassName.innerClassName();
		statiClass.inner sc = new statiClass.inner();
		System.out.println(sc.value);
		

	}

}
