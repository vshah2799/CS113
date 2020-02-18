public class Book {
    int pages;
    String title;

    public Book(int pages, String title){
        this.pages = pages;
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString(){
        return "The book title is " + title + ".\nAnd the page number is " + pages;
    }

    public boolean equalsTitlePages(Book b1, Book b2){
        return b1.getPages() == b2.getPages() && b1.getTitle().equals(b2.getTitle());
    }

    public int compareTo(Book b1, Book b2){
        if(b1.getPages()==b2.getPages()){
            return 0;
        }
        else if(b1.getPages()>b2.getPages()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
