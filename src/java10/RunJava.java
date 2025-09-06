package java10;

public class RunJava {

    public static void main(String[] args) {
        Member member = new Member("Dong", "1997-10-13");
        Book book = new Book("One Piece", "Oda Eiichiro", 100);
        AudioBook audioBook = new AudioBook("Sherlock Holmes", "Conan Doyle", 10000);
        EBook eBook = new EBook("The New Japanese Minimalism", "Fumio Sasaki", 167, "PDF");

        member.borrow(book);

        System.out.printf("%s was born back in %s and he is now %d years old.", member.getName(), member.getBirthDay(), member.age());
        System.out.println();

        System.out.printf("%s has borrow these books: %s", member.getName(), member.borrowedBooks());
        System.out.println();

        System.out.println(audioBook.toString());
        System.out.println(eBook.toString());
    }

}
