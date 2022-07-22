class Fraction
{
  // instance fields
  int num;  // numerator
  private int den;  // denominator
  
  // Constructors - creator and initializer of fields
  
  /**
   * This constructor replaces the default constructor. It creates
   * a Fraction with 0/1 representing 0.
   */
  public Fraction()
  {
    num = 0;
    den = 1;
  }
  
  /**
   * This constructor reads in the num and den fields from the
   * user and assigns them into the appropriate fields.
   */
  public Fraction(int num, int den)
  {
    this.num = num;
    if( den == 0 )
    {
      System.out.println("Can't set denominator to 0. Denominator set to 1");
      this.den = 1;
    }
    else
      this.den = den;
  }
  
  public Fraction(Fraction other)
  {
    this.num = other.num;
    this.den = other.den;
  }

  /**
   * This method first reduces the implicit Fraction and the
   * returns a String representation of the Fraction in the form
   * of num/den
   */
  public String toString()
  {
    this.reduce();
    return this.num + "/" + this.den;
  }
  
  /**
   * Accessor (reading) Method - allows user to access the private field
   * with some controls (AKA "getter method")
   */
  public int getDen()
  {
    return this.den;
  }
  
  /**
   * Mutator (writing) Method - allows user to change the private field
   * with some controls (AKA "setter method");
   */
  public void setDen(int newDen)
  {
    if(newDen != 0)
      this.den = newDen;
    else
    {
      System.out.println("Cannot set denominator to 0. Denominator remains unchanged");
    }
  }
  
  public void invertMe()
  {
    int temp = this.num;
    this.num = this.den;
    this.den = temp;
  }
  
  public Fraction invert()
  {
    Fraction inverted = new Fraction();
    inverted.num = this.den;
    inverted.den = this.num;
    return inverted;
  }
  
  public Fraction plus(Fraction other)
  {
    Fraction sum = new Fraction();
    sum.num = this.num * other.den + other.num * this.den;
    sum.den = this.den * other.den;
    return sum;
  }
  
  public void plusEquals(Fraction other)
  {
    this.num = this.num * other.den + other.num * this.den;
    this.den = this.den * other.den;
  }
  
  /**
   * This method will compare the implicit Fraction
   * to the other Fraction in the parameter and return the larger of
   * the two.
   */
  public Fraction larger(Fraction other)
  {
    if( this.toDecimal() > other.toDecimal() )
      return this;  // return the implicit Fraction
    else
      return other;
  }
  /**
   * Will return true if this Fraction is bigger than the other Fraction
   */
  public boolean isLarger(Fraction other)
  {
    if( this.toDecimal() > other.toDecimal() )
      return true;
    else
      return false;
  }
  
  public double toDecimal()
  {
    return (double)this.num/this.den;
  }
  
  public Fraction times(Fraction other)
  {
    return new Fraction(this.num * other.num, this.den * other.den);
  }
  
  public Fraction times(Fraction other1, Fraction other2)
  {
    Fraction prod = new Fraction();
    prod.num = this.num * other1.num * other2.num;
    prod.den = this.den * other1.den * other2.den;
    
    return prod;
  }
  
  
  
  public void reduce()
  {
    int gcf = gcf(Math.abs(this.num), Math.abs(this.den));
    this.num = this.num / gcf;
    this.den /= gcf;
    
  }
  
  // stand-alone helper method
  public static int gcf(int firstNum, int secondNum)
  {
    int gcf = 1;
    if (firstNum>=0 && secondNum>=0)
    {
      for (int i = 1; i <= firstNum && i <= secondNum; i++)
      {
        if (firstNum % i == 0 && secondNum % i == 0)
          gcf = i;
      }
      return gcf;
    }
    return -1;
  }
  
  
}