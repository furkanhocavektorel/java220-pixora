package repository;

import com.sun.source.doctree.SeeTree;
import entity.Admin;
import sim.Database;

import java.util.List;

public class AdminRepository {

    public void adminSave(Admin admin) {
        Database.adminList.add(admin);
    }


    public void deleteAdmin(Admin admin) {

        Database.adminList.remove(admin);

    }

    public Admin adminGetirMaileGore(String mail){

        List<Admin> adminList= Database.adminList;

        for (Admin admin : adminList){

            if (admin.getEmail().equals(mail)){
                return admin;
            }

        }

        return null;
    }


}
