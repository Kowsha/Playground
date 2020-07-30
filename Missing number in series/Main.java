import java.util.*; 
public class Main
{ 
public static int findMissingUtil(int arr[], int low, int high, int diff)
{ 
	if (high <= low) 
		return Integer.MAX_VALUE; 
	int mid = low + (high - low) / 2; 
	if (arr[mid + 1] - arr[mid] != diff)
      return (arr[mid] + diff); 
	if (mid > 0 && arr[mid] - 
				arr[mid - 1] != diff) 
		return (arr[mid - 1] + diff); 
	if (arr[mid] == arr[0] + mid * diff) 
		return findMissingUtil(arr, mid + 1, 
							high, diff); 
	return findMissingUtil(arr, low, mid - 1, diff); 
} 
/*The function uses findMissingUtil() to find the missing element in AP. 
It assumes that there is exactly one missing element and may give 
incorrect result when there is no missing element or more than one 
missing elements. This function also assumes that the difference in AP is 
an integer.*/ 
public static int findMissing(int arr[], int n) 
{ 
	int diff = (arr[n - 1] - arr[0]) / n; 
	return findMissingUtil(arr, 0, n - 1, diff); 
} 
	public static void main (String[] args) 
{ 
	  int n ; 
     Scanner sc = new Scanner(System.in);
     n = sc.nextInt();
     int arr[] = new int[n];
      for(int i = 0 ; i < n ; i++){
      	arr[i] = sc.nextInt();
      }
	System.out.println(findMissing(arr, n)); 
} 
}