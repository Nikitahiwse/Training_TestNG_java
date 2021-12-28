package java_basic_programs;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 
		int r,temp;
		int sum=0;
		int num=454;
		temp=num;
		while(num>0)
		{
			r=num%10;
			
			sum=(sum*10)+r;
			
			num=num/10;
			
		}

		
	
		if(temp==sum)
		{
			System.out.println("number is palindrom");
		}
		else {
			System.out.println("number is not palindrom");
		}
	}
	

}
