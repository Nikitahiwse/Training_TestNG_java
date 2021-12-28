package basic;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		int c=0;
		System.out.println( "Fibo series is"+ a);
		System.out.println(b);
		for(int i=0;i<10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(c);
		}
		
		
		
	}

}
