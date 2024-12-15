import controller.KullaniciController;
import entity.Kullanici;
import entity.Paylasim;
import sim.Database;

import java.util.Scanner;

public class Main {

    // FRONT SIM -test sim
    public static void main(String[] args) {

        Scanner src= new Scanner(System.in);

        System.out.println("ad giriniz");
        String ad=src.nextLine();

        System.out.println("soyad giriniz");
        String soyad=src.nextLine();

        System.out.println("email giriniz");
        String email=src.nextLine();

        System.out.println("sifre giriniz");
        String sifre=src.nextLine();

        System.out.println("kullaniciAdi giriniz");
        String kullaniciAdi=src.nextLine();

        KullaniciController kullaniciController= new KullaniciController();
        kullaniciController.kullaniciSave(ad,soyad,
                email,kullaniciAdi,sifre);

        System.out.println(Database.kullaniciList.get(0).bilgiGetir());

    }



}