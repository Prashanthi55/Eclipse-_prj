package COE1;
import java.util.*;
public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter your name : ");
		s=sc.nextLine();
		System.out.println("Name in capitals : ");
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
	}

}
