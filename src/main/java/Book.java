
public class Book {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    String author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }
}
