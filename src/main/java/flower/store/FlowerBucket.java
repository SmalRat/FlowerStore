package flower.store;

import java.util.ArrayList;

public class FlowerBucket {
    private ArrayList<FlowerPack> flowerPacks = new ArrayList<>();
    public void add(FlowerPack flowerPack){
        flowerPacks.add(flowerPack);
    }

    public double getPrice(){
        int price = 0;
        for (FlowerPack flowerPack: flowerPacks){
            price += flowerPack.get_price();
        }
        return price;
    }
}
