package service.serviceImlp;

import model.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookService implements service.BookService {
    private List<Book> books=new ArrayList<>();


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    @Override
    public List<Book> createBooks(List<Book> books) {
       this.books = books;

        return null;
    }


    @Override
    public List<Book> getAllBooks() {
        return null;
    }

    @Override
    public List<Book> getBooksByGenre(String genre) {
            for (Book book : books) {
                if (book.getGenre().name().equals(genre)){
                    books.add(book);
                }
            }
            return books;

        }


    @Override
    public Book removeBookById(Long id) {

        return null;
    }

    @Override
    public List<Book> sortBooksByPriceInDescendingOrder() {
        @Override
        public List<Book> getBookByInitialLetter() {
            List<Book> list = new ArrayList<>();
            String latter = new Scanner(System.in).nextLine();
            for (Book book : books) {
                if (book.getName().contains(latter)){
                    list.add(book);
                }
            }
            return list;
        }
        return null;
    }

    @Override
    public List<Book> filterBooksByPublishedYear() {
      books.stream().filter(x->Character
        return null;
    }

    @Override
    public List<Book> getBookByInitialLetter() {
        return null;
    }

    @Override
    public Book maxPriceBook() {
        System.out.println(books.stream().max(Comparator.comparing(Book::getPrice)));
        return null;
    }
}
