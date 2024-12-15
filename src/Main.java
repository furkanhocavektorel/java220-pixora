import controller.KullaniciController;
import entity.Kullanici;
import entity.Paylasim;
import sim.Database;

import java.util.List;
import java.util.Scanner;

public class Main {

    // FRONT SIM -test sim
    public static void main(String[] args) {

        kullaniciEkle();

        KullaniciController kullaniciController= new KullaniciController();

        List<Kullanici> list =kullaniciController.kullaniciGetirAdaGore("mehmet");

        for (Kullanici k : list){
            System.out.println(k.bilgiGetir());
        }


    }





    public static void kullaniciEkle(){

        KullaniciController kullaniciController= new KullaniciController();

        kullaniciController.kullaniciSave("ali", "koc",
                "ali@gmail.com","alikc","asd");

        kullaniciController.kullaniciSave("furkan", "türkmen",
                "frkn@gmail.com","frkntkrmn","xaxa");

        kullaniciController.kullaniciSave("mehmet", "erbil",
                "mehmet@gmail.com","mehmeterbil","hgfgsd");

        kullaniciController.kullaniciSave("mehmet", "ertug",
                "mehmetertg@gmail.com","ertugmehmet","hfgsa2");

    }



}