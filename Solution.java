
import java.util.Scanner;
public class Solution
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
        int  sum = 0;
        float average;
       
        int[] a ={ 1 , 2 , 3 , 4 };
       int n=a.length;
        for(int i = 0; i < n ; i++)
        {
            sum = sum + a[i];
        }
        System.out.println(" "+sum);
        average = (float)sum / n;
        System.out.println(" "+average);
    }
}
