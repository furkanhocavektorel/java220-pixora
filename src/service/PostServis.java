package service;

import entity.Kullanici;
import entity.Paylasim;
import repository.KullaniciRepository;
import repository.PostRepository;

public class PostServis {

    PostRepository postRepository=new PostRepository();
    KullaniciServis kullaniciServis= new KullaniciServis();

    public void postGonder(String url,String aciklama,String kullaniciAdi){
        Paylasim paylasim= new Paylasim();
        paylasim.setFotoUrl(url);
        paylasim.setAciklama(aciklama);

        Kullanici kullanici=kullaniciServis.kullaniciBulKullaniciAdinaGore(kullaniciAdi);

        paylasim.setKullanici(kullanici);

        postRepository.save(paylasim);
    }



}
