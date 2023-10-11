
package jun02;

public class Test01 {
   public static void main(String[] args) {
      
      int num9 = 1;
      System.out.println("num9 = 1 : " + num9);
      
      int num10 = num9--;
      //        1      2
      System.out.println(num9); //0
      System.out.println(num10); //1

      int num11 = (num9--) + (--num9);
      //        3     4  2  1
      System.out.println(num9);//-2
      System.out.println(num10);//1
      System.out.println(num11);//-2

   }
}