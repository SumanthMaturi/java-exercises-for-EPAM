import java.util.Scanner;
public class Solution2
{
public static void main(String[]args)
{
 int[] a ={ 1 , 2 , 3 , 4 };
       int n=a.length;
   Solution2 m1 = new Solution2();
   
    int max=m1.getMaxValue(a);
   int min=m1.getMinValue(a);
  System.out.println(" min value:"+min+"\n"+"max value: "+max);
}
public static int getMaxValue(int[] num)
{
  int maxValue = num[0];
  for(int i=1;i < num.length;i++)
{
    if(num[i] > maxValue)
{
	  maxValue = num[i];
	}
  }
  return maxValue;
}
public static int getMinValue(int[] num)
{
  int minValue = num[0];
  for(int i=1;i<num.length;i++)
{
    if(num[i] < minValue)
{
	  minValue = num[i];
	}
  }
  return minValue;
}
}
