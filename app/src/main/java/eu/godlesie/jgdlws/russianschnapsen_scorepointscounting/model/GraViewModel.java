package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.model;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

import eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database.Gra;
import eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database.GraRepository;
import eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database.Rozgrywka;

public class GraViewModel extends AndroidViewModel {
    private final LiveData<List<Gra>> mOBservableGra;
    private final int rozgrywkaID;
    private GraRepository repository;

    public GraViewModel(Application application, final int rozgrywkaID) {
        super(application);
        this.rozgrywkaID = rozgrywkaID;
        repository = new GraRepository(application,rozgrywkaID);
        mOBservableGra = repository.getAllGry();
    }
}
