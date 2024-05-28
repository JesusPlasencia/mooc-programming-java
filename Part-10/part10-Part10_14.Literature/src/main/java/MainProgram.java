
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList<Book>();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String entry = scanner.nextLine();
            if (entry.equals("")) break;
            
            System.out.println("Input the age recommendation: ");
            int recommendedAge = Integer.valueOf(scanner.nextLine());
            books.add(new Book(entry, recommendedAge));
            System.out.println();
        }
        
        Comparator<Book> comparator = Comparator.comparing(Book::getRecommendedAge)
                                                .thenComparing(Book::getName);
        Collections.sort(books, comparator);
        
        int sizeList = books.size();
        String renderWord = sizeList == 1 ? "book" : "books";
        System.out.println(sizeList + " " + renderWord + " in total.");
        System.out.println();
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

}
