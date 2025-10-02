import java.util.Scanner;

public class SistemKampus08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = input.nextLine();

        System.out.print("Apakah status mahasiswa aktif? (ya/tidak): ");
        String status = input.nextLine();

        if (status.equalsIgnoreCase("ya")) {
            System.out.println("Mahasiswa dengan NIM " + nim + " berstatus AKTIF");
            System.out.println("Akses perpustakaan: DIZINKAN");
            System.out.println("Akses WiFi kampus: DIZINKAN");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " berstatus NONAKTIF");
            System.out.println("Akses perpustakaan: DITOLAK");
            System.out.println("Akses WiFi kampus: DITOLAK");
        }
    }
}
