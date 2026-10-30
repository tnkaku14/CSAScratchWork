public class Algorithms{
   public static void main(String[] args){
      System.out.println(Algorithms.sumAllNumLessThan(10));
      System.out.println(largestRandomNumber(10));
   }
   public static int sumAllNumLessThan(int num){
      int value = 0;
      for (int i = 0;i<num;i++){
         value += i;
      }
      return value;
   }
   public static int largestRandomNumber(int loopTimes){
      int smallestValue = -10000;
      for(int i=0;i<loopTimes;i++){
         int num = (int) (Math.random() * (10000+1));
         if (num>smallestValue){
            smallestValue = num;
         }
      }
      return smallestValue;
   }
}