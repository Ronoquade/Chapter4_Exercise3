/**Class: Triangle
 * @author Ronoquade Lawrence
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: April 9, 2024
 *
 * This class tests if instances of the Triangle class have valid side
 * measurements.
 */
public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;


    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }
    public Triangle() {
        this(1.0,1.0,1.0);
    }

    // method checks if Triangle instance meets the requirements for a legal triangle
    public boolean checkSides() throws IllegalTriangleSideException {
        boolean validTriangle = true;
        if ( !( (sideOne + sideTwo) > (sideThree) ) ) {
            validTriangle = false;
            throw new IllegalTriangleSideException("The sum of side one and side two has to be greater than side three");
        }
        else if ( !( (sideTwo + sideThree) > (sideOne) ) ) {
            validTriangle = false;
            throw new IllegalTriangleSideException("The sum of side two and side three has to be greater than side one");
        }
        else if ( !( (sideOne + sideThree) > (sideTwo) ) ) {
            validTriangle = false;
            throw new IllegalTriangleSideException("The sum of side one and side three has to be greater than side two");
        }
        return validTriangle;
    }
    // Main Method
    public static void main(String[] args) throws IllegalTriangleSideException{
        Triangle one = new Triangle();
        Triangle two = new Triangle(0,1,3);
        Triangle three = new Triangle(100,2,3);
        Triangle four = new Triangle();

        System.out.println(one.checkSides());
        System.out.println(two.checkSides());
        System.out.println(three.checkSides());
        System.out.println(one.checkSides());
    }
}