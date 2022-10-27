package flower.store.groups.instances_classes;

import flower.store.groups.specs.FlowerBucketSpecs;
import java.util.ArrayList;
import java.util.List;

public final class FlowerBucket {
    /**
     * Specifications of this bucket
     * Linter... just be quiet..
     *
     */
    private final FlowerBucketSpecs specs = new FlowerBucketSpecs();

    /**
     * List of the packs inside bucket
     */
    private final List<FlowerPack> flowerPacks = new ArrayList<>();


    /**
     * Adds a pack of flowers to this bucket
     */
    public void add(final FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
        specs.add(flowerPack);
    }


    /**
     * Returns the copy of flower packs inside this bucket
     */
    public ArrayList<FlowerPack> getFlowerPacks() {
        return new ArrayList<FlowerPack>(flowerPacks);
    }


    /**
     * Returns true/false - whether this bucket matches pattern
     */
    public boolean matches(final FlowerBucketSpecs otherSpecs) {
        return (this.specs.equal(otherSpecs));
    }


    /**
     * Returns the price of the bucket
     */
    public double getPrice() {
        return specs.getPrice();
    }

}
