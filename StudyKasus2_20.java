import java.util.Scanner;
public class StudyKasus2_20 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkatJuara, statusPendanaanPKM;

        System.out.println("Masukkan nama: ");
        namaMahasiswa = sc.nextLine();
        System.out.println("Masukkan jenis kegiatan: ");
        jenisKegiatan = sc.nextLine();
        System.out.println("Masukkan jumlah dokumen");
        jumlahDokumen = sc.nextInt();
        System.out.println("Peringkat juara");
        peringkatJuara = sc.nextInt();

        if (jenisKegiatan.equals("BELMAWA") || jenisKegiatan.equals("BAKORMA") || jenisKegiatan.equals("MANDIRI")) {
            System.out.println("Masukkan jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            System.out.println("Masukkan peringkat juara: ");
            peringkatJuara = sc.nextInt();

            System.out.println("Peringkat juara : " + peringkatJuara);

            if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Hanya peraih Juara 1, 2, atau 3 yang memperoleh dana penghargaan. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equals("PKM")) {
            System.out.println("Masukkan jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();
            System.out.println("Masukkan status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPendanaanPKM = sc.nextInt();

            if (statusPendanaanPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dana penghargaan diberikan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tim tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status : Dokumen tidak lengkap (dokumen kurang 1). Dana penghargaan tidak diberikan.");
        }

        sc.close();

   }
}