public class StaticToStatic{
 static int x=30,y=90;
 public static void main(String[] args){
     StaticToStatic obj1=new  StaticToStatic();
     System.out.println("x=" +obj1.x);
     System.out.println("y=" +obj1.y);
  }
 }