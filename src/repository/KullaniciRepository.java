package repository;

import entity.Kullanici;
import sim.Database;

public class KullaniciRepository {


    public void kullaniciKaydet(Kullanici kullanici){
        Database.kullaniciList.add(kullanici);
    }

    public Kullanici kullaniciGetirKullaniciAdinaGore(String kullaniciAdi){
        Kullanici kullanici= new Kullanici();

        for (Kullanici k : Database.kullaniciList){
            if (k.getKullaniciAdi().equals(kullaniciAdi)){
                kullanici.setAd(k.getAd());
                kullanici.setSoyad(k.getSoyad());
                kullanici.setKullaniciAdi(k.getKullaniciAdi());
                kullanici.setSifre(k.getSifre());
                kullanici.setEmail(k.getEmail());
            }
        }

        return kullanici;
    }


}
