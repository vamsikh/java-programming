import java.util.*;
public class Copy
  {  
public static void main(String[] args) {  
      
       int n,i; 
        System.out.println(" elements in given array ");  
        Scanner h=new Scanner(System.in);
        n=h.nextInt();
        int p[]=new int[n];
        int q[]=new int[n];
        
        for(i=0;i<n;i++)
          {
            System.out.println("copy a elements"+"["+i+"]:");
            p[i]=h.nextInt();
          }
  for(i=0;i<n;i++)
    {
      q[i]=p[i];
    }
  for(i=0;i<n;i++)
    {
      System.out.println(q[i]);
    }
          
          
       
    }  
}  