class Rectangle extends Shape {


    // Basic
    public Rectangle() {
        super();
    }

    //Parametrized constructor
    public Rectangle(Double width, Double height, Double radius, Double length) {
        super(width, height, radius,length);

    }

    // Methods

    // Display width and height separated by a comma
    public void display() {
        System.out.println("" + super.getWidth() + " " + super.getHeight());
    }

    // Calculate the rectangle area
    public Double area() {

        // Get both side value
        Double sideA = super.getWidth();
        Double sideB = super.getLength();

        // Calculate the area multiplying both sides
        Double rentangleArea = sideA*sideB;

        return rentangleArea;
    }



}