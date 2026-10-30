public class WaterBottleTester{
   public static void main(String[] args){
   

   WaterBottle myBottle = new WaterBottle("green");
   
   System.out.println(myBottle.open());
   System.out.println(myBottle.fill(24));
   System.out.println(myBottle.bottleColor);
   }
}