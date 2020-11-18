package Tugas;

public class Singa extends Binatang implements Karnivora{
    public String suara;
    public String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis : Karnivora");
        System.out.println("Makanan : Daging");
    }

    public void displayBinatang(){
        System.out.println("Nama : " + super.nama);
        System.out.println("Jumlah kaki : " +super.jmlKaki);
    }

    public void displatData(){
        System.out.println("Warna bulu : " + this.warnaBulu);
        System.out.println("Suara : " + this.suara);
    }
}
