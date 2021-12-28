package basic;

public class armstrongdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int num=153;
		int sum=0, r, temp;
		
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			sum=sum+(r*r*r);
		}
 
		
		if(sum==temp)
		{
			System.out.println("number is armstrong"+ temp);
		}
		else
		{
			System.out.println("not");
		}
	}

}
