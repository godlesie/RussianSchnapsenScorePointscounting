package eu.godlesie.jgdlws.russianschnapsen_scorepointscounting.rareentity;

public class Players {
    private final String player_1;
    private final String player_2;
    private final String player_3;
    private final String player_4;

    public static class Builder{
        private final String player_1;
        private final String player_2;
        private final String player_3;
        private final String player_4;

        public Builder(String pl_1, String pl_2, String pl_3, String pl_4) {
            this.player_1 = pl_1;
            this.player_2 = pl_2;
            this.player_3 = pl_3;
            this.player_4 = pl_4;
        }
        public Players build() { return new Players(this); }
    }
    private Players(Builder builder) {
        player_1 = builder.player_1;
        player_2 = builder.player_2;
        player_3 = builder.player_3;
        player_4 = builder.player_4;
    }

    public String getPlayer_1() {
        return player_1;
    }

    public String getPlayer_2() {
        return player_2;
    }

    public String getPlayer_3() {
        return player_3;
    }

    public String getPlayer_4() {
        return player_4;
    }
}
