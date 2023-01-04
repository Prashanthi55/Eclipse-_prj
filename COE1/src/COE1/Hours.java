package COE1;
import java.util.*;
public class Hours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter value : ");
		n=sc.nextInt();
		int x=(n/3600)%24;
		int m=(n%3600)/60;
		int sec=(n%3600)%60;
		//System.out.println(x+":"+m+":"+sec);
		System.out.printf("%d:%0,2d:%0,2d",x,m,sec);
	}

}
