package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {Rozgrywka.class,Gra.class}, version = 1)
public abstract class ThousendDatabase extends RoomDatabase {
    public abstract ThousendDao thousenDao();
    private static volatile ThousendDatabase INSTANCE;
    static ThousendDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ThousendDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ThousendDatabase.class,"thousend")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
