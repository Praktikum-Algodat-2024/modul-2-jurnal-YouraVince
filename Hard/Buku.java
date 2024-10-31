package Hard;
public class Buku {
    String judul;
    String pengarang;
    String genre;
    String status;

    public Buku(String judul, String pengarang, String genre, String status) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.genre = genre;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Judul Buku : " + judul + "\nPengarang : " + pengarang + "\nGenre : " + genre + "\nStatus Buku : " + status;
    }
}
