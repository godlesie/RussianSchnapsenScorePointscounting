package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.rareentity;

import android.os.Build;

public class WynikRozgrywki {
    private final int wynik_1;
    private final int wynik_2;
    private final int wynik_3;
    private final int wynik_4;

    private final int bomba_1;
    private final int bomba_2;
    private final int bomba_3;
    private final int bomba_4;

    public static class Builder {
        private final int wynik_1;
        private final int wynik_2;
        private final int wynik_3;
        private final int wynik_4;

        private int bomba_1;
        private int bomba_2;
        private int bomba_3;
        private int bomba_4;

        public Builder(int w_1,int w_2, int w_3,int w_4) {
            this.wynik_1 = w_1;this.wynik_2 = w_2;this.wynik_3 = w_3;this.wynik_4 = w_4;
        }
        public Builder bomba_1(int val) { this.bomba_1 = val; return this; }
        public Builder bomba_2(int val) { this.bomba_2 = val; return this; }
        public Builder bomba_3(int val) { this.bomba_3 = val; return this; }
        public Builder bomba_4(int val) { this.bomba_4 = val; return this; }

        public WynikRozgrywki build() { return new WynikRozgrywki(this);}
    }
    private WynikRozgrywki(Builder builder) {
        this.wynik_1 = builder.wynik_1;
        this.wynik_2 = builder.wynik_2;
        this.wynik_3 = builder.wynik_3;
        this.wynik_4 = builder.wynik_4;

        this.bomba_1 = builder.bomba_1;
        this.bomba_2 = builder.bomba_2;
        this.bomba_3 = builder.bomba_3;
        this.bomba_4 = builder.bomba_4;
    }

    public int getWynik_1() { return wynik_1; }
    public int getWynik_2() { return wynik_2; }
    public int getWynik_3() { return wynik_3; }
    public int getWynik_4() { return wynik_4; }

    public int getBomba_1() { return bomba_1; }
    public int getBomba_2() { return bomba_2; }
    public int getBomba_3() { return bomba_3; }
    public int getBomba_4() { return bomba_4; }
}
