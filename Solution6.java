import java.util.Scanner;
public class Solution6
{
    public static void main(String[] args) 
    {
        int  temp;
        Scanner s = new Scanner(System.in);
        
        int [] a = {1 , 15 , 18 , 19 ,10 };
        int n=a.length;
       
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
       
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}