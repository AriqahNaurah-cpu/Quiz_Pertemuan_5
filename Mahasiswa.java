public class Mahasiswa {
    private String nama;
    private int nilai;

    public Mahasiswa(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }
    public int getNilai() {
        return nilai;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama + " - Nilai: " + nilai);
    }
    public static void main(String[] args) {
        Mahasiswa[] data = {
            new Mahasiswa("King Zaki", 95),
            new Mahasiswa("Prince Ardi", 85),
            new Mahasiswa("Ajudan Farrash", 60)
        };
        for (Mahasiswa mhs : data) {
            mhs.tampilkanData();
        }
        Mahasiswa tertinggi = data[0];
        for (Mahasiswa mhs : data) {
            if (mhs.getNilai() > tertinggi.getNilai()) {
                tertinggi = mhs;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi: " +
                tertinggi.getNama() + " (" + tertinggi.getNilai() + ")");
    }
}
