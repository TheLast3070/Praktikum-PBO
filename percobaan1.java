public class percobaan1 {
        public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("Budi Asiap Mamang", "Teknik Informatika", "124140299",31);
        mahasiswa mahasiswa2 = new mahasiswa("Jono Jamsut", "Teknik Informatika", "124140300", 22);
        System.out.println("Data mahasiswa ITERA");
        System.out.println();
        mahasiswa1.TampilMahasiswa();
        System.out.println();
        mahasiswa2.TampilMahasiswa();
    }
}

class mahasiswa {
    String nama, prodi, NIM;
    int umur;

    mahasiswa(String nama, String prodi, String NIM, int umur) {
        this.nama = nama;
        this.prodi = prodi;
        this.NIM = NIM;
        this.umur = umur;
    }

    void TampilMahasiswa(){
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("NIM : " + NIM);
        System.out.println("Umur : " + umur);
    }
}