public class percobaan3 {
        mahasiswa mahasiswa1 = new mahasiswa("Budi Asiap Mamang", "Teknik Informatika", "124140299",31, 90);
        mahasiswa mahasiswa2 = new mahasiswa("Jono Jamsut", "Teknik Informatika", "124140300", 22, 65);
        
        void ceknilai(mahasiswa mhs){
            if (mhs.nilai >= 75) {
                System.out.println(mhs.nama + " Lulus");
            } else {
                System.out.println(mhs.nama + " Tidak Lulus");
            }
        }
    public static void main(String[] args) {
        percobaan3 percobaan = new percobaan3();
        percobaan.ceknilai(percobaan.mahasiswa1);
        percobaan.ceknilai(percobaan.mahasiswa2);
    }
}