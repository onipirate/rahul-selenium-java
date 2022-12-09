

public class CoreJavaBrushUp4 {

	public static void main(String[] args) {
		// Creating Class and Methods in Java
		
		CoreJavaBrushUp4 d = new CoreJavaBrushUp4();
		d.getData();
		System.out.println(d.stringData());
		String dog = bark(); ///method is called with instance of the object...static)
		System.out.println(dog);
		MethodsDemo2 dl = new MethodsDemo2();
		dl.stringDatum();
		
		
		
			

	}
	
	
	//void declaration will execute code but will not return any value
	//you need to create mobject of the class
	public void getData() {
		System.out.println("Inside the getData method");
	}
	
	public String stringData() {
		return "John Erwin Chan";
	}
	
	//Static Keyword....access class methods without creating the object, class level access
    public static String bark() {
    	System.out.println("woof woof");
    	return("woot woot");
    }
}
