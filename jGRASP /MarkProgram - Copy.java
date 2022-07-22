import java.util.*;

class MarkProgram
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int[] marks = {99, 98, 67, 83};
    int index;
    boolean isValidInput = false;
    while(!isValidInput)
    {
       try{
         System.out.println("Enter the index of the mark you would like");
         in = new Scanner(System.in);
         index = in.nextInt(); // could throw InputMisMatch if input is not an int
         System.out.println("The mark at that index is " + marks[index]);  // could throw ArrayIndexOutOfBounds if index is greater than array bounds
         isValidInput = true;
       }
       catch(InputMismatchException im)
       {
         System.out.println("Please enter only an int and not a String");
         isValidInput = false;
       }
       catch(ArrayIndexOutOfBoundsException ae)
       {
         System.out.println("Your index is out of range. Your int must be from 0-3");
         isValidInput = false;
       }
       catch(Exception e)
       {
         System.out.println("Something went wrong!! I'm not sure what it is");
         System.out.println(e);
         isValidInput = false;
       }
    }
     
    
  }
}