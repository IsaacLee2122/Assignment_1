//Isaac Lee, Exercise 1 Create a Square class, which declares a side instance variable of type int. Then create a public method called perimeter() that returns the perimeter of the square, and a public area() method that returns the area of the square.//


public class Square {
  public int side;
  public int perimeter() {
      int perimeter = side * 4;
      return perimeter;
  }
  public int area () {
      int area = side * side;
      return area;
    }
}
