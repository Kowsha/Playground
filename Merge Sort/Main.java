import java.util.*;
public class Main
{
          void merge(int arr[], int beg, int mid, int end)
          {
          int l = mid - beg + 1;
          int r = end - mid;
          int LeftArray[] = new int [l];
          int RightArray[] = new int [r];
            for (int i=0; i<l; ++i)
            LeftArray[i] = arr[beg + i];
            for (int j=0; j<r; ++j)
            RightArray[j] = arr[mid + 1+ j];
          int i = 0, j = 0;
          int k = beg;
            while (i<l&&j<r)
            {
            	if (LeftArray[i] <= RightArray[j])
              	{
                  arr[k] = LeftArray[i];
                  i++;
              	}
              	else
              	{
                  arr[k] = RightArray[j];
                  j++;
              	}
           	 k++;
            }	
          while (i<l)
          {
            arr[k] = LeftArray[i];
            i++;
            k++;
          }
          while (j<r)
          {
            arr[k] = RightArray[j];
            j++;
            k++;
          }
          }
      void sort(int arr[], int beg, int end)
      {
          if (beg<end)
          {
              int mid = (beg+end)/2;
              sort(arr, beg, mid);
              sort(arr , mid+1, end);
              merge(arr, beg, mid, end);
          }
      }
public static void main(String args[])
{
      int i;
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int arr[] = new int[n];
        System.out.println("Before Sort:");
        for(i=0;i <n; i++){
            arr[i]=s.nextInt();
          	System.out.print(arr[i]+" ");
        }

      Main ob = new Main();
      ob.sort(arr, 0, n-1);
      System.out.println("\nAfter Sort:");
      for(i =0; i<n;i++)
      {
		System.out.print(arr[i]+" ");
	  }
   }
}