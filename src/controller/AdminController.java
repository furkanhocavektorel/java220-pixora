package controller;

import service.AdminServis;

public class AdminController {
    AdminServis adminServis;

    public AdminController() {
        this.adminServis = new AdminServis();
    }

    public void saveAdmin(String ad, String soyad, String sifre, String email){

        adminServis.adminKaydet(ad,soyad,sifre,email);

    }

    public void deleteAdmin(String email){

        adminServis.deleteAdmin(email);
    }


}
