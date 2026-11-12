public class FindMinimum{
   public static int findMin(){
      int findMin = 100;
      int randNum = 0;
      for(int i = 0;i<10;i++){
         randNum = (int)(Math.random()*100)+1;
         if(randNum<findMin){
            findMin = randNum;
         }
      }
      return findMin;
   }
   public static void main(String[] args){
      System.out.print(findMin());
   }
}