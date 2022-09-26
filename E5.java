//Isaac Lee, Exercise 5: Create a Rectangle class equivalent to the Square class created in the Exercise 2.d and refined//
//in subsequent exercises. Before coding the class, decide which variables and methods this class must have.//

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
}
