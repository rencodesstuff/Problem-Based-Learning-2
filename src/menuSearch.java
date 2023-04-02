import java.util.Scanner;

public class menuSearch {

    private static menuUtama menuUtama = new menuUtama();

    public void cariBuku() {
        Scanner cari = new Scanner(System.in);

        System.out.println("Menu carian\n");
        System.out.print("Sila masukkan title untuk di cari :\n\n");

        String search = cari.nextLine();
        int index = -1;
        for (int i = 0; i < Books.booksList.size(); i++) {
            if (Books.booksList.get(i).gettitle().equalsIgnoreCase(search)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Buku tidak dijumpai.");
        } else {
            Books book = Books.booksList.get(index);
            System.out.println("\nBuku dijumpai:");
            System.out.println("No ID: " + book.getbookId());
            System.out.println("Title: " + book.gettitle());
            System.out.println("Author: " + book.getauthor());
            System.out.println("Tahun Published: " + book.gettahunPublished());
            System.out.println("No. ISBN: " + book.getisbn());
            System.out.println("Availability:");
            System.out.println("Status (y/n): " + (book.isavailability() ? "y" : "n"));

            if (book.isavailability()) {
                System.out.println("\nLokasi");
                System.out.println("Tingkat: " + book.gettingkat());
                System.out.println("Rak: " + book.getrak());
            } else {
                System.out.print("\nTarikh pulang : (by default : 00-00-0000) " + book.getreturnDate());
            }
        }

        System.out.println("\nTekan 1 untuk mencari buku lagi");
        System.out.println("Tekan 2 untuk kembali ke menu utama");
        int choice = cari.nextInt();
        cari.nextLine();

        if (choice == 1) {
            cariBuku();
        } else if (choice == 2) {
            menuUtama.newMain();
        } else {
            System.out.println("Pilihan tidak sah. Kembali ke menu utama.");
            menuUtama.newMain();
        }
        cari.close();
    }
}
