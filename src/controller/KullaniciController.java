package controller;

import service.KullaniciServis;

public class KullaniciController {


    public void kullaniciSave(String ad,String soyad,String email,
                              String kullaniciAdi,String sifre){

        KullaniciServis kullaniciServis= new KullaniciServis();

        kullaniciServis.kullanciKaydet(ad,soyad,email,sifre,kullaniciAdi);

    }

}
