package java_basic_programs;

public class occur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "Nikita";
		
		char [] name_o=name.toCharArray();
		
		
		for(int i=0; i<name_o.length;i++)
		{
			int count=0;
			for(int j=i+1;j<name_o.length;j++)
			{
				if(name_o[i]==name_o[j])
				{
					count++;
					name_o[j]='0';
					
				}
				
			}
			if(count>0)
			{
				System.out.println(name_o[i]);
			}
		}
		
	}

}
