package SoalNo1;

// Class Programmer sebagai subclass dari Employee
class Programmer extends Employee {
    private String bahasaPemrograman;

    // Constructor untuk Programmer
    public Programmer(String nama, String posisi, int gaji, String bahasaPemrograman) {
        super(nama, posisi, gaji);
        this.bahasaPemrograman = bahasaPemrograman;
    }

    // Getter untuk bahasa pemrograman
    public String getBahasaPemrograman() {
        return bahasaPemrograman;
    }

    // Setter untuk bahasa pemrograman
    public void setBahasaPemrograman(String bahasaPemrograman) {
        this.bahasaPemrograman = bahasaPemrograman;
    }

    // Method overloading untuk menampilkan informasi employee
    public void displayInfo(boolean isDetailed) {
        if (isDetailed) {
            super.displayInfo();
            System.out.println("Bahasa Pemrograman: " + bahasaPemrograman);
        } else {
            System.out.println("Nama: " + nama);
            System.out.println("Posisi: " + posisi);
        }
    }
}