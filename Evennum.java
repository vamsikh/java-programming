import java.util.*;
class Evennum
  {
    public static void main(String args[])
    {
      int n;
      System.out.println("enter n value");
      Scanner h=new Scanner(System.in);
      n=h.nextInt();
      for(int i=1;i<n;i++)
        {
          if(i%2==0)
          {
            System.out.println(i);
          }
        }
    }
  }
  