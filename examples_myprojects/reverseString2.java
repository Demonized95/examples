package examples.myprojects;

public class reverseString2 {

    public static void main(String[] args) {
    	System.out.print("Please enter your name: ");
        String name = nextLine();

    	String reverse = new StringBuffer(name).reverse().toString();
    	String rev = reverse.toLowerCase();
    	System.out.println(rev);
    }

	private static java.lang.String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
}

