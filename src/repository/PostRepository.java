package repository;

import entity.Paylasim;
import sim.Database;

public class PostRepository {
    public void save(Paylasim paylasim) {
        Database.paylasimList.add(paylasim);
    }


}
