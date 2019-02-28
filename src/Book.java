import java.util.Optional;

public class Book {
    private final String name;
    private final Optional<String> author;

    public Book(String name, Optional<String> author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public boolean hasAuthor(String name) {
        return author
                .filter(s -> s.contains(name))
                .isPresent();
    }

    @Override
    public String toString() {
        return "\nlivro: " + name
             + "\nautor: " + author;
    }
}
