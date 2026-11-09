public class EulerRegistration{
   public static void main(String[] args){
      long Sum = 0;
      long iSquared = 0;
      for(long i=1;i<692000;i++){
         iSquared = i*i;
         if(iSquared%2==1){
            Sum+=iSquared;
         }
      }
      System.out.println(Sum);
   }
}