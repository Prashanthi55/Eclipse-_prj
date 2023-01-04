package COE1;
import java.util.*;
public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		String s2=null;
		System.out.println("Enter string : ");
		s=sc.nextLine();
		int d=s.length();
		System.out.println("Enter n value : ");
		int n=sc.nextInt();
		String s1=s.substring(0,2);
		for(int i=0;i<n;i++)
		{
			System.out.print(s1);
		}
		System.out.println();
		for(int i=0;i<d;i++)
		{
			System.out.print(s1);
		}
		System.out.println();
	}

}
