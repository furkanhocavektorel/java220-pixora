package controller;

import entity.Kullanici;
import service.KullaniciServis;
import service.interfaceler.IKullaniciServis;

import java.util.List;

public class KullaniciController {

    IKullaniciServis kullaniciServis= new KullaniciServis() ;


    public void kullaniciSave(String ad,String soyad,String email,
                              String kullaniciAdi,String sifre){

        kullaniciServis.kullanciKaydet(ad,soyad,email,sifre,kullaniciAdi);
    }

    //kullaniciadina göre kullanici bulma
    public Kullanici kullaniciGetirKullaniciAdaGore(String kullaniciAdi){

         return kullaniciServis.kullaniciBulKullaniciAdinaGore(kullaniciAdi);

    }

    public List<Kullanici> kullaniciGetirAdaGore(String ad){
        List<Kullanici> list= kullaniciServis.kullaniciGetirAdaGore(ad) ;
        return list;
    }

}
