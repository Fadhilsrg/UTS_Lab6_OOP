package SoalNo1;

// Class Main sebagai entry point program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Manager
        Manager manager = new Manager("Budi", "Manager", 10000000, 5000000);

        // Menampilkan informasi manager
        System.out.println("Informasi Manager:");
        manager.displayInfo();
        System.out.println();

        // Mengubah posisi manager menggunakan setter
        manager.setPosisi("Senior Manager");

        // Menampilkan informasi manager setelah perubahan posisi
        System.out.println("Informasi Manager setelah perubahan posisi:");
        manager.displayInfo();
        System.out.println();

        // Membuat objek Programmer
        Programmer programmer = new Programmer("Joko", "Programmer", 8000000, "Java");

        // Menampilkan informasi programmer
        System.out.println("Informasi Programmer:");
        programmer.displayInfo();
        System.out.println();

        // Mengubah gaji programmer menggunakan setter
        programmer.setGaji(9000000);

        // Menampilkan informasi programmer setelah perubahan gaji
        System.out.println("Informasi Programmer setelah perubahan gaji:");
        programmer.displayInfo();
        System.out.println();

        // Menampilkan informasi programmer dengan detail
        System.out.println("Informasi Programmer dengan detail:");
        programmer.displayInfo(true);
    }
}