public class Book {
    private String title;
    private String author;
    private int totalPage;
    private boolean open;
    private Person reader;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public boolean isOpen() {
        return open;
    }

    public Person getReader() {
        return reader;
    }
    public void details(){

    }
}
