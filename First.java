import java.util.*;
public class First
  {
    public static void main(String a[])
    {
      int n,first_number=0,last_number=0,sum=0;
      Scanner j=new Scanner(System.in);
       System.out.println("enter n value");
      n=j.nextInt();
       
      last_number=n%10;
      System.out.println(last_number);
      while(n!=0){
        first_number=n%10;
          n=n/10;
      }
    sum=first_number+last_number;
    System.out.println(first_number);
        System.out.println(sum);
      
      
    }
}