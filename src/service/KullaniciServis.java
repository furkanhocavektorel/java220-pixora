package service;

import entity.Kullanici;
import repository.KullaniciRepository;

public class KullaniciServis {

    public void kullanciKaydet(String ad,String soyad,String email,
                               String sifre,String kullaniciAdi){

        Kullanici kullanici= new Kullanici();
        kullanici.setAd(ad);
        kullanici.setSifre(sifre);
        kullanici.setSoyad(soyad);
        kullanici.setKullaniciAdi(kullaniciAdi);
        kullanici.setEmail(email);

        KullaniciRepository kullaniciRepository = new KullaniciRepository();
        kullaniciRepository.kullaniciKaydet(kullanici);
    }

    public Kullanici kullaniciGetirKullaniciAdinaGore(String kullaniciAdi){

        KullaniciRepository kullaniciRepository= new KullaniciRepository();
        return kullaniciRepository.kullaniciGetirKullaniciAdinaGore(kullaniciAdi);
    }


}
