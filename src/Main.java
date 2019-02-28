import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {
        List<Book> allBooks = new ArrayList<>();

        allBooks.add(new Book("O milagra da manhã", java.util.Optional.of("Elrod Hal")));
        allBooks.add(new Book("A sutil arte de ligar o foda-se", java.util.Optional.of("Manson")));
        allBooks.add(new Book("Seja foda!", java.util.Optional.of("Carneiro, caio")));

        allBooks.stream()
                .forEach(System.out::println);

        allBooks.stream()
                .filter(book -> book.hasAuthor("Carneiro, caio"))
                .sorted(comparing(Book::getName))
                .forEach(System.out::println);
    }
}
