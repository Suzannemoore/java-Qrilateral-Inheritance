//Write an inheritance hierarchy for classes  Qadrilateral, Trapezoid,  Parallelogram,  
//Rectangle and Square. Use Quadrilateral as the superclass of the hierarchy. Create and 
//use a Point class to represent the points in each shape. Make the hierarchy as deep 
//(i.e., as many levels) as possible. Specify the instance variables and methods 
//for each class. The private instance variables of Quadrilateral should be the 
//x-y coordinate pairs for the four endpoints of the Quadrilateral. 
//write a program that instantiates objects of your classes and outputs each object’s area 
//(except Quadrilateral).   The Quadrilateral class is defined below.
package quadinheritancehierarchy;

//using trapzoid public methods
public class Parallelogram extends Trapezoid 
{
    // parallelogram constructor
    public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) 
    {
        //        point1 = new Point(x1, y1);
        //        point2 = new Point(x2, y2);
        //        point3 = new Point(x3, y3);
        //        point4 = new Point(x4, y4);
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    } 

    // math for the width
    //using point class
    public double getWidth() 
    {
        if (getPoint1().getY() == getPoint2().getY()) 
        {
            return (getPoint1().getX() - getPoint2().getX());
        } 
        else 
        {
            return (getPoint2().getX() - getPoint3().getX());
        }
    } 
    
    // return string representation of Parallelogram object
    //print to screen
    //override a method in sub class
    @Override
    public String toString()
    {
        return "\nCoordinates of Parallelogram are: \n" + getCoordinatesAsString()+ "\nWidth is: " + getWidth() + "\nHeight is: " + getHeight() + "\nArea is: " + getArea();   
       
    } 
} 
