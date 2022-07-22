/**
 * This class contains most of the solutions from the Sample Quiz
 * for the quiz on Arrays and Methods. There is a main method
 * with some example test cases.
 * 
 * There are also some helper methods at the bottom.
 * For problem number 5, I copied the helper method into this class
 * for counting the number of factors given a int to keep it all contained in
 * one file.
 */

class ArraysMethods
{
  public static void main(String[] args)
  {
    // testing problem #0 -- swap()
    double[] values = {2.5, 7, 9.3, Math.PI, 7.9};
    printArray(values);
    swap(values, 1, 4);
    printArray(values);
    
    // testing problem #2 -- lastMultiple
    int[] multiples = {4, 5, 7, 11};
    System.out.println( lastMultiple3(multiples) );
    
    // testing problem #4
    String newWord = replaceLetter("hello", 'l', '$');
    System.out.println( newWord );
    
    // testing problem #5 -- findFactors
    int[] factors = findFactors(12);
    printArray(factors);
  }
  
  /**
   * Problem #0 - Swap
   */
  public static void swap(double[] list, int i, int j)
  {
    double temp = list[i];
    list[i] = list[j];
    list[j] = temp;
  }
  
  /**
   * Problem #2
   * Write a method that returns the index of the last value 
   * in the array that is a multiple of 3. For example, in the array
   * [4, 7, 9, 7, 12, 13] the last (rightmost) multiple of three is 
   * ‘12’, which occurs at index 4. If there is no multiple of 3 in the 
   * array, we return -1
   */
  public static int lastMultiple3(int[] list)
  {
    for(int i = list.length-1; i >= 0; i--)  // right to left in array
    {
      if(list[i] % 3 == 0 )
        return i;
    }
    
    // if no multiples of 3 in the array
    return -1;
    
  }
  
  /**
   * Problem #4
   * Write a method that will take an integer parameter, n, 
   * and return an int array with all of n’s factors in  ascending order.
   * For example, findFactors(8) returns [1, 2, 4, 8]
   */
  public static String replaceLetter(String word, char letter, char replaceWith)
  {
    String newWord = "";
    for(int i = 0; i < word.length(); i++)
    {
      if( word.charAt(i) == letter )
        newWord += replaceWith;
      else
        newWord += word.charAt(i);
    }
    return newWord;
    
  }
  
  
  /**
   * Problem #5
   * Write a method that will take an integer parameter, n, 
   * and return an int array with all of n’s factors in  ascending order.
   * For example, findFactors(8) returns [1, 2, 4, 8]
   */
  public static int[] findFactors(int n)
  {
    // determine number of factors
    int[] factorsArr = new int[numFactors(n)];
    
    int factor = 1;
    for(int i = 0; i < factorsArr.length; factor++)
    {
      if( n % factor == 0 ){
        factorsArr[i] = factor;
        i++;
      }
    }
    
    return factorsArr;
    
  }
  
  // Helper method for problem #5.
  // Will return the number of factors in a given int.
  // For example, if n is 8, this method will return 4 (4 factors of 8)
  public static int numFactors(int n)
    {
      int numOfFactors = 0;
      for(int i = 1; i <= n; i++)
      {
        if( n % i == 0)
          numOfFactors++;
      }
      
      return numOfFactors;
    }
  
  

  // Helper Method - Nicely prints out an array of ints
  public static void printArray(int[] list)
  {
    System.out.print("{");
        
    for(int i = 0; i < list.length-1; i++)
      System.out.print(list[i] + ", ");
    
    System.out.println(list[list.length-1]  + "}");
    
  }
  
  // Helper Method - Nicely prints out an array of doubles
  public static void printArray(double[] list)
  {
    System.out.print("{");
        
    for(int i = 0; i < list.length-1; i++)
      System.out.print(list[i] + ", ");
    
    System.out.println(list[list.length-1]  + "}");
    
  }
  
  
  
  
}