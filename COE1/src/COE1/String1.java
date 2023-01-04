package COE1;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="CSE";
		String s2="cse";
		String s3=new String("CSE");
		String s4=new String("CSE");
		System.out.println(s1==s3);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println(s4==s3);
		System.out.println(s3.intern());
		String s6,s5;
		s5=s3.intern();
		s6=s4.intern();
		System.out.println(s5==s6);
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(2));
	}

}
