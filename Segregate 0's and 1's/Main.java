import java.util.*;
class Main
{
 
  public static void main(String args[])
  {
    String s;
    int i;
    Scanner sc=new Scanner(System.in);
    StringBuilder str1=new StringBuilder();
    StringBuilder str2=new StringBuilder();
    s=sc.next();
    char a[]=s.toCharArray();
    for(i=0;i<a.length;i++)
    {
      if(a[i]=='1')
      {
        str1.append(a[i]);
      }
      else
        str2.append(a[i]);
    }
    
    System.out.println(str1.append(str2));
   
  }
}