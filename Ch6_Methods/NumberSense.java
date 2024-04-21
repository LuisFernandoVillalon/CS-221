public class NumberSense 
{
   public static void main(String[] args)
   {
        int a = reverse(347);
        boolean b = isPalindrome(222); 
        int c = sumDigits(234);
        String d = displaySortedNumbers(19, 45, 33);
        double e = celsiusToFarenheit(78.3);
        double f = farenheitToCelcius(78.3);
        boolean g = isPrime(23);
        System.out.println(g);
   }//end main
   
   public static boolean isPrime(int num) 
   {
   
      for (int i = 2; i <= num / 2; ++i) {
         if (num % i == 0) {
           return false;
         }
    }

    return true;
   }//end isPrime
   
   public static double celsiusToFarenheit(double temp) 
   {
   
      double ans = ( temp * (9.0f/5) ) + 32 ; 
      return ans;
   
   }//end celsiusToFarenheit
   
   public static double farenheitToCelcius(double temp) 
   {
   
      double ans = ( temp - 32 ) * (5.0f/9) ; 
      return ans;
   
   }//end farenheitToCelcius
   
   
   public static String displaySortedNumbers(int num1, int num2, int num3)
   {
      int first = 0;
      int second = 0;
      int third = 0;
      String ans = "";
      if ( num1 > num2 && num1 > num3 )
      {
        first = num1;
         if ( num2 > num3 ) 
         {
           second = num2;
            third = num3;
         }else {
           second = num3;
           third = num2;
         }
      } else if ( num2 > num1 && num2 > num3 )
      {
            first = num2;
            if ( num1 > num3 ) 
            {
               second = num1;
               third = num3;
            } else {
               second = num3;
               third = num1;
            }
      } else if ( num3 > num2 && num3 > num1 )
      {
            first = num3;
            if ( num2 > num1 ) 
            {
               second = num2;
               third = num1;
            } else {
               second = num1;
               third = num2;
            }
      }  
      ans = third + ", " + second + ", " + first;
      return ans;
   }//end displaySortedNumbers
   
   
   public static boolean isPalindrome(int num) 
   {
      
      int i = 0;
      int copy = num/10;
      while( copy > 0 )
      {
         copy /= 10;
         i++;
      }
      int revNum = 0;
      int temp = num;
      while( temp > 0 )
      { 
         int digit = temp % 10;
         revNum =  revNum + (int) (digit * Math.pow(10, i));
         i--;
         temp /= 10;
      }
      if (revNum == num) {
         return true;
      } else {
         return false;
      }
      
   }//end isPalindrome
   
   public static int sumDigits(int num) 
   {
      int sum = 0;
      
      while(num > 0) 
      {
       int temp = num % 10;
       sum += temp;
       num /= 10;
      }
      return sum;
   }//end sumDigits
   
   public static int reverse(int num) 
   {
      int i = 0;
      int copy = num/10;
      while( copy > 0 )
      {
         copy /= 10;
         i++;
      }
      int newNum = 0;
      while( num > 0 )
      { 
         int digit = num % 10;
         newNum =  newNum + (int) (digit * Math.pow(10, i));
         i--;
         num /= 10;
      }

      return newNum;
   }//end reverse
   
   
}