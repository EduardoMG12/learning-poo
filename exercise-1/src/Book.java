public class Book implements IBook {
    private String title;
    private String author;
    private int totalPage;
    private int currentPage;
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
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
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

    public int getCurrentPage(){
        return currentPage;
    }
    public boolean getOpen() {
        return open;
    }

    public Person getReader() {
        return reader;
    }
    public String details() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", totalPage=" + totalPage +
                ", currentPage=" + currentPage +
                ", open=" + open +
                ", reader=" + reader +
                '}';
    }

    @Override
    public void opening() {
        if(this.open == false){
            this.open = true;
            System.out.println("[open book]");
        }
    }

    @Override
    public void closing() {
        if(getOpen()){
            this.open = false;
            System.out.println("[close book]");
        }
    }

    @Override
    public void leafThrough(int p) {
            this.currentPage = p;
            System.out.println(this.currentPage);
    }

    @Override
    public void nextPage() {
            this.currentPage++;
            System.out.println(this.currentPage);
    }

    @Override
    public void backPage() {
            this.currentPage--;
            System.out.println(this.currentPage);
    }

    public Book(String title, String author, int totalPage, Person reader) {
        this.title = title;
        this.author = author;
        this.totalPage = totalPage;
        this.currentPage = 0;
        this.open = false;
        this.reader = reader;
    }
}
