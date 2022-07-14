import java.util.*;
public class Series{
  
public static void main(String args[])
    {
  int i,j,row;
  System.out.println("enter a numer");
  Scanner h=new Scanner(System.in);
  i=h.nextInt();
  for(row=1;row<=i;i++)
    {
      for(j=1;j<=row;j++)
        {
      System.out.print("*"+" ");
        }
    
      System.out.println();
    }
}
}
