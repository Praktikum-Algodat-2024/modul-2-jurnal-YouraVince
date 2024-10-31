package Medium;
public class Main {
    public static void main(String[] args) {
        Queue antrian = new Queue();

        antrian.enqueue(new Pasien("Bruno Jigola", 25, "Laki-Laki", "Berat", "VIP"));
        antrian.enqueue(new Pasien("Mitrime Ganthi", 37, "Perempuan", "Berat", "VIP"));
        antrian.enqueue(new Pasien("Liam Wayne", 31, "Laki-Laki", "Sedang", "Reguler"));
        antrian.enqueue(new Pasien("Anceloti Ferguso", 41, "Laki-Laki", "Ringan", "VIP"));
        antrian.enqueue(new Pasien("Ali Dakota", 20, "Laki-Laki", "Ringan", "Reguler"));

        System.out.println("========================================");
        System.out.println("=         Daftar Pasien                =\n");
        antrian.display();
        System.out.println("========================================");

        Queue antrianBaru = new Queue();
        antrianBaru.enqueue(new Pasien("Megan Foz", 32, "Perempuan", "Darurat", "VIP"));
        antrianBaru.enqueue(new Pasien("Poor didi", 54, "Laki-Laki", "Darurat", "VIP"));
        antrianBaru.enqueue(new Pasien("Anakin Gonzales", 29, "Laki-Laki", "Darurat", "Reguler"));
        antrianBaru.enqueue(new Pasien("Fander Liot", 20, "Laki-Laki", "Sedang", "VIP"));
        antrianBaru.enqueue(new Pasien("Picanta Ether", 29, "Perempuan", "Sedang", "Reguler"));

        System.out.println("========================================");
        System.out.println("=           Daftar Pasien               =\n");
        antrianBaru.display();
        antrianBaru.display(); 
        antrianBaru.enqueue(antrian.dequeue()); 
        System.out.println("========================================");

        System.out.println("=========================================");
        System.out.println("Operasi Sedang Berlangsung");
        System.out.println("=========================================");
        System.out.println("\n=== Ruang Operasi 1 ===");
        System.out.println("Tim Penanganan: Tim Dr. Purwanto");
        System.out.println("Nama Pasien    : " + antrianBaru.dequeue().toString());
        System.out.println("Penanganan    : Darurat");

        System.out.println("\n=== Ruang Operasi 2 ===");
        System.out.println("Tim Penanganan: Tim Dr. Rizal Airin");
        System.out.println("Nama Pasien    : " + antrianBaru.dequeue().toString());
        System.out.println("Penanganan    : Darurat");

        System.out.println("\n============ Dalam Antrian ===================");
        antrianBaru.display();

        Queue ruangPerawatan = new Queue();
        ruangPerawatan.enqueue(new Pasien("Anceloti Ferguso", 41, "Laki-Laki", "Ringan", "VIP"));
        ruangPerawatan.enqueue(new Pasien("Bana Ilyana", 29, "Perempuan", "Ringan", "VIP"));
        
        System.out.println("\n==========================================");
        System.out.println("Dalam Penanganan Dokter Umum");
        System.out.println("==========================================");
        
        System.out.println("\n=== Ruang Perawatan 1 ===");
        System.out.println("Tim Penanganan: Dr. Erling Haaland");
        System.out.println("Nama Pasien    : " + ruangPerawatan.dequeue().toString());
        System.out.println("Penanganan    : Ringan");

        System.out.println("\n=== Ruang Perawatan 2 ===");
        System.out.println("Tim Penanganan: Dr. Ridwan Munir");
        System.out.println("Nama Pasien    : " + ruangPerawatan.dequeue().toString());
        System.out.println("Penanganan    : Ringan");

        System.out.println("\n================Dalam Antrian=====================");
        ruangPerawatan.display();

        System.out.println("\n==========================================");
        System.out.println("Daftar Tim Dokter Umum");
        System.out.println("==========================================");
        System.out.println("1. Dr. Erling Haaland\n   Dokter Operasi: Dr. Erling Haaland\n   Dokter Anestesi: \n   Perawat 1: Oscar Az\n   Perawat 2: -");
        System.out.println("\n2. Dr. Ridwan Munir\n   Dokter Operasi: Dr. Ridwan Munir\n   Dokter Anestesi: \n   Perawat 1: Nia Valentino\n   Perawat 2: -");

        System.out.println("\n==========================================");
        System.out.println("Daftar Tim Operasi");
        System.out.println("==========================================");
        System.out.println("1. Tim Dr. Purwanto\n   Dokter Operasi: Dr. Purwanto\n   Dokter Anestesi: Dr. Rewind HD\n   Perawat 1: Dwi Julian\n   Perawat 2: Exelsen");
        System.out.println("\n2. Tim Dr. Rizal Airin\n   Dokter Operasi: Dr. Rizal Airin\n   Dokter Anestesi: Dr. Kyky Insania\n   Perawat 1: Abyan Tubuh\n   Perawat 2: Rahmatdian");

        System.out.println("\n==========================================");
        System.out.println("Operasi Sedang Berlangsung");
        System.out.println("==========================================");
        System.out.println("\n===========Ruang Operasi 1================");
        System.out.println("Tim Penanganan: Tim Dr. Faruk Ad-Dhar");
        System.out.println("Nama Pasien: Anakin Gonzales");
        System.out.println("Penanganan: Darurat");
        System.out.println("\n=============Ruang Operasi 2======================");
        System.out.println("Tim Penanganan: Tim Dr. Anastasya Maharani");
        System.out.println("Nama Pasien: Bruno Jigola");
        System.out.println("Penanganan: Berat");
        System.out.println("\n=============Dalam Antrian======================");
        
        antrian.display();

        System.out.println("\n==========================================");
        System.out.println("Daftar Pasien Pasca Penanganan");
        System.out.println("==========================================");
        System.out.println("Megan Foz, 32, Perempuan, Darurat, VIP");
        System.out.println("Poor Didi, 54, Laki-Laki, Darurat, VIP");
        System.out.println("Anakin Gonzales, 29, Laki-Laki, Darurat, Reguler");
        System.out.println("Bruno Jigola, 25, Laki-Laki, Berat, VIP");
        System.out.println("Mitrime Ganthi, 37, Perempuan, Berat, VIP");
        System.out.println("Antoni Dos Santos, 32, Laki-Laki, Berat, Reguler");
        System.out.println("Anceloti Ferguso, 41, Laki-Laki, Ringan, VIP");
        System.out.println("Bana Ilyana, 29, Perempuan, Ringan, VIP");
        System.out.println("Ali Dakota, 20, Laki-Laki, Ringan, Reguler");
        System.out.println("==========================================");
    }
}
