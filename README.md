# Proyek PBO: Sistem Rekening Bank (Enkapsulasi & Static Keyword)

Repositori ini berisi tugas praktikum Pemrograman Berbasis Objek (PBO) Pertemuan 3 yang berfokus pada penerapan konsep **Enkapsulasi (Data Hiding)** dan **Static Keyword** di Java[cite: 54].

---

## 📂 Struktur Proyek
Proyek ini terdiri dari dua class utama:
1. **`RekeningBank.java`**: Class blueprint yang menerapkan atribut privat, constructor dengan validasi saldo minimal, *getter & setter*, static variable untuk menghitung total rekening, serta method bisnis (transfer)[cite: 54].
2. **`MainBank.java`**: Class *test runner* untuk menjalankan program, menguji validasi, melakukan transaksi transfer antar rekening, dan menampilkan status akhir[cite: 54].

---

## 🚀 Penjelasan Fitur & Konsep
* **Atribut Privat (Data Hiding)**: Atribut seperti `noRekening`, `namaPemilik`, dan `saldo` dilindungi dengan modifier `private` agar tidak bisa diakses secara langsung dari luar class[cite: 54].
* **Validasi Saldo Awal**: Constructor memastikan bahwa setiap pembuatan rekening baru harus memiliki saldo awal minimal **Rp50.000**. Jika kurang, saldo otomatis diset ke `0` dan menampilkan pesan *error*[cite: 54].
* **Getter & Setter**: Method publik (`getSaldo()` dan `setSaldo()`) digunakan sebagai pintu aman untuk membaca dan mengubah data saldo[cite: 54].
* **Static Variable**: Variabel `totalRekening` digunakan untuk menghitung jumlah total objek rekening yang berhasil diinisialisasi[cite: 54].
* **Method Transfer**: Memungkinkan pengiriman dana antar objek `RekeningBank` dengan validasi kecukupan saldo[cite: 54].

---

## 💻 Hasil Running Program (Screenshot)
Berikut adalah hasil tangkapan layar (*screenshot*) saat program dijalankan di terminal:

**1. Hasil Transaksi Saldo Awal dan Transfer Berhasil:**
![Hasil Transaksi Normal](ss PBO2 (1).png)

**2. Hasil Validasi Error (Transfer Melebihi Saldo):**
![Validasi Error](ss PBO2 (2).png)

---

## 👨‍💻 Cara Menjalankan Program
1. Pastikan compiler Java sudah terpasang di komputer/laptopmu.
2. Simpan file `RekeningBank.java` dan `MainBank.java` di dalam satu folder yang sama.
3. Buka terminal atau VS Code, lalu lakukan *compile* dan *run* menggunakan perintah berikut:
   ```bash
   javac RekeningBank.java MainBank.java
   java MainBank
