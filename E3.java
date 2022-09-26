//Isaac Lee, Exercise 3: To avoid to write this statement, create a constructor in the Square class of the Exercise 2.d,
//which takes the value of the variable side as input. Once done, compile the Square class. The//
//SquareTest class, on the other hand, will no longer compile due to the instruction specified//
//above and the non-use of the new constructor. Modify the code of the SquareTest class so that//
//it compiles and runs correctly.//

public class Square {
  public int side;
  public Square(int l) {
    side = 1;
  }
  public int perimeter() {
      int perimeter = side * 4;
      return perimeter;
  }
  
  public int area() {
      int area = side * side;
      return area;
  }
}

public class SquareTest {
    public static void main(String args[]) {
        Square sqaure = new Square(5);
        int perimeter = square.perimeter();
        System.out.println(perimeter);
        int area = square.area();
        System.out.println(area);
    }
}
