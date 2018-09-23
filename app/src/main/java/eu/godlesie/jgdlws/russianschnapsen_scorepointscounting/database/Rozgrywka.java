package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "rozgrywki")
public class Rozgrywka {
    @PrimaryKey
    @NonNull
    @ColumnInfo
    private long dateTime;
    @ColumnInfo
    private String player_1;
    @ColumnInfo
    private String player_2;
    @ColumnInfo
    private String player_3;
    @ColumnInfo
    private String player_4;
    @ColumnInfo
    private int result_1;
    @ColumnInfo
    private int result_2;
    @ColumnInfo
    private int result_3;
    @ColumnInfo
    private int result_4;
    @ColumnInfo
    private int bomb_1;
    @ColumnInfo
    private int bomb_2;
    @ColumnInfo
    private int bomb_3;
    @ColumnInfo
    private int bomb_4;

    Rozgrywka(@NonNull long dateTime) {
        this.dateTime = dateTime;
    }

    @NonNull
    public long getDateTime() {
        return dateTime;
    }

    public void setDateTime(@NonNull long dateTime) {
        this.dateTime = dateTime;
    }

    public String getPlayer_1() {
        return player_1;
    }

    public void setPlayer_1(String player_1) {
        this.player_1 = player_1;
    }

    public String getPlayer_2() {
        return player_2;
    }

    public void setPlayer_2(String player_2) {
        this.player_2 = player_2;
    }

    public String getPlayer_3() {
        return player_3;
    }

    public void setPlayer_3(String player_3) {
        this.player_3 = player_3;
    }

    public String getPlayer_4() {
        return player_4;
    }

    public void setPlayer_4(String player_4) {
        this.player_4 = player_4;
    }

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

    public int getBomb_1() {
        return bomb_1;
    }

    public void setBomb_1(int bomb_1) {
        this.bomb_1 = bomb_1;
    }

    public int getBomb_2() {
        return bomb_2;
    }

    public void setBomb_2(int bomb_2) {
        this.bomb_2 = bomb_2;
    }

    public int getBomb_3() {
        return bomb_3;
    }

    public void setBomb_3(int bomb_3) {
        this.bomb_3 = bomb_3;
    }

    public int getBomb_4() {
        return bomb_4;
    }

    public void setBomb_4(int bomb_4) {
        this.bomb_4 = bomb_4;
    }
}
