package functionalInterfaces;

public class FunctionalInterfaceExample implements function_Interface {
	
	public void disp_msg(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// create object of implementation class and call method
		FunctionalInterfaceExample finte = new FunctionalInterfaceExample();
		finte.disp_msg("Hello, World!!!");
	}
}
