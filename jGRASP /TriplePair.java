/**
 * @author Dev Patel
 * Date Last Modified Jan. 25th, 2021
 */
 
class TriplePair
{
   public static void main(String[] args)
   {
      // test case 1 (postive and negative number)
      int[] testCase1Array = {1, -2, 6, 4, 5};
      System.out.println("Test Case 1 Array: {1, -2, 6, 4, 5}");
      System.out.println("Output should be: false");
      System.out.println("Output from method: " + arrayTriple(testCase1Array, 0) + "\n");
      
      // test case 2 (starting at index 2)
      int[] testCase2Array = {5, 20, 60, 4, 7};
      System.out.println("Test Case 2 Array: {5, 20, 60, 4, 7}");
      System.out.println("Output should be: false");
      System.out.println("Output from method: " + arrayTriple(testCase2Array, 2) + "\n");
      
      // test case 3 (contains triple pair)
      int[] testCase3Array = {2, 7, 7, 9, 27};
      System.out.println("Test Case 3 Array: {2, 7, 7, 9, 27}");
      System.out.println("Output should be: true");
      System.out.println("Output from method: " + arrayTriple(testCase3Array, 0));
   }
   
   public static boolean arrayTriple(int[] arr, int index)
   {
      if(index < arr.length && ((index + 1) < arr.length))
      {
         if( (arr[index] * 3) == arr[index + 1])
            return true;
         else
            return arrayTriple(arr, index + 1);
      }
      else
         return false;
   }
   
}