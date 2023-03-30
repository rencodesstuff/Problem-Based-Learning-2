import java.util.ArrayList;

public class Books {

    private int bookId;
    private String title;
    private String author;
    private String tahunPublished;
    private int isbn;
    private int tingkat;
    private int rak;
    private boolean availability;
    private String borrowerName;
    private String borrowingDate;
    private String returnDate;

    public static ArrayList<Books> booksList = new ArrayList<Books>();

    public Books(int bookId, String title, String author, String tahunPublished, int isbn, int tingkat, int rak,
            boolean availability, String borrowerName, String borrowingDate, String returnDate) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.tahunPublished = tahunPublished;
        this.isbn = isbn;
        this.tingkat = tingkat;
        this.rak = rak;
        this.availability = availability;
        this.borrowerName = (borrowerName != null && !borrowerName.trim().isEmpty()) ? borrowerName : "NULL";
        this.borrowingDate = (borrowingDate != null && !borrowingDate.trim().isEmpty()) ? borrowingDate : "00-00-0000";
        this.returnDate = (returnDate != null && !returnDate.trim().isEmpty()) ? returnDate : "00-00-0000";
    }

    public int getbookId() {
        return bookId;
    }

    public String gettitle() {
        return title;
    }

    public String getauthor() {
        return author;
    }

    public String gettahunPublished() {
        return tahunPublished;
    }

    public int getisbn() {
        return isbn;
    }

    public int gettingkat() {
        return tingkat;
    }

    public int getrak() {
        return rak;
    }

    public boolean isavailability() {
        return availability;
    }

    public String getborrowerName() {
        return borrowerName;
    }

    public String getborrowingDate() {
        return borrowingDate;
    }

    public String getreturnDate() {
        return returnDate;
    }


    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }
    
    public void setBorrowingDate(String borrowingDate) {
        this.borrowingDate = borrowingDate;
    }
    
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

}
