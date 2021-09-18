package input;
import java.util.*;
public class nameinput {
	public static void main(String args[])
	   {
	      String str;
	      int len;
	      Scanner scan = new Scanner(System.in);
	      System.out.println("Enter Your Name : ");
	      str = scan.nextLine();
	      len = str.length();
	      if(str.length()<4) {
	    	  System.out.println("the length of the name is short: ");
	      }
	      else{
	    	  System.out.print("The length of the name is long: ");
	}
}
	   }
