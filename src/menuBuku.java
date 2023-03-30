import java.util.Scanner;

public class menuBuku {

    public static Scanner scanner = new Scanner(System.in);
    public static menuUtama menuUtama = new menuUtama();


    public void menuUtamaBuku() {

        System.out.println("\nMenu Buku");
        System.out.println("1. Tambah buku");
        System.out.println("2. Delete buku");
        System.out.println("3. Display buku");
        System.out.print("Sila pilih pilihan anda: ");
        System.out.println();

        int pilihan = scanner.nextInt();

        switch(pilihan) {
        
            case 1:
                tambahBuku();
                break;
            case 2:
                deleteBuku();
                break;
            case 3:
                displayBuku();
                break;
            default:
                System.out.println("Pilihan tidak sah sila cuba lagi");
                menuUtamaBuku();
                break;
        }
    }

    public void tambahBuku() {
        System.out.print("Sila masukkan ID buku: ");
        int bookId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Sila masukkan tajuk buku: ");
        String title = scanner.nextLine();

        System.out.print("Sila masukkan pengarang: ");
        String author = scanner.nextLine();

        System.out.print("Sila masukkan tahun diterbitkan: ");
        String tahunPublished = scanner.nextLine();

        System.out.print("Sila masukkan ISBN: ");
        int isbn = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Sila masukkan tingkat: ");
        int tingkat = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Sila masukkan rak: ");
        int rak = scanner.nextInt();
        scanner.nextLine();

        boolean availability;
        System.out.println("Availability"); 
        System.out.print("Status (y/n): ");  
        String availabilityStatus = scanner.nextLine();
        if (availabilityStatus.equalsIgnoreCase("y")) {
            availability = true;  
        } else if (availabilityStatus.equalsIgnoreCase("n")) {
            availability = false; 
        } else {
            System.out.println("Invalid input. Please enter either 'y' or 'n'.");
            availability = false;
        }
        

        System.out.print("Nama peminjam (by default: NULL): ");
        String borrowerName = scanner.nextLine().trim();
        if (borrowerName.isEmpty()) {
            borrowerName = "NULL";
        }

        System.out.print("Tarikh pinjam (by default: 00-00-0000): ");
        String borrowingDate = scanner.nextLine().trim();
        if (borrowingDate.isEmpty()) {
            borrowingDate = "00-00-0000";
        }

        System.out.print("Tarikh pulang (by default: 00-00-0000): ");
        String returnDate = scanner.nextLine().trim();
        if (returnDate.isEmpty()) {
            returnDate = "00-00-0000";
        }

        Books newBook = new Books(bookId, title, author, tahunPublished, isbn, tingkat, rak, availability, borrowerName, borrowingDate, returnDate);

        Books.booksList.add(newBook);

        menuUtama.newMain();

    }

    public void deleteBuku() {
        
        System.out.println("\nDelete Buku");

        System.out.print("No Id buku untuk di padam : ");
        int bookIdDelete = scanner.nextInt();

        for (int i = 0; i < Books.booksList.size(); i++) {
            if (Books.booksList.get(i).getbookId() == bookIdDelete) {
                Books.booksList.remove(i);
                break;
            }
        }
        menuUtama.newMain();
    }

    public void displayBuku() {
        
        System.out.println("\nDisplay Buku");

        for (int i = 0; i < Books.booksList.size(); i++) {
            Books book = Books.booksList.get(i);
            System.out.println("No ID : " + book.getbookId());
            System.out.println("Title : " + book.gettitle());
            System.out.println("Author : " + book.getauthor());
            System.out.println("Tahun Published : " + book.gettahunPublished());
            System.out.println("No. ISBN : " + book.getisbn());
            System.out.println();
            }
            menuUtama.newMain();
        }
    }