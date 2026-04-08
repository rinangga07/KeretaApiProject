**KeretaApiProject**

**Deskripsi Project**
Project ini merupakan pengembangan dari tugas pertemuan 2, yang sebelumnya menggunakan data statis, 
kemudian diubah menjadi data dinamis menggunakan Java Collection serta penerapan konsep Object-Oriented Programming (OOP).

**Tujuan Pengembangan**

Mengubah data kereta dari statis menjadi dinamis
Menggunakan struktur data seperti List, Set, atau Map
Mengoptimalkan sistem pemilihan tiket agar tidak manual
Mengimplementasikan konsep OOP secara lengkap

**Perubahan dari Versi Sebelumnya**

Data Kereta Menjadi Dinamis
Sebelumnya, data kereta ditulis langsung di dalam kode (hardcoded).
Sekarang, data disimpan dalam struktur data (Collection) sehingga lebih fleksibel untuk ditambah atau diubah.

**Penggunaan Struktur Data**
Project ini menggunakan List untuk menyimpan daftar kereta.
Dengan penggunaan List, data menjadi lebih terstruktur dan mudah diakses serta dikelola.

**Sistem Pemilihan Tiket**
Sebelumnya secara manual. Sekarang, pengguna memilih dari daftar kereta yang tersedia, 
dan sistem otomatis mengambil data seperti harga, jenis kereta, serta melakukan perhitungan total biaya.

**Perhitungan Otomatis**
Dengan sistem baru, tidak ada lagi input manual nama kereta. Semua perhitungan dilakukan berdasarkan data objek,
sehingga mengurangi kesalahan input.

**Konsep OOP yang Digunakan**

**Encapsulation**
Data disimpan dalam class dengan access modifier private dan diakses menggunakan getter serta setter.

**Inheritance**
Class turunan dibuat dari class induk, misalnya class Kereta sebagai superclass dan KeretaEkonomi atau KeretaBisnis 
sebagai subclass.

**Polymorphism**
Method yang sama dapat memiliki implementasi berbeda, contohnya method hitungHarga().

**Abstraction**
Menggunakan abstract class sebagai dasar struktur, sehingga tidak semua method langsung diimplementasikan.

**Interface**
Digunakan untuk mendefinisikan method tanpa isi, kemudian diimplementasikan oleh class lain sesuai kebutuhan.

**Struktur Project**
Project terdiri dari beberapa file .java yang mencakup class utama (Main), class kereta, class turunan, interface, 
serta class untuk transaksi dan perhitungan.

**Cara Menjalankan Program**
Compile program dengan perintah javac Main.java, kemudian jalankan dengan perintah java Main.

**Commit**
Project ini menggunakan commit dengan pesan: tugas pertemuan 3

**Kesimpulan**
Dengan perubahan dari data statis ke dinamis, program menjadi lebih fleksibel, mudah dikembangkan, 
serta telah menerapkan konsep OOP secara nyata dalam studi kasus.
