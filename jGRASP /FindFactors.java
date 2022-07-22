/**
 * This program will find the factors of a given int and return them
 * in a factor array.
 * For example,
 * findFactors(8)
 * returns
 * [1, 2, 4, 8]
 * @author C. Cardoso
 * Date Last Modified Dec. 11th, 2020
 */

class FindFactors
{
  public static void main(String[] args)
  {
    System.out.println("Testing findFactors TEST CASE 1");
    int[] testCase1Factors = findFactors(8);
    System.out.println("Testing 8...");
    System.out.println("Expected result: [1, 2, 4, 8]");
    System.out.print("Program result:     ");
    printArray(testCase1Factors);
    
    System.out.println("Testing findFactors TEST CASE 2");
    int[] testCase2Factors = findFactors(20);
    System.out.println("Testing 20...");
    System.out.println("Expected result: [1, 2, 4, 5, 10, 20]");
    System.out.print("Program result:     ");
    printArray(testCase2Factors);
    
  }
  
  /**
   * This method will find the factors of n and return them
   * in an int array
   * @param n the given int
   * @return the array of factors
   */
  public static int[] findFactors(int n)
  {
    int[] factorArr = new int[numOfFactors(n)];
    
    int factor = 1; // checking if factor is a factor of n
    for(int i = 0; i < factorArr.length; factor++)
    {
      if(n % factor == 0){
        factorArr[i] = factor;
        i++;
      }
    }
    
    return factorArr;
    
  }

  /**
   * This method will return the number of factors of a given int n
   * @param n the given int
   * @return the number of factors of n
   */
  public static int numOfFactors(int n)
  {
    if(n == 1)
      return 1;
    
    int numOfFactors = 2;
     
    for(int i = 2; i <= n/2; i++)
    {
      if(n % i == 0)
        numOfFactors++;
    }
    
    return numOfFactors;
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
