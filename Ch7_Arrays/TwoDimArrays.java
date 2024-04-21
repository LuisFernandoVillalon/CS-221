import java.util.Arrays;

public class TwoDimArrays 
{
   public static void main(String[] args)
   {
        int[][] arr2D = { {1, 2, 3}, {4, 5, 6}, { 7, 8, 9} };
        int[][] arr2D_2 = { {934, 8234, 712}, {1236, 15, 421}, {43, 42, 111} }; 
        int row = 0;
        int column = 2;
        int a = sumRow(arr2D, row);
        int b = sumColumn(arr2D, column);
        int[][] c = addMatrix(arr2D, arr2D_2);
        int d = locateLargest(arr2D_2);
       for (int i = 0; i < c.length; ++i)
       {
          for (int j = 0; j < c[i].length; ++j)
          {
            System.out.print(c[i][j] + " ");
          }
       }
        System.out.print(d);
   }//end main
   
   public static int locateLargest(int[][] arr) 
   {
      int min = arr[0][0];
      for (int i = 0; i < arr.length; ++i)
      {
         for (int j = 0; j < arr[i].length; ++j)
         {
           if (arr[i][j] < min) 
           {
            min = arr[i][j];
           }
         }
      }      
      return min;
   }//end locateLargest
   
   public static int[][] addMatrix(int[][] arr1, int[][] arr2)
   {
      for (int i = 0; i < arr1.length; ++i)
      {
         for (int j = 0; j < arr1[i].length; ++j)
         {
            arr1[i][j] += arr2[i][j];
         }
      }
      return arr1;
   }//end addMatrix
   
   
   public static int sumColumn(int[][] arr2D, int col) 
   {
      int sum = 0;
      for (int i = 0; i < arr2D.length; ++i) 
      {
         sum += arr2D[i][col];
      }
      return sum;
     
   }//end sumColumn     
   
   
   public static int sumRow(int[][] arr2D, int row) 
   {
      int sum = 0;
      for (int i = 0; i < arr2D[row].length; ++i) 
      {
         sum += arr2D[row][i];
      }
      return sum;
     
   }//end sumRow   
     
   
}