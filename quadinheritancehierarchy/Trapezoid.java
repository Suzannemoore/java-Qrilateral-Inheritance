//Write an inheritance hierarchy for classes  Qadrilateral, Trapezoid,  Parallelogram,  
//Rectangle and Square. Use Quadrilateral as the superclass of the hierarchy. Create and 
//use a Point class to represent the points in each shape. Make the hierarchy as deep 
//(i.e., as many levels) as possible. Specify the instance variables and methods 
//for each class. The private instance variables of Quadrilateral should be the 
//x-y coordinate pairs for the four endpoints of the Quadrilateral. 
//write a program that instantiates objects of your classes and outputs each object’s area 
//(except Quadrilateral).   The Quadrilateral class is defined below.

package quadinheritancehierarchy;

public class Trapezoid extends Quadrilateral 
{
    // the trapezoid consturctor. using quadrilateral public methods
    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) 
    {
        //        point1 = new Point(x1, y1);
        //        point2 = new Point(x2, y2);
        //        point3 = new Point(x3, y3);
        //        point4 = new Point(x4, y4);
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    
    //math to get the height
    public double getHeight() 
    {
        if (getPoint1().getY() == getPoint2().getY()) 
        {
            return (getPoint2().getY() - getPoint3().getY());
        } 
        else 
        {
            return (getPoint1().getY() - getPoint2().getY());
        }
    } 

    // area of trapezoid
    public double getArea() 
    {
        return (SumtwoSides() * getHeight()) / (2.0);
    } 

    //math to get the sum
    public double SumtwoSides() 
    {
        if (getPoint1().getY() == getPoint2().getY()) 
        {
            return (getPoint1().getX() - getPoint2().getX()) + Math.abs(getPoint3().getX() - getPoint4().getX());
        }
        else 
        {
            return (getPoint2().getX() - getPoint3().getX()) + Math.abs(getPoint4().getX() - getPoint1().getX());
        }
    } 

    // return string representation of Trapezoid object
    //override a method in sub class
    @Override
    public String toString() 
    {
        {
            return "\nCoordinates of Trapazoid are: \n" + getCoordinatesAsString() + "\nHeight is: " + getHeight() + "\nArea is: " + getArea();
            
        }
    }
}
