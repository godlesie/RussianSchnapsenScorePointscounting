package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class RozgrywkaRepository {
    private RozgrywkaDao mDao;
    private LiveData<List<Rozgrywka>> mAllRozgrywka;
    public LiveData<List<Rozgrywka>> getmAllRozgrywka() {
        return mAllRozgrywka;
    }
    RozgrywkaRepository(Application application) {
        ThousendDatabase db = ThousendDatabase.getDatabase(application);
        mDao = db.rozgrywkaDao();
        mAllRozgrywka = mDao.getAllRozgrywki();
    }
    public void insert(Rozgrywka rozgrywka) { new insertAsyncRozgrywka(mDao).execute(rozgrywka); }
    private static class insertAsyncRozgrywka extends AsyncTask<Rozgrywka,Void,Void> {
        private RozgrywkaDao rozgrywkaDao;
        insertAsyncRozgrywka(RozgrywkaDao dao) { rozgrywkaDao = dao; }
        @Override protected Void doInBackground(final Rozgrywka ... params) {
            rozgrywkaDao.insert(params[0]); return null;
        }
    }
    public void update(Rozgrywka rozgrywka) { new updateAsyncRozgrywka(mDao).execute(rozgrywka); }
    private static class updateAsyncRozgrywka extends AsyncTask<Rozgrywka,Void,Void> {
        private RozgrywkaDao rozgrywkaDao;
        updateAsyncRozgrywka(RozgrywkaDao dao) { rozgrywkaDao = dao; }
        @Override protected Void doInBackground(final Rozgrywka ... params) {
            rozgrywkaDao.update(params[0]); return null;
        }
    }
    public void delete(Rozgrywka rozgrywka) { new deleteAsyncRozgrywka(mDao).execute(rozgrywka); }
    private static class deleteAsyncRozgrywka extends AsyncTask<Rozgrywka,Void,Void> {
        private RozgrywkaDao rozgrywkaDao;
        deleteAsyncRozgrywka(RozgrywkaDao dao) { rozgrywkaDao = dao; }
        @Override protected Void doInBackground(final Rozgrywka ... params) {
            rozgrywkaDao.delete(params[0]); return null;
        }
    }
    public void deleteAll() { new deleteAsyncRozgrywka(mDao).execute(); }
    private static class deleteAllRozgrywkaAsync extends AsyncTask<Void,Void,Void> {
        private RozgrywkaDao rozgrywkaDao;
        deleteAllRozgrywkaAsync(RozgrywkaDao dao) { rozgrywkaDao = dao; }
        @Override protected Void doInBackground(final Void ... params) {
            rozgrywkaDao.deleteAll(); return null;
        }
    }
}
