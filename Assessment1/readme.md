### INHERITANCE
-  Inheritance adalah suatu mekanisme dimana suatu class dapat mewarisi semua fields dan methods dari class lain, kecuali yang memiliki access modifier private. Mekanisme ini biasa disebut juga dengan hubungan parent – child.

### POLYMORPHISM
- Polymorphism adalah suatu konsep yang dapat diterapkan ketika kita memiliki banyak class yang berhubungan satu satu sama lain dengan mekanisme inheritance. Konsep ini memungkinkan kita untuk membuat method dengan nama yang sama tetapi aksi yang berbeda-beda.

### ABSTRACTION
- Abstraction adalah sebuah konsep dimana kita hanya mendeklarasikan sebuah class atau method tanpa melakukan aksi yang spesifik didalamnya.
- abstract class tidak dapat digunakan untuk membuat object, untuk mengakses abstract class harus melalui mekanisme  inheritance dari kelas lain.
- abstract method hanya bisa dideklarasi didalam abstract class, dan tidak memiliki body. Untuk mengakses abstract method harus melalui subclass yang mewarisi abstract class (overriding).

### ENCAPSULATION
- Encapsulation adalah metode untuk mengakses variables atau attributes dari class lain yang memiliki access modifier private. Dimana variables atau attributes yang memiliki access modifier private hanya bisa diakses didalam kelasnya sendiri. Metode umum yang digunakan adalah setter dan getter. Dimana setter digunakan untuk menetapkan nilai variables sedangkan getter digunakan untuk mengembalikan nilai variables.