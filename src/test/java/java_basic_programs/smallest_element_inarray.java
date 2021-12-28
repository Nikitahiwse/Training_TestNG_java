package java_basic_programs;

public class smallest_element_inarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={9,3,8,6};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("smallest element in array is "+min);

	}

}
