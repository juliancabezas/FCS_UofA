class Shape {
    // Attributes of the class, I will set them to private to protect them from modifications
    private Double width;
    private Double height;
    private Double radius;
    private Double length;

    // CONSTRUCTORS

    // Basic constructor
    Shape() {
        System.out.println("Using basic constructor");
        this.width = 0d;
        this.height = 0d;
        this.radius = 0d;
        this.length = 0d;
    }

    // Parametrized constructor
    Shape(Double width, Double height, Double radius, Double length) {
        System.out.println("Using parametrized constructor");
        this.width = width;
        this.height = height;
        this.radius = radius;
        this.length = length;
    }

    // ACCESORS AND MUTATORS

    // Accessors or getters
    public Double getWidth() {
        return this.width;
    }

    public Double getHeight() {
        return this.height;
    }

    public Double getRadius() {
        return this.radius;
    }

    public Double getLength() {
        return this.length;
    }

    // Mutators or setters
    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}