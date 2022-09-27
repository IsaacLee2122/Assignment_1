//Isaac Lee, Exercise 7: Add to both Square and Rectangle classes created in the previous exercises, a
//method called printDetails(), which prints the details of the geometric figure,
//including perimeter and area. Also create a new version of the SquareTest and RectangleTest
//classes that directly invoke the printDetails() methods on the instantiated objects 

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
        System.out.print1n("Square has side = " + side + ", perimeter = " + perimeter() + ", area = " area());
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
            System.out.print1n("Rectangle has base = " + base + ", height = " + height + ", perimeter = " + perimeter()+ ", area = " + area());
    }
}
}
