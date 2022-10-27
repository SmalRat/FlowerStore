package flower.store;

import flower.store.flowers.Chamomile;
import flower.store.flowers.Rose;
import flower.store.flowers.Tulip;
import flower.store.groups.instancesclasses.FlowerBucket;
import flower.store.groups.instancesclasses.FlowerPack;
import flower.store.groups.specs.FlowerBucketSpecs;
import flower.store.store.Store;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Store store = new Store();
    private Rose roseOne;
    private Tulip tulip_one;
    private Chamomile chamomile_one;
    private FlowerPack flowerPack_one;
    private FlowerPack flowerPack_two;
    private FlowerPack flowerPack_three;
    private FlowerPack flowerPack_four;
    private FlowerPack flowerPack_five;
    private FlowerPack flowerPack_six;
    private FlowerBucket bucket_one;
    private FlowerBucket bucket_two;
    private FlowerBucket bucket_three;
    private FlowerBucketSpecs specs_one;
    private FlowerBucketSpecs specs_two;
    private FlowerBucketSpecs specs_three;

    private List<FlowerBucket> correct_answer_one;
    private List<FlowerBucket> correct_answer_two;
    private List<FlowerBucket> correct_answer_three;

    @BeforeEach
    public void init() {

        roseOne = new Rose();
        roseOne.setPrice(8);

        tulip_one = new Tulip();
        tulip_one.setPrice(12);

        chamomile_one = new Chamomile();
        roseOne.setPrice(17);

        flowerPack_one = new FlowerPack(roseOne, 10);
        flowerPack_two = new FlowerPack(tulip_one, 5);
        flowerPack_three = new FlowerPack(chamomile_one, 15);
        flowerPack_four = new FlowerPack(roseOne, 13);
        flowerPack_five = new FlowerPack(tulip_one, 8);
        flowerPack_six = new FlowerPack(chamomile_one, 11);

        bucket_one = new FlowerBucket();
        bucket_one.add(flowerPack_one);
        bucket_one.add(flowerPack_three);


        bucket_two = new FlowerBucket();
        bucket_two.add(flowerPack_two);
        bucket_two.add(flowerPack_five);

        bucket_three = new FlowerBucket();
        bucket_three.add(flowerPack_four);
        bucket_three.add(flowerPack_six);

        store.addBucket(bucket_one);
        store.addBucket(bucket_two);
        store.addBucket(bucket_three);

        specs_one = new FlowerBucketSpecs();
        specs_one.add(flowerPack_one);
        specs_one.add(flowerPack_three);

        specs_two = new FlowerBucketSpecs();
        specs_two.add(flowerPack_two);
        specs_two.add(flowerPack_five);

        specs_three = new FlowerBucketSpecs();
        specs_three.add(flowerPack_four);
        specs_three.add(flowerPack_six);

        correct_answer_one = new ArrayList<>();
        correct_answer_one.add(bucket_one);

        correct_answer_two = new ArrayList<>();
        correct_answer_two.add(bucket_two);

        correct_answer_three = new ArrayList<>();
        correct_answer_three.add(bucket_three);
    }

    @Test
    public void test_one() { }

    @Test
    public void test_two() { }

    @Test
    public void test_three() { }

}
