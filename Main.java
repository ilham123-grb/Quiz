import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner obj=new Scanner(System.in);
        Siswa siswa=new Siswa(18210005,"Ilham kusuma jaya");
        siswa.cetak_siswa();
        System.out.println("============input data Matapelajaran :======");
        Nilai nilai=new Nilai();
        Nilai grade= new Nilai();
        System.out.print("kode Matapelajaran =");
        nilai.kdmt= obj.nextLine();
        System.out.print("nama pelajaran =");
        nilai.nmmt=obj.nextLine();
        System.out.println("============Data Matapelajaran============");
        nilai.cetakmt();
        System.out.println("============Data Nilai============");
        System.out.print("jumlah kehadiran =");
        nilai.nilai_absen=obj.nextInt();
        System.out.print("Nilai tugas 1=");
        nilai.nilai_tugas=obj.nextInt();
        System.out.print("Nilai tugas 2=");
        nilai.nilai_tugas=obj.nextInt();
        System.out.print("Nilai tugas 3=");
        nilai.nilai_tugas=obj.nextInt();
        System.out.print("nilai_UTS =");
        nilai.nilai_uts=obj.nextInt();
        System.out.print("nilai_UAS =");
        nilai.nilai_uas=obj.nextInt();
        nilai.addnnlai();
        System.out.println("============Status Nilai============");
        nilai.getRata_rata();
        nilai.cetak_nilai();
        System.out.println("================================");
        nilai.cetak_status();
    }
}