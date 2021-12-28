package basic;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "Nikita";
		char [] name_rev=name.toCharArray();
		//String [] name_s=
		
		for(int i=name_rev.length-1; i>=0;i--)
		{
			
			System.out.print(name_rev[i]);
			
		}
		
	}

}
