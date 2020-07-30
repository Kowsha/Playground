import java.lang.*;
import java.util.*;
class Main
{
  public static void main(String args[])
  {
  int n,a,count=0,temp=0,m=0,len;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
 len=String.valueOf(n).length();
  while(n!=0)
{
a=n%10;
    if(count==1)
    {
      m=n%10;
      temp=n;
      break;
    }
    n=n/10;
    count++;
}
if(m%3==0&&len==3)
{
  System.out.println("Trendy Number");
}
    else  if(m%3!=0&&len==3)
    {
        System.out.println("Not a Trendy Number");
    }
    else
    {
         System.out.println("Invalid Number");
    }
  }
}