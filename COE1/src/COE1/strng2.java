package COE1;
import java.util.*;
public class strng2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter string : ");
		s=sc.nextLine();
		String s2,s3;
		int n=s.indexOf(" ");
		s2=s.substring(0,n);
		s3=s.substring(n+1);
		System.out.println(s3);
		if(s2.charAt(n-1)==s3.charAt(0))
			System.out.println(s2.concat(" "+s3.substring(1)));
		else
			System.out.println(s2.concat(" "+s3));
	}

}
