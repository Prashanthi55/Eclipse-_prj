package COE1;
import java.util.*;
public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=0;
		int[][] m=new int[3][];
		m[0]=new int[] {2,3,4,5};
		m[1]=new int[] {445};
		m[2]=new int[] {3,4,5};
		for(int x[]:m)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
