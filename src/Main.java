import controller.KullaniciController;
import entity.Kullanici;
import entity.Paylasim;
import sim.Database;

import java.util.Scanner;

public class Main {

    // FRONT SIM -test sim
    public static void main(String[] args) {

        kullaniciEkle();

        KullaniciController kullaniciController= new KullaniciController();

        Kullanici k=kullaniciController.kullaniciGetirKullaniciAdaGore("frkntkrmn");

        System.out.println(k.bilgiGetir());


    }





    public static void kullaniciEkle(){

        KullaniciController kullaniciController= new KullaniciController();

        kullaniciController.kullaniciSave("ali", "koc",
                "ali@gmail.com","alikc","asd");

        kullaniciController.kullaniciSave("furkan", "türkmen",
                "frkn@gmail.com","frkntkrmn","xaxa");

        kullaniciController.kullaniciSave("mehmet", "erbil",
                "mehmet@gmail.com","mehmeterbil","hgfgsd");
    }



}