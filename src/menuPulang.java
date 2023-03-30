import java.util.Scanner;

public class menuPulang {

    public void pulangBuku() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pulang buku :");

        System.out.print("No ID Buku : ");
        int bookId = scan.nextInt();

        Books bookToReturn = null;
        for (Books book : Books.booksList) {
            if (book.getbookId() == bookId) {
                bookToReturn = book;
                break;
            }
        }

        if (bookToReturn == null) {
            System.out.println("Book with ID " + bookId + " not found.");
        } else if (bookToReturn.isavailability()) {
            System.out.println("This book has not been borrowed.");
        } else {
            bookToReturn.setAvailability(true);
            bookToReturn.setBorrowerName("NULL");
            bookToReturn.setBorrowingDate("00-00-0000");
            bookToReturn.setReturnDate("00-00-0000");
            System.out.println("Book with ID " + bookId + " has been returned.");
        }

        scan.close();
    }
}
