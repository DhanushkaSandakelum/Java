import item.Book;
import item.Magazine;
import library.Library;
import library.LibraryMember;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("harry Potter", 2000, "J.K. Rowling");
        Magazine magazine = new Magazine("National Geographic", 2023, "National Geographic Society");

        library.addItem(book);
        library.addItem(magazine);

        LibraryMember libraryMember1 = new LibraryMember("Dhanushka", 1);
        LibraryMember libraryMember2 = new LibraryMember("Deneth", 2);

        library.addMember(libraryMember1);
        library.addMember(libraryMember2);

        System.out.println("\n--- Catalog ---");
        library.displayCatalog();

        System.out.println("\n--- Library Members ---");
        library.displayMembers();
    }
}