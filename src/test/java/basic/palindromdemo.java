package basic;

public class palindromdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=454;
		int sum=0,r,temp;
		temp=num;
		
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		
		if(sum==temp)
		{
			System.out.println("no is palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
		
	}

}
