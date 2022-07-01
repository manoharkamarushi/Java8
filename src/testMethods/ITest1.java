package testMethods;

public interface ITest1 {
	
	String s="hello";
	
	default void m1() {
		System.out.println("Am from default interface method m1-Itest1");
	}

	void m2();
	
	static void m3() {
		System.out.println("Am from Interface static method m3-Itest1");
	}
}
