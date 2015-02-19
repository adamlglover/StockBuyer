public class House {
   int bedrooms = 5;
   int bathrooms = 2;
   int kitchens = 1;

   string maxCapacity(){
      return "The maxumin ammount of people that can live is " + bedrooms;
   }

    class Buyer {


       void intrest(){
           System.out.println("I Am intrested in a house that has " + maxCapacity());
       }


   }
 
}
