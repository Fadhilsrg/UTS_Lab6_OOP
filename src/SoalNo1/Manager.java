package SoalNo1;

// Class Manager sebagai subclass dari Employee
class Manager extends Employee {
    private int tunjangan;

    // Constructor untuk Manager
    public Manager(String nama, String posisi, int gaji, int tunjangan) {
        super(nama, posisi, gaji);
        this.tunjangan = tunjangan;
    }

    // Getter untuk tunjangan
    public int getTunjangan() {
        return tunjangan;
    }

    // Setter untuk tunjangan
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    // Method overriding untuk menampilkan informasi employee
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}