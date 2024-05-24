package java1;
import java.util.*;
class Main {
        int length;
        int breadth;
      public void setDim(int length,int breadth){
           this.length=length;
           this.breadth=breadth;
       }
       public int getArea(int length,int breadth){
           int result=length*breadth;
           return result;
       } 
   }
public class Area{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
        int length=sc.nextInt();
		System.out.println("enter length");
        int breadth=sc.nextInt();
         Main a=new Main();
         a.setDim(length,breadth);
         int res=a.getArea(length,breadth);
         System.out.println("Area of rectangle "+res);
         sc.close();
	}
}

