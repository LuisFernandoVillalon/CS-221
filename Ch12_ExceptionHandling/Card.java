public class Card 
{
   //data fields, a place where you can store data
   private String rank, suit;
   private int value; 
   //constructor(s)
   //never returns a value (void is excluded)
   //named after its class
   //must be public
   public Card (String a, String b)
   {
      this.rank = a;
      this.suit = b;
      setValue();
   } 
   //methods (getter/setter), bc it is private it can only be called withing this class
   private void setValue()
   {
      switch(this.rank.toLowerCase()) 
      {
         case "two":
            this.value = 2;
            break;
         case "three":
            this.value = 3;
            break;
         case "four":
            this.value = 4;
            break;
         case "five":
            this.value = 5;
            break;   
         case "six":
            this.value = 6;
            break;
         case "seven":
            this.value = 7;
            break;
         case "eight":
            this.value = 8;
            break;
         case "nine":
            this.value = 9;
            break;
         case "ten":
            this.value = 10;
            break;
         case "king":
            this.value = 10;
            break;
         case "queen":
            this.value = 10;
            break;
         case "jack":
            this.value = 10;
            break; 
         case "ace":
            this.value = 1;
            break;                                                                                                                                
      }
   }
   //specialized methods
   private void aceUp() 
   {
     this.value = 11;     
   }
   //toString method
   @Override
   public String toString()
   {
      return "Card: " + this.rank + " of " + this.suit + "\nValue: " + this.value;
   }
}                       
                  
    