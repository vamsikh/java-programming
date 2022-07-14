import java.util.*;
class max2
  {
    public static void main(String args[])
    
    {
      Scanner s = new Scanner(System.in);
      
     
      System.out.println("enter x value");
       int x=s.nextInt();
      System.out.println("enter y value");
       int y=s.nextInt();
      if(x==y){
      System.out.println(x+ "and"+ y+" are equal numbers");
    }
    else if(x>y){
      System.out.println(x+ " is a maximum number");
    }
    else{
      System.out.println(y+ " is a maximum number");
    }
        }
  }
