import java.util.*;
class Sum
  
  {
    public static void main(String args[])
    {
      int n,sum=0,d;
      System.out.println("enter n value");
      Scanner h=new Scanner(System.in);
      n=h.nextInt();
        while(n>0)
      {
       d=n%10;
System.out.println(d);
sum=sum+1;
n=n/10;
}
System.out.println(sum);
}
}