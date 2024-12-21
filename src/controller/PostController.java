package controller;

import service.PostServis;

public class PostController {

    PostServis postServis= new PostServis();

    public void postAt(String foto,String aciklama,String kullaniciAdi){
        postServis.postGonder(foto,aciklama,kullaniciAdi);
    }




}
