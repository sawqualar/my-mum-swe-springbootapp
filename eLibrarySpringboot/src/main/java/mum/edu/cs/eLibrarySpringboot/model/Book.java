package mum.edu.cs.eLibrarySpringboot.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="bookid")
    private int bookId;

    private String title;
    private float fee;

    @Column(name="datepublished")
    private LocalDate datePublished;

    public Book() {
    }

    public Book(String title, float fee, LocalDate datePublished) {
        this.title = title;
        this.fee = fee;
        this.datePublished = datePublished;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(LocalDate datePublished) {
        this.datePublished = datePublished;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + ", fee=" + fee + ", datePublished=" + datePublished
                + "]";
    }

}

