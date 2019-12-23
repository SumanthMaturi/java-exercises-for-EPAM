import java.util.Scanner;
class Solution3
 { 
public static void main(String[]args) 
	{ 
		int [] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 }; 
		int number = 3; 
                                     int result;
                                    Solution3 s=new Solution3();
		s.check(arr,number); 
	} 
       public static void check(int[] arr, int num) 
	{ 	boolean test = false; 
                                       int n=0;
                                       int count=0;
		for (int i=0 ; i<arr.length ; i++)
                               {     
                                                      if (arr[i] == num) 
                                                     { 
                                                                n=i;
                                                               count++;
			} 
                                }
                                  for(int j=0;j<arr.length;j++)
                               {
                                        if(count==0)
                                          {
                                              System.out.println("-1");
                                              break;
                                            }
                                        else if(count >=1)
                                         {
                                              System.out.println(" " +n);
                                             break;
                                           }
                                           else
                                          {
                                             break;
                                             }
                                                 
			
	}
}
} 


