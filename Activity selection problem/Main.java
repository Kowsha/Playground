import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class  Main
{ 
    public static void printMaxActivities(int arr1[], int arr2[], int n) 
    { 
    int i, j;
    i = 0; 
    System.out.print(i+" ");
    for (j = 1; j < n; j++) 
    {
         if (arr1[j] >= arr2[i]) 
         { 
              System.out.print(j+" "); 
              i = j; 
          } 
     } 
    } 
    public static void main(String[] args) 
    { 
    
     int n;
      Scanner sc =  new Scanner(System.in);
      n = sc.nextInt();
      int arr1[] = new int[n];
      int arr2[]  = new int[n];
      for(int i = 0 ; i < n ; i++){
        arr1[i] = sc.nextInt();
      }
       for(int i = 0 ; i < n ; i++){
        arr2[i] = sc.nextInt();
      }
      
         
    printMaxActivities(arr1, arr2, n); 
    } 
      
}