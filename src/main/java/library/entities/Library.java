package library.entities;

import java.util.List;

public class Library {
    private String name;
    private String city;
    private List<Author> authors;
    private List<Book> books;

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", authors=" + authors +
                ", books=" + books +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
