import java.util.Scanner;

class RectangleArea extends Rectangle {


    // Ask the user to input width and height
    public void read_input() {

        Double inputWidth;
        Double inputHeight;
        
        Scanner input = new Scanner(System.in);

        // Ask the user for the width

        System.out.print("Input the Width of the Rectangle: ");

        // I will use hasNextDouble to check if the user input is an integer
        if (input.hasNextDouble()) {

            // Assing the user input to the width of the rectangle
            inputWidth = input.nextDouble();

            // If the width is greater to 1 OK, if not throw exception
            if (inputWidth >= 1.0d) {

                // Use setter to define thw width of the shape
                super.setWidth(inputWidth);

            } else {
                throw new RuntimeException("The width has to be greater or equal to 1");
            }

        // If the user input is not a double resurn exception
        } else {
            throw new RuntimeException("Invalid input, please enter a number");
        }

        System.out.print("Input the Height of the Rectangle: ");

        // I will use hasNextDouble to check if the user input is an integer
        if (input.hasNextDouble()) {

            // Assing the user input to the height of the rectangle
            inputHeight = input.nextDouble();

            // If the height is lesser to 1000 OK, if not throw exception
            if (inputHeight <= 1000.0d) {

                // Use setter to define thwe height of the shape
                super.setHeight(inputHeight);

            } else {
                throw new RuntimeException("The height has to be lesser or equal to 1000");
            }


        // If the user input is not a double resurn exception
        } else {
            throw new RuntimeException("Invalid input, please enter a number");
        }

    }

    // Calculate the rectangle area
    // Display width and height separated by a comma
    @Override
    public void display() {
        
        System.out.println("" + super.getWidth() + " " + super.getHeight());

        // Print the area (wedth * height)
        Double area = super.getWidth() + super.getHeight();
        System.out.println(area);

    }

}