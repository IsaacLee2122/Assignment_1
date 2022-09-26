//Isaac Lee, Exercise 4: In the Square class created in the Exercise 2.d, replace the value 4 used to calculate the perimeter, with an instance constant named SIDES_NUMBER//

public class Square {
    public int final Sides_Number = 4;
    public int side;
  
    public Square(int 1) {
        side = 1;
    }
  
    public int perimeter() {
        int perimeter = side * Sides_Number;
        return perimeter;
    }
  
    public int area() {
        int area = side * side;
        return area;
      
    }
}
