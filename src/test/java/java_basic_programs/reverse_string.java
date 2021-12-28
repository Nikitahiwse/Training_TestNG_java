package java_basic_programs;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "GeeksForGeeks";
		 
        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
        
        System.out.println("length of string is "+ try1.length);
        for (int i = try1.length - 1; i >= 0; i--)
            System.out.print(try1[i]);
	}

}
