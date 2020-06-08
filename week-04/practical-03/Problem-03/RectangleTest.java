class RectangleTest {
    public static void main(String[] args) {
        
        // Create a rectangle class object
        Rectangle rectangleTest = new Rectangle(3.0d, 5.2d, 0.0d, 0.0d);

        // Test the display method
        rectangleTest.display();

        // Create a rectangle area class object using the basic constructor
        RectangleArea rectangleArea = new RectangleArea();

        // Test the input method
        rectangleArea.read_input();

        // Test the area
        rectangleArea.display();

    }
}