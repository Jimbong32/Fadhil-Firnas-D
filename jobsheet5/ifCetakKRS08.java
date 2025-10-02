import java.util.Scanner;

public class ifCetakKRS08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverivikasi.");
        } else {
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA.");
        }

        sc.close();
    }
}
