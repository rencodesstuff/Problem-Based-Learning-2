import java.util.Scanner;

public class menuUtama {
 
    private static menuBuku menuBuku = new menuBuku();
    menuFaulty menuFaulty = new menuFaulty();
    menuPinjam menuPinjam = new menuPinjam();
    menuPulang menuPulang = new menuPulang();
    menuSearch menuSearch = new menuSearch(); 
    
    public void newMain() {

        Scanner pilih = new Scanner(System.in);  

        System.out.println("\nMenu Utama");
        System.out.println("1. Buku");
        System.out.println("2. Carian");
        System.out.println("3. Pinjam");
        System.out.println("4. Pulang buku");
        System.out.println("5. Display laporan faulty");
        System.out.print("Selection : ");

        int choice = pilih.nextInt();

        switch(choice) {
            case 1:
                menuBuku.menuUtamaBuku();
                break;
            case 2:
                menuSearch.cariBuku();
                break;
            case 3:
                menuPinjam.pinjamBuku();
                break;
            case 4:
                menuPulang.pulangBuku();
                break;
            case 5:
                menuFaulty.bukuFaulty();
                break;
            default:
                System.out.println("Pilihan tidak sah sila cuba lagi");
                newMain();
                break;
        }

        pilih.close();
    }
    
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  

        System.out.print("Selamat datang ke Sistem Library XYZ");
        menuUtama menuUtama = new menuUtama();
        menuUtama.newMain();
        scanner.close();
    }

}
