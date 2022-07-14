import java.util.*;
public class max3{
  public static void main(String args[]){
  Scanner h=new Scanner(System.in);
  
    System.out.println("enter a value");
    int a=h.nextInt();
      System.out.println("enter b value");
    int b=h.nextInt();
      System.out.println("enter c value");
      int c=h.nextInt();
      if(a>b&&a>c){
      System.out.println(a+"is maximum");
      }
    else if(b>c&&b>a)
    {
      System.out.println(b+"is maximum");
    }
    else
      {
      System.out.println(c+"is maximum");
      }
  }
}