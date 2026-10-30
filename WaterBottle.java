//class declaration
public class WaterBottle{

   //instance variable
   String bottleColor;
   
   //constructor
   public WaterBottle(String bottleColor){
      System.out.println("You just made a water bottle");
      }
   //method declarations
   public int fill(int waterOz){
      return waterOz;
   }
   public String open(){
      return "Unscrew the bottle.";
   }
}