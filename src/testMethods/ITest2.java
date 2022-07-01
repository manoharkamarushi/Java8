package testMethods;

public interface ITest2 {

	default void m1() {
		System.out.println("Am from default interface method m1-ITest2");
	}
	
	static void m3() {
		System.out.println("static method from Itest2");
	}
}
