import entity.Kullanici;
import entity.Paylasim;

public class Main {

    // FRONT SIM -test sim
    public static void main(String[] args) {

        Kullanici alikoc= new Kullanici();
        alikoc.setAd("ali");
        alikoc.setSoyad("koc");
        alikoc.setEmail("koc@gmail.com");
        alikoc.setSifre("fenerbahce1907");
        alikoc.setKullaniciAdi("alikocbasganfenersampiyon");

        Kullanici acun= new Kullanici();
        alikoc.setAd("acun");
        alikoc.setSoyad("ilicali");
        alikoc.setEmail("acunnn@gmail.com");
        alikoc.setSifre("acunn123");
        alikoc.setKullaniciAdi("acunilicali");



        Paylasim pa=new Paylasim();
        pa.setAciklama("basaksehire basarilar ama bizde çok güclüyüz");
        pa.setFotoUrl("fenerfotosu");
        pa.setId(723);
        pa.setTarih("2024");
        pa.setKullanici(k);



    }



}