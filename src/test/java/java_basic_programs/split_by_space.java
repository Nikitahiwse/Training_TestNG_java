package java_basic_programs;

public class split_by_space {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Hello This is DelfStack";
        String[] newStr = str.split("\\s+");
        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);
        }

	}

}
