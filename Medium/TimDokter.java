package Medium;

public class TimDokter {
    String namaTim;
    String dokterOperasi;
    String dokterAnestesi;
    String perawat1;
    String perawat2;

    public TimDokter(String namaTim, String dokterOperasi, String dokterAnestesi, String perawat1, String perawat2) {
        this.namaTim = namaTim;
        this.dokterOperasi = dokterOperasi;
        this.dokterAnestesi = dokterAnestesi;
        this.perawat1 = perawat1;
        this.perawat2 = perawat2;
    }

    @Override
    public String toString() {
        return "Nama Tim: " + namaTim + "\nDokter Operasi: " + dokterOperasi + 
               "\nDokter Anestesi: " + dokterAnestesi + 
               "\nPerawat 1: " + perawat1 + 
               "\nPerawat 2: " + perawat2 + "\n";
    }
}
