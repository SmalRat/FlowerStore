package flower.store.flower;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    /**
     * Flower class
     */

    @Getter
    private double sepalLength;
    /**
     * Sepal length
     */
    private FlowerColor color;

    /**
     * Color of the flower
     */
    @Getter
    private double price;
    /**
     * The price of flower
     */
    @Getter
    private FlowerType flowerType;
    /**
     * Type of flower
     */
    public final String getColor() {
        /**
         * returns color (string)
         */
        return color.toString();
    }
}
