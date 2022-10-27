package flower.store.flower;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("#FF0000"), BLUE("#0000FF");
    private final String stringRepresentation;

    FlowerColor(final String stringRepr) {
        this.stringRepresentation = stringRepr;
    }

    @Override
    public final String toString() {
        return stringRepresentation;
    }
}
