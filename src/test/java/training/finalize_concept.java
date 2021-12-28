package training;

public class finalize_concept {
	public void finalize()
	{
		System.out.println("hello from test1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		finalize_concept f1=new finalize_concept();
		finalize_concept f2=new finalize_concept();
		
		System.out.println("hi");
		f1=null;
		f2=null;
		// gc is for garbage collector
		 System.gc();
		
		
	}
	
	
}
