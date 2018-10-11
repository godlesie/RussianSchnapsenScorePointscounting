package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class GraRepository {
    private GraDao mDao;
    LiveData<List<Gra>> allGry;
    public LiveData<List<Gra>> getAllGry() {
        return allGry;
    }
    GraRepository(Application application, int id_rozgrywka) {
        ThousendDatabase db = ThousendDatabase.getDatabase(application);
        mDao = db.graDao();
        allGry = mDao.getGryForRozgrywka(id_rozgrywka);
    }
    public void insert(Gra gra) { new insertAsyncGra(mDao).execute(gra); }
    private static class insertAsyncGra extends AsyncTask<Gra,Void,Void> {
        private GraDao graDao;
        insertAsyncGra(GraDao dao) { graDao = dao; }
        @Override protected Void doInBackground(final Gra ... params) {
            graDao.insert(params[0]);
            return null;
        }
    }
    public void update(Gra gra) { new updateAsyncGra(mDao).execute(gra); }
    private static class updateAsyncGra extends AsyncTask<Gra,Void,Void> {
        private GraDao graDao;
        updateAsyncGra(GraDao dao) { graDao = dao; }
        @Override protected Void doInBackground(final Gra ... params) {
            graDao.update(params[0]);
            return null;
        }
    }
    public void delete(Gra gra) { new deleteAsyncGra(mDao).execute(gra); }
    private static class deleteAsyncGra extends AsyncTask<Gra,Void,Void> {
        private GraDao graDao;
        deleteAsyncGra(GraDao dao) { graDao = dao; }
        @Override protected Void doInBackground(final Gra ... params) {
            graDao.delete(params[0]);
            return null;
        }
    }

    private static class deleteAsyncAllGraForRozgrywka extends AsyncTask<Gra,Void,Void> {
        private GraDao graDao;
        deleteAsyncAllGraForRozgrywka(GraDao dao) { graDao = dao; }
        @Override protected Void doInBackground(final Gra ... params) {
            graDao.deleteAllGraForRozgrywka(params[0].getId_rozgrywka());
            return null;
        }
    }
}
