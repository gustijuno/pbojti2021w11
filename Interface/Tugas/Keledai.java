package Tugas;

public class Keledai extends Binatang implements Herbivora{
    public String suara;
    public String warnaBulu;


    public Keledai(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis : Herbivora");
        System.out.println("Makanan : Tumbuhan");
    }

    public void displayBinatang(){
        System.out.println("Nanma : " + super.nama);
        System.out.println("Jumlah Kaki : " + super.jmlKaki);
    }

    public void displayData(){
        System.out.println("Suara : " + this.suara );
        System.out.println("Warna bulu : " + this.warnaBulu);
    }
}
