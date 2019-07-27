package mfajar8.wordpress.pahlawanku.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import mfajar8.wordpress.pahlawanku.DAO.PahlawanDao;
import mfajar8.wordpress.pahlawanku.Entity.Pahlawan;


@Database(entities = Pahlawan.class, version = 1)
public abstract class AppDatabase  extends RoomDatabase {

    public abstract PahlawanDao pahlawanDao();
}