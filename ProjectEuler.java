public class ProjectEuler {
   
   public static int problem1() {
      int P1Sum = 0;
         for(int i = 1; i<1000;i++){
            if (i%3==0 || i%5 ==0){
               P1Sum += i;
            }
         }
      return P1Sum;
   }
   
   public static int problem2() {
      int P2Sum = 0;
      int PastResult1 = 1;
         for (int i = 2; i<4000000;i=i+PastResult1){
            if(i%2==0){
               P2Sum += i;
            }
            PastResult1 = i-PastResult1;
         }
      return P2Sum;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());      
   }  
}