import java.util.Scanner;
public class StudiKasus215 {
    public static void main (String [] arg) {
        Scanner scanner = new Scanner(System.in);

        String nama_Mahasiswa, jenis_Kegiatan;
        int dokumen_Terupload;
        int peringkat_Juara;
        int statusPendanaan;
        
        System.out.println("Masukkan Nama Panjang anda : ");
        nama_Mahasiswa = scanner.next();
        System.out.println("Masukkan Jenis Kegiatan yang anda ikuti (BELMAWA, BAKORMA, Mandiri, PKM, Lainnya) : ");
        jenis_Kegiatan = scanner.next().toLowerCase();
        
        if (jenis_Kegiatan.equalsIgnoreCase("BELMAWA") || jenis_Kegiatan.equalsIgnoreCase("BAKORMA") || jenis_Kegiatan.equalsIgnoreCase("Mandiri")){;
            System.out.println("Jumlah Dokumen yang telah diupload: ");
            dokumen_Terupload = scanner.nextInt();
            System.out.println("Peringkat Juara : ");
            peringkat_Juara = scanner.nextInt();
            if (peringkat_Juara >=1 && peringkat_Juara <=3) {
                if (dokumen_Terupload == 4){
                    System.out.println("Seluruh ketentuan untuk dana Penghargaan terpenuhi, Berhak Mendapat dana.");
                } else {
                    int kurang = 4 - dokumen_Terupload;
                    System.out.println("Maaf, Ketentuan Dokumen tidak terpenuhi, Dokumen yang belum terupload :  " + kurang );
                }
            } else {
                System.out.println("Maaf, Dana Penghargaan hanya diberikan kepada pemenang peringkat 1, 2, dan 3.");
            }

        } else if (jenis_Kegiatan.equalsIgnoreCase("PKM")){
            System.out.println("Jumlah Dokumen yang telah diupload : ");
            dokumen_Terupload = scanner.nextInt();
            System.out.println("Status Pendanaan PKM (1 = lolos,0 = tidak lolos): ");
            statusPendanaan = scanner.nextInt();
            if (dokumen_Terupload == 4){
                if (statusPendanaan == 1){
                    System.out.println("Seluruh ketentuan untuk dana Penghargaan terpenuhi, Berhak Mendapat dana.");
                } else {
                    int kurang = 4 - dokumen_Terupload;
                    System.out.println("Maaf, Ketentuan Status pendanaan anda tidak lolos.");
                }
            }int kurang = 4 - dokumen_Terupload;
                    System.out.println("Maaf, Ketentuan Dokumen tidak terpenuhi, Dokumen yang belum terupload :  " + kurang );
        }else {
            System.out.println("Maaf, Diluar keperluan PKM dan Lomba yang ada, anda tidak bisa menerima dana penghargaan");
        }
        scanner.close();
    }
}
