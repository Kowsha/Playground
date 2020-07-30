import java.util.*;
public class Main
{ 
   public  static int sumOfDigit(int K)  
    { 
   
        int sod = 0; 
        while (K != 0) 
        { 
            sod += K % 10; 
            K /= 10; 
        } 
        return sod; 
    } 
    public static int TotDiff(int n, int d) 
    { 
        int low = 1, high = n; 
       while (low <= high)  
        { 
            int mid = (low + high) / 2; 
        if (mid - sumOfDigit(mid) < d)         
                low = mid + 1; 
             else       
                high = mid - 1;         
        } 
       return (n- high); 
    } 
  public static void main(String args[]) 
    { 
        int n , d;
      Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     d = sc.nextInt();
      System.out.println(TotDiff(n,d));  
    } 
}