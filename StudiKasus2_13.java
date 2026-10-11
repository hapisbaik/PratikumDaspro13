import java.util.Scanner;
public class StudiKasus2_13{
    public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama =  sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

        boolean layakKriteria = false;
        String alasanGagal = "";

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")||jenisKegiatan.equalsIgnoreCase("BAKORMA")||jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Peringkat juara: ");
            int peringkat = sc.nextInt();
            if (peringkat >= 1  && peringkat <= 3) {
                layakKriteria = true;
            } else {
                alasanGagal = "Hanya Juara 1, 2, 3 yang memperoleh dana dan penghargaan";
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")){
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1){
                layakKriteria = true;
            } else {
                alasanGagal = "PKM tidak lolos pendanaan";
            }

        } else {
            alasanGagal = "Jenis kegiatan tidak memperoleh dana penghargaan.";
        }
            if (layakKriteria){
                System.out.print("Jumlah dokumen : ");
                int jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4){
                    System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan.");
                } else if (jumlahDokumen < 4 && jumlahDokumen >= 0){
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang" + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                } else {
                    System.out.println("Status: Jumlah dokumen tidak valid.");
                }
            } else {
                System.out.println("Status: "+ alasanGagal);
            }
            sc.close();
        }
    }
