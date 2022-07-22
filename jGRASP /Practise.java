/** 
 * This program will simply print "Hello World" to the user/
 * @author Dev Patel
 * Date Last Modified: Dec. 4th 2020
 */
import java.util.*;

class Template
{
   public static void main(String[] args)
   {
      System.out.println("Testing removeElement(int[])");
      int[] testCaseArrayInt1 = {10, 7, 9, 3, 26, 33};
      int index = 3;
           
      System.out.print("TEST CASE 1...  ");
      printArray(testCaseArrayInt1);
      System.out.println("The result should be 10, 7, 9, 26 and 33");
      System.out.println("The program gives the results...");
      printArray(removeElement(testCaseArrayInt1, index));    
      
      System.out.println("Testing joinArrays TEST CASE 1");
      int[] testCase1Factors = {10, 7, 9, 3, 26, 33};
      int[] testCase2Factors = {52, 49};
      System.out.println("Expected result: [10, 7, 9, 3, 26, 33, 10, 7, 9, 3, 26, 33]");
      System.out.print("Program result:     ");
      printArray(joinArrays(testCase1Factors, testCase2Factors));     
   }
   
   public static int[] removeElement(int[] arr, int index)
   {
      int[] newArr = new int[arr.length-1];
      for(int i = 0; i < index; i++){
         newArr[i] = arr[i];
      }
      for(int i = index; i < newArr.length; i++){
         newArr[i] = arr[i+1];
      }
      return newArr;
   }
   
   public static int[] joinArrays(int[] arr1, int[] arr2){
      int[] newArray = new int[arr1.length+arr2.length];
      for(int i = 0; i < arr1.length; i++){
         newArray[i] = arr1[i];
      }
      int j = 0;
      for(int i = arr1.length; i < newArray.length; i++){
         newArray[i] = arr2[j];
         j++;
      }
      return newArray;
   }

   /**
    * This method prints an array in the format {1, 2, 3, 4, 5, 6}
    * @param a the array we would like to print
    */
   public static void printArray(int[] a)
   {
      System.out.print("{");
      for(int i = 0; i < a.length-1; i++)
      {
         System.out.print(a[i] + ", ");
      }
      System.out.println(a[a.length-1] +"}");
   }

}