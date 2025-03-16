
import java.util.ArrayList;
import java.util.Scanner;

public class Restoran {
    // Main Class
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Menu> listMenu = new ArrayList<>();
        daftarMenu(listMenu);

        for (Menu menu : listMenu) {
            menu.output();
            System.out.println();
        }

        ArrayList<Pelanggan> listPelanggan = new ArrayList<>();

        inputPelanggan(listPelanggan, listMenu, input);

        for (Pelanggan out : listPelanggan) {
            out.output();
            System.out.println();
        }

        for (Menu menu : listMenu) {
            menu.output();
            System.out.println();
        }
    }

    static void daftarMenu(ArrayList<Menu> listMenu) {
        Ramen shoyu = new Ramen();
        shoyu.setJenisMenu("Ramen");
        shoyu.setNamaRamen("Shoyu");
        shoyu.setJenisKaldu("Kecap Asin");
        shoyu.setHarga(30000);

        Ramen curry = new Ramen();
        curry.setJenisMenu("Ramen");
        curry.setNamaRamen("Curry");
        curry.setJenisKaldu("Kari Jepang");
        curry.setHarga(35000);

        Ramen miso = new Ramen();
        miso.setJenisMenu("Ramen");
        miso.setNamaRamen("Miso");
        miso.setJenisKaldu("Kuah Miso");
        miso.setHarga(32000);

        listMenu.add(shoyu);
        listMenu.add(curry);
        listMenu.add(miso);
    }

    static void inputPelanggan(ArrayList<Pelanggan> listPelanggan, ArrayList<Menu> listMenu,Scanner input) {
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

    }
}
