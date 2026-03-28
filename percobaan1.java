public class percobaan1 {
        public static void main(String[] args) {
        mahasiswa mahasiswa1 = new mahasiswa("Budi Asiap Mamang", "Teknik Informatika", "124140299",31, 90);
        mahasiswa mahasiswa2 = new mahasiswa("Jono Jamsut", "Teknik Informatika", "124140300", 22, 85);
        System.out.println("Data mahasiswa ITERA");
        System.out.println();
        mahasiswa1.TampilMahasiswa();
        System.out.println();
        mahasiswa2.TampilMahasiswa();
    }
}

class mahasiswa {
    String nama, prodi, NIM;
    int umur, nilai;

    mahasiswa(String nama, String prodi, String NIM, int umur, int nilai) {
        this.nama = nama;
        this.prodi = prodi;
        this.NIM = NIM;
        this.umur = umur;
        this.nilai = nilai;
    }

    void TampilMahasiswa(){
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("NIM : " + NIM);
        System.out.println("Umur : " + umur);
        System.out.println("Nilai : " + nilai);
    }
     
}