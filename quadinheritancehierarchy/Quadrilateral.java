/*Write an inheritance hierarchy for classes  Qadrilateral, Trapezoid,  Parallelogram,  
Rectangle and Square. Use Quadrilateral as the superclass of the hierarchy. Create and
use a Point class to represent the points in each shape. Make the hierarchy as deep 
(i.e., as many leofvels) as possible. Specify the instance variables and methods for each
class. The private instance variables of Quadrilateral should be the x-y coordinate
pairs for the four endpoints of the Quadrilateral. Write a program that instantiates 
objects of your classes and outputs each object’s area (except Quadrilateral).   
The Quadrilateral class is defined below.*/

package quadinheritancehierarchy;

//this is the superclass and is what is getting inherit from other class inherit 
//what is in this class
public class Quadrilateral 
{
    //this is private so other class do not use this
    private Point point1; // first endpoint
    private Point point2; // second endpoint
    private Point point3; // third endpoint
    private Point point4; // fourth endpoint

    // quadrilaterl constructor. double points
    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) 
    {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        point3 = new Point(x3, y3);
        point4 = new Point(x4, y4);
    }

    // return point1
    //double x1, double y1
    public Point getPoint1() 
    {
        return point1;
    }

    // return point2
    //double x2, double y2
    public Point getPoint2() 
    {
        return point2;
    }

    // return point3
    //double x3, double y3
    public Point getPoint3() 
    {
        return point3;
    }

    // return point4
    //double x4, double y4
    public Point getPoint4() 
    {
        return point4;
    }

    // return string representation of a Quadrilateral object
    @Override
    public String toString() 
    {
        return String.format("%s:\n%s", "Coordinates of Quadrilateral", getCoordinatesAsString());
        
    }

    // return string containing coordinates as strings
    public String getCoordinatesAsString() 
    {
        return point1.toString() + ", " + point2.toString() + ", " + point3.toString() + ", " + point4.toString();
    }
}
