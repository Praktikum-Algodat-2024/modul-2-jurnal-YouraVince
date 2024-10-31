package Hard;
import java.util.Stack;

public class Antrian {
    String nama;
    int antrianKe;
    Stack<Buku> tumpukanBuku;
    boolean kartuSpesial;

    public Antrian(String nama, boolean kartuSpesial) {
        this.nama = nama;
        this.tumpukanBuku = new Stack<>();
        this.kartuSpesial = kartuSpesial;
    }

    public void setAntrianKe(int antrianKe) {
        this.antrianKe = antrianKe;
    }

    public int getJumlahBuku() {
        return tumpukanBuku.size();
    }

    public void tambahBuku(Buku buku) {
        tumpukanBuku.push(buku);
    }

    public void tampilkanBuku() {
        System.out.println("= BUKU " + nama.toUpperCase() + " =");
        for (Buku buku : tumpukanBuku) {
            System.out.println(buku);
            System.out.println("===================================");
        }
    }

    public void hapusBukuTengah() {
        if (tumpukanBuku.isEmpty()) {
            System.out.println("Tumpukan buku kosong.");
            return;
        }

        Stack<Buku> tempStack = new Stack<>();
        int middleIndex = tumpukanBuku.size() / 2;

        for (int i = 0; i < middleIndex; i++) {
            tempStack.push(tumpukanBuku.pop());
        }

        tumpukanBuku.pop();

        while (!tempStack.isEmpty()) {
            tumpukanBuku.push(tempStack.pop());
        }
    }

    @Override
    public String toString() {
        return "Nama : " + nama + "\nAntrian ke : " + antrianKe + "\nJumlah Buku : " + getJumlahBuku() + "\nKartu Spesial : " + (kartuSpesial ? "Ada" : "Tidak ada") + "\n";
    }
}
