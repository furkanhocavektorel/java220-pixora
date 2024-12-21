package service.interfaceler;

import entity.Kullanici;

import java.util.List;

public interface IKullaniciServis {


    public void kullanciKaydet(String ad,String soyad,String email,
                               String sifre,String kullaniciAdi);

    public Kullanici kullaniciBulKullaniciAdinaGore(String kullaniciAdi);

    public List<Kullanici> kullaniciGetirAdaGore(String ad);


}
