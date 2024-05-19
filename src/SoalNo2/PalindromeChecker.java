package SoalNo2;

public class PalindromeChecker {
    // Metode untuk memeriksa apakah sebuah string merupakan palindrom atau tidak
    public static boolean isPalindrome(String str) {
        // Mengubah string menjadi lowercase dan menghapus semua spasi
        str = str.toLowerCase().replaceAll("\\s+", "");
        int length = str.length();
        // Melakukan iterasi untuk setengah panjang string
        for (int i = 0; i < length / 2; i++) {
            // Memeriksa apakah karakter di posisi i sama dengan karakter di posisi length - i - 1
            // Jika tidak sama, mengembalikan false
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        // Jika semua karakter cocok, mengembalikan true
        return true;
    }
}

