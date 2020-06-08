class PhysicalBook extends Book {

    // Attributes of the subclass, I will set them to private to protect them from modifications
    private int shelf;
    private int aisle;
    private int floor;

    // Basic constructor
    public PhysicalBook() {
        super();
        this.shelf= 0;
        this.aisle= 0;
        this.floor = 0;
    }

    // Parametrized constructor
    public PhysicalBook(String title, int year, String publish,  int pages, int shelf, int aisle, int floor) {
        super(title, year, publish, pages);
        this.shelf= shelf;
        this.aisle= aisle;
        this.floor = floor;
    }

    public void displayBookLocation() {
        System.out.println("Floor where the book is: " + this.shelf);
        System.out.println("Aisle where the book is: " + this.aisle);
        System.out.println("Shelf where the book is: " + this.floor);
    }

    // Accesors
    public int getShelf() {
        return this.shelf;
    }

    public int getAisle() {
        return this.aisle;
    }

    public int getFloor() {
        return this.floor;
    }

    // Mutators

    public void setShelf(int shelf) {
        this.shelf = shelf;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }



}