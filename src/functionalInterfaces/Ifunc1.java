package functionalInterfaces;

/*A functional interface is an interface that has only one abstract method. 
 * It can contain any number of default and static methods but the abstract method it contains is exactly one.
 *  Additionally, a functional interface can have declarations of object class methods. 
 * */

@FunctionalInterface        //annotation indicates it’s a functional interface
interface function_Interface {
	
	 // abstract method  
    void disp_msg(String msg);  
    
    // Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);

}
