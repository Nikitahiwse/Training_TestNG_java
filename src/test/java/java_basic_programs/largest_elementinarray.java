package java_basic_programs;

public class largest_elementinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={9,3,8,6};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		System.out.println("largest element in array is "+max);

	}
	}


