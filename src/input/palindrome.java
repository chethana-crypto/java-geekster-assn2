package input;
import java.util.*;
public class palindrome {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	System.out.println("Type a string:");
	String str = s.nextLine();
	String rev ="";
	int len = str.length();
	for(int i=len-1;i>-1;i--) {
		rev = rev+str.charAt(i);
	}
	//System.out.println("Reverse String:"+rev);
	if(str.equals(rev)) {
		System.out.println("Given String is Palindrome");
	}else {
		System.out.println("Given string is Not a Palindrome");
	}
}
}
