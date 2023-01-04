package COE1;
import java.util.*;
public class HSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=1;
		a[3]=2;
		a[4]=3;
		HashSet hs=new HashSet<Integer>();
		for(int i=0;i<5;i++)
		{
			hs.add(a[i]);
		}
		Iterator <Integer> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
