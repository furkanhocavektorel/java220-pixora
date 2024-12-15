package repository;

import entity.Kullanici;
import sim.Database;

public class KullaniciRepository {


    public void kullaniciKaydet(Kullanici kullanici){
        Database.kullaniciList.add(kullanici);
    }

}
