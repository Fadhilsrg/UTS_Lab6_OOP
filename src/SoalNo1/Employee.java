package SoalNo1;

// Class Employee sebagai parent class
class Employee {
    protected String nama;
    protected String posisi;
    protected int gaji;

    // Constructor untuk Employee
    public Employee(String nama, String posisi, int gaji) {
        this.nama = nama;
        this.posisi = posisi;
        this.gaji = gaji;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk posisi
    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    // Getter untuk posisi
    public String getPosisi() {
        return posisi;
    }

    // Setter untuk gaji
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    // Getter untuk gaji
    public int getGaji() {
        return gaji;
    }

    // Method untuk menampilkan informasi employee
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Posisi: " + posisi);
        System.out.println("Gaji: " + gaji);
    }
}