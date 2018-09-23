package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface ThousenDao {
    @Insert void insertRozgrywka(Rozgrywka ... rozgrywki);
    @Insert void insertGra(Gra ... gry);
    @Update void updateRozgrywka(Rozgrywka rozgrywka);
    @Update void updateGra(Gra gra);
    @Delete void deleteRozgrywka(Rozgrywka rozgrywka);
    @Delete void deleteGra(Gra gra);

    @Query("SELECT * FROM rozgrywki ORDER BY dateTime ASC")
    LiveData<List<Rozgrywka>> getAllRozgrywki();
    @Query("SELECT * FROM gry where id_rozgrywka LIKE :search ORDER BY id_gra ASC")
    LiveData<List<Gra>> getGryByRozgrywka(long search);
}
