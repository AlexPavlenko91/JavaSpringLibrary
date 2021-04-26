package library.annotations;

import library.entities.Author;
import library.entities.Book;
import library.entities.Library;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class JavaConfigAnnotations {


    @Bean(name = "author1")
    public Author author1(Book book1) {
        Author author = new Author();
        author.setFirstName("Bert");
        author.setLastName("Bates");
        author.setBooks(List.of(book1));
        return author;
    }

    @Bean(name = "book1")
    public Book book1() {
        Book book = new Book();
        book.setName("Head First Java");
        return book;
    }

    @Bean(name = "library1")
    public Library library(Book book1, Author author1) {
        Library library = new Library();
        library.setName("IT Library");
        library.setCity("Zhytomyr");
        library.setAuthors(List.of(author1));
        library.setBooks(List.of(book1));
        return library;
    }
}
