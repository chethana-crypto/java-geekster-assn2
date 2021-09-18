package input;

public class reversedigit {
public static void main(String args[]) {
	int digit=1234;
	int reversedig=0;
	while(digit!=0) {
		reversedig = reversedig * 10;
		reversedig = reversedig + digit%10;
		digit = digit/10;
	}
	System.out.println("reverse format for the given number is: " +reversedig);
}
}
