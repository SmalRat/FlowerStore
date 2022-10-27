package flower.store.groups.instances_classes;

import flower.store.groups.specs.FlowerBucketSpecs;
import java.util.ArrayList;
import java.util.List;

public final class FlowerBucket {
    private FlowerBucketSpecs specs = new FlowerBucketSpecs();
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    public void add(final FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
        specs.add(flowerPack);
    }
    /*public ArrayList<FlowerPack> getFlowerPacks() {
        return new ArrayList<FlowerPack>(flowerPacks);
    }*/
    public boolean matches(final FlowerBucketSpecs otherSpecs) {
        return (this.specs.equal(otherSpecs));
    }
    public double getPrice() {
        return specs.getPrice();
    }
}
