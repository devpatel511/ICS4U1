/**
 * This program will print the elements at the odd indices of a given array.
 * The method is overloaded and can accept an int array and a double array.
 * @author Cardoso
 * Date Last Modified Dec. 11th, 2020
 */

class PrintOddElements
{
  public static void main(String[] args)
  {
    System.out.println("Testing printOddIndices(int[])");
    int[] testCaseArrayInt1 = {10, 7, 9, 3, 26, 33};
        
    System.out.print("TEST CASE 1...  ");
    printArray(testCaseArrayInt1);
    System.out.println("The result should be 7, 3 and 33");
    System.out.println("The program gives the results...");
    printOddIndices(testCaseArrayInt1);
    
    int[] testCaseArrayInt2 = {-5, 0, 17, 22, 100, 44, 71};
    System.out.print("TEST CASE 2...  ");
    printArray(testCaseArrayInt2);
    System.out.println("The result should be 0, 22 and 44");
    System.out.println("The program gives the results...");
    printOddIndices(testCaseArrayInt2);
    
    System.out.println();
    System.out.println("Testing printOddIndices(double[])");
    double[] testCaseArrayDouble1 = {10.5, 7.5, 9.5, 3.5, 26.7, 33.3};
        
    System.out.print("TEST CASE 1...  ");
    printArray(testCaseArrayDouble1);
    System.out.println("The result should be 7.5, 3.5 and 33.3");
    System.out.println("The program gives the results...");
    printOddIndices(testCaseArrayDouble1);
    
    double[] testCaseArrayDouble2 = {-5.3, 0, 17.5, 22, 100.6, 44.7, 71.24};
    System.out.print("TEST CASE 2...  ");
    printArray(testCaseArrayDouble2);
    System.out.println("The result should be 0.0, 22.0 and 44.7");
    System.out.println("The program gives the results...");
    printOddIndices(testCaseArrayDouble2);
  }
  
  /**
   * This method will print the elements at the odd indices 
   * of a given int array.
   * @param arr the given array
   */
  public static void printOddIndices(int[] arr)
  {
    for(int i = 1; i < arr.length; i+=2)
      System.out.println(arr[i]);
  }
  
  /**
   * This method will print the elements at the odd indices 
   * of a given double array.
   * @param arr the given array
   */
  public static void printOddIndices(double[] arr)
  {
    for(int i = 1; i < arr.length; i+=2)
      System.out.println(arr[i]);
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
  
  /**
   * This method prints an array in the format {1, 2, 3, 4, 5, 6}
   * @param a the array we would like to print
   */
  public static void printArray(double[] a)
  {
    System.out.print("{");
    for(int i = 0; i < a.length-1; i++)
    {
      System.out.print(a[i] + ", ");
    }
    System.out.println(a[a.length-1] +"}");
  }
  
}
