class Circle extends Shape {


    // Basic
    public Circle() {
        super();
    }

    //Parametrized constructor
    public Circle(Double width, Double height, Double radius, Double length) {
        super(width, height, radius, length);
    }

    // Methods

    // Calculate area of the circle
    public Double area() {

        Double radius = super.getRadius();
        // Define pi
        Double pi = 3.14159265359d;

        // Calculate the area as pi*r^2
        Double circleArea = pi * (radius*radius);

        return circleArea;
    }




}