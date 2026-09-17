import java.util.Scanner;
public class MyCatMeowzer {
   public static void main(String[] args){
   
   String catName = "Meowzer";
   boolean isHungry = true;
   int catMealsPerDay = 2;
   double foodScoopsPerDay = 1.5;
   
   System.out.println ("What's your cat's name?");
   Scanner scan = new Scanner(System.in);
   String userCatName = scan.nextLine();
   
   System.out.print ("My cats name is " + catName + "!");
   System.out.println ("Is she hungry? " + isHungry);
   System.out.println ("We feed her " + catMealsPerDay + " times per day.");
   System.out.println ("We feed her " + foodScoopsPerDay/catMealsPerDay + " scoops of food per meal.");
   System.out.println ("I like the name " + userCatName + "!");
   }
}
