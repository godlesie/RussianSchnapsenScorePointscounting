package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class ThousendRepository {
    private ThousenDao mDao;
    private LiveData<List<Rozgrywka>> mAllRozgrywka;
    private LiveData<List<Gra>> mAllGraByRozgrywka;

    ThousendRepository(Application application) {
        ThousendDatabase db = ThousendDatabase.getDatabase(application);
        mDao = db.thousenDao();
        mAllRozgrywka = mDao.getAllRozgrywki();
        mAllGraByRozgrywka = mDao.getAllGra();
    }

    LiveData<List<Rozgrywka>> getmAllRozgrywka() {
        return mAllRozgrywka;
    }
    LiveData<List<Gra>> getmAllGraByRozgrywka() {
        return mAllGraByRozgrywka;
    }

    public void insertRozgrywka(Rozgrywka rozgrywka) {
        new insertAsyncRozgrywka(mDao).execute(rozgrywka);
    }
    public void insertGra(Gra gra) {
        new insertAsyncGra(mDao).execute(gra);
    }

    private static class insertAsyncRozgrywka extends AsyncTask<Rozgrywka,Void,Void> {
        private ThousenDao mAsyncTaskDao;
        insertAsyncRozgrywka(ThousenDao dao) {
            mAsyncTaskDao = dao;
        }
        @Override
        protected Void doInBackground(final Rozgrywka ... params) { 
            mAsyncTaskDao.insertRozgrywka(params[0]);
            return null;
        }
    }
    private static class insertAsyncGra extends AsyncTask<Gra,Void,Void> {
        private ThousenDao mAsyncTaskDao;
        insertAsyncGra(ThousenDao dao) {
            mAsyncTaskDao = dao;
        }
        @Override
        protected Void doInBackground(final Gra ... params) {
            mAsyncTaskDao.insertGra(params[0]);
            return null;
        }
    }

}
