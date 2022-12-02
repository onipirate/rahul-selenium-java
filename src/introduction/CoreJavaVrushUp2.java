package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaVrushUp2 {

	public static void main(String[] args) {
		// use of conditional statements
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				//break; // this will exit the loop conditions
			}
			else {
				System.out.println(arr[i]+" is not multiple of 2 ");
			}
		}
		
		//ArrayList...in array the size is initialize and fixed and you cannot push data...in test automation we might need dynamic array thus we use arraylist
		
		ArrayList<String> a = new ArrayList<String>();
		//create object of the class  - object.method
		//Array use length, ArrayList use size method
		//Arraylist use get method to get value and not the normal display that of the array[index]
		a.add("Rahul");
		a.add("Shetty");
		a.add("Academy");
		a.add("Selenium");
		for(String as: a) {
			System.out.println(as);
		}
		System.out.println(a.get(3));
		
		//contains method if it has the value in the arraylist
		System.out.println(a.contains("Selenium"));
		
		
       //Convert Array to ArrayList
		String[] name = {"john", "erwin","rai","arya"};
		List<String> nameArrayList = Arrays.asList(name);
		System.out.println(nameArrayList.contains("mom"));
	}

}
