package java_basic_programs;

public class sorting_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {5,1,7,2,9,-1};
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
			System.out.println("array is "+arr[i]);
			
		}
		
		
	}

}
