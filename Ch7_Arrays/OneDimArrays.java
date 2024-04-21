import java.util.Arrays;

public class OneDimArrays 
{
   public static void main(String[] args)
   {
        int[] intArr = {14, 42, 92, 51};
        double[] doubleArr = {23.89, 32.11, 90.20};
        int[] intArr2 = {32, 44, 12};
        int[] intArr3 = {32, 44};
        double a = average(intArr);
        double b = averageDouble(doubleArr);
        int c = min(intArr);
        boolean d = identical(intArr, intArr3);
        boolean e = identical(intArr2, intArr3);
        int[] f = merge(intArr, intArr2);
        for (int i = 0; i < f.length; ++i)
            System.out.print(f[i] + " ");
   }//end main
   
   public static int[] merge(int[] arr1, int[] arr2) 
   {
     int length1 = arr1.length;
     int length2 = arr2.length;
     int[] mergedArr = new int[length1 + length2];
     
     for (int i = 0; i < length1; ++i) 
     {
         mergedArr[i] = arr1[i];
     }
     for (int i = 0; i < length2; ++i) 
     {
         mergedArr[length1 + i] = arr2[i];
     }
     Arrays.sort(mergedArr);
     return mergedArr;
     
   }//end merge
      
   public static boolean identical(int[] arr1, int[] arr2) 
   {
    
      if (arr1.length == arr2.length)
      {
         int tracker = 0;
         for (int i = 0; i < arr1.length; ++i) 
         {
            if (arr1[i] == arr2[i])
            {
               tracker += 1;
            }
         }
         
         if (tracker == arr2.length) 
         {
            return true;
         } 
       }
      
      return false;
   }//end identical
   
   public static int min(int[] arr) 
   {
      int min = arr[0];
      for (int i = 0; i < arr.length; ++i) 
      {
         if (arr[i] < min) {
            min = arr[i];
         }
      }

      return min;
   
   }//end min
   
   public static double average(int[] arr) 
   {
      double sum = 0.0;
      for (int i = 0; i < arr.length; ++i) 
      {
         sum += arr[i];
      }

      return sum / arr.length;
   
   }//end average
   
   public static double averageDouble(double[] arr) 
   {
      double sum = 0.0;
      for (int i = 0; i < arr.length; ++i) 
      {
         sum += arr[i];
      }

      return sum / arr.length;
   
   }//end averageDouble
   
   
   
     
   
}