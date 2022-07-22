/**
 * This program can be used in the main method of another class to create
 * and manipulate lines in the Cartesian plane in various ways.
 * This representation of a line in mathematics is using the equation y = mx + b 
 * where m represents the slope of the line and b the y-intercept.
 * Example: y = 2.1x + 15.4, 2.1 is m(slope) and 15.4 is b(y-intercept)
 * In this Line class, there are many methods that the user can 
 * easily access to help find or calculate certain features and concepts of lines.
 * @author Dev Patel
 * Date Last Modified Jan. 19th, 2021
 */

class Line
{
   // Instance Fields
   
   double m;
   double b;
   
   // Constructors
   
   /**
    * This constructor replaces the default constructor. It creates a
    * a Line with the value 0.0 for the slope and y-intercept(so y = 0)
    */
   public Line()
   {
      this.m = 0;
      this.b = 0;
   }
   
   /**
    * This constructor creates a Line with two double parameters 
    * and assigns the values of the slope and y-intercept given into their appropriate fields.
    * @param m the value of the slope of the line as a double
    * @param b the value of the y-intercept of the line as a double
    */
   public Line(double m, double b)
   {
      this.m = m;
      this.b = b;
   }
   
   // Instance Methods
   
   /**
    * This method returns a String that is formatted to display the implicit Line
    * in y = mx + b format. (ex. y=2.0x-15.3 or y=0.0x+0.0) 
    * @return String diplaying the implicit Line in y = mx + b format
    */
   public String toString()
   {
      if(this.b < 0)
         return "y=" + this.m + "x" + this.b;
      else
         return "y=" + this.m + "x+" + this.b;
   }
   
   /**
    * This method returns the y-value of the implicit Line as a double (Formula used: y=mx+b)
    * @param x the given x value of the line as a double
    * @return the y-value of the implicit Line as a double
    */
   public double getY(double x)
   {
      double y = (this.m * x) + (this.b);
      return y;
   }
   
   /**
    * This method returns the x-value of the implicit Line as a double (Formula used: y=mx+b).
    * @param y the given y value of the line as a double
    * @throws RuntimeException if m(slope) is equal to 0 to avoid mathematical error
    * @return the x-value of the implicit Line as a double
    */
   public double getX(double y)
   {
      double x;
      if(this.m != 0)
      {
         x = (y - this.b) / this.m;
         return x;
      }
      else
         throw new RuntimeException("The slope is 0, cannot solve for x-value");
   }
   
   /**
    * This method returns a new Line that is perpendicular to the implicit Line (Formula used: y=(-1/m)+b).
    * @param b the given y-intercept value of the new Line as a double
    * @throws RuntimeException if m(slope) is equal to 0 to avoid mathematical error
    * @return a new Line that has values perpendicular to the implicit Line
    */
   public Line getPerpendicularLine(double b)
   {
      Line perpendicular = new Line();
      if(this.m != 0)
         perpendicular.m = (1 / this.m) * (-1);
      else
         throw new RuntimeException("The slope is 0, cannot create perpendicular line");
      perpendicular.b = b;
      return perpendicular;
   }
   
   /**
    * This method determines and return either true/false depending on if the implicit
    * and explicit Lines are equal to each other (if the m and b valus are equal to 3 decimals).
    * @param other the explicit Line
    * @return true if the Lines are equal, and false otherwise
    */
   public boolean equals(Line other)
   {
      return roundThreeDecimals(this.m) == roundThreeDecimals(other.m) && roundThreeDecimals(this.b) == roundThreeDecimals(other.b);
   }
   
   /**
    * This method determines and return either true/false depending on if the implicit
    * and explicit Lines are parallel to each other (if the m valus are equal to 3 decimals).
    * @param other the explicit Line
    * @return true if the Lines are parallel, and false otherwise
    */
   public boolean isParallel(Line other)
   {
      return roundThreeDecimals(this.m) == roundThreeDecimals(other.m);
   }
   
   // Class Methods
   
   /**
    * This method takes in 4 double parameters for two points (x1, y1) & (x2, y2),
    * and then calculates and returns the slope between them.
    * @param x1 the x-coordinate of the first point as a double
    * @param y1 the y-coordinate of the first point as a double
    * @param x2 the x-coordinate of the second point as a double
    * @param y2 the y-coordinate of the second point as a double
    * @throws RuntimeException if the difference of the x-values equals 0 to avoid mathematical error
    * @return the slope between two points as a double
    */
   public static double getSlope(double x1, double y1, double x2, double y2)
   {
      if( (x2 - x1) != 0)
      {
         double slope = (y2 - y1) / (x2 - x1);
         return slope;
      }
      else
         throw new RuntimeException("x2 - x1 = 0, cannot solve for slope");
   }
   
   /**
    * (HELPER METHOD)
    * This method takes a dobuble number and returns it rounded to 3 decimal places.
    * @param num the given number 
    * @return given number rounded to three decimal places also as a double 
    */
   public static double roundThreeDecimals(double num)
   {
      double numRounded = Math.round(num * 1000.0) / 1000.0;
      return numRounded;
   }
}