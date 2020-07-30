import java.util.*;
public class Main{
public static void result(int m  , int n ) 
    {      
        int sum = 0 ,num;
        for ( num = m; num < n; num++) 
        {      
           
            if (num % 3 == 0 && num % 5 == 0) 
                sum = sum +num;
               
          
        } 
          System.out.print(sum + " "); 
    } 
       
    
    public static void main(String []args) 
    { 
        int a,b;
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      result(a,b);
   } 
} 