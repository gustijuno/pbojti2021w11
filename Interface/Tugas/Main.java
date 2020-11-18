package Tugas;

public class Main {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla("Gorilla", 2,"huhuhuhu", "Hitam");
        Singa singa = new Singa("Singa", 4, "arrhggg", "Coklat");
        Keledai keledai = new Keledai("keledai", 4,"hiiikhaaak", "abu-abu");

        gorilla.displayMakanan();
        gorilla.displayBinatang();
        gorilla.displayData();
        System.out.println();

        singa.displayMakanan();
        singa.displayBinatang();
        singa.displatData();
        System.out.println();

        keledai.displayMakanan();
        keledai.displayBinatang();
        keledai.displayData();
        System.out.println();

    }
}
