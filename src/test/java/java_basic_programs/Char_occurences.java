package java_basic_programs;

public class Char_occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "aaaabbccAAdda";
		  char search = 'a';             // Character to search is 'a'.
		  char [] input_o=input.toCharArray();
		  
		  int count=0;
		  for(int i=0; i<input_o.length; i++)
		  {
		      if(input_o[i] == search)
		      count++;
		  }
		  
		  System.out.println("The Character '"+search+"' appears "+count+" times.");
		  }

}
