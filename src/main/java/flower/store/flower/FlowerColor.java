package flower.store.flower;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    private final String stringRepresentation;
    /**
     * returns color (string)
     */

    FlowerColor(String stringRepresentation) {
        /**
         * sets color
         */
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public final String toString() {
        /**
         * returns color (string)
         */
        return stringRepresentation;
    }
}
