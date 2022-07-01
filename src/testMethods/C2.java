package testMethods;

public class C2 implements ITest1, ITest2 {

	@Override
	public void m1() {

		ITest2.super.m1();
		System.out.println("override method m1- from Class c2");
	}

	@Override
	public void m2() {
		System.out.println("override method, m2 from class c2");
	}

	public static void main(String[] args) {
		C2 c2 = new C2();
		c2.m1();
		c2.m2();
//			ITest2.m3();
//			ITest1.m3();
	}
}
