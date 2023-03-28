import java.util.Scanner;

public class menuPinjam {

    public static menuUtama menuUtama = new menuUtama();

    public void pinjamBuku() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPinjam Buku");
        System.out.print("No ID Buku: ");
        int bookId = scanner.nextInt();

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

        scanner.close();

        menuUtama.newMain();
    }
}
