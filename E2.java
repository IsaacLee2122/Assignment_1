//Isaac Lee, Exercise 2:Create a SquareTest class that contains a main() method that instantiates an object of type//
//Square, with side of value 5. Then print the perimeter and the area of the object just created. //
    
public class SquareTest {
    public static void main(String args[]) {
        Square square = new Square ();
        square.side = 5;
        int perimeter = square.perimeter();
        System.out.println(perimeter);
        int area = square.area();
        System.out.println(area);
    }
}
