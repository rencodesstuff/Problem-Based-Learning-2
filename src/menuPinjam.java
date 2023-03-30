import java.util.Scanner;

public class menuPinjam {

    private static menuUtama menuUtama = new menuUtama();

    public void pinjamBuku() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPinjam Buku");
        System.out.print("No ID Buku: ");
        int bookId;
        bookId = scanner.nextInt();
        scanner.nextLine();

        int index = -1;
        for (int i = 0; i < Books.booksList.size(); i++) {
            if (Books.booksList.get(i).getbookId() == bookId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Buku dengan ID tersebut tidak ditemukan.");
            return;
        }

        if (!Books.booksList.get(index).isavailability()) {
            System.out.println("Buku tidak tersedia untuk dipinjam.");
            return;
        }

        System.out.print("Nama Peminjam : ");
        String borrowerName = scanner.nextLine();

        System.out.print("Tarikh Pinjam : ");
        String borrowingDate = scanner.nextLine();

        System.out.print("Tarikh Pulang : ");
        String returnDate = scanner.nextLine();

        Books.booksList.get(index).setAvailability(false);
        Books.booksList.get(index).setBorrowerName(borrowerName);
        Books.booksList.get(index).setBorrowingDate(borrowingDate);
        Books.booksList.get(index).setReturnDate(returnDate);

        System.out.println("Buku berhasil dipinjam oleh " + borrowerName + ".");

        System.out.println("\nTekan 1 untuk meminjam buku lagi");
        System.out.println("Tekan 2 untuk kembali ke menu utama");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            pinjamBuku();
        } else if (choice == 2) {
            menuUtama.newMain();
        } else {
            System.out.println("Pilihan tidak sah. Kembali ke menu utama.");
            menuUtama.newMain();
        }

        scanner.close();
    }

}
