# Proyek PBO: Sistem Rekening Bank

Repositori ini berisi kodingan tugas praktikum Pemrograman Berbasis Objek (PBO) Pertemuan 3. Di sini saya belajar cara menerapkan konsep **Enkapsulasi** (menyembunyikan data biar aman) dan penggunaan **Static Keyword** di bahasa pemrograman Java.

---

## 📂 Struktur Proyek
Di dalam proyek ini ada dua file utama yang saling terhubung:
1. **`RekeningBank.java`**: Ini *blueprint* (cetak biru) utamanya. Isinya ada atribut yang diprivat, constructor buat validasi saldo awal, getter-setter, penghitung total rekening pakai static, sama fitur buat transfer uang.
2. **`MainBank.java`**: Ini file buat nge-run programnya. Di sinilah saya bikin objek rekening, nyoba transfer saldo antar akun, dan ngetes validasi error-nya.

---

## 🚀 Fitur yang Dibuat
* **Atribut yang Diprivat (Data Hiding)**: Data penting kayak nomor rekening, nama pemilik, sama saldo sengaja saya set `private` supaya gak bisa diubah sembarangan dari luar class.
* **Validasi Saldo Awal**: Jadi kalau bikin rekening baru, sistem bakal ngecek dulu. Minimal harus ada saldo **Rp50.000**. Kalau kurang, otomatis bakal muncul pesan error dan saldo diset jadi `0`.
* **Getter & Setter**: Method khusus (`getSaldo` dan `setSaldo`) yang bertindak sebagai jalur resmi dan aman buat baca atau ngerubah nilai saldo.
* **Static Variable**: Variabel `totalRekening` dipakai buat ngitung otomatis ada berapa banyak akun rekening yang berhasil dibuat.
* **Fitur Transfer**: Bisa ngirim saldo antar rekening dengan aman, lengkap dengan pengecekan apakah saldo pengirimnya cukup atau nggak.

---

## 💻 Hasil Running Program (Screenshot)
Berikut adalah hasil tangkapan layar (*screenshot*) saat program dijalankan di terminal:

**1. Hasil Transaksi Saldo Awal dan Transfer Berhasil:**
![Hasil Transaksi Normal](PBO(1).jpeg)

**2. Hasil Validasi Error (Transfer Melebihi Saldo):**
![Validasi Error](PBO(2).jpeg)

---

## 👨‍💻 Cara Menjalankan Program
1. Pastikan compiler Java sudah terpasang di komputer/laptopmu.
2. Simpan file `RekeningBank.java` dan `MainBank.java` di dalam satu folder yang sama.
3. Buka terminal atau VS Code, lalu lakukan *compile* dan *run* menggunakan perintah berikut:
   ```bash
   javac RekeningBank.java MainBank.java
   java MainBank
