public class MainBank {

    public static void main(String[] args) {
        System.out.println("=== SISTEM REKENING BANK ===");

        // Membuat 2 objek Rekening dengan nama pemilik yang jelas
        RekeningBank rekening1 = new RekeningBank("01", "Syifa", 500000);
        RekeningBank rekening2 = new RekeningBank("02", "Silva", 400000);

        // Menampilkan saldo awal masing-masing pemilik
        System.out.println("\n--- Saldo Awal ---");
        System.out.println("Saldo Syifa: Rp" + rekening1.getSaldo());
        System.out.println("Saldo Silva: Rp" + rekening2.getSaldo());

        // Melakukan transfer dari Syifa ke Silva
        System.out.println("\n--- Proses Transfer ---");
        rekening1.transfer(100000, rekening2);

        // Menampilkan saldo akhir setelah transfer
        System.out.println("\n--- Saldo Akhir Setelah Transfer ---");
        System.out.println("Saldo Syifa: Rp" + rekening1.getSaldo());
        System.out.println("Saldo Silva: Rp" + rekening2.getSaldo());

        // Percobaan transfer melebihi saldo (Uji coba validasi enkapsulasi)
        System.out.println("\n--- Percobaan Transfer Melebihi Saldo ---");
        rekening1.transfer(1000000, rekening2);

        // Mengakses Static Variable total rekening
        System.out.println("\n");
        System.out.println("Total Rekening Terdaftar: " + RekeningBank.totalRekening);
        System.out.println("");
    }
}