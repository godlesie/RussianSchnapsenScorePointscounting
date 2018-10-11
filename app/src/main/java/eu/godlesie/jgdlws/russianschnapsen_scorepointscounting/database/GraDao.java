package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface GraDao {
    @Query("SELECT * FROM gry WHERE id_rozgrywka LIKE :search ORDER BY id_gra")
    LiveData<List<Gra>> getGryForRozgrywka(int search);
    @Insert
    void insert(Gra gra);
    @Update
    void update(Gra gra);
    @Delete
    void delete(Gra gra);
    @Query("DELETE FROM gry WHERE id_rozgrywka LIKE :search")
    void deleteAllGraForRozgrywka(long search);
}
