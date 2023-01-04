package COE1;
import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[];
		a=new int[10];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}

}
