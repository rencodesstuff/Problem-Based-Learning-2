import java.util.Scanner;

public class menuFaulty {

    private static menuUtama menuUtama = new menuUtama();
    private static Scanner scun = new Scanner(System.in);

    
    public void bukuFaulty() {
        
        System.out.println("\nDisplay laporan faulty");
        System.out.println("Buku yang masih belum dipulangkan");
        
        for (Books book : Books.booksList) {
            if (!book.isavailability()) {
                System.out.println("Title: " + book.gettitle());
                System.out.println("Borrower Name: " + book.getborrowerName());
                System.out.println("Return Date: " + book.getreturnDate());
            }
        }

        System.out.println("\nTekan 1 untuk display buku faulty lagi");
        System.out.println("Tekan 2 untuk kembali ke menu utama");
        int choice = scun.nextInt();
        scun.nextLine();

        if (choice == 1) {
            bukuFaulty();
        } else if (choice == 2) {
            menuUtama.newMain();
        } else {
            System.out.println("Pilihan tidak sah. Kembali ke menu utama.");
            menuUtama.newMain();
        }
    }
}
