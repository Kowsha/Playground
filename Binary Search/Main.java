import java.util.*;
public class Main
{
    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l)
        {
            int mid = l + (r - l)/2;
          if(arr[mid] == x){
          	return mid;
          }else if(arr[mid] > x){
          	return binarySearch(arr, l, mid-1, x);
          }else{
          	return binarySearch(arr, mid+1, r, x);
          }
        }
   return -1;
    }
    public static void main(String args[])
    {
        Main ob = new Main();
        int n ,x; 
      	Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
      for(int i = 0 ; i < n ; i++){
      	arr[i] = sc.nextInt();
      }
      x= sc.nextInt();
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println(result);
    }
}