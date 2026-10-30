public class LittleLamb {
   public static void main(String[] args){
      System.out.print("Mary had a ");
      marysPet("Honey-baked ham", ",");
      System.out.println(".");
      
   }
   public static void marysPet(String petName, String punctuation) {
      System.out.print(petName + punctuation);
   }
}