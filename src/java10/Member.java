package java10;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Member {
    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<Book>();

    Member(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    public String getName() {
        return this.name;
    }

    public String getBirthDay() {
        return this.birthDay.toString();
    }

    public int age() {
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }

    public void borrow(Book book) {
        this.books.add(book);
    }

    public String borrowedBooks() {
        return this.books.toString();
    }

}
