public class Book {
    private int id;
    private String title;
    private String author;
    private String genre;
    private int publicationYear;
    private int pageCount;
    private String publisher;
    private String ISBN;

    public Book(int id, String title, String author, String genre, int publicationYear, int pageCount, String publisher,
            String ISBN) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
        this.pageCount = pageCount;
        this.publisher = publisher;
        this.ISBN = ISBN;
        System.out.println("Book instance created, id: " + id);
    }

    public void turnPage(int page) {
        page = page + 1;
    }

    public void setBookmark(int page) {
        int bookmark = 0;

        if (bookmark != 0) {
            bookmark = page;
        }
    }

    public void readChapter(int chapter) {
        System.out.print("The chapter contains xxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

}
