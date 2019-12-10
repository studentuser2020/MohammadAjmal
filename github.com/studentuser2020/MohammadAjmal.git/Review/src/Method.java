
public class Method {

	
	public static int A (int a, int b)
	{	int c;
		c = a+b;
		return c;}
	
	public static int B (int a, int b)
	{	int d;
		d = a-b;
		return d;}
	
	public static void main(String[] args) {
		
		int a = 4;
		int b = 3;
		
		int c = A(a,b);
		int d = B(a,b);
		
		System.out.println(c);
		System.out.println(d);
		
		
		}}
