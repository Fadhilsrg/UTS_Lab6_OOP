package SoalNo2;

// Scanner untuk membaca inputan user
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan sebuah string
        System.out.print("Masukkan string: ");
        String input = scanner.nextLine();

        // Memeriksa apakah string tersebut merupakan palindrom atau tidak, section ini juga sekaligus mengambil output sebagai boolean
        if (PalindromeChecker.isPalindrome(input)) {
            System.out.println("String \"" + input + "\" adalah palindrom.");
        } else {
            System.out.println("String \"" + input + "\" bukan palindrom.");
        }

        // Menutup objek scanner
        scanner.close();
    }
}
