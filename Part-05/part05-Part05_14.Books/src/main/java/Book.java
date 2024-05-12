
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object obj) {
        // Value of both pointers are the same
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) obj;

        if (this.name.equals(comparedBook.getName()) && this.publicationYear == comparedBook.getPublicationYear()) {
            return true;
        }
        return false; 
    }

}
