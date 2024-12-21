package service;

import entity.Admin;
import repository.AdminRepository;

public class AdminServis {

    AdminRepository adminRepository;

    public AdminServis(){
        adminRepository=new AdminRepository();
    }


    public void adminKaydet(String ad, String soyad, String sifre, String email) {
        Admin admin= new Admin();
        admin.setAd(ad);
        admin.setSoyad(soyad);
        admin.setEmail(email);
        admin.setSifre(sifre);
        adminRepository.adminSave(admin);

    }


    public void deleteAdmin(String mail){
        Admin admin= adminRepository.adminGetirMaileGore(mail);

        adminRepository.deleteAdmin(admin);
    }



}
