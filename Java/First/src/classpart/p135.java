package classpart;

public class p135 {
   public int add(int num1, int num2) {
      int result;
      result = num1 + num2;
      return result;
   }
   
   public static void printGreeting(String name) {
	   System.out.println(name + "´Ô ¾È³çÇÏ¼¼¿ä.");
	   return;
   }
   
   public static void main(String[] args) {
//      p135 result = new p135();
//      int return_result = result.add(1, 2);
//      System.out.println(return_result);
	   
	   p135 result = new p135();
	   result.printGreeting("ÀÌµµ¿ø");
   }
}