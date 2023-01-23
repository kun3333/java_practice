public class Guru{
     public static void test(){
      System.out.println("kunal is clever and happy");
   }
 public void test1(){
     System.out.println("kunal is good");
     Guru.test();
   }
     public static void main(String[] args){
     Guru obj=new Guru();
     obj.test1();
   }
}
