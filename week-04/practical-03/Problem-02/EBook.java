class EBook extends Book {

    // Attributes of the subclass, I will set them to private to protect them from modifications
    private String url;

    // Basic constructor
    public EBook() {
        super();
        this.url = "Undefined";
    }

    // Parametrized constructor
    public EBook(String title, int year, String publish,  int pages, String url) {
        super(title, year, publish, pages);
        this.url = url;
    }

    // Accesors
    public String getUrl() {
        return this.url;
    }

    // Mutators

    public void setUrl(String url) {
        this.url = url;
    }

}