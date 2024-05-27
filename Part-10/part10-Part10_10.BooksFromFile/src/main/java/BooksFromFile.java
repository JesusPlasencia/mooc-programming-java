
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Book> listOfBooksFromFile = readBooks("data.txt");
        listOfBooksFromFile.stream().forEach(BooksFromFile::printBook);
    }

    public static List<Book> readBooks(String file) {
        List<Book> list = new ArrayList<Book>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(array -> array.length >= 4)
                    .map(BooksFromFile::createBookFromArray)
                    .forEach(book -> list.add(book));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    private static Book createBookFromArray (String[] array) {
        return new Book(
                array[0],
                Integer.valueOf(array[1]),
                Integer.valueOf(array[2]),
                array[3]
        );
    }
    
    private static void printBook (Book b) {
        System.out.println(b.getName() + "," + b.getPublishingYear() + "," + b.getPagecount()+ "," + b.getAuthor());
    }
}
