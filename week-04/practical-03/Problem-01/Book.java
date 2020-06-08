class Book {
    // Attributes of the class, I will set them to private to protect them from modifications
    private String title;
    private int year;
    private String publish;
    private int pages;

    // CONSTRUCTORS

    // Basic constructor
    Book() {
        System.out.println("Using basic constuctor");
        this.title = "Undefined book title";
        this.publish = "Undefined publisher";
        this.year = 1900;
        this.pages = 300;
    }

    // Parametrized constructor
    Book(String title, int year, String publish,  int pages) {
        System.out.println("Using parametrized constuctor");
        this.title = title;
        this.publish = publish;
        this.year = year;
        this.pages = pages;
    }

    // METHODS

    // Display information about the class
    public void display() {
        System.out.println("---------------------");
        System.out.println("Book title: " + this.title);
        System.out.println("Year: " + this.year);
        System.out.println("Publisher: " + this.publish);
        System.out.println("Pages: " + this.pages);
        System.out.println("---------------------");
    }


    // ACCESORS AND MUTATORS

    // Accessors or getters
    public String getTitle() {
        return this.title;
    }

    public String getPublish() {
        return this.publish;
    }

    public int getYear() {
        return this.year;
    }

    public int getPages() {
        return this.pages;
    }


    // Mutators or setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}