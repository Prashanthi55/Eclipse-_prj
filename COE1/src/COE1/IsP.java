package COE1;
import java.util.*;
public class IsP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String s=sc.next();
		StringBuffer s1=new StringBuffer(s);
		s1.reverse();
		String s2=new String(s1);
		boolean b=s2.equalsIgnoreCase(s);
		if(b==true)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
