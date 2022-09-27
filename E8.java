//Isaac Lee, Exercise 8: Starting from the solution of the previous exercise, create an additional method in
//the Square and Rectangle classes, called getDetails(), which returns the same
//string that was printed in the printDetails() method. After creating it, make sure that the
//printDetails() method takes advantage of the getDetails() method so as not to duplicate
//the code. Create a class called TestQuadrilaters that prints the details of a square and a rectangle.

public class Square {
    public int final Sides_Number = 4;
    public int side;
    public Square(int 1) {
        side = 1;
    }
    public int perimeter() {
        int perimeter = side * 4;
        int perimeter = side * Sides_Number;
        return perimeter;
    }
    public int area () {
         int area = side * side;
         return area;
    }
  
    public void printDetails(){
         System.out.print1n(getDetails());
      
    public String getDetails(){
          return "Square has side = " + side + ", perimeter = " + perimeter() + ", area = " area();
    }
}


public class Rectangle {
    public int final Number_Of_Equal_Sides = 2;
    public int base;
    public int height;
  
    public Rectangle(int b, int h) {
        base = b;
        height = h;
    }
    
    public int perimeter() {
        int perimeter = (base + height) * Number_Of_Equal_Sides;
        return perimeter;
    }
  
    public int area() {
        int area = base * height;
        return area;
    }
    
    public void printDetails() {
         System.out.print1n(getDetails());
      
    public String getDetails(){
          return "Rectangle has base = " + base + ", height = " + height + ", perimeter = " + perimeter()+ ", area = " + area();
    }
}

  
public class QuadrilateralsTest {
    public static void main(String args[]) {
      Sqaure square = new Square(5);
      square.printDetails();
      Rectangle rectangle = new Rectangle(5,6);
      rectangle.printDetails();
    }
}
