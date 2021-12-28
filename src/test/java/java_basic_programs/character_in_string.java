package java_basic_programs;

public class character_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String title="my name is nikita hiwse";
		int count=0;
		for(int i=0;i<title.length();i++)
		{
			if(title.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("total number of characters are "+count);
		
	}

}
