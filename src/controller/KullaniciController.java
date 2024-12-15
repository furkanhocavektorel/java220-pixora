package controller;

import service.KullaniciServis;

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

}
