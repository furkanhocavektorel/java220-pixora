package repository;

import entity.Kullanici;
import sim.Database;

import java.util.ArrayList;
import java.util.List;

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

    public List<Kullanici> kullaniciGetirAdaGore (String ad){

        List<Kullanici> filtreliList= new ArrayList<>();

        for (Kullanici k : Database.kullaniciList){

            if (k.getAd().equals(ad)){
                filtreliList.add(k);
            }
        }

        return filtreliList;
    }


}
