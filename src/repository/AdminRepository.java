package repository;

import entity.Admin;
import sim.Database;

public class AdminRepository {

    public void adminSave(Admin admin) {
        Database.adminList.add(admin);
    }


}
