public class hewan {
    public static void main(String[] args) {
        String[] hewan = new String[5];
        hewan[0] = "Kucing";
        hewan[1] = "Kelinci";
        hewan[2] = "Burung";
        hewan[3] = "Ikan";
        hewan[4] = "Kuda";

        System.out.println("Daftar Hewan di Kebun Binatang Bu Yuyun:");
        for (int i = 0; i < hewan.length; i++) {
            System.out.println(hewan[i]);
        }
    }
}
