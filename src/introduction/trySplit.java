package introduction;

public class trySplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pass ="Your password is 'rahulshetty' to login";
		String[] splitPass = pass.split("'");
		for(int i = 0 ; i < splitPass.length ; i ++) {
			System.out.println(splitPass[i]);
		}

	}

}
