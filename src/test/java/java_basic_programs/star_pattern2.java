package java_basic_programs;

import java.util.Scanner;

public class star_pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row number for star pattern");
		
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row;j>=i;j--)
			{
				System.out.print(" ");
			}
			 for (int k=1; k<=i; k++)
	            {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		}
	
	}

	


