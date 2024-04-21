public class StringOperations 
{
   public static void main(String[] args)
   {
        boolean a = validatePassword("guess6534");
        String b = countLetters("Luis Fernando Villalon");
        int c = count("Dragon Ball Z: Warriors", 'r');
        String d = reverse("stressed");
        System.out.println(d);
   }//end main
   
   public static String reverse(String phrase) 
   {
   
      String temp = new StringBuilder(phrase).reverse().toString();
      return temp;
   
   }
   
   
   public static int count(String phrase, char letter)
   {
      int counter = 0;
      for (int i = 0; i < phrase.length(); i++)
      {
         if (letter == phrase.charAt(i)) {
            counter++;
         }
      }
      
      return counter;
   
   }
   
   public static String countLetters(String str)
   {
      int upCounter = 0;
      int lowCounter = 0;
      for (int i = 0; i < str.length(); i++)
      {
         if (Character.isUpperCase(str.charAt(i))) {
            upCounter++;
         } else if (Character.isLowerCase(str.charAt(i))) {
            lowCounter++;
         }
      }
      String ans = "# of lowercases: " + lowCounter + ". # of uppercases: " + upCounter + ". ";
      return ans;
   }
   
   
   public static boolean validatePassword(String attempt) 
   {
      String password = "password123";
      if (password.equals(attempt)) 
      {
         return true; 
      } else {
         return false;
      }
      
   }//end isPrime
   
     
   
}