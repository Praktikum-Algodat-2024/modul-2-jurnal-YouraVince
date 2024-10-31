package Medium;

public class Pasien {
    private String nama;
    private int umur;
    private String jenisKelamin;
    private String penanganan;
    private String status;

    public Pasien(String nama, int umur, String jenisKelamin, String penanganan, String status) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.penanganan = penanganan;
        this.status = status;
    }

    @Override
    public String toString() {
        return nama + ", " + umur + ", " + jenisKelamin + ", " + penanganan + ", " + status;
    }
}
