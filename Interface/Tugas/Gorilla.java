package Tugas;

public class Gorilla extends Binatang implements Karnivora, Herbivora{
    public String suara;
    public String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayMakanan() {
        System.out.println("Jenis : Karnivora + Herbivora");
        System.out.println("Makanan : Daging + Tumbuhan");
    }

    public void displayBinatang(){
        System.out.println("Nama : " + super.nama);
        System.out.println("Jumlah kaki : " + super.jmlKaki);
    }

    public void displayData(){
        System.out.println("Suara : " + this.suara);
        System.out.println("Warna bulu : " + this.warnaBulu);
    }
}
