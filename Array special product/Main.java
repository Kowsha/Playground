import java.util.*;
class Main { 
    void productArray(int arr[], int n) 
    { 
  
      
        if (n == 1) { 
            System.out.print("0"); 
            return; 
        } 
  
        int i, temp = 1; 
  
    
        int prod[] = new int[n]; 
  
     
        for (int j = 0; j < n; j++) 
            prod[j] = 1; 
  
       
        for (i = 0; i < n; i++) { 
            prod[i] = temp; 
            temp *= arr[i]; 
        } 
  
        
        temp = 1; 
  
     
        for (i = n - 1; i >= 0; i--) { 
            prod[i] *= temp; 
            temp *= arr[i]; 
        } 
  
        
        for (i = 0; i < n; i++) 
            System.out.print(prod[i] + "\n"); 
  
        return; 
    } 
  

    public static void main(String[] args) 
    {  
        Main pa = new Main(); 
      	int n ;
      	Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
       for(int i = 0 ; i < n ; i++){
       	arr[i] = sc.nextInt();
       }
        pa.productArray(arr, n); 
    } 
}