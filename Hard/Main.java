package Hard;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Antrian> queue = new LinkedList<>();

        Antrian kazuma = new Antrian("Kazuma", false);
        kazuma.tambahBuku(new Buku("Cara Menjadi Orang Kaya", "Teguh", "Fantasi", "Buku Biasa"));
        kazuma.tambahBuku(new Buku("Belajar Java", "Raysen", "Edukasi", "Buku Biasa"));

        Antrian huTao = new Antrian("Hu Tao", true);
        huTao.tambahBuku(new Buku("Belajar Ilmu Hitam", "Megumin", "Unknown", "Cursed"));
        huTao.tambahBuku(new Buku("Belajar C++", "Raysen", "Edukasi", "Buku Biasa"));
        huTao.tambahBuku(new Buku("Cara Tidur Cepat", "Teguh", "Edukasi Kayaknya", "Cursed"));

        Antrian kafka = new Antrian("Kafka", false);
        kafka.tambahBuku(new Buku("Cara Menjadi Milioner Dalam 1 Jam", "Master Oogway", "Edukasi", "Buku Biasa"));
        kafka.tambahBuku(new Buku("Misteri Menghilangnya Nasi Puyung", "Optimus", "Misteri", "Buku Biasa"));
        kafka.tambahBuku(new Buku("Raysen the Forgotten One", "Unknown", "Sejarah", "Cursed"));

        Antrian xiangling = new Antrian("Xiangling", false);
        xiangling.tambahBuku(new Buku("Cara Memasak", "Chef Ling", "Masakan", "Buku Biasa"));

        queue.add(kazuma);
        queue.add(huTao);
        queue.add(kafka);
        queue.add(xiangling);

        tampilkanDaftarAntrian(queue);

        kazuma.tampilkanBuku();
        queue.poll();

        tampilkanDaftarAntrian(queue);

        huTao.tampilkanBuku();
        queue.poll();

        tampilkanDaftarAntrian(queue);

        Antrian sucrose = new Antrian("Sucrose", true);
        sucrose.tambahBuku(new Buku("Durin The Forgotten Dragon", "Gold", "Misteri", "Buku Biasa"));
        sucrose.tambahBuku(new Buku("Alchemy", "Albedo", "Science", "Cursed"));
        sucrose.tambahBuku(new Buku("Resurrection", "Unknown", "Unknown", "Cursed"));
        queue.add(sucrose);

        tampilkanDaftarAntrian(queue);

        sucrose.tampilkanBuku();
        queue.poll();

        tampilkanDaftarAntrian(queue);

        kafka.tampilkanBuku();

        swapBukuStack(kafka, 1, 3);
        kafka.tampilkanBuku();

        kafka.tumpukanBuku.removeIf(buku -> buku.status.equals("Cursed"));
        kafka.tampilkanBuku();

        System.out.println("= DAFTAR ANTRIAN =\nAntrian Kosong");
    }

    public static void tampilkanDaftarAntrian(Queue<Antrian> queue) {
        System.out.println("= DAFTAR ANTRIAN =");
        int antrianKe = 1;
        for (Antrian antrian : queue) {
            antrian.setAntrianKe(antrianKe++);
            System.out.println(antrian);
        }
        System.out.println("===================================");
    }

    public static void swapBukuStack(Antrian antrian, int pos1, int pos2) {
        if (pos1 < 1 || pos2 < 1 || pos1 > antrian.tumpukanBuku.size() || pos2 > antrian.tumpukanBuku.size()) {
            System.out.println("Posisi buku tidak valid.");
            return;
        }

        Buku[] bukuArray = antrian.tumpukanBuku.toArray(new Buku[0]);
        Buku temp = bukuArray[pos1 - 1];
        bukuArray[pos1 - 1] = bukuArray[pos2 - 1];
        bukuArray[pos2 - 1] = temp;

        antrian.tumpukanBuku.clear();
        for (int i = bukuArray.length - 1; i >= 0; i--) {
            antrian.tumpukanBuku.push(bukuArray[i]);
        }
    }
}
