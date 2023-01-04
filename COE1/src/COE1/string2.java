package COE1;
import java.util.*;
public class string2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter string : ");
		s=sc.nextLine();
		StringBuffer s1=new StringBuffer(s);
		StringBuffer s3=new StringBuffer(s);
		s1.reverse();
		String s4=s.concat(" kammari");
		StringBuffer s5=s3.append(" shanthi");
		System.out.println(s.substring(3)+"\n"+s4+"\n"+s5);
		if(s1.compareTo(s3)==0)
		System.out.println("True");
		else
			System.out.println("False");
	}

}
