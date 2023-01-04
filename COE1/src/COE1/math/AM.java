package COE1.math;

public class AM {
	public int sum(int x,int y)
	{
		return x+y;
	}
	public int sub(int x,int y)
	{
		return x-y;
	}
	public int mul(int x,int y)
	{
		return x*y;
	}
	public int div(int x,int y)
	{
		if(x>y)
			return x/y;
		else
			return y/x;
	}
}
