package mfajar8.wordpress.pahlawanku.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import mfajar8.wordpress.pahlawanku.Entity.Pahlawan;

@Dao
public interface PahlawanDao {

    @Query("SELECT * FROM pahlawan")
    List<Pahlawan> getAll();

    @Insert
    void insertAll(Pahlawan... pahlawans);
}
