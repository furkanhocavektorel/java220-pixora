package service;

import entity.Admin;
import repository.AdminRepository;

public class AdminServis {


    public void adminKaydet(String ad, String soyad, String sifre, String email) {

        Admin admin= new Admin();
        admin.setAd(ad);
        admin.setSoyad(soyad);
        admin.setEmail(email);
        admin.setSifre(sifre);

        AdminRepository adminRepository= new AdminRepository();
        adminRepository.adminSave(admin);


    }

}
