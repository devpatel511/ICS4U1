import java.util.*;

class FractionAverage
{
  public static void main(String[] args)
  {
    Scanner kbReader = new Scanner(System.in);
    
    System.out.println("Enter the numerator of the Fraction.");
    int num = kbReader.nextInt();
    
    System.out.println("Enter the denominator of the Fraction. 0 to quit");
    int den = kbReader.nextInt();
    
    Fraction totalSum = new Fraction(0, 1);
    int numOfFractions = 0;
    
    Fraction largest = new Fraction(num, den);
    Fraction current = new Fraction(num, den);
    
    while(den != 0)
    {
      current.num = num;
      current.setDen(den);
      
      totalSum.plusEquals(current);
      numOfFractions++;
      
      if( current.isLarger(largest) ){
        largest.num = current.num;  // do not do this largest = current;
        largest.setDen(current.getDen());
      }
           
      System.out.println("Enter the numerator of the Fraction.");
      num = kbReader.nextInt();
    
      System.out.println("Enter the denominator of the Fraction. 0 to quit");
      den = kbReader.nextInt();
    }
    
    // Compute avagage
    Fraction avg = new Fraction(totalSum.num, totalSum.getDen() * numOfFractions);
    System.out.println("The average is " + avg);
    System.out.println("The largest fraction entered is " + largest);
    
  }
  
}