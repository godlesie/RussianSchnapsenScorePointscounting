package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

import eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database.Rozgrywka;
import eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database.RozgrywkaRepository;

public class RozgrywkaViewModel extends AndroidViewModel {
    private LiveData<List<Rozgrywka>> mObservableRozgrywka;
    private RozgrywkaRepository mRepository;

    public RozgrywkaViewModel(Application application) {
        super(application);
        mRepository = new RozgrywkaRepository(application);
        mObservableRozgrywka = mRepository.getmAllRozgrywka();
    }

    LiveData<List<Rozgrywka>> getmObservableRozgrywka() {
        return mObservableRozgrywka;
    }
    public void insert(Rozgrywka rozgrywka) { mRepository.insert(rozgrywka); }
    public void update(Rozgrywka rozgrywka) { mRepository.update(rozgrywka); }
    public void deleteALL() { mRepository.deleteAll(); }
    public void delete(Rozgrywka rozgrywka) { mRepository.delete(rozgrywka); }
}
