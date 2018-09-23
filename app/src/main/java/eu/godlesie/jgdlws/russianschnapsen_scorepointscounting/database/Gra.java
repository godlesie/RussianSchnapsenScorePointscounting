package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "gry")
public class Gra {
    @PrimaryKey
    @NonNull
    @ColumnInfo
    private int id_gra;
    @ColumnInfo
    private long id_rozgrywka;
    @ColumnInfo
    private int result_1;
    @ColumnInfo
    private int result_2;
    @ColumnInfo
    private int result_3;
    @ColumnInfo
    private int result_4;
    @ColumnInfo
    private int contract_1;
    @ColumnInfo
    private int contract_2;
    @ColumnInfo
    private int contract_3;
    @ColumnInfo
    private int contract_4;
    @ColumnInfo
    private int bomb;
    @ColumnInfo
    private int rozdaje;
    Gra() {}

    public int getResult_1() {
        return result_1;
    }

    public void setResult_1(int result_1) {
        this.result_1 = result_1;
    }

    public int getResult_2() {
        return result_2;
    }

    public void setResult_2(int result_2) {
        this.result_2 = result_2;
    }

    public int getResult_3() {
        return result_3;
    }

    public void setResult_3(int result_3) {
        this.result_3 = result_3;
    }

    public int getResult_4() {
        return result_4;
    }

    public void setResult_4(int result_4) {
        this.result_4 = result_4;
    }

    public int getContract_1() {
        return contract_1;
    }

    public void setContract_1(int contract_1) {
        this.contract_1 = contract_1;
    }

    public int getContract_2() {
        return contract_2;
    }

    public void setContract_2(int contract_2) {
        this.contract_2 = contract_2;
    }

    public int getContract_3() {
        return contract_3;
    }

    public void setContract_3(int contract_3) {
        this.contract_3 = contract_3;
    }

    public int getContract_4() {
        return contract_4;
    }

    public void setContract_4(int contract_4) {
        this.contract_4 = contract_4;
    }

    public int getBomb() {
        return bomb;
    }

    public void setBomb(int bomb) {
        this.bomb = bomb;
    }

    public int getRozdaje() {
        return rozdaje;
    }

    public void setRozdaje(int rozdaje) {
        this.rozdaje = rozdaje;
    }

    @NonNull
    public int getId_gra() {
        return id_gra;
    }

    public void setId_gra(@NonNull int id_gra) {
        this.id_gra = id_gra;
    }

    public long getId_rozgrywka() {
        return id_rozgrywka;
    }

    public void setId_rozgrywka(long id_rozgrywka) {
        this.id_rozgrywka = id_rozgrywka;
    }
}
