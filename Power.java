import java.util.*;
public class Power
  {
    public static void main(String args[])
    {
      int base,power,res=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Base value");
      base=sc.nextInt();
      System.out.println("Enter Power of Base value");
      power=sc.nextInt();
      System.out.println("Power of "+base);
      for(int i=1;i<=power;i++)
        {
          res=res*base;
        }  
      System.out.println(base+"  Power of "+power+" is :"+res);
    }    
  }