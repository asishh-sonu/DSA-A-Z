import java.util.Date;

abstract class LibraryItem {
    private String title;
    private String author;
    private String publicationDate;
    private boolean checkedOut;
    private Date returnDate;

    public LibraryItem(String title, String author, String publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.checkedOut = false;
        this.returnDate = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void checkOut() {
        if (!isCheckedOut()) {
            checkedOut = true;
            returnDate = new Date(System.currentTimeMillis() + 7 * 24 * 60 * 60 * 1000); // 7 days from now
            System.out.println("Item checked out. Return by: " + returnDate);
        } else {
            System.out.println("Item is already checked out.");
        }
    }

    public void returnItem() {
        if (isCheckedOut()) {
            checkedOut = false;
            returnDate = null;
            System.out.println("Item returned successfully.");
        } else {
            System.out.println("Item is not checked out.");
        }
    }

    public abstract String getType();
}

class Book extends LibraryItem {
    private int pageCount;

    public Book(String title, String author, String publicationDate, int pageCount) {
        super(title, author, publicationDate);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String getType() {
        return "Book";
    }
}

class DVD extends LibraryItem {
    private int duration;

    public DVD(String title, String author, String publicationDate, int duration) {
        super(title, author, publicationDate);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String getType() {
        return "DVD";
    }
}

class Journal extends LibraryItem {
    private String ISSN;

    public Journal(String title, String author, String publicationDate, String ISSN) {
        super(title, author, publicationDate);
        this.ISSN = ISSN;
    }

    public String getISSN() {
        return ISSN;
    }

    @Override
    public String getType() {
        return "Journal";
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", "2022-01-01", 500);
        DVD dvd = new DVD("The Matrix", "The Wachowskis", "1999-03-31", 120);
        Journal journal = new Journal("Science Today", "Various", "2022-02-15", "1234-5678");

        book.checkOut();
        dvd.checkOut();
        journal.checkOut();

        book.returnItem();
        dvd.returnItem();
        journal.returnItem();
    }
}
