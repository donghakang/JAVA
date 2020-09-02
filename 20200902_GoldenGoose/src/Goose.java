public class Goose {
    int egg;
    int totalEgg;
    volatile boolean isEgg;
    volatile boolean isAlive;

    Goose() {
        this.egg = 0;
        this.totalEgg = 0;
        this.isEgg = true;
        this.isAlive = true;
    }
}
