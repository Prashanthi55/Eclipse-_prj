package COE1;
import java.util.*;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,x=0,y=0;
		int s=0;
		System.out.println("Enter n :");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
			if(a[i]==6)
				x=i;
		for(int i=n-1;i>x;i--)
			if(a[i]==7)
				y=i;
		if(x<y)
		{
			for(int i=0;i<x;i++)
				s=s+a[i];
			for(int i=y+1;i<n;i++)
				s=s+a[i];
			System.out.println(s);
		}
		else
		{
			for(int i=0;i<n;i++)
				s=s+a[i];
			System.out.println(s);
		}
				
	}

}
