package flower.store.groups.instances_classes;

import flower.store.groups.specs.FlowerBucketSpecs;
import java.util.ArrayList;
import java.util.List;

public final class FlowerBucket {
    /**
     * Flower Bucket
     */
    private FlowerBucketSpecs specs = new FlowerBucketSpecs();
    /**
     * Flower Bucket specifications
     */

    private List<FlowerPack> flowerPacks = new ArrayList<>();
    /**
     * Flower Pack which are in this bucket
     */

    public void add(FlowerPack flowerPack) {
        /**
         * Adds new Flower Pack to the bucket
         */
        flowerPacks.add(flowerPack);
        specs.add(flowerPack);
    }

    public ArrayList<FlowerPack> getFlowerPacks() {
        /**
         * Returns Flower Packs of this bucket
         */
        return new ArrayList<FlowerPack>(flowerPacks);
    }

    public boolean matches(FlowerBucketSpecs specs) {
        /**
         * Says whether this bucket matches the pattern
         */
        return (this.specs.equal(specs));
    }

    public double getPrice() {
        /**
         * Returns price of the bucket
         */
        return specs.getPrice();
    }
}
