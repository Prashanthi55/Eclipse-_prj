package COE1;
import java.io.*;
public class BReader {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value : ");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter string : ");
		String s=br.readLine();
		boolean b=Boolean.parseBoolean(br.readLine());
		System.out.println(b);
		System.out.println(n+"\n"+s);
	}

}
