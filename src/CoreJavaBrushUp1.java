

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// declaring variables
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.25;
		boolean flag = true;
		System.out.println(myNum);
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(flag);
		
		//Arrays in Java
		
		//first way
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(arr[0]);
		
		//second way
		int[] arr2 = {6,7,8,9, 10};
		System.out.println(arr2[0]);
		
		//for loop can iterate in the array
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		};
		
		//string array
		String[] arrstring = {"john", "erwin", "cruz", "chan"};
		
		for(int i=0; i < arrstring.length; i++) {
			System.out.println(arrstring[i]);
		};
		
		//shortcut iteration for string
		for(String a: arrstring) {
			System.out.println(a);
		}

	}

}
