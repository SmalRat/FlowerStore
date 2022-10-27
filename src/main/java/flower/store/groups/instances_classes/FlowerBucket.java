package flower.store.groups.instances_classes;

import flower.store.flower.Flower;
import flower.store.groups.specs.FlowerBucketSpecs;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FlowerBucket {
    private FlowerBucketSpecs specs = new FlowerBucketSpecs();

    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public FlowerBucket(){
    }

    public void add(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
        specs.add(flowerPack);
    }

    public ArrayList<FlowerPack> getFlowerPacks(){
        return new ArrayList<FlowerPack>(flowerPacks);
    }

    public boolean matches(FlowerBucketSpecs specs){
        return (this.specs.equal(specs));
    }

    public double getPrice(){
        return specs.getPrice();
    }
}
