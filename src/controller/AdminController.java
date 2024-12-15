package controller;

import service.AdminServis;

public class AdminController {

    public void saveAdmin(String ad,String soyad,String sifre,String email){

        AdminServis adminServis= new AdminServis();

        adminServis.adminKaydet(ad,soyad,sifre,email);

    }

}
