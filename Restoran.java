
import java.util.ArrayList;
import java.util.Scanner;

public class Restoran {
    // Main Class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ramen shoyu = new Ramen();
        shoyu.setJenisMenu("Ramen");
        shoyu.setNamaRamen("Shoyu");
        shoyu.setJenisKaldu("Kecap Asin");
        shoyu.setHarga(32000);

        MakananPendamping katsu = new MakananPendamping();
        katsu.setJenisMenu("Makanan Pendamping");
        katsu.setNamaMakananPendamping("Katsu");
        katsu.setHarga(16000);

        ArrayList<Menu> listMenu = new ArrayList<>();
        listMenu.add(shoyu);
        listMenu.add(katsu);

        for (Menu menu : listMenu) {
            menu.output();
            System.out.println();
        }

        ArrayList<Pelanggan> listPelanggan = new ArrayList<>();
        Pelanggan pelanggan = new Pelanggan();
        System.out.println("Masukkan Nama Pelanggan!");
        String namaPelanggan = input.nextLine();
        System.out.println();
        for (int i = 0 ; i < 2 ; i++) { //ini perlu diubah mau berapa kali pelanggan memesan
            System.out.print("Masukkan pilihan makanan : ");
            int pesanan = input.nextInt();
            System.out.print("Masukkan jumlah makanan : ");
            int jumlah = input.nextInt();
            input.nextLine();
            System.out.println();
            pelanggan.input(namaPelanggan, listMenu, pesanan, jumlah);
        }
        listPelanggan.add(pelanggan);

        for (Pelanggan out : listPelanggan) {
            out.output();
            System.out.println();
        }

        for (Menu menu : listMenu) {
            menu.output();
            System.out.println();
        }
    }
}
