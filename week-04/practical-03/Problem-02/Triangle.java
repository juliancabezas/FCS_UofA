class Triangle extends Shape {


    // Basic
    public Triangle() {
        super();
    }

    //Parametrized constructor
    public Triangle(Double width, Double height, Double radius, Double length) {
        super(width, height, radius,length);

    }

    // Methods

    // Calculate the area of the triangle
    public Double area() {

        // Get the base (width) and the height values
        Double base = super.getWidth();
        Double height = super.getHeight();

        // Calculate The area of the triangle
        Double triangleArea = (base*height) / 2.0d;

        return triangleArea;
    }




}