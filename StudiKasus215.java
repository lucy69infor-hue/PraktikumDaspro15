import java.util.Scanner;
public class StudiKasus215 {
    public static void main (String [] arg) {
        Scanner scanner = new Scanner(System.in);

        String nama_Mahasiswa;
        String jenis_Kegiatan;
        int dokumen_Terupload;
        int peringkat_Juara;
        
        System.out.println("Masukkan Nama Panjang anda : ");
        nama_Mahasiswa = scanner.next();
        System.out.println("Masukkan Jenis Kegiatan yang anda ikuti (BELMAWA, BAKORMA, atau Mandiri) : ");
        jenis_Kegiatan = scanner.next().toLowerCase();
        System.out.println("Masukkan jumlah Dokumen yang telah anda upload : ");
        dokumen_Terupload = scanner.nextInt();
        System.out.println("Peringkat Juara anda (1,2,3,jika tidak menjuarai isi dengan 0): ");
        peringkat_Juara = scanner.nextInt();

        
    }
}
