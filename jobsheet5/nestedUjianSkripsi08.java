import java.util.Scanner;

public class nestedUjianSkripsi08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan = "";

        System.out.print("Apakah bebas kompen? (Yes/No): ");
        String bebasKompen = sc.next().trim();

        System.out.print("Jumlah bimbingan dengan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();

        System.out.print("Jumlah bimbingan dengan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Yes")) {
            if (bimbinganP1 >= 8) {
                if (bimbinganP2 >= 4) {
                    pesan = "Anda memenuhi syarat untuk mendaftar ujian skripsi.";
                } else {
                    pesan = "Gagal: Bimbingan dengan Pembimbing 2 kurang dari 4 kali.";
                }
            } else {
                pesan = "Gagal: Bimbingan dengan Pembimbing 1 kurang dari 8 kali.";
            }
        } else {
            pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali.";
        }

        System.out.println(pesan);
        sc.close();
    }
}
