

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// creating String and important methods
		// string is an object...represents a sequence of characters
		// dclare string in 2 ways..first one does create new object if same value
		
		//String Literal declaration
		String s ="Rahul Shetty Academy";
		String s1 ="Rahul Shetty Academy"; //does not create new object
		
		//New Keyword declaration
		String s2 = new String("Welcome");
		String s3 = new String("Welcome"); //creates new object
		
		String[] splittedString = s.split(" ");
		
		for(String a: splittedString) {
			System.out.println(a);
		}
		
		String[] newName = s.split("Shetty");
		System.out.println(newName[0]);
		System.out.println(newName[1]);
		System.out.println(newName[1].trim());

		for(int i =0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		//Reverse print
		for(int i =s.length()-1 ; i >= 0 ; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
