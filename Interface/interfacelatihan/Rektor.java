package interfacelatihan;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat ! silahkan perkenalkan diri Anda..");

        mahasiswa.kuliahDiKampus();
        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("---------------------------------------------");
    }

    public void berisertifikatMawapres(IBerpresrasi mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("----------------------------------------------");
    }
}