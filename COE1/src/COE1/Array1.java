package COE1;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size : ");
		n=sc.nextInt();
		int c=0;
		int a[]=new int[n];
		int b[]=new int[n];
		int k=0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			c=0;
			for(int j=0;j<n;j++)
			{
				if(a[i]==a[j])
					c++;
			}
			if(c==1)
				b[k++]=a[i];
		}
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
		System.out.println();
	}

}
