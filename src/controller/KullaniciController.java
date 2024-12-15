package controller;

import entity.Kullanici;
import service.KullaniciServis;

import java.util.List;

public class KullaniciController {


    // C.R.U.D
    // create
    // read
    // update
    // delete

    public void kullaniciSave(String ad,String soyad,String email,
                              String kullaniciAdi,String sifre){

        KullaniciServis kullaniciServis= new KullaniciServis();

        kullaniciServis.kullanciKaydet(ad,soyad,email,sifre,kullaniciAdi);

    }

    //kullaniciadina göre kullanici bulma

    public Kullanici kullaniciGetirKullaniciAdaGore(String kullaniciAdi){

        KullaniciServis kullaniciServis = new KullaniciServis();

         return kullaniciServis.kullaniciGetirKullaniciAdinaGore(kullaniciAdi);

    }


    public List<Kullanici> kullaniciGetirAdaGore(String ad){
        KullaniciServis kullaniciServis= new KullaniciServis();
        List<Kullanici> list= kullaniciServis.kullaniciGetirAdaGore(ad) ;
        return list;
    }

}
