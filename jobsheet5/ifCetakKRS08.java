import java.util.Scanner;

public class ifCetakKRS08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        // Versi IF-ELSE
        if (nilai >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        // Versi Ternary Operator
        String hasil = (nilai >= 60) ? "Lulus" : "Tidak Lulus";
        System.out.println("Hasil dengan ternary: " + hasil);
    }
}
