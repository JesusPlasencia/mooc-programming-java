import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Title: ");
            String bookTitle = scanner.nextLine();
            if (bookTitle.isEmpty()) break;
            
            System.out.println("Pages: ");
            int bookPages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int bookPublicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(bookTitle, bookPages, bookPublicationYear));
        }
        
        System.out.println("What information will be printed? ");
        String option = scanner.nextLine();
        for (Book book : books) {
            if (option.equals("everything")) {
                System.out.println(book.toString());
            } else if (option.equals("name")) {
                System.out.println(book.getTitle());
            } else {
                return;
            }
        }
    }
}
