//Write an inheritance hierarchy for classes  Qadrilateral, Trapezoid,  Parallelogram,  
//Rectangle and Square. Use Quadrilateral as the superclass of the hierarchy. Create and 
//use a Point class to represent the points in each shape. Make the hierarchy as deep 
//(i.e., as many levels) as possible. Specify the instance variables and methods 
//for each class. The private instance variables of Quadrilateral should be the 
//x-y coordinate pairs for the four endpoints of the Quadrilateral. 
//write a program that instantiates objects of your classes and outputs each object’s area 
//(except Quadrilateral).   The Quadrilateral class is defined below.

package quadinheritancehierarchy;

public class QuadInheritanceHierarchy 
{
    //to test the program
    public static void main(String args[]) 
    {
        //quadrilateral class superclass
        Quadrilateral newQuadrilateral = new Quadrilateral
        (1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);

        //trapezoid class. subclass
        Trapezoid newTrapezoid = new Trapezoid
        (1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);
        
        // parallelogram class. subclass
        Parallelogram newParallelogram = new Parallelogram
        (1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);

        //rectangle class.subclass
        Rectangle newRectangle = new Rectangle
        (1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);

        //square class.subclass
        Square newSquare = new Square
        (1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0);

        //show out to screen
        System.out.printf("%s\n", newQuadrilateral);
        System.out.printf("%s\n", newTrapezoid );
        System.out.printf("%s\n", newParallelogram);
        System.out.printf("%s\n", newRectangle);
        System.out.printf("%s\n", newSquare);
        
    } 
} 

