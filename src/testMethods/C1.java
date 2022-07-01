package testMethods;

public class C1 implements ITest1 {

	@Override
	public void m2() {
		System.out.println("From c1 class method");

	}

	public static void main(String[] args) {

		C1 c1 = new C1();
		c1.m1();
		c1.m2();
		ITest1.m3();
	}
}
