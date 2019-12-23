import java.util.Scanner;
public class Solution5
{
	public static void main (String[] args)
	{
		int [] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 }; 
 
		int largest1, largest2, temp;
 
		largest1 = arr[0];
		largest2 = arr[1];
 
		if (largest1 < largest2)
		{
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
 
		for (int i = 2; i < arr.length; i++)
		{
			if (arr[i] > largest1)
			{
				largest2 = largest1;
				largest1 = arr[i];
			}
			else if (arr[i] > largest2 && arr[i] != largest1)
			{
				largest2 = arr[i];
			}
		}
 
		System.out.println ("  " + largest1);
		System.out.println ("  " + largest2);
                                int smallest1, smallest2, temp1;
 
		smallest1 = arr[0];
		smallest2 = arr[1];
 
		if (smallest1 < smallest1)
		{
			temp1 = smallest2;
			smallest2 = smallest1;
			smallest1 = temp1;
		}
 
		for (int i = 2; i < arr.length; i++)
		{
			if (arr[i] < smallest2)
			{
				smallest1 = smallest2;
				smallest2 = arr[i];
			}
			else if (arr[i] < smallest1 && arr[i] != smallest2)
			{
				smallest1 = arr[i];
			}
		}
                                 System.out.println(" "+smallest1);
                                System.out.println("  "+smallest2);
 
	}
}