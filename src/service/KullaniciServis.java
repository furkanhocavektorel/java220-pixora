package service;

import entity.Kullanici;
import repository.KullaniciRepository;
import service.interfaceler.IKullaniciServis;

import java.util.List;

public class KullaniciServis implements IKullaniciServis {
    KullaniciRepository kullaniciRepository = new KullaniciRepository();

    public void kullanciKaydet(String ad,String soyad,String email,
                               String sifre,String kullaniciAdi){

        Kullanici kullanici= new Kullanici();
        kullanici.setAd(ad);
        kullanici.setSifre(sifre);
        kullanici.setSoyad(soyad);
        kullanici.setKullaniciAdi(kullaniciAdi);
        kullanici.setEmail(email);

        kullaniciRepository.kullaniciKaydet(kullanici);
    }

    public Kullanici kullaniciBulKullaniciAdinaGore(String kullaniciAdi){

        return kullaniciRepository.kullaniciGetirKullaniciAdinaGore(kullaniciAdi);
    }

    @Override
    public List<Kullanici> kullaniciGetirAdaGore(String ad){

        return kullaniciRepository.kullaniciGetirAdaGore(ad);
    }


}
