import java.util.*;
class Main
{ 
  static  int josephus(int n, int k)  
    { 
        int sum = 0;
        for(int i = 2; i <= n; i++)  
        { 
            sum = (sum + k) % i; 
        } 
  
        return sum+1; 
    } 
 
    public static void main(String[] args) 
    {  
		int n,k;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      k=sc.nextInt(); 
        System.out.println(josephus(n, k));  
    } 
}