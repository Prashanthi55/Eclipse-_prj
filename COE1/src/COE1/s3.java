package COE1;

public class s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String input1="Hello world";
		int input2=0;
		int n=input1.length();
		int sum=0;
		if(input2==0)
		{
			for(int i=0;i<n;i++)
			{
				if(input1.charAt(i)>='A'&&input1.charAt(i)<='Z') 
				{
					if(input1.charAt(i)!='A'||input1.charAt(i)!='E'||input1.charAt(i)!='I'||input1.charAt(i)!='O'||input1.charAt(i)!='U')
					{
						sum=sum+(int)input1.charAt(i)-(int)'A'+1;
					}
				}
				if(input1.charAt(i)>='a'&&input1.charAt(i)<='z')
				{
					if(input1.charAt(i)!='a'||input1.charAt(i)!='e'||input1.charAt(i)!='i'||input1.charAt(i)!='o'||input1.charAt(i)!='u')
						sum=sum+(int)input1.charAt(i)-(int)'a'+1;
				}
			}
		}
		else if(input2==1)
		{
			for(int i=0;i<n;i++)
			{
				if(input1.charAt(i)>='A'&&input1.charAt(i)<='Z')
					{
						sum=sum+(int)input1.charAt(i)-(int)'A'+1;
					}
					if(input1.charAt(i)>='a'&&input1.charAt(i)<='z')
					{
						sum=sum+(int)input1.charAt(i)-(int)'a'+1;
					}
			}
		}
		System.out.println(sum);
	}

}
