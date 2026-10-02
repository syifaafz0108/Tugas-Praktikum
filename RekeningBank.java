public class RekeningBank {
    
    // Atribut Private (Enkapsulasi)
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    // Static Variable untuk menghitung total rekening
    public static int totalRekening = 0;

    // Constructor + Validasi Saldo Minimal Rp50.000
    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;

        if (saldoAwal >= 50000) {
            this.saldo = saldoAwal;
        } else {
            System.out.println("ERROR: Saldo awal untuk " + namaPemilik + " minimal Rp50.000! Diset ke 0.");
            this.saldo = 0;
        }

        totalRekening++; // Bertambah otomatis setiap objek dibuat
    }

    // Getter untuk membaca nilai saldo
    public double getSaldo() {
        return this.saldo;
    }

    // Setter untuk mengubah nilai saldo
    public void setSaldo(double saldoBaru) {
        if (saldoBaru >= 0) {
            this.saldo = saldoBaru;
        } else {
            System.out.println("ERROR: Saldo tidak boleh negatif!");
        }
    }

    // Method Bisnis: Transfer antar rekening
    public void transfer(double nominal, RekeningBank tujuan) {
        if (nominal > 0 && nominal <= this.saldo) {
            this.saldo -= nominal;              // Saldo pengirim berkurang
            tujuan.saldo += nominal;            // Saldo penerima bertambah
            System.out.println("Transfer berhasil sebesar Rp" + nominal + " dari " + this.namaPemilik + " ke " + tujuan.namaPemilik);
        } else {
            System.out.println("ERROR: Saldo tidak mencukupi atau nominal tidak valid!");
        }
    }
}