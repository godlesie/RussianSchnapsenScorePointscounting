package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface RozgrywkaDao {
    @Query("SELECT * FROM rozgrywki ORDER BY dateTime")
    LiveData<List<Rozgrywka>> getAllRozgrywki();
    @Insert
    void insert(Rozgrywka rozgrywka);
    @Update
    void update(Rozgrywka rozgrywka);
    @Delete
    void delete(Rozgrywka rozgrywka);
    @Query("DELETE FROM rozgrywki")
    void deleteAll();
}
