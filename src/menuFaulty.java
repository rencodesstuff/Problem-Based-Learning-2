public class menuFaulty {
    
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
    }
}
