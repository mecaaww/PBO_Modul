import java.util.Scanner;

public class Balok extends BangunRuang {
    Scanner scanner = new Scanner(System.in);
    private double panjang;
    private double lebar;
    private double tinggi;

    Balok(String nameBangun) {
        super(nameBangun);
    }

    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input Panjang Balok: ");
        panjang = scanner.nextDouble();
        System.out.print("Input Lebar Balok: ");
        lebar = scanner.nextDouble();
        System.out.print("Input Tinggi Balok: ");
        tinggi = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume(){
        double hasil = panjang * lebar * tinggi;
        super.volume();
        System.out.println("Hasil Volume: " + hasil);

    }

}
