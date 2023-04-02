import java.util.Scanner;

public class menuPulang {

    private static menuUtama menuUtama = new menuUtama();


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
            System.out.println("Buku dengan ID " + bookId + " tidak dijumpai");
        } else if (bookToReturn.isavailability()) {
            System.out.println("Buku ini masih belum dipinjam");
        } else {
            bookToReturn.setAvailability(true);
            bookToReturn.setBorrowerName("NULL");
            bookToReturn.setBorrowingDate("00-00-0000");
            bookToReturn.setReturnDate("00-00-0000");
            System.out.println("Buku dengan ID " + bookId + " berjaya dipulangkan");
        }

        System.out.println("\nTekan 1 untuk pulangkan buku lagi");
        System.out.println("Tekan 2 untuk kembali ke menu utama");
        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1) {
            pulangBuku();
        } else if (choice == 2) {
            menuUtama.newMain();
        } else {
            System.out.println("Pilihan tidak sah. Kembali ke menu utama.");
            menuUtama.newMain();
        }

        scan.close();
    }
}
