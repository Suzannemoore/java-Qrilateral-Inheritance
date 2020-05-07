//Write an inheritance hierarchy for classes  Qadrilateral, Trapezoid,  Parallelogram,  
//Rectangle and Square. Use Quadrilateral as the superclass of the hierarchy. Create and 
//use a Point class to represent the points in each shape. Make the hierarchy as deep 
//(i.e., as many levels) as possible. Specify the instance variables and methods 
//for each class. The private instance variables of Quadrilateral should be the 
//x-y coordinate pairs for the four endpoints of the Quadrilateral. 
//write a program that instantiates objects of your classes and outputs each object’s area 
//(except Quadrilateral).   The Quadrilateral class is defined below.

package quadinheritancehierarchy;

public class Point
{
    //the varibles
   private double x, y;
  

   //two arguement constructor
   public Point (double xCoordinate, double yCoordinate)
   {
       //sets x 
       x = xCoordinate;
       //sets y
       y = yCoordinate;
   }
   //return y
   public double getY()
   {
       return y;
   }

   //return x
   public double getX()
   {
       return x;
   }
   //shows the points in nice format 
   //@Override
   // return string representation of Point object
   public String toString()
   {
       return "[ " + getX() + ", " + getY() + "]";
   }
}
