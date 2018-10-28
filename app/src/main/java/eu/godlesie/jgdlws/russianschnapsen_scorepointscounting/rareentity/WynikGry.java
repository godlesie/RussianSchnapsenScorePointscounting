package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.rareentity;

public class WynikGry {
    private final int wynik_1;
    private final int wynik_2;
    private final int wynik_3;
    private final int wynik_4;

    private final boolean bomba_1 = false;
    private final boolean bomba_2 = false;
    private final boolean bomba_3 = false;
    private final boolean bomba_4 = false;

    public static class Builder {
        private final int wynik_1;
        private final int wynik_2;
        private final int wynik_3;
        private final int wynik_4;

        private boolean bomba_1;
        private boolean bomba_2;
        private boolean bomba_3;
        private boolean bomba_4;

        public Builder bomba_1(boolean val) { bomba_1 = val; return this; }
        public Builder bomba_2(boolean val) { bomba_2 = val; return this; }
        public Builder bomba_3(boolean val) { bomba_3 = val; return this; }
        public Builder bomba_4(boolean val) { bomba_4 = val; return this; }

        public Builder(int w_1, int w_2, int w_3, int w_4) {
            this.wynik_1 = w_1;
            this.wynik_2 = w_2;
            this.wynik_3 = w_3;
            this.wynik_4 = w_4;
        }
        public WynikGry build() { return new WynikGry(this); }
    }
    private WynikGry(Builder builder) {
        this.wynik_1 = builder.wynik_1;
        this.wynik_2 = builder.wynik_2;
        this.wynik_3 = builder.wynik_3;
        this.wynik_4 = builder.wynik_4;
    }

    public int getWynik_1() { return wynik_1; }
    public int getWynik_2() { return wynik_2; }
    public int getWynik_3() { return wynik_3; }
    public int getWynik_4() { return wynik_4; }
}
