package exercise;

class Random {

    private int seed;
    private final int initSeed;

    Random(int seed) {
        this.seed = seed;
        this.initSeed = seed;
    }

    public int getNext() {
        seed = (int) ((seed * 0x5DEECE66DL + 0xBL) & ((1L << 48) - 1));
        return seed;
    }

    void reset() {
        seed = initSeed;
    }
}