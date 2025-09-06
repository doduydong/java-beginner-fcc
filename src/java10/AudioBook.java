package java10;

public class AudioBook extends Book {
    private int runtime;

    AudioBook(String title, String author, int runtime) {
        super(title, author, 0);
        this.runtime = runtime;
    }

}
