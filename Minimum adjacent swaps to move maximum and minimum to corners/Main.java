import java.util.*; 
class Main { 
    
    public static void MinimumSwaps(int a[], int n) 
    { 
        int max = -1, min = a[0], l = 0, r = 0; 
        for (int i = 0; i < n; i++) { 
        if (a[i] > max) { 
                max = a[i]; 
                l = i; 
            } 
          if (a[i] <= min) { 
                min = a[i]; 
                r = i; 
            } 
        } 
        if (r < l) 
            System.out.println(l + (n - r - 2)); 
        else
            System.out.println(l + (n - r - 1)); 
    }
    public static void main(String args[]) 
    { 
        int n ;
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      int a[] = new int[n];
      for(int i = 0 ; i < n ; i++){
      	a[i] = sc.nextInt();
      }
        MinimumSwaps(a, n); 
    } 
}