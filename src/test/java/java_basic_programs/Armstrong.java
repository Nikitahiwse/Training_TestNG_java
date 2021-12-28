package java_basic_programs;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int temp,r,sum=0;
		int num=153;
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+(r*r*r);
			
		}
		if(temp==sum)
		{
			System.out.println("number is armstrong");
			
		}
		else
		{
			System.out.println("number is not armstrong");
		}
		
	}

}
